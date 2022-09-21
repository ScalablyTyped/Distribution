package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resource extends StObject {
  
  /**
    * The Amazon Resoure Name (ARN) of the resource.
    */
  var arn: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time when the resource was associated with the resource share.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date an time when the association was last updated.
    */
  var lastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resoure Name (ARN) of the resource group. This value is available only if the resource is part of a resource group.
    */
  var resourceGroupArn: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the scope of visibility of this resource:    REGIONAL – The resource can be accessed only by using requests that target the Amazon Web Services Region in which the resource exists.    GLOBAL – The resource can be accessed from any Amazon Web Services Region.  
    */
  var resourceRegionScope: js.UndefOr[ResourceRegionScope] = js.undefined
  
  /**
    * The Amazon Resoure Name (ARN) of the resource share this resource is associated with.
    */
  var resourceShareArn: js.UndefOr[String] = js.undefined
  
  /**
    * The current status of the resource.
    */
  var status: js.UndefOr[ResourceStatus] = js.undefined
  
  /**
    * A message about the status of the resource.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The resource type. This takes the form of: service-code:resource-code 
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object Resource {
  
  inline def apply(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  
  extension [Self <: Resource](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    inline def setResourceGroupArn(value: String): Self = StObject.set(x, "resourceGroupArn", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupArnUndefined: Self = StObject.set(x, "resourceGroupArn", js.undefined)
    
    inline def setResourceRegionScope(value: ResourceRegionScope): Self = StObject.set(x, "resourceRegionScope", value.asInstanceOf[js.Any])
    
    inline def setResourceRegionScopeUndefined: Self = StObject.set(x, "resourceRegionScope", js.undefined)
    
    inline def setResourceShareArn(value: String): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
    
    inline def setResourceShareArnUndefined: Self = StObject.set(x, "resourceShareArn", js.undefined)
    
    inline def setStatus(value: ResourceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
