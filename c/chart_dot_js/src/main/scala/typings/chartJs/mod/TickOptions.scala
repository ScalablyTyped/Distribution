package typings.chartJs.mod

import typings.chartJs.anon.Enabled
import typings.chartJs.anon.PartialFontSpec
import typings.chartJs.typesColorMod.Color
import typings.chartJs.typesGeometricMod.ChartArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TickOptions extends StObject {
  
  /**
    * Color of label backdrops.
    * @default 'rgba(255, 255, 255, 0.75)'
    */
  var backdropColor: Scriptable[Color, ScriptableScaleContext] = js.native
  
  /**
    * Padding of tick backdrop.
    * @default 2
    */
  var backdropPadding: Double | ChartArea = js.native
  
  def callback(tickValue: String, index: Double, ticks: js.Array[Tick]): js.UndefOr[String | (js.Array[Double | String]) | Double | Null] = js.native
  /**
    * Returns the string representation of the tick value as it should be displayed on the chart. See callback.
    */
  def callback(tickValue: Double, index: Double, ticks: js.Array[Tick]): js.UndefOr[String | (js.Array[Double | String]) | Double | Null] = js.native
  
  /**
    * Color of tick
    * @see Defaults.color
    */
  var color: ScriptableAndArray[Color, ScriptableScaleContext] = js.native
  
  /**
    * If true, show tick labels.
    * @default true
    */
  var display: Boolean = js.native
  
  /**
    * see Fonts
    */
  var font: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableScaleContext] = js.native
  
  var major: Enabled = js.native
  
  /**
    * Sets the offset of the tick labels from the axis
    */
  var padding: Double = js.native
  
  /**
    * If true, draw a background behind the tick labels.
    * @default false
    */
  var showLabelBackdrop: Scriptable[Boolean, ScriptableScaleContext] = js.native
  
  /**
    * The color of the stroke around the text.
    * @default undefined
    */
  var textStrokeColor: Scriptable[Color, ScriptableScaleContext] = js.native
  
  /**
    * Stroke width around the text.
    * @default 0
    */
  var textStrokeWidth: Scriptable[Double, ScriptableScaleContext] = js.native
  
  /**
    * z-index of tick layer. Useful when ticks are drawn on chart area. Values <= 0 are drawn under datasets, > 0 on top.
    * @default 0
    */
  var z: Double = js.native
}
