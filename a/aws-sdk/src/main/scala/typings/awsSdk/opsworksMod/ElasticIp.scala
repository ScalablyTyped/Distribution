package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElasticIp extends js.Object {
  
  /**
    * The domain.
    */
  var Domain: js.UndefOr[String] = js.native
  
  /**
    * The ID of the instance that the address is attached to.
    */
  var InstanceId: js.UndefOr[String] = js.native
  
  /**
    * The IP address.
    */
  var Ip: js.UndefOr[String] = js.native
  
  /**
    * The name.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The AWS region. For more information, see Regions and Endpoints.
    */
  var Region: js.UndefOr[String] = js.native
}
object ElasticIp {
  
  @scala.inline
  def apply(): ElasticIp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticIp]
  }
  
  @scala.inline
  implicit class ElasticIpOps[Self <: ElasticIp] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: String): Self = this.set("Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("Domain", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    
    @scala.inline
    def setIp(value: String): Self = this.set("Ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIp: Self = this.set("Ip", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
  }
}
