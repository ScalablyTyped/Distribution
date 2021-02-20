package typings.blueprintjsCore

import typings.blueprintjsCore.alignmentMod.Alignment
import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGroupMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/button/buttonGroup", "ButtonGroup")
  @js.native
  class ButtonGroup protected ()
    extends AbstractPureComponent2[IButtonGroupProps, js.Object, js.Object] {
    def this(props: IButtonGroupProps) = this()
    def this(props: IButtonGroupProps, context: js.Any) = this()
  }
  /* static members */
  object ButtonGroup {
    
    @JSImport("@blueprintjs/core/lib/esm/components/button/buttonGroup", "ButtonGroup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/button/buttonGroup", "ButtonGroup.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
  trait IButtonGroupProps extends HTMLAttributes[HTMLDivElement] {
    
    /**
      * Text alignment within button. By default, icons and text will be centered
      * within the button. Passing `"left"` or `"right"` will align the button
      * text to that side and push `icon` and `rightIcon` to either edge. Passing
      * `"center"` will center the text and icons together.
      */
    var alignText: js.UndefOr[Alignment] = js.native
    
    /**
      * Whether the button group should take up the full width of its container.
      * @default false
      */
    var fill: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the child buttons should appear with large styling.
      * @default false
      */
    var large: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the child buttons should appear with minimal styling.
      * @default false
      */
    var minimal: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the button group should appear with vertical styling.
      * @default false
      */
    var vertical: js.UndefOr[Boolean] = js.native
  }
  object IButtonGroupProps {
    
    @scala.inline
    def apply(): IButtonGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IButtonGroupProps]
    }
    
    @scala.inline
    implicit class IButtonGroupPropsMutableBuilder[Self <: IButtonGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignText(value: Alignment): Self = StObject.set(x, "alignText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignTextUndefined: Self = StObject.set(x, "alignText", js.undefined)
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      @scala.inline
      def setMinimal(value: Boolean): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimalUndefined: Self = StObject.set(x, "minimal", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
}
