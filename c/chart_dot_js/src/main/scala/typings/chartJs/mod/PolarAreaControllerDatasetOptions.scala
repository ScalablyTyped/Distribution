package typings.chartJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.anon.AnimationSpecdoughnutonPr
import typings.chartJs.chartJsBooleans.`false`
import typings.chartJs.chartJsStrings.center
import typings.chartJs.chartJsStrings.doughnut
import typings.chartJs.chartJsStrings.inner
import typings.chartJs.chartJsStrings.x
import typings.chartJs.chartJsStrings.y
import typings.chartJs.typesColorMod.Color
import typings.chartJs.typesGeometricMod.ChartArea
import typings.std.CanvasLineJoin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolarAreaControllerDatasetOptions
  extends StObject
     with DoughnutControllerDatasetOptions {
  
  /**
    * Arc angle to cover. - for polar only
    * @default circumference / (arc count)
    */
  var angle: Double
}
object PolarAreaControllerDatasetOptions {
  
  inline def apply(
    angle: Double,
    animation: `false` | AnimationSpecdoughnutonPr,
    animations: AnimationsSpec[doughnut],
    backgroundColor: ScriptableAndArray[Color, ScriptableContext[doughnut]],
    borderAlign: ScriptableAndArray[center | inner, ScriptableContext[doughnut]],
    borderColor: ScriptableAndArray[Color, ScriptableContext[doughnut]],
    borderJoinStyle: ScriptableAndArray[CanvasLineJoin, ScriptableContext[doughnut]],
    borderRadius: ScriptableAndArray[Double | ArcBorderRadius, ScriptableContext[doughnut]],
    borderWidth: ScriptableAndArray[Double, ScriptableContext[doughnut]],
    circular: ScriptableAndArray[Boolean, ScriptableContext[doughnut]],
    circumference: Double,
    clip: Double | ChartArea | `false`,
    hidden: Boolean,
    hoverBackgroundColor: ScriptableAndArray[Color, ScriptableContext[doughnut]],
    hoverBorderColor: ScriptableAndArray[Color, ScriptableContext[doughnut]],
    hoverBorderWidth: ScriptableAndArray[Double, ScriptableContext[doughnut]],
    hoverOffset: ScriptableAndArray[Double, ScriptableContext[doughnut]],
    indexAxis: x | y,
    label: String,
    normalized: Boolean,
    offset: Double,
    order: Double,
    parsing: StringDictionary[String] | `false`,
    rotation: Double,
    spacing: Double,
    stack: String,
    transitions: TransitionsSpec[doughnut],
    weight: Double
  ): PolarAreaControllerDatasetOptions = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], animations = animations.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], borderAlign = borderAlign.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderJoinStyle = borderJoinStyle.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], circular = circular.asInstanceOf[js.Any], circumference = circumference.asInstanceOf[js.Any], clip = clip.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hoverBackgroundColor = hoverBackgroundColor.asInstanceOf[js.Any], hoverBorderColor = hoverBorderColor.asInstanceOf[js.Any], hoverBorderWidth = hoverBorderWidth.asInstanceOf[js.Any], hoverOffset = hoverOffset.asInstanceOf[js.Any], indexAxis = indexAxis.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], normalized = normalized.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], parsing = parsing.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolarAreaControllerDatasetOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolarAreaControllerDatasetOptions] (val x: Self) extends AnyVal {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
  }
}
