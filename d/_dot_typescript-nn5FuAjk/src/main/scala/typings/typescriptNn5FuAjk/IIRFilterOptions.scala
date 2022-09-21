package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIRFilterOptions
  extends StObject
     with AudioNodeOptions {
  
  var feedback: Array[Double]
  
  var feedforward: Array[Double]
}
object IIRFilterOptions {
  
  inline def apply(feedback: Array[Double], feedforward: Array[Double]): IIRFilterOptions = {
    val __obj = js.Dynamic.literal(feedback = feedback.asInstanceOf[js.Any], feedforward = feedforward.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIRFilterOptions]
  }
  
  extension [Self <: IIRFilterOptions](x: Self) {
    
    inline def setFeedback(value: Array[Double]): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    inline def setFeedforward(value: Array[Double]): Self = StObject.set(x, "feedforward", value.asInstanceOf[js.Any])
  }
}
