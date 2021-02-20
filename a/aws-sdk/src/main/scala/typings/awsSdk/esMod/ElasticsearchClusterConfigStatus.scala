package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElasticsearchClusterConfigStatus extends StObject {
  
  /**
    *  Specifies the cluster configuration for the specified Elasticsearch domain.
    */
  var Options: ElasticsearchClusterConfig = js.native
  
  /**
    *  Specifies the status of the configuration for the specified Elasticsearch domain.
    */
  var Status: OptionStatus = js.native
}
object ElasticsearchClusterConfigStatus {
  
  @scala.inline
  def apply(Options: ElasticsearchClusterConfig, Status: OptionStatus): ElasticsearchClusterConfigStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticsearchClusterConfigStatus]
  }
  
  @scala.inline
  implicit class ElasticsearchClusterConfigStatusMutableBuilder[Self <: ElasticsearchClusterConfigStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: ElasticsearchClusterConfig): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
