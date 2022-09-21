package typings.baseui

import typings.baseui.overridesMod.Override
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeTypesMod {
  
  trait BadgeOverrides extends StObject {
    
    var Badge: js.UndefOr[Override[Any]] = js.undefined
    
    var Positioner: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
  }
  object BadgeOverrides {
    
    inline def apply(): BadgeOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BadgeOverrides]
    }
    
    extension [Self <: BadgeOverrides](x: Self) {
      
      inline def setBadge(value: Override[Any]): Self = StObject.set(x, "Badge", value.asInstanceOf[js.Any])
      
      inline def setBadgeUndefined: Self = StObject.set(x, "Badge", js.undefined)
      
      inline def setPositioner(value: Override[Any]): Self = StObject.set(x, "Positioner", value.asInstanceOf[js.Any])
      
      inline def setPositionerUndefined: Self = StObject.set(x, "Positioner", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  trait BadgeProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var color: js.UndefOr[Color] = js.undefined
    
    var content: ReactNode
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var hierarchy: js.UndefOr[Hierarchy] = js.undefined
    
    var horizontalOffset: js.UndefOr[String] = js.undefined
    
    var overrides: js.UndefOr[BadgeOverrides] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var shape: js.UndefOr[Shape] = js.undefined
    
    var verticalOffset: js.UndefOr[String] = js.undefined
  }
  object BadgeProps {
    
    inline def apply(): BadgeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BadgeProps]
    }
    
    extension [Self <: BadgeProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setHierarchy(value: Hierarchy): Self = StObject.set(x, "hierarchy", value.asInstanceOf[js.Any])
      
      inline def setHierarchyUndefined: Self = StObject.set(x, "hierarchy", js.undefined)
      
      inline def setHorizontalOffset(value: String): Self = StObject.set(x, "horizontalOffset", value.asInstanceOf[js.Any])
      
      inline def setHorizontalOffsetUndefined: Self = StObject.set(x, "horizontalOffset", js.undefined)
      
      inline def setOverrides(value: BadgeOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setVerticalOffset(value: String): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
      
      inline def setVerticalOffsetUndefined: Self = StObject.set(x, "verticalOffset", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.accent
    - typings.baseui.baseuiStrings.primary
    - typings.baseui.baseuiStrings.positive
    - typings.baseui.baseuiStrings.warning
    - typings.baseui.baseuiStrings.negative
  */
  trait Color extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.primary
    - typings.baseui.baseuiStrings.secondary
  */
  trait Hierarchy extends StObject
  
  trait HintDotProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var color: js.UndefOr[Color] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var horizontalOffset: js.UndefOr[String] = js.undefined
    
    var overrides: js.UndefOr[BadgeOverrides] = js.undefined
    
    var verticalOffset: js.UndefOr[String] = js.undefined
  }
  object HintDotProps {
    
    inline def apply(): HintDotProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HintDotProps]
    }
    
    extension [Self <: HintDotProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setHorizontalOffset(value: String): Self = StObject.set(x, "horizontalOffset", value.asInstanceOf[js.Any])
      
      inline def setHorizontalOffsetUndefined: Self = StObject.set(x, "horizontalOffset", js.undefined)
      
      inline def setOverrides(value: BadgeOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setVerticalOffset(value: String): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
      
      inline def setVerticalOffsetUndefined: Self = StObject.set(x, "verticalOffset", js.undefined)
    }
  }
  
  trait NotificationCircleProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var color: js.UndefOr[Color] = js.undefined
    
    var content: ReactNode
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var horizontalOffset: js.UndefOr[String] = js.undefined
    
    var overrides: js.UndefOr[BadgeOverrides] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var verticalOffset: js.UndefOr[String] = js.undefined
  }
  object NotificationCircleProps {
    
    inline def apply(): NotificationCircleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationCircleProps]
    }
    
    extension [Self <: NotificationCircleProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setHorizontalOffset(value: String): Self = StObject.set(x, "horizontalOffset", value.asInstanceOf[js.Any])
      
      inline def setHorizontalOffsetUndefined: Self = StObject.set(x, "horizontalOffset", js.undefined)
      
      inline def setOverrides(value: BadgeOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setVerticalOffset(value: String): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
      
      inline def setVerticalOffsetUndefined: Self = StObject.set(x, "verticalOffset", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.bottomRightEdge
    - typings.baseui.baseuiStrings.topLeft
    - typings.baseui.baseuiStrings.rightTopEdge
    - typings.baseui.baseuiStrings.leftTopEdge
    - typings.baseui.baseuiStrings.topRightEdge
    - typings.baseui.baseuiStrings.topRight
    - typings.baseui.baseuiStrings.bottomLeft
    - typings.baseui.baseuiStrings.topLeftEdge
    - typings.baseui.baseuiStrings.topEdge
    - typings.baseui.baseuiStrings.bottomLeftEdge
    - typings.baseui.baseuiStrings.bottomRight
    - typings.baseui.baseuiStrings.rightBottomEdge
    - typings.baseui.baseuiStrings.bottomEdge
    - typings.baseui.baseuiStrings.leftBottomEdge
  */
  trait Placement extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.badge
    - typings.baseui.baseuiStrings.notificationCircle
    - typings.baseui.baseuiStrings.hintDot
  */
  trait Role extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.pill
    - typings.baseui.baseuiStrings.rectangle
  */
  trait Shape extends StObject
}
