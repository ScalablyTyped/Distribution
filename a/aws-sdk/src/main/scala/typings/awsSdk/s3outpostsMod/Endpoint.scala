package typings.awsSdk.s3outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Endpoint extends js.Object {
  
  /**
    * The VPC CIDR committed by this endpoint.
    */
  var CidrBlock: js.UndefOr[typings.awsSdk.s3outpostsMod.CidrBlock] = js.native
  
  /**
    * The time the endpoint was created.
    */
  var CreationTime: js.UndefOr[typings.awsSdk.s3outpostsMod.CreationTime] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint.
    */
  var EndpointArn: js.UndefOr[typings.awsSdk.s3outpostsMod.EndpointArn] = js.native
  
  /**
    * The network interface of the endpoint.
    */
  var NetworkInterfaces: js.UndefOr[typings.awsSdk.s3outpostsMod.NetworkInterfaces] = js.native
  
  /**
    * The ID of the AWS Outpost.
    */
  var OutpostsId: js.UndefOr[OutpostId] = js.native
  
  /**
    * The status of the endpoint.
    */
  var Status: js.UndefOr[EndpointStatus] = js.native
}
object Endpoint {
  
  @scala.inline
  def apply(): Endpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Endpoint]
  }
  
  @scala.inline
  implicit class EndpointOps[Self <: Endpoint] (val x: Self) extends AnyVal {
    
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
    def setCidrBlock(value: CidrBlock): Self = this.set("CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidrBlock: Self = this.set("CidrBlock", js.undefined)
    
    @scala.inline
    def setCreationTime(value: CreationTime): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setEndpointArn(value: EndpointArn): Self = this.set("EndpointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointArn: Self = this.set("EndpointArn", js.undefined)
    
    @scala.inline
    def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = this.set("NetworkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setNetworkInterfaces(value: NetworkInterfaces): Self = this.set("NetworkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterfaces: Self = this.set("NetworkInterfaces", js.undefined)
    
    @scala.inline
    def setOutpostsId(value: OutpostId): Self = this.set("OutpostsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutpostsId: Self = this.set("OutpostsId", js.undefined)
    
    @scala.inline
    def setStatus(value: EndpointStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
