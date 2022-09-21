package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteServiceInput extends StObject {
  
  /**
    * The name of the service to delete.
    */
  var name: ResourceName
}
object DeleteServiceInput {
  
  inline def apply(name: ResourceName): DeleteServiceInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServiceInput]
  }
  
  extension [Self <: DeleteServiceInput](x: Self) {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
