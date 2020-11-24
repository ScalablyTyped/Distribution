package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputOrigin extends js.Object {
  
  /**
    * The name of the origin resource.
    */
  var name: js.UndefOr[ResourceName] = js.native
  
  /**
    * The protocol that your Amazon Lightsail distribution uses when establishing a connection with your origin to pull content.
    */
  var protocolPolicy: js.UndefOr[OriginProtocolPolicyEnum] = js.native
  
  /**
    * The AWS Region name of the origin resource.
    */
  var regionName: js.UndefOr[RegionName] = js.native
}
object InputOrigin {
  
  @scala.inline
  def apply(): InputOrigin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputOrigin]
  }
  
  @scala.inline
  implicit class InputOriginOps[Self <: InputOrigin] (val x: Self) extends AnyVal {
    
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
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProtocolPolicy(value: OriginProtocolPolicyEnum): Self = this.set("protocolPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocolPolicy: Self = this.set("protocolPolicy", js.undefined)
    
    @scala.inline
    def setRegionName(value: RegionName): Self = this.set("regionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionName: Self = this.set("regionName", js.undefined)
  }
}
