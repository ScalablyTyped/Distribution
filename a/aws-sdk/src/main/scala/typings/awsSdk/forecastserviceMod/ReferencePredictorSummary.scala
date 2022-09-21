package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferencePredictorSummary extends StObject {
  
  /**
    * The ARN of the reference predictor.
    */
  var Arn: js.UndefOr[typings.awsSdk.forecastserviceMod.Arn] = js.undefined
  
  /**
    * Whether the reference predictor is Active or Deleted.
    */
  var State: js.UndefOr[typings.awsSdk.forecastserviceMod.State] = js.undefined
}
object ReferencePredictorSummary {
  
  inline def apply(): ReferencePredictorSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferencePredictorSummary]
  }
  
  extension [Self <: ReferencePredictorSummary](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setState(value: State): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
