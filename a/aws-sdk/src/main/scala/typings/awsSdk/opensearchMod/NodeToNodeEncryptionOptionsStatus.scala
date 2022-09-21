package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeToNodeEncryptionOptionsStatus extends StObject {
  
  /**
    * The node-to-node encryption options for the specified domain.
    */
  var Options: NodeToNodeEncryptionOptions
  
  /**
    * The status of the node-to-node encryption options for the specified domain.
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
