package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutInventoryResult extends StObject {
  
  /**
    * Information about the request.
    */
  var Message: js.UndefOr[PutInventoryMessage] = js.undefined
}
object PutInventoryResult {
  
  inline def apply(): PutInventoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutInventoryResult]
  }
  
  extension [Self <: PutInventoryResult](x: Self) {
    
    inline def setMessage(value: PutInventoryMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
