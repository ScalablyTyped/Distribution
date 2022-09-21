package typings.awsSdk.keyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreTableResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the restored table.
    */
  var restoredTableARN: ARN
}
object RestoreTableResponse {
  
  inline def apply(restoredTableARN: ARN): RestoreTableResponse = {
    val __obj = js.Dynamic.literal(restoredTableARN = restoredTableARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreTableResponse]
  }
  
  extension [Self <: RestoreTableResponse](x: Self) {
    
    inline def setRestoredTableARN(value: ARN): Self = StObject.set(x, "restoredTableARN", value.asInstanceOf[js.Any])
  }
}
