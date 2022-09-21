package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VersionStatus extends StObject {
  
  /**
    * The OpenSearch version for the specified OpenSearch domain.
    */
  var Options: VersionString
  
  /**
    * The status of the OpenSearch version options for the specified OpenSearch domain.
    */
  var Status: OptionStatus
}
object VersionStatus {
  
  inline def apply(Options: VersionString, Status: OptionStatus): VersionStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionStatus]
  }
  
  extension [Self <: VersionStatus](x: Self) {
    
    inline def setOptions(value: VersionString): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
