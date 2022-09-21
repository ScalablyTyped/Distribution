package typings.azureCoreClient.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolymorphicDiscriminator
  extends StObject
     with /**
  * It may contain any other property.
  */
/* key */ StringDictionary[String] {
  
  /**
    * Name to use on the resulting object instead of the original property name.
    * Useful since the JSON property could be difficult to work with.
    * For example: For a field received as `@odata.kind`, the final object could instead include a property simply named `kind`.
    */
  var clientName: String
  
  /**
    * Name of the discriminant property in the original JSON payload, e.g. `@odata.kind`.
    */
  var serializedName: String
}
object PolymorphicDiscriminator {
  
  inline def apply(clientName: String, serializedName: String): PolymorphicDiscriminator = {
    val __obj = js.Dynamic.literal(clientName = clientName.asInstanceOf[js.Any], serializedName = serializedName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolymorphicDiscriminator]
  }
  
  extension [Self <: PolymorphicDiscriminator](x: Self) {
    
    inline def setClientName(value: String): Self = StObject.set(x, "clientName", value.asInstanceOf[js.Any])
    
    inline def setSerializedName(value: String): Self = StObject.set(x, "serializedName", value.asInstanceOf[js.Any])
  }
}
