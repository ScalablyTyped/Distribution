package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delegate extends StObject {
  
  /**
    * The identifier for the user or group associated as the resource's delegate.
    */
  var Id: String
  
  /**
    * The type of the delegate: user or group.
    */
  var Type: MemberType
}
object Delegate {
  
  inline def apply(Id: String, Type: MemberType): Delegate = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delegate]
  }
  
  extension [Self <: Delegate](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setType(value: MemberType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
