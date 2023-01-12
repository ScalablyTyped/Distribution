package typings.blueprintjsCore

import typings.blueprintjsCore.anon.PartialTextProps
import typings.blueprintjsCore.anon.TextPropsOmitHTMLAttribut
import typings.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsTextTextMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/text/text", "Text")
  @js.native
  open class Text protected ()
    extends AbstractPureComponent2[TextPropsOmitHTMLAttribut, ITextState, js.Object] {
    def this(props: TextPropsOmitHTMLAttribut) = this()
    def this(props: TextPropsOmitHTMLAttribut, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MText(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MText(): Unit = js.native
    
    /* private */ var textRef: Any = js.native
    
    /* private */ var update: Any = js.native
  }
  /* static members */
  object Text {
    
    @JSImport("@blueprintjs/core/lib/esm/components/text/text", "Text")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/text/text", "Text.defaultProps")
    @js.native
    def defaultProps: PartialTextProps = js.native
    inline def defaultProps_=(x: PartialTextProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/text/text", "Text.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait ITextProps
    extends StObject
       with IProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Indicates that this component should be truncated with an ellipsis if it overflows its container.
      * The `title` attribute will also be added when content overflows to show the full text of the children on hover.
      *
      * @default false
      */
    var ellipsize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * HTML tag name to use for rendered element.
      *
      * @default "div"
      */
    var tagName: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.blueprintjsCore.blueprintjsCoreStrings.a, typings.blueprintjsCore.blueprintjsCoreStrings.abbr, typings.blueprintjsCore.blueprintjsCoreStrings.address */ Any
      ] = js.undefined
    
    /**
      * HTML title of the element
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object ITextProps {
    
    inline def apply(): ITextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITextProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITextProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setEllipsize(value: Boolean): Self = StObject.set(x, "ellipsize", value.asInstanceOf[js.Any])
      
      inline def setEllipsizeUndefined: Self = StObject.set(x, "ellipsize", js.undefined)
      
      inline def setTagName(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.blueprintjsCore.blueprintjsCoreStrings.a, typings.blueprintjsCore.blueprintjsCoreStrings.abbr, typings.blueprintjsCore.blueprintjsCoreStrings.address */ Any
      ): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait ITextState extends StObject {
    
    var isContentOverflowing: Boolean
    
    var textContent: String
  }
  object ITextState {
    
    inline def apply(isContentOverflowing: Boolean, textContent: String): ITextState = {
      val __obj = js.Dynamic.literal(isContentOverflowing = isContentOverflowing.asInstanceOf[js.Any], textContent = textContent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITextState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITextState] (val x: Self) extends AnyVal {
      
      inline def setIsContentOverflowing(value: Boolean): Self = StObject.set(x, "isContentOverflowing", value.asInstanceOf[js.Any])
      
      inline def setTextContent(value: String): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
    }
  }
  
  type TextProps = ITextProps
}
