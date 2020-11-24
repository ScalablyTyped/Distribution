package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsService extends js.Object {
  
  /**
    * The name of the AWS service that performed the action.
    */
  var invokedBy: js.UndefOr[string] = js.native
}
object AwsService {
  
  @scala.inline
  def apply(): AwsService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsService]
  }
  
  @scala.inline
  implicit class AwsServiceOps[Self <: AwsService] (val x: Self) extends AnyVal {
    
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
    def setInvokedBy(value: string): Self = this.set("invokedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvokedBy: Self = this.set("invokedBy", js.undefined)
  }
}
