package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3LogsConfigurationResult extends StObject {
  
  /**
    * A value that describes whether S3 data event logs are automatically enabled for new members of the organization.
    */
  var Status: DataSourceStatus
}
object S3LogsConfigurationResult {
  
  @scala.inline
  def apply(Status: DataSourceStatus): S3LogsConfigurationResult = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3LogsConfigurationResult]
  }
  
  @scala.inline
  implicit class S3LogsConfigurationResultMutableBuilder[Self <: S3LogsConfigurationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: DataSourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
