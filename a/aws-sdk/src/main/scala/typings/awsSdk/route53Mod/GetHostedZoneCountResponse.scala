package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHostedZoneCountResponse extends js.Object {
  
  /**
    * The total number of public and private hosted zones that are associated with the current AWS account.
    */
  var HostedZoneCount: typings.awsSdk.route53Mod.HostedZoneCount = js.native
}
object GetHostedZoneCountResponse {
  
  @scala.inline
  def apply(HostedZoneCount: HostedZoneCount): GetHostedZoneCountResponse = {
    val __obj = js.Dynamic.literal(HostedZoneCount = HostedZoneCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostedZoneCountResponse]
  }
  
  @scala.inline
  implicit class GetHostedZoneCountResponseOps[Self <: GetHostedZoneCountResponse] (val x: Self) extends AnyVal {
    
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
    def setHostedZoneCount(value: HostedZoneCount): Self = this.set("HostedZoneCount", value.asInstanceOf[js.Any])
  }
}
