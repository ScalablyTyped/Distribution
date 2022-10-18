package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FaultRootCauseEntity extends StObject {
  
  /**
    * The types and messages of the exceptions.
    */
  var Exceptions: js.UndefOr[RootCauseExceptions] = js.undefined
  
  /**
    * The name of the entity.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * A flag that denotes a remote subsegment.
    */
  var Remote: js.UndefOr[NullableBoolean] = js.undefined
}
object FaultRootCauseEntity {
  
  inline def apply(): FaultRootCauseEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaultRootCauseEntity]
  }
  
  extension [Self <: FaultRootCauseEntity](x: Self) {
    
    inline def setExceptions(value: RootCauseExceptions): Self = StObject.set(x, "Exceptions", value.asInstanceOf[js.Any])
    
    inline def setExceptionsUndefined: Self = StObject.set(x, "Exceptions", js.undefined)
    
    inline def setExceptionsVarargs(value: RootCauseException*): Self = StObject.set(x, "Exceptions", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRemote(value: NullableBoolean): Self = StObject.set(x, "Remote", value.asInstanceOf[js.Any])
    
    inline def setRemoteUndefined: Self = StObject.set(x, "Remote", js.undefined)
  }
}
