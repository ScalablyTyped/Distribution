package typings.baseui

import typings.baseui.anon.AriaLabel_
import typings.baseui.baseuiStrings.dark
import typings.baseui.baseuiStrings.light
import typings.baseui.baseuiStrings.secondary
import typings.baseui.baseuiStrings.tertiary
import typings.baseui.helpersOverridesMod.Override
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageCardTypesMod {
  
  trait MessageCardOverrides extends StObject {
    
    var Button: js.UndefOr[Override[Any]] = js.undefined
    
    var ContentContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var HeadingContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var Image: js.UndefOr[Override[Any]] = js.undefined
    
    var ParagraphContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
  }
  object MessageCardOverrides {
    
    inline def apply(): MessageCardOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageCardOverrides]
    }
    
    extension [Self <: MessageCardOverrides](x: Self) {
      
      inline def setButton(value: Override[Any]): Self = StObject.set(x, "Button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "Button", js.undefined)
      
      inline def setContentContainer(value: Override[Any]): Self = StObject.set(x, "ContentContainer", value.asInstanceOf[js.Any])
      
      inline def setContentContainerUndefined: Self = StObject.set(x, "ContentContainer", js.undefined)
      
      inline def setHeadingContainer(value: Override[Any]): Self = StObject.set(x, "HeadingContainer", value.asInstanceOf[js.Any])
      
      inline def setHeadingContainerUndefined: Self = StObject.set(x, "HeadingContainer", js.undefined)
      
      inline def setImage(value: Override[Any]): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "Image", js.undefined)
      
      inline def setParagraphContainer(value: Override[Any]): Self = StObject.set(x, "ParagraphContainer", value.asInstanceOf[js.Any])
      
      inline def setParagraphContainerUndefined: Self = StObject.set(x, "ParagraphContainer", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  trait MessageCardProps extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var backgroundColorType: js.UndefOr[light | dark] = js.undefined
    
    var buttonKind: js.UndefOr[secondary | tertiary] = js.undefined
    
    var buttonLabel: js.UndefOr[ReactNode] = js.undefined
    
    var heading: js.UndefOr[ReactNode] = js.undefined
    
    var image: js.UndefOr[AriaLabel_] = js.undefined
    
    def onClick(a: SyntheticEvent[HTMLButtonElement, Event]): Any
    
    var overrides: js.UndefOr[MessageCardOverrides] = js.undefined
    
    var paragraph: js.UndefOr[ReactNode] = js.undefined
  }
  object MessageCardProps {
    
    inline def apply(onClick: SyntheticEvent[HTMLButtonElement, Event] => Any): MessageCardProps = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick))
      __obj.asInstanceOf[MessageCardProps]
    }
    
    extension [Self <: MessageCardProps](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorType(value: light | dark): Self = StObject.set(x, "backgroundColorType", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorTypeUndefined: Self = StObject.set(x, "backgroundColorType", js.undefined)
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setButtonKind(value: secondary | tertiary): Self = StObject.set(x, "buttonKind", value.asInstanceOf[js.Any])
      
      inline def setButtonKindUndefined: Self = StObject.set(x, "buttonKind", js.undefined)
      
      inline def setButtonLabel(value: ReactNode): Self = StObject.set(x, "buttonLabel", value.asInstanceOf[js.Any])
      
      inline def setButtonLabelUndefined: Self = StObject.set(x, "buttonLabel", js.undefined)
      
      inline def setHeading(value: ReactNode): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
      
      inline def setImage(value: AriaLabel_): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setOnClick(value: SyntheticEvent[HTMLButtonElement, Event] => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOverrides(value: MessageCardOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setParagraph(value: ReactNode): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
      
      inline def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
    }
  }
}
