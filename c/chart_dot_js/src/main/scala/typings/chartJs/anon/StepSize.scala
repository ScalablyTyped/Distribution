package typings.chartJs.anon

import typings.chartJs.chartJsStrings.auto
import typings.chartJs.chartJsStrings.data
import typings.chartJs.chartJsStrings.labels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepSize extends StObject {
  
  /**
    * Ticks generation input values:
    * - 'auto': generates "optimal" ticks based on scale size and time options.
    * - 'data': generates ticks from data (including labels from data `{t|x|y}` objects).
    * - 'labels': generates ticks from user given `data.labels` values ONLY.
    * @see https://github.com/chartjs/Chart.js/pull/4507
    * @since 2.7.0
    * @default 'auto'
    */
  var source: labels | auto | data
  
  /**
    * The number of units between grid lines.
    * @default 1
    */
  var stepSize: Double
}
object StepSize {
  
  inline def apply(source: labels | auto | data, stepSize: Double): StepSize = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], stepSize = stepSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StepSize] (val x: Self) extends AnyVal {
    
    inline def setSource(value: labels | auto | data): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setStepSize(value: Double): Self = StObject.set(x, "stepSize", value.asInstanceOf[js.Any])
  }
}
