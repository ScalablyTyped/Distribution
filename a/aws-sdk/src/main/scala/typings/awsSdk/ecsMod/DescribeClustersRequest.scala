package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClustersRequest extends StObject {
  
  /**
    * A list of up to 100 cluster names or full cluster Amazon Resource Name (ARN) entries. If you do not specify a cluster, the default cluster is assumed.
    */
  var clusters: js.UndefOr[StringList] = js.undefined
  
  /**
    * Whether to include additional information about your clusters in the response. If this field is omitted, the attachments, statistics, and tags are not included. If ATTACHMENTS is specified, the attachments for the container instances or tasks within the cluster are included. If SETTINGS is specified, the settings for the cluster are included. If STATISTICS is specified, the following additional information, separated by launch type, is included:   runningEC2TasksCount   runningFargateTasksCount   pendingEC2TasksCount   pendingFargateTasksCount   activeEC2ServiceCount   activeFargateServiceCount   drainingEC2ServiceCount   drainingFargateServiceCount   If TAGS is specified, the metadata tags associated with the cluster are included.
    */
  var include: js.UndefOr[ClusterFieldList] = js.undefined
}
object DescribeClustersRequest {
  
  inline def apply(): DescribeClustersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClustersRequest]
  }
  
  extension [Self <: DescribeClustersRequest](x: Self) {
    
    inline def setClusters(value: StringList): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    inline def setClustersUndefined: Self = StObject.set(x, "clusters", js.undefined)
    
    inline def setClustersVarargs(value: String*): Self = StObject.set(x, "clusters", js.Array(value :_*))
    
    inline def setInclude(value: ClusterFieldList): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: ClusterField*): Self = StObject.set(x, "include", js.Array(value :_*))
  }
}
