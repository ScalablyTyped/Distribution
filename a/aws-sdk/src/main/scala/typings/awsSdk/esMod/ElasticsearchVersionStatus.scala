package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElasticsearchVersionStatus extends StObject {
  
  /**
    *  Specifies the Elasticsearch version for the specified Elasticsearch domain.
    */
  var Options: ElasticsearchVersionString
  
  /**
    *  Specifies the status of the Elasticsearch version options for the specified Elasticsearch domain.
    */
  var Status: OptionStatus
}
object ElasticsearchVersionStatus {
  
  @scala.inline
  def apply(Options: ElasticsearchVersionString, Status: OptionStatus): ElasticsearchVersionStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticsearchVersionStatus]
  }
  
  @scala.inline
  implicit class ElasticsearchVersionStatusMutableBuilder[Self <: ElasticsearchVersionStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: ElasticsearchVersionString): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
