package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobFailure extends js.Object {
  
  /**
    * The failure code, if any, for the specified job.
    */
  var FailureCode: js.UndefOr[JobFailureCode] = js.native
  
  /**
    * The failure reason, if any, for the specified job.
    */
  var FailureReason: js.UndefOr[JobFailureReason] = js.native
}
object JobFailure {
  
  @scala.inline
  def apply(): JobFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobFailure]
  }
  
  @scala.inline
  implicit class JobFailureOps[Self <: JobFailure] (val x: Self) extends AnyVal {
    
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
    def setFailureCode(value: JobFailureCode): Self = this.set("FailureCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureCode: Self = this.set("FailureCode", js.undefined)
    
    @scala.inline
    def setFailureReason(value: JobFailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
  }
}
