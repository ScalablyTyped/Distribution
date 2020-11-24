package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteUsageLimitMessage extends js.Object {
  
  /**
    * The identifier of the usage limit to delete.
    */
  var UsageLimitId: String = js.native
}
object DeleteUsageLimitMessage {
  
  @scala.inline
  def apply(UsageLimitId: String): DeleteUsageLimitMessage = {
    val __obj = js.Dynamic.literal(UsageLimitId = UsageLimitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUsageLimitMessage]
  }
  
  @scala.inline
  implicit class DeleteUsageLimitMessageOps[Self <: DeleteUsageLimitMessage] (val x: Self) extends AnyVal {
    
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
    def setUsageLimitId(value: String): Self = this.set("UsageLimitId", value.asInstanceOf[js.Any])
  }
}
