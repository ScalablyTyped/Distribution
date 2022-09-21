package typings.awsSdk.mgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinalizeCutoverRequest extends StObject {
  
  /**
    * Request to finalize Cutover by Source Server ID.
    */
  var sourceServerID: SourceServerID
}
object FinalizeCutoverRequest {
  
  inline def apply(sourceServerID: SourceServerID): FinalizeCutoverRequest = {
    val __obj = js.Dynamic.literal(sourceServerID = sourceServerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalizeCutoverRequest]
  }
  
  extension [Self <: FinalizeCutoverRequest](x: Self) {
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
  }
}
