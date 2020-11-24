package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElasticIpStatus extends js.Object {
  
  /**
    * The elastic IP (EIP) address for the cluster.
    */
  var ElasticIp: js.UndefOr[String] = js.native
  
  /**
    * The status of the elastic IP (EIP) address.
    */
  var Status: js.UndefOr[String] = js.native
}
object ElasticIpStatus {
  
  @scala.inline
  def apply(): ElasticIpStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticIpStatus]
  }
  
  @scala.inline
  implicit class ElasticIpStatusOps[Self <: ElasticIpStatus] (val x: Self) extends AnyVal {
    
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
    def setElasticIp(value: String): Self = this.set("ElasticIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElasticIp: Self = this.set("ElasticIp", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
