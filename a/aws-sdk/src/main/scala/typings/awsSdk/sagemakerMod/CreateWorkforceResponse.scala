package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateWorkforceResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the workforce.
    */
  var WorkforceArn: typings.awsSdk.sagemakerMod.WorkforceArn = js.native
}
object CreateWorkforceResponse {
  
  @scala.inline
  def apply(WorkforceArn: WorkforceArn): CreateWorkforceResponse = {
    val __obj = js.Dynamic.literal(WorkforceArn = WorkforceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkforceResponse]
  }
  
  @scala.inline
  implicit class CreateWorkforceResponseOps[Self <: CreateWorkforceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWorkforceArn(value: WorkforceArn): Self = this.set("WorkforceArn", value.asInstanceOf[js.Any])
  }
}
