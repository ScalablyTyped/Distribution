package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resource extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var arn: js.UndefOr[String] = js.undefined
  
  /**
    * The time when the resource was associated with the resource share.
    */
  var creationTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The time when the association was last updated.
    */
  var lastUpdatedTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The ARN of the resource group. This value is returned only if the resource is a resource group.
    */
  var resourceGroupArn: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the resource.
    */
  var status: js.UndefOr[ResourceStatus] = js.undefined
  
  /**
    * A message about the status of the resource.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The resource type.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object Resource {
  
  @scala.inline
  def apply(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  
  @scala.inline
  implicit class ResourceMutableBuilder[Self <: Resource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: DateTime): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: DateTime): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    @scala.inline
    def setResourceGroupArn(value: String): Self = StObject.set(x, "resourceGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceGroupArnUndefined: Self = StObject.set(x, "resourceGroupArn", js.undefined)
    
    @scala.inline
    def setResourceShareArn(value: String): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceShareArnUndefined: Self = StObject.set(x, "resourceShareArn", js.undefined)
    
    @scala.inline
    def setStatus(value: ResourceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
