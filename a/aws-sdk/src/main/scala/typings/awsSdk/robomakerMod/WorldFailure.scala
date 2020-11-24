package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorldFailure extends js.Object {
  
  /**
    * The failure code of the world export job if it failed:  InternalServiceError  Internal service error.  LimitExceeded  The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests exceeds the maximum number allowed.   ResourceNotFound  The specified resource could not be found.   RequestThrottled  The request was throttled.  InvalidInput  An input parameter in the request is not valid.  
    */
  var failureCode: js.UndefOr[WorldGenerationJobErrorCode] = js.native
  
  /**
    * The number of failed worlds.
    */
  var failureCount: js.UndefOr[Integer] = js.native
  
  /**
    * The sample reason why the world failed. World errors are aggregated. A sample is used as the sampleFailureReason. 
    */
  var sampleFailureReason: js.UndefOr[GenericString] = js.native
}
object WorldFailure {
  
  @scala.inline
  def apply(): WorldFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorldFailure]
  }
  
  @scala.inline
  implicit class WorldFailureOps[Self <: WorldFailure] (val x: Self) extends AnyVal {
    
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
    def setFailureCode(value: WorldGenerationJobErrorCode): Self = this.set("failureCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureCode: Self = this.set("failureCode", js.undefined)
    
    @scala.inline
    def setFailureCount(value: Integer): Self = this.set("failureCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureCount: Self = this.set("failureCount", js.undefined)
    
    @scala.inline
    def setSampleFailureReason(value: GenericString): Self = this.set("sampleFailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleFailureReason: Self = this.set("sampleFailureReason", js.undefined)
  }
}
