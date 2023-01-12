package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyVaultKey extends StObject {
  
  /**
    * Key identifier.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The key value.
    */
  var key: js.UndefOr[JsonWebKey2] = js.undefined
  
  /**
    * Operations allowed on this key
    */
  var keyOperations: js.UndefOr[js.Array[KeyOperation]] = js.undefined
  
  /**
    * JsonWebKey Key Type (kty), as defined in
    * https://tools.ietf.org/html/draft-ietf-jose-json-web-algorithms-40. Possible values include:
    * 'EC', 'EC-HSM', 'RSA', 'RSA-HSM', 'oct', "oct-HSM"
    */
  var keyType: js.UndefOr[KeyType2] = js.undefined
  
  /**
    * The name of the key.
    */
  var name: String
  
  /**
    * The properties of the key.
    */
  var properties: KeyProperties
}
object KeyVaultKey {
  
  inline def apply(name: String, properties: KeyProperties): KeyVaultKey = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyVaultKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyVaultKey] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKey(value: JsonWebKey2): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyOperations(value: js.Array[KeyOperation]): Self = StObject.set(x, "keyOperations", value.asInstanceOf[js.Any])
    
    inline def setKeyOperationsUndefined: Self = StObject.set(x, "keyOperations", js.undefined)
    
    inline def setKeyOperationsVarargs(value: KeyOperation*): Self = StObject.set(x, "keyOperations", js.Array(value*))
    
    inline def setKeyType(value: KeyType2): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    inline def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: KeyProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
