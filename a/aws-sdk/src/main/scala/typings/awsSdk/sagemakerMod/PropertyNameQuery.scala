package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyNameQuery extends StObject {
  
  /**
    * Text that begins a property's name.
    */
  var PropertyNameHint: typings.awsSdk.sagemakerMod.PropertyNameHint
}
object PropertyNameQuery {
  
  inline def apply(PropertyNameHint: PropertyNameHint): PropertyNameQuery = {
    val __obj = js.Dynamic.literal(PropertyNameHint = PropertyNameHint.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyNameQuery]
  }
  
  extension [Self <: PropertyNameQuery](x: Self) {
    
    inline def setPropertyNameHint(value: PropertyNameHint): Self = StObject.set(x, "PropertyNameHint", value.asInstanceOf[js.Any])
  }
}
