package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedOptionsStatus extends StObject {
  
  /**
    *  Specifies the status of advanced options for the specified Elasticsearch domain.
    */
  var Options: AdvancedOptions
  
  /**
    *  Specifies the status of OptionStatus for advanced options for the specified Elasticsearch domain.
    */
  var Status: OptionStatus
}
object AdvancedOptionsStatus {
  
  inline def apply(Options: AdvancedOptions, Status: OptionStatus): AdvancedOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedOptionsStatus]
  }
  
  extension [Self <: AdvancedOptionsStatus](x: Self) {
    
    inline def setOptions(value: AdvancedOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
