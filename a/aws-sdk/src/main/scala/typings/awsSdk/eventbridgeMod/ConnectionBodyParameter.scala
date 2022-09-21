package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionBodyParameter extends StObject {
  
  /**
    * Specified whether the value is secret.
    */
  var IsValueSecret: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The key for the parameter.
    */
  var Key: js.UndefOr[String] = js.undefined
  
  /**
    * The value associated with the key.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object ConnectionBodyParameter {
  
  inline def apply(): ConnectionBodyParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionBodyParameter]
  }
  
  extension [Self <: ConnectionBodyParameter](x: Self) {
    
    inline def setIsValueSecret(value: Boolean): Self = StObject.set(x, "IsValueSecret", value.asInstanceOf[js.Any])
    
    inline def setIsValueSecretUndefined: Self = StObject.set(x, "IsValueSecret", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
