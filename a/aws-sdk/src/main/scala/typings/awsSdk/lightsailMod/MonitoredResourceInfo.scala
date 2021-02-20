package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoredResourceInfo extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource being monitored.
    */
  var arn: js.UndefOr[ResourceArn] = js.native
  
  /**
    * The name of the Lightsail resource being monitored.
    */
  var name: js.UndefOr[ResourceName] = js.native
  
  /**
    * The Lightsail resource type of the resource being monitored. Instances, load balancers, and relational databases are the only Lightsail resources that can currently be monitored by alarms.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
}
object MonitoredResourceInfo {
  
  @scala.inline
  def apply(): MonitoredResourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoredResourceInfo]
  }
  
  @scala.inline
  implicit class MonitoredResourceInfoMutableBuilder[Self <: MonitoredResourceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ResourceArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
