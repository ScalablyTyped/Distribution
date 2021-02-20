package typings.blueprintjsCore

import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.refsMod.IRef
import typings.react.mod.TextareaHTMLAttributes
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/forms/textArea", "TextArea")
  @js.native
  class TextArea protected ()
    extends AbstractPureComponent2[ITextAreaProps, ITextAreaState, js.Object] {
    def this(props: ITextAreaProps) = this()
    def this(props: ITextAreaProps, context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MTextArea(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTextArea(prevProps: ITextAreaProps): Unit = js.native
    
    var handleChange: js.Any = js.native
    
    var refHandlers: js.Any = js.native
    
    var textareaRef: js.Any = js.native
  }
  /* static members */
  object TextArea {
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/textArea", "TextArea")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/textArea", "TextArea.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
  trait ITextAreaProps
    extends TextareaHTMLAttributes[HTMLTextAreaElement]
       with IIntentProps {
    
    /**
      * Whether the text area should take up the full width of its container.
      */
    var fill: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the text area should automatically grow vertically to accomodate content.
      */
    var growVertically: js.UndefOr[Boolean] = js.native
    
    /**
      * Ref handler that receives HTML `<textarea>` element backing this component.
      */
    var inputRef: js.UndefOr[IRef[HTMLTextAreaElement]] = js.native
    
    /**
      * Whether the text area should appear with large styling.
      */
    var large: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the text area should appear with small styling.
      */
    var small: js.UndefOr[Boolean] = js.native
  }
  object ITextAreaProps {
    
    @scala.inline
    def apply(): ITextAreaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITextAreaProps]
    }
    
    @scala.inline
    implicit class ITextAreaPropsMutableBuilder[Self <: ITextAreaProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setGrowVertically(value: Boolean): Self = StObject.set(x, "growVertically", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrowVerticallyUndefined: Self = StObject.set(x, "growVertically", js.undefined)
      
      @scala.inline
      def setInputRef(value: IRef[HTMLTextAreaElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputRefFunction1(value: /* ref */ HTMLTextAreaElement | Null => js.Any): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      @scala.inline
      def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      @scala.inline
      def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    }
  }
  
  @js.native
  trait ITextAreaState extends StObject {
    
    var height: js.UndefOr[Double] = js.native
  }
  object ITextAreaState {
    
    @scala.inline
    def apply(): ITextAreaState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITextAreaState]
    }
    
    @scala.inline
    implicit class ITextAreaStateMutableBuilder[Self <: ITextAreaState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    }
  }
}
