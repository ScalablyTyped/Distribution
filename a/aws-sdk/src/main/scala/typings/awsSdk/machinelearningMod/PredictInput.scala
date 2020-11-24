package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PredictInput extends js.Object {
  
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
  implicit class PredictInputOps[Self <: PredictInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMLModelId(value: EntityId): Self = this.set("MLModelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictEndpoint(value: VipURL): Self = this.set("PredictEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecord(value: Record): Self = this.set("Record", value.asInstanceOf[js.Any])
  }
}
