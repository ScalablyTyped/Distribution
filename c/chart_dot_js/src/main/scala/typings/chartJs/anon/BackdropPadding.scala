package typings.chartJs.anon

import typings.chartJs.chartJsStrings.auto
import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesGeometricMod.ChartArea
import typings.chartJs.distTypesIndexMod.FontSpec
import typings.chartJs.distTypesIndexMod.ScriptableAndScriptableOptions
import typings.chartJs.distTypesIndexMod.ScriptableScalePointLabelContext
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackdropPadding extends StObject {
  
  /**
    * Background color of the point label.
    * @default undefined
    */
  var backdropColor: typings.chartJs.distTypesIndexMod.Scriptable[typings.chartJs.distTypesColorMod.Color, ScriptableScalePointLabelContext]
  
  /**
    * Padding of label backdrop.
    * @default 2
    */
  var backdropPadding: typings.chartJs.distTypesIndexMod.Scriptable[Double | ChartArea, ScriptableScalePointLabelContext]
  
  /**
    * Border radius
    * @default 0
    * @since 3.8.0
    */
  var borderRadius: typings.chartJs.distTypesIndexMod.Scriptable[
    Double | typings.chartJs.distTypesIndexMod.BorderRadius, 
    ScriptableScalePointLabelContext
  ]
  
  /**
    * Callback function to transform data labels to point labels. The default implementation simply returns the current string.
    */
  def callback(label: String, index: Double): String | (js.Array[Double | String]) | Double
  
  /**
    * if true, point labels are centered.
    * @default false
    */
  var centerPointLabels: Boolean
  
  /**
    * Color of label
    * @see Defaults.color
    */
  var color: typings.chartJs.distTypesIndexMod.Scriptable[typings.chartJs.distTypesColorMod.Color, ScriptableScalePointLabelContext]
  
  /**
    * if true, point labels are shown. When `display: 'auto'`, the label is hidden if it overlaps with another label.
    * @default true
    */
  var display: Boolean | auto
  
  /**
    */
  var font: ScriptableAndScriptableOptions[Partial[FontSpec], ScriptableScalePointLabelContext]
  
  /**
    * Padding around the pointLabels
    * @default 5
    */
  var padding: typings.chartJs.distTypesIndexMod.Scriptable[Double, ScriptableScalePointLabelContext]
}
object BackdropPadding {
  
  inline def apply(
    backdropColor: typings.chartJs.distTypesIndexMod.Scriptable[typings.chartJs.distTypesColorMod.Color, ScriptableScalePointLabelContext],
    backdropPadding: typings.chartJs.distTypesIndexMod.Scriptable[Double | ChartArea, ScriptableScalePointLabelContext],
    borderRadius: typings.chartJs.distTypesIndexMod.Scriptable[
      Double | typings.chartJs.distTypesIndexMod.BorderRadius, 
      ScriptableScalePointLabelContext
    ],
    callback: (String, Double) => String | (js.Array[Double | String]) | Double,
    centerPointLabels: Boolean,
    color: typings.chartJs.distTypesIndexMod.Scriptable[typings.chartJs.distTypesColorMod.Color, ScriptableScalePointLabelContext],
    display: Boolean | auto,
    font: ScriptableAndScriptableOptions[Partial[FontSpec], ScriptableScalePointLabelContext],
    padding: typings.chartJs.distTypesIndexMod.Scriptable[Double, ScriptableScalePointLabelContext]
  ): BackdropPadding = {
    val __obj = js.Dynamic.literal(backdropColor = backdropColor.asInstanceOf[js.Any], backdropPadding = backdropPadding.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], callback = js.Any.fromFunction2(callback), centerPointLabels = centerPointLabels.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackdropPadding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackdropPadding] (val x: Self) extends AnyVal {
    
    inline def setBackdropColor(
      value: typings.chartJs.distTypesIndexMod.Scriptable[typings.chartJs.distTypesColorMod.Color, ScriptableScalePointLabelContext]
    ): Self = StObject.set(x, "backdropColor", value.asInstanceOf[js.Any])
    
    inline def setBackdropColorFunction2(
      value: (ScriptableScalePointLabelContext, /* options */ AnyObject) => js.UndefOr[typings.chartJs.distTypesColorMod.Color]
    ): Self = StObject.set(x, "backdropColor", js.Any.fromFunction2(value))
    
    inline def setBackdropPadding(
      value: typings.chartJs.distTypesIndexMod.Scriptable[Double | ChartArea, ScriptableScalePointLabelContext]
    ): Self = StObject.set(x, "backdropPadding", value.asInstanceOf[js.Any])
    
    inline def setBackdropPaddingFunction2(
      value: (ScriptableScalePointLabelContext, /* options */ AnyObject) => js.UndefOr[Double | ChartArea]
    ): Self = StObject.set(x, "backdropPadding", js.Any.fromFunction2(value))
    
    inline def setBorderRadius(
      value: typings.chartJs.distTypesIndexMod.Scriptable[
          Double | typings.chartJs.distTypesIndexMod.BorderRadius, 
          ScriptableScalePointLabelContext
        ]
    ): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusFunction2(
      value: (ScriptableScalePointLabelContext, /* options */ AnyObject) => js.UndefOr[Double | typings.chartJs.distTypesIndexMod.BorderRadius]
    ): Self = StObject.set(x, "borderRadius", js.Any.fromFunction2(value))
    
    inline def setCallback(value: (String, Double) => String | (js.Array[Double | String]) | Double): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    inline def setCenterPointLabels(value: Boolean): Self = StObject.set(x, "centerPointLabels", value.asInstanceOf[js.Any])
    
    inline def setColor(
      value: typings.chartJs.distTypesIndexMod.Scriptable[typings.chartJs.distTypesColorMod.Color, ScriptableScalePointLabelContext]
    ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorFunction2(
      value: (ScriptableScalePointLabelContext, /* options */ AnyObject) => js.UndefOr[typings.chartJs.distTypesColorMod.Color]
    ): Self = StObject.set(x, "color", js.Any.fromFunction2(value))
    
    inline def setDisplay(value: Boolean | auto): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setFont(value: ScriptableAndScriptableOptions[Partial[FontSpec], ScriptableScalePointLabelContext]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontFunction2(
      value: (ScriptableScalePointLabelContext, /* options */ AnyObject) => js.UndefOr[Partial[FontSpec]]
    ): Self = StObject.set(x, "font", js.Any.fromFunction2(value))
    
    inline def setPadding(value: typings.chartJs.distTypesIndexMod.Scriptable[Double, ScriptableScalePointLabelContext]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingFunction2(value: (ScriptableScalePointLabelContext, /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "padding", js.Any.fromFunction2(value))
  }
}
