package typings.baseui

import typings.baseui.anon.Color
import typings.baseui.anon.ColorHidden
import typings.baseui.anon.Hidden
import typings.baseui.anon.HorizontalOffset
import typings.baseui.badgeTypesMod.BadgeOverrides
import typings.baseui.badgeTypesMod.BadgeProps
import typings.baseui.badgeTypesMod.Hierarchy
import typings.baseui.badgeTypesMod.HintDotProps
import typings.baseui.badgeTypesMod.NotificationCircleProps
import typings.baseui.badgeTypesMod.Placement
import typings.baseui.badgeTypesMod.Shape
import typings.baseui.baseuiStrings.div
import typings.react.mod.global.JSX.Element
import typings.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeMod {
  
  @JSImport("baseui/badge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Badge(
    hasChildrenContentColorShapePlacementHierarchyHorizontalOffsetVerticalOffsetHiddenOverrides: BadgeProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Badge")(hasChildrenContentColorShapePlacementHierarchyHorizontalOffsetVerticalOffsetHiddenOverrides.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined std.Readonly<{  accent :'accent',   primary :'primary',   positive :'positive',   negative :'negative',   warning :'warning'}> */
  object COLOR {
    
    @JSImport("baseui/badge", "COLOR.accent")
    @js.native
    val accent: typings.baseui.baseuiStrings.accent = js.native
    
    @JSImport("baseui/badge", "COLOR.negative")
    @js.native
    val negative: typings.baseui.baseuiStrings.negative = js.native
    
    @JSImport("baseui/badge", "COLOR.positive")
    @js.native
    val positive: typings.baseui.baseuiStrings.positive = js.native
    
    @JSImport("baseui/badge", "COLOR.primary")
    @js.native
    val primary: typings.baseui.baseuiStrings.primary = js.native
    
    @JSImport("baseui/badge", "COLOR.warning")
    @js.native
    val warning: typings.baseui.baseuiStrings.warning = js.native
  }
  
  /* Inlined std.Readonly<{  primary :'primary',   secondary :'secondary'}> */
  object HIERARCHY {
    
    @JSImport("baseui/badge", "HIERARCHY.primary")
    @js.native
    val primary: typings.baseui.baseuiStrings.primary = js.native
    
    @JSImport("baseui/badge", "HIERARCHY.secondary")
    @js.native
    val secondary: typings.baseui.baseuiStrings.secondary = js.native
  }
  
  inline def HintDot(hasChildrenColorHorizontalOffsetPropVerticalOffsetPropHiddenOverrides: HintDotProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HintDot")(hasChildrenColorHorizontalOffsetPropVerticalOffsetPropHiddenOverrides.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def NotificationCircle(
    hasChildrenContentPropColorPlacementHorizontalOffsetVerticalOffsetHiddenOverrides: NotificationCircleProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NotificationCircle")(hasChildrenContentPropColorPlacementHorizontalOffsetVerticalOffsetHiddenOverrides.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined std.Readonly<{  topLeft :'topLeft',   topRight :'topRight',   bottomRight :'bottomRight',   bottomLeft :'bottomLeft',   topLeftEdge :'topLeftEdge',   topEdge :'topEdge',   topRightEdge :'topRightEdge',   bottomRightEdge :'bottomRightEdge',   bottomEdge :'bottomEdge',   bottomLeftEdge :'bottomLeftEdge',   leftTopEdge :'leftTopEdge',   rightTopEdge :'rightTopEdge',   rightBottomEdge :'rightBottomEdge',   leftBottomEdge :'leftBottomEdge'}> */
  object PLACEMENT {
    
    @JSImport("baseui/badge", "PLACEMENT.bottomEdge")
    @js.native
    val bottomEdge: typings.baseui.baseuiStrings.bottomEdge = js.native
    
    @JSImport("baseui/badge", "PLACEMENT.bottomLeft")
    @js.native
    val bottomLeft: typings.baseui.baseuiStrings.bottomLeft = js.native
    
    @JSImport("baseui/badge", "PLACEMENT.bottomLeftEdge")
    @js.native
    val bottomLeftEdge: typings.baseui.baseuiStrings.bottomLeftEdge = js.native
    
    @JSImport("baseui/badge", "PLACEMENT.bottomRight")
    @js.native
    val bottomRight: typings.baseui.baseuiStrings.bottomRight = js.native
    
    @JSImport("baseui/badge", "PLACEMENT.bottomRightEdge")
    @js.native
    val bottomRightEdge: typings.baseui.baseuiStrings.bottomRightEdge = js.native
    
    @JSImport("baseui/badge", "PLACEMENT.leftBottomEdge")
    @js.native
    val leftBottomEdge: typings.baseui.baseuiStrings.leftBottomEdge = js.native
    
    @JSImport("baseui/badge", "PLACEMENT.leftTopEdge")
    @js.native
    val leftTopEdge: typings.baseui.baseuiStrings.leftTopEdge = js.native
    
    @JSImport("baseui/badge", "PLACEMENT.rightBottomEdge")
    @js.native
    val rightBottomEdge: typings.baseui.baseuiStrings.rightBottomEdge = js.native
    
    @JSImport("baseui/badge", "PLACEMENT.rightTopEdge")
    @js.native
    val rightTopEdge: typings.baseui.baseuiStrings.rightTopEdge = js.native
    
    @JSImport("baseui/badge", "PLACEMENT.topEdge")
    @js.native
    val topEdge: typings.baseui.baseuiStrings.topEdge = js.native
    
    @JSImport("baseui/badge", "PLACEMENT.topLeft")
    @js.native
    val topLeft: typings.baseui.baseuiStrings.topLeft = js.native
    
    @JSImport("baseui/badge", "PLACEMENT.topLeftEdge")
    @js.native
    val topLeftEdge: typings.baseui.baseuiStrings.topLeftEdge = js.native
    
    @JSImport("baseui/badge", "PLACEMENT.topRight")
    @js.native
    val topRight: typings.baseui.baseuiStrings.topRight = js.native
    
    @JSImport("baseui/badge", "PLACEMENT.topRightEdge")
    @js.native
    val topRightEdge: typings.baseui.baseuiStrings.topRightEdge = js.native
  }
  
  /* Inlined std.Readonly<{  pill :'pill',   rectangle :'rectangle'}> */
  object SHAPE {
    
    @JSImport("baseui/badge", "SHAPE.pill")
    @js.native
    val pill: typings.baseui.baseuiStrings.pill = js.native
    
    @JSImport("baseui/badge", "SHAPE.rectangle")
    @js.native
    val rectangle: typings.baseui.baseuiStrings.rectangle = js.native
  }
  
  @JSImport("baseui/badge", "StyledBadge")
  @js.native
  val StyledBadge: StyletronComponent[div, Color] = js.native
  
  @JSImport("baseui/badge", "StyledHintDot")
  @js.native
  val StyledHintDot: StyletronComponent[div, Hidden] = js.native
  
  @JSImport("baseui/badge", "StyledNotificationCircle")
  @js.native
  val StyledNotificationCircle: StyletronComponent[div, ColorHidden] = js.native
  
  @JSImport("baseui/badge", "StyledPositioner")
  @js.native
  val StyledPositioner: StyletronComponent[div, HorizontalOffset] = js.native
  
  @JSImport("baseui/badge", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, js.Object] = js.native
  
  type BadgeOverridesT = BadgeOverrides
  
  type BadgePropsT = BadgeProps
  
  type ColorT = typings.baseui.badgeTypesMod.Color
  
  type HierarchyT = Hierarchy
  
  type HintDotPropsT = HintDotProps
  
  type NotificationCirclePropsT = NotificationCircleProps
  
  type PlacementT = Placement
  
  type ShapeT = Shape
}
