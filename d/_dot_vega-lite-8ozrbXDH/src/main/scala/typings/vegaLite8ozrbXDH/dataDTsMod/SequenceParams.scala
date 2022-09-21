package typings.vegaLite8ozrbXDH.dataDTsMod

import typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SequenceParams extends StObject {
  
  /**
    * The name of the generated sequence field.
    *
    * __Default value:__ `"data"`
    */
  var as: js.UndefOr[FieldName] = js.undefined
  
  /**
    * The starting value of the sequence (inclusive).
    */
  var start: Double
  
  /**
    * The step value between sequence entries.
    *
    * __Default value:__ `1`
    */
  var step: js.UndefOr[Double] = js.undefined
  
  /**
    * The ending value of the sequence (exclusive).
    */
  var stop: Double
}
object SequenceParams {
  
  inline def apply(start: Double, stop: Double): SequenceParams = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceParams]
  }
  
  extension [Self <: SequenceParams](x: Self) {
    
    inline def setAs(value: FieldName): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setStop(value: Double): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
  }
}
