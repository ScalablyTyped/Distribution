package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeToNodeEncryptionOptionsStatus extends StObject {
  
  /**
    * Specifies the node-to-node encryption options for the specified Elasticsearch domain.
    */
  var Options: NodeToNodeEncryptionOptions
  
  /**
    * Specifies the status of the node-to-node encryption options for the specified Elasticsearch domain.
    */
  var Status: OptionStatus
}
object NodeToNodeEncryptionOptionsStatus {
  
  inline def apply(Options: NodeToNodeEncryptionOptions, Status: OptionStatus): NodeToNodeEncryptionOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeToNodeEncryptionOptionsStatus]
  }
  
  extension [Self <: NodeToNodeEncryptionOptionsStatus](x: Self) {
    
    inline def setOptions(value: NodeToNodeEncryptionOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
