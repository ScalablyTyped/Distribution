package typings.cssBoxModel

import typings.std.CSSStyleDeclaration
import typings.std.ClientRect
import typings.std.DOMRect
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("css-box-model", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateBox(borderBox: AnyRectType, styles: CSSStyleDeclaration): BoxModel = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateBox")(borderBox.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[BoxModel]
  
  inline def createBox(boxArgs: CreateBoxArgs): BoxModel = ^.asInstanceOf[js.Dynamic].applyDynamic("createBox")(boxArgs.asInstanceOf[js.Any]).asInstanceOf[BoxModel]
  
  inline def expand(target: Spacing, expandBy: Spacing): Spacing = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(target.asInstanceOf[js.Any], expandBy.asInstanceOf[js.Any])).asInstanceOf[Spacing]
  
  inline def getBox(el: Element): BoxModel = ^.asInstanceOf[js.Dynamic].applyDynamic("getBox")(el.asInstanceOf[js.Any]).asInstanceOf[BoxModel]
  
  inline def getRect(param0: Spacing): Rect = ^.asInstanceOf[js.Dynamic].applyDynamic("getRect")(param0.asInstanceOf[js.Any]).asInstanceOf[Rect]
  
  inline def offset(original: BoxModel, change: Position): BoxModel = (^.asInstanceOf[js.Dynamic].applyDynamic("offset")(original.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[BoxModel]
  
  inline def shrink(target: Spacing, shrinkBy: Spacing): Spacing = (^.asInstanceOf[js.Dynamic].applyDynamic("shrink")(target.asInstanceOf[js.Any], shrinkBy.asInstanceOf[js.Any])).asInstanceOf[Spacing]
  
  inline def withScroll(original: BoxModel): BoxModel = ^.asInstanceOf[js.Dynamic].applyDynamic("withScroll")(original.asInstanceOf[js.Any]).asInstanceOf[BoxModel]
  inline def withScroll(original: BoxModel, scroll: Position): BoxModel = (^.asInstanceOf[js.Dynamic].applyDynamic("withScroll")(original.asInstanceOf[js.Any], scroll.asInstanceOf[js.Any])).asInstanceOf[BoxModel]
  
  /* Rewritten from type alias, can be one of: 
    - typings.std.ClientRect
    - typings.std.DOMRect
    - typings.cssBoxModel.mod.Rect
    - typings.cssBoxModel.mod.Spacing
  */
  type AnyRectType = _AnyRectType | ClientRect | DOMRect
  
  trait BoxModel extends StObject {
    
    var border: Spacing
    
    var borderBox: Rect
    
    var contentBox: Rect
    
    var margin: Spacing
    
    var marginBox: Rect
    
    var padding: Spacing
    
    var paddingBox: Rect
  }
  object BoxModel {
    
    inline def apply(
      border: Spacing,
      borderBox: Rect,
      contentBox: Rect,
      margin: Spacing,
      marginBox: Rect,
      padding: Spacing,
      paddingBox: Rect
    ): BoxModel = {
      val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], borderBox = borderBox.asInstanceOf[js.Any], contentBox = contentBox.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], marginBox = marginBox.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], paddingBox = paddingBox.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoxModel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BoxModel] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: Spacing): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderBox(value: Rect): Self = StObject.set(x, "borderBox", value.asInstanceOf[js.Any])
      
      inline def setContentBox(value: Rect): Self = StObject.set(x, "contentBox", value.asInstanceOf[js.Any])
      
      inline def setMargin(value: Spacing): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginBox(value: Rect): Self = StObject.set(x, "marginBox", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: Spacing): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingBox(value: Rect): Self = StObject.set(x, "paddingBox", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreateBoxArgs extends StObject {
    
    var border: js.UndefOr[Spacing] = js.undefined
    
    var borderBox: AnyRectType
    
    var margin: js.UndefOr[Spacing] = js.undefined
    
    var padding: js.UndefOr[Spacing] = js.undefined
  }
  object CreateBoxArgs {
    
    inline def apply(borderBox: AnyRectType): CreateBoxArgs = {
      val __obj = js.Dynamic.literal(borderBox = borderBox.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateBoxArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateBoxArgs] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: Spacing): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderBox(value: AnyRectType): Self = StObject.set(x, "borderBox", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setMargin(value: Spacing): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setPadding(value: Spacing): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  trait Position extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Position {
    
    inline def apply(x: Double, y: Double): Position = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rect
    extends StObject
       with _AnyRectType {
    
    var bottom: Double
    
    var center: Position
    
    var height: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object Rect {
    
    inline def apply(
      bottom: Double,
      center: Position,
      height: Double,
      left: Double,
      right: Double,
      top: Double,
      width: Double,
      x: Double,
      y: Double
    ): Rect = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Rect] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setCenter(value: Position): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Spacing
    extends StObject
       with _AnyRectType {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object Spacing {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): Spacing = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Spacing]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Spacing] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait _AnyRectType extends StObject
  object _AnyRectType {
    
    inline def Rect(
      bottom: Double,
      center: Position,
      height: Double,
      left: Double,
      right: Double,
      top: Double,
      width: Double,
      x: Double,
      y: Double
    ): typings.cssBoxModel.mod.Rect = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.cssBoxModel.mod.Rect]
    }
    
    inline def Spacing(bottom: Double, left: Double, right: Double, top: Double): typings.cssBoxModel.mod.Spacing = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.cssBoxModel.mod.Spacing]
    }
  }
}
