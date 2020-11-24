package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddPermissionResponse extends js.Object {
  
  /**
    * The permission statement that's added to the function policy.
    */
  var Statement: js.UndefOr[String] = js.native
}
object AddPermissionResponse {
  
  @scala.inline
  def apply(): AddPermissionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddPermissionResponse]
  }
  
  @scala.inline
  implicit class AddPermissionResponseOps[Self <: AddPermissionResponse] (val x: Self) extends AnyVal {
    
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
    def setStatement(value: String): Self = this.set("Statement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatement: Self = this.set("Statement", js.undefined)
  }
}
