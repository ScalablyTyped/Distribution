package typings.awsSyntheticsPuppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepDurationMetric extends StObject {
  
  var stepDurationMetric: Boolean
  
  var stepSuccessMetric: Boolean
}
object StepDurationMetric {
  
  inline def apply(stepDurationMetric: Boolean, stepSuccessMetric: Boolean): StepDurationMetric = {
    val __obj = js.Dynamic.literal(stepDurationMetric = stepDurationMetric.asInstanceOf[js.Any], stepSuccessMetric = stepSuccessMetric.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepDurationMetric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StepDurationMetric] (val x: Self) extends AnyVal {
    
    inline def setStepDurationMetric(value: Boolean): Self = StObject.set(x, "stepDurationMetric", value.asInstanceOf[js.Any])
    
    inline def setStepSuccessMetric(value: Boolean): Self = StObject.set(x, "stepSuccessMetric", value.asInstanceOf[js.Any])
  }
}
