package typings.vegaLite8ozrbXDH.specBaseDTsMod

import typings.std.Exclude
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaTypings.colorMod.Color
import typings.vegaTypings.configMod.Cursor
import typings.vegaTypings.configMod.StrokeCap
import typings.vegaTypings.configMod.StrokeJoin
import typings.vegaTypings.encodeMod.ColorValueRef
import typings.vegaTypings.encodeMod.NumericValueRef
import typings.vegaTypings.encodeMod.ScaledValueRef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<std.Pick<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/mark.d.ts.MarkConfig<ES>, 'cornerRadius' | 'fillOpacity' | 'opacity' | 'strokeCap' | 'strokeDash' | 'strokeDashOffset' | 'strokeJoin' | 'strokeMiterLimit' | 'strokeOpacity' | 'strokeWidth'>> */
trait BaseViewBackground[ES /* <: ExprRef | SignalRef */] extends StObject {
  
  var cornerRadius: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  /**
    * The mouse cursor used over the view. Any valid [CSS cursor type](https://developer.mozilla.org/en-US/docs/Web/CSS/cursor#Values) can be used.
    */
  var cursor: js.UndefOr[Cursor] = js.undefined
  
  /**
    * The fill color.
    *
    * __Default value:__ `undefined`
    */
  var fill: js.UndefOr[Color | Null | ES] = js.undefined
  
  var fillOpacity: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var opacity: js.UndefOr[Double | ES] = js.undefined
  
  /**
    * The stroke color.
    *
    * __Default value:__ `"#ddd"`
    */
  var stroke: js.UndefOr[Color | Null | ES] = js.undefined
  
  var strokeCap: js.UndefOr[
    (Exclude[
      js.UndefOr[StrokeCap | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var strokeDash: js.UndefOr[
    (Exclude[
      js.UndefOr[js.Array[Double] | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var strokeDashOffset: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var strokeJoin: js.UndefOr[
    (Exclude[
      js.UndefOr[StrokeJoin | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var strokeMiterLimit: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var strokeOpacity: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var strokeWidth: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
}
object BaseViewBackground {
  
  inline def apply[ES /* <: ExprRef | SignalRef */](): BaseViewBackground[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseViewBackground[ES]]
  }
  
  extension [Self <: BaseViewBackground[?], ES /* <: ExprRef | SignalRef */](x: Self & BaseViewBackground[ES]) {
    
    inline def setCornerRadius(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setCursor(value: Cursor): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setFill(value: Color | ES): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillNull: Self = StObject.set(x, "fill", null)
    
    inline def setFillOpacity(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setOpacity(value: Double | ES): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setStroke(value: Color | ES): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeCap(
      value: (Exclude[
          js.UndefOr[StrokeCap | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "strokeCap", value.asInstanceOf[js.Any])
    
    inline def setStrokeCapUndefined: Self = StObject.set(x, "strokeCap", js.undefined)
    
    inline def setStrokeDash(
      value: (Exclude[
          js.UndefOr[js.Array[Double] | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "strokeDash", value.asInstanceOf[js.Any])
    
    inline def setStrokeDashOffset(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "strokeDashOffset", value.asInstanceOf[js.Any])
    
    inline def setStrokeDashOffsetUndefined: Self = StObject.set(x, "strokeDashOffset", js.undefined)
    
    inline def setStrokeDashUndefined: Self = StObject.set(x, "strokeDash", js.undefined)
    
    inline def setStrokeDashVarargs(value: Double*): Self = StObject.set(x, "strokeDash", js.Array(value*))
    
    inline def setStrokeJoin(
      value: (Exclude[
          js.UndefOr[StrokeJoin | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "strokeJoin", value.asInstanceOf[js.Any])
    
    inline def setStrokeJoinUndefined: Self = StObject.set(x, "strokeJoin", js.undefined)
    
    inline def setStrokeMiterLimit(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "strokeMiterLimit", value.asInstanceOf[js.Any])
    
    inline def setStrokeMiterLimitUndefined: Self = StObject.set(x, "strokeMiterLimit", js.undefined)
    
    inline def setStrokeNull: Self = StObject.set(x, "stroke", null)
    
    inline def setStrokeOpacity(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setStrokeWidth(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
