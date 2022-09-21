package typings.awsSdk.identitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlternateIdentifier extends StObject {
  
  /**
    * The identifier issued to this resource by an external identity provider.
    */
  var ExternalId: js.UndefOr[typings.awsSdk.identitystoreMod.ExternalId] = js.undefined
  
  /**
    * An entity attribute that's unique to a specific entity.
    */
  var UniqueAttribute: js.UndefOr[typings.awsSdk.identitystoreMod.UniqueAttribute] = js.undefined
}
object AlternateIdentifier {
  
  inline def apply(): AlternateIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlternateIdentifier]
  }
  
  extension [Self <: AlternateIdentifier](x: Self) {
    
    inline def setExternalId(value: ExternalId): Self = StObject.set(x, "ExternalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "ExternalId", js.undefined)
    
    inline def setUniqueAttribute(value: UniqueAttribute): Self = StObject.set(x, "UniqueAttribute", value.asInstanceOf[js.Any])
    
    inline def setUniqueAttributeUndefined: Self = StObject.set(x, "UniqueAttribute", js.undefined)
  }
}
