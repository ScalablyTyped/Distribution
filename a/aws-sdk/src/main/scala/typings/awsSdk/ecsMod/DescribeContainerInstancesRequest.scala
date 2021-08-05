package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeContainerInstancesRequest extends StObject {
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instances to describe. If you do not specify a cluster, the default cluster is assumed. This parameter is required if the container instance or container instances you are describing were launched in any cluster other than the default cluster.
    */
  var cluster: js.UndefOr[String] = js.undefined
  
  /**
    * A list of up to 100 container instance IDs or full Amazon Resource Name (ARN) entries.
    */
  var containerInstances: StringList
  
  /**
    * Specifies whether you want to see the resource tags for the container instance. If TAGS is specified, the tags are included in the response. If this field is omitted, tags are not included in the response.
    */
  var include: js.UndefOr[ContainerInstanceFieldList] = js.undefined
}
object DescribeContainerInstancesRequest {
  
  inline def apply(containerInstances: StringList): DescribeContainerInstancesRequest = {
    val __obj = js.Dynamic.literal(containerInstances = containerInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeContainerInstancesRequest]
  }
  
  extension [Self <: DescribeContainerInstancesRequest](x: Self) {
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setContainerInstances(value: StringList): Self = StObject.set(x, "containerInstances", value.asInstanceOf[js.Any])
    
    inline def setContainerInstancesVarargs(value: String*): Self = StObject.set(x, "containerInstances", js.Array(value :_*))
    
    inline def setInclude(value: ContainerInstanceFieldList): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: ContainerInstanceField*): Self = StObject.set(x, "include", js.Array(value :_*))
  }
}
