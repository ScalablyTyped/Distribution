package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PickleRejected. */
trait IPickleRejected extends StObject {
  
  /** PickleRejected pickleId */
  var pickleId: js.UndefOr[String | Null] = js.undefined
}
object IPickleRejected {
  
  inline def apply(): IPickleRejected = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPickleRejected]
  }
  
  extension [Self <: IPickleRejected](x: Self) {
    
    inline def setPickleId(value: String): Self = StObject.set(x, "pickleId", value.asInstanceOf[js.Any])
    
    inline def setPickleIdNull: Self = StObject.set(x, "pickleId", null)
    
    inline def setPickleIdUndefined: Self = StObject.set(x, "pickleId", js.undefined)
  }
}
