package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUsageLimitMessage extends StObject {
  
  /**
    * The identifier of the usage limit to delete.
    */
  var UsageLimitId: String
}
object DeleteUsageLimitMessage {
  
  inline def apply(UsageLimitId: String): DeleteUsageLimitMessage = {
    val __obj = js.Dynamic.literal(UsageLimitId = UsageLimitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUsageLimitMessage]
  }
  
  extension [Self <: DeleteUsageLimitMessage](x: Self) {
    
    inline def setUsageLimitId(value: String): Self = StObject.set(x, "UsageLimitId", value.asInstanceOf[js.Any])
  }
}
