package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DNSLogsConfigurationResult extends StObject {
  
  /**
    * Denotes whether DNS logs is enabled as a data source.
    */
  var Status: DataSourceStatus = js.native
}
object DNSLogsConfigurationResult {
  
  @scala.inline
  def apply(Status: DataSourceStatus): DNSLogsConfigurationResult = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DNSLogsConfigurationResult]
  }
  
  @scala.inline
  implicit class DNSLogsConfigurationResultMutableBuilder[Self <: DNSLogsConfigurationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: DataSourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
