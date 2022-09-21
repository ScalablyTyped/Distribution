package typings.baseui

import typings.baseui.anon.Size
import typings.baseui.overridesMod.Override
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bannerTypesMod {
  
  trait ActionContent extends StObject {
    
    var icon: js.UndefOr[js.Function1[/* a */ Size, ReactNode]] = js.undefined
    
    var label: String
    
    def onClick(a: SyntheticEvent[HTMLButtonElement, Event]): Any
    
    var position: js.UndefOr[ActionPosition] = js.undefined
  }
  object ActionContent {
    
    inline def apply(label: String, onClick: SyntheticEvent[HTMLButtonElement, Event] => Any): ActionContent = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
      __obj.asInstanceOf[ActionContent]
    }
    
    extension [Self <: ActionContent](x: Self) {
      
      inline def setIcon(value: /* a */ Size => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: SyntheticEvent[HTMLButtonElement, Event] => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setPosition(value: ActionPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.below
    - typings.baseui.baseuiStrings.trailing
  */
  trait ActionPosition extends StObject
  
  trait ArtworkContent extends StObject {
    
    def icon(a: Size): ReactNode
    
    var `type`: js.UndefOr[ArtworkType] = js.undefined
  }
  object ArtworkContent {
    
    inline def apply(icon: Size => ReactNode): ArtworkContent = {
      val __obj = js.Dynamic.literal(icon = js.Any.fromFunction1(icon))
      __obj.asInstanceOf[ArtworkContent]
    }
    
    extension [Self <: ArtworkContent](x: Self) {
      
      inline def setIcon(value: Size => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      inline def setType(value: ArtworkType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.icon
    - typings.baseui.baseuiStrings.badge
  */
  trait ArtworkType extends StObject
  
  trait BannerOverrides extends StObject {
    
    var BelowContent: js.UndefOr[Override[Any]] = js.undefined
    
    var LeadingContent: js.UndefOr[Override[Any]] = js.undefined
    
    var Message: js.UndefOr[Override[Any]] = js.undefined
    
    var MessageContent: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
    
    var Title: js.UndefOr[Override[Any]] = js.undefined
    
    var TrailingButtonContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var TrailingContent: js.UndefOr[Override[Any]] = js.undefined
    
    var TrailingIconButton: js.UndefOr[Override[Any]] = js.undefined
  }
  object BannerOverrides {
    
    inline def apply(): BannerOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BannerOverrides]
    }
    
    extension [Self <: BannerOverrides](x: Self) {
      
      inline def setBelowContent(value: Override[Any]): Self = StObject.set(x, "BelowContent", value.asInstanceOf[js.Any])
      
      inline def setBelowContentUndefined: Self = StObject.set(x, "BelowContent", js.undefined)
      
      inline def setLeadingContent(value: Override[Any]): Self = StObject.set(x, "LeadingContent", value.asInstanceOf[js.Any])
      
      inline def setLeadingContentUndefined: Self = StObject.set(x, "LeadingContent", js.undefined)
      
      inline def setMessage(value: Override[Any]): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setMessageContent(value: Override[Any]): Self = StObject.set(x, "MessageContent", value.asInstanceOf[js.Any])
      
      inline def setMessageContentUndefined: Self = StObject.set(x, "MessageContent", js.undefined)
      
      inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setTitle(value: Override[Any]): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
      
      inline def setTrailingButtonContainer(value: Override[Any]): Self = StObject.set(x, "TrailingButtonContainer", value.asInstanceOf[js.Any])
      
      inline def setTrailingButtonContainerUndefined: Self = StObject.set(x, "TrailingButtonContainer", js.undefined)
      
      inline def setTrailingContent(value: Override[Any]): Self = StObject.set(x, "TrailingContent", value.asInstanceOf[js.Any])
      
      inline def setTrailingContentUndefined: Self = StObject.set(x, "TrailingContent", js.undefined)
      
      inline def setTrailingIconButton(value: Override[Any]): Self = StObject.set(x, "TrailingIconButton", value.asInstanceOf[js.Any])
      
      inline def setTrailingIconButtonUndefined: Self = StObject.set(x, "TrailingIconButton", js.undefined)
    }
  }
  
  trait BannerProps extends StObject {
    
    var action: js.UndefOr[ActionContent] = js.undefined
    
    var artwork: js.UndefOr[ArtworkContent] = js.undefined
    
    var children: ReactNode
    
    var hierarchy: js.UndefOr[Hierarchy] = js.undefined
    
    var kind: js.UndefOr[Kind] = js.undefined
    
    var nested: js.UndefOr[Boolean] = js.undefined
    
    var overrides: js.UndefOr[BannerOverrides] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object BannerProps {
    
    inline def apply(): BannerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BannerProps]
    }
    
    extension [Self <: BannerProps](x: Self) {
      
      inline def setAction(value: ActionContent): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setArtwork(value: ArtworkContent): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
      
      inline def setArtworkUndefined: Self = StObject.set(x, "artwork", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setHierarchy(value: Hierarchy): Self = StObject.set(x, "hierarchy", value.asInstanceOf[js.Any])
      
      inline def setHierarchyUndefined: Self = StObject.set(x, "hierarchy", js.undefined)
      
      inline def setKind(value: Kind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setNested(value: Boolean): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
      
      inline def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
      
      inline def setOverrides(value: BannerOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.low
    - typings.baseui.baseuiStrings.high
  */
  trait Hierarchy extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.info
    - typings.baseui.baseuiStrings.negative
    - typings.baseui.baseuiStrings.positive
    - typings.baseui.baseuiStrings.warning
  */
  trait Kind extends StObject
}
