package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Namespace extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the namespace when you create it.
    */
  var Arn: js.UndefOr[typings.awsSdk.servicediscoveryMod.Arn] = js.native
  
  /**
    * The date that the namespace was created, in Unix date/time format and Coordinated Universal Time (UTC). The value of CreateDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreateDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * A unique string that identifies the request and that allows failed requests to be retried without the risk of executing an operation twice. 
    */
  var CreatorRequestId: js.UndefOr[ResourceId] = js.native
  
  /**
    * The description that you specify for the namespace when you create it.
    */
  var Description: js.UndefOr[ResourceDescription] = js.native
  
  /**
    * The ID of a namespace.
    */
  var Id: js.UndefOr[ResourceId] = js.native
  
  /**
    * The name of the namespace, such as example.com.
    */
  var Name: js.UndefOr[NamespaceName] = js.native
  
  /**
    * A complex type that contains information that's specific to the type of the namespace.
    */
  var Properties: js.UndefOr[NamespaceProperties] = js.native
  
  /**
    * The number of services that are associated with the namespace.
    */
  var ServiceCount: js.UndefOr[ResourceCount] = js.native
  
  /**
    * The type of the namespace. The methods for discovering instances depends on the value that you specify:    HTTP: Instances can be discovered only programmatically, using the AWS Cloud Map DiscoverInstances API.    DNS_PUBLIC: Instances can be discovered using public DNS queries and using the DiscoverInstances API.    DNS_PRIVATE: Instances can be discovered using DNS queries in VPCs and using the DiscoverInstances API.  
    */
  var Type: js.UndefOr[NamespaceType] = js.native
}
object Namespace {
  
  @scala.inline
  def apply(): Namespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Namespace]
  }
  
  @scala.inline
  implicit class NamespaceOps[Self <: Namespace] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setCreateDate(value: Timestamp): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    
    @scala.inline
    def setCreatorRequestId(value: ResourceId): Self = this.set("CreatorRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatorRequestId: Self = this.set("CreatorRequestId", js.undefined)
    
    @scala.inline
    def setDescription(value: ResourceDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setId(value: ResourceId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setName(value: NamespaceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setProperties(value: NamespaceProperties): Self = this.set("Properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("Properties", js.undefined)
    
    @scala.inline
    def setServiceCount(value: ResourceCount): Self = this.set("ServiceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceCount: Self = this.set("ServiceCount", js.undefined)
    
    @scala.inline
    def setType(value: NamespaceType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
