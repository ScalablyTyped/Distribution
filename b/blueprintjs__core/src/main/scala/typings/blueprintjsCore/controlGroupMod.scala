package typings.blueprintjsCore

import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlGroupMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/forms/controlGroup", "ControlGroup")
  @js.native
  class ControlGroup protected ()
    extends AbstractPureComponent2[IControlGroupProps, js.Object, js.Object] {
    def this(props: IControlGroupProps) = this()
    def this(props: IControlGroupProps, context: js.Any) = this()
  }
  /* static members */
  object ControlGroup {
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/controlGroup", "ControlGroup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/controlGroup", "ControlGroup.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
  trait IControlGroupProps extends HTMLAttributes[HTMLDivElement] {
    
    /**
      * Whether the control group should take up the full width of its container.
      * @default false
      */
    var fill: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the control group should appear with vertical styling.
      * @default false
      */
    var vertical: js.UndefOr[Boolean] = js.native
  }
  object IControlGroupProps {
    
    @scala.inline
    def apply(): IControlGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IControlGroupProps]
    }
    
    @scala.inline
    implicit class IControlGroupPropsMutableBuilder[Self <: IControlGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
}
