package typings.awsSdk.emrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualCluster extends StObject {
  
  /**
    * The ARN of the virtual cluster.
    */
  var arn: js.UndefOr[VirtualClusterArn] = js.undefined
  
  /**
    * The container provider of the virtual cluster.
    */
  var containerProvider: js.UndefOr[ContainerProvider] = js.undefined
  
  /**
    * The date and time when the virtual cluster is created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the virtual cluster.
    */
  var id: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    * The name of the virtual cluster.
    */
  var name: js.UndefOr[ResourceNameString] = js.undefined
  
  /**
    * The state of the virtual cluster.
    */
  var state: js.UndefOr[VirtualClusterState] = js.undefined
  
  /**
    * The assigned tags of the virtual cluster.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object VirtualCluster {
  
  inline def apply(): VirtualCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualCluster]
  }
  
  extension [Self <: VirtualCluster](x: Self) {
    
    inline def setArn(value: VirtualClusterArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setContainerProvider(value: ContainerProvider): Self = StObject.set(x, "containerProvider", value.asInstanceOf[js.Any])
    
    inline def setContainerProviderUndefined: Self = StObject.set(x, "containerProvider", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setId(value: ResourceIdString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: ResourceNameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: VirtualClusterState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
