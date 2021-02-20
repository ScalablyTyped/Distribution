package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PredictInput extends StObject {
  
  /**
    * A unique identifier of the MLModel.
    */
  var MLModelId: EntityId = js.native
  
  var PredictEndpoint: VipURL = js.native
  
  var Record: typings.awsSdk.machinelearningMod.Record = js.native
}
object PredictInput {
  
  @scala.inline
  def apply(MLModelId: EntityId, PredictEndpoint: VipURL, Record: Record): PredictInput = {
    val __obj = js.Dynamic.literal(MLModelId = MLModelId.asInstanceOf[js.Any], PredictEndpoint = PredictEndpoint.asInstanceOf[js.Any], Record = Record.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredictInput]
  }
  
  @scala.inline
  implicit class PredictInputMutableBuilder[Self <: PredictInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMLModelId(value: EntityId): Self = StObject.set(x, "MLModelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictEndpoint(value: VipURL): Self = StObject.set(x, "PredictEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecord(value: Record): Self = StObject.set(x, "Record", value.asInstanceOf[js.Any])
  }
}
