package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetQueryLoggingConfigRequest extends js.Object {
  
  /**
    * The ID of the configuration for DNS query logging that you want to get information about.
    */
  var Id: QueryLoggingConfigId = js.native
}
object GetQueryLoggingConfigRequest {
  
  @scala.inline
  def apply(Id: QueryLoggingConfigId): GetQueryLoggingConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueryLoggingConfigRequest]
  }
  
  @scala.inline
  implicit class GetQueryLoggingConfigRequestOps[Self <: GetQueryLoggingConfigRequest] (val x: Self) extends AnyVal {
    
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
    def setId(value: QueryLoggingConfigId): Self = this.set("Id", value.asInstanceOf[js.Any])
  }
}
