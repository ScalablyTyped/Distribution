package typings.consumerDataStandards.registerMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Alg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseJWKS
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The value of the "keys" parameter is an array of JWK values
    */
  var keys: js.Array[Alg]
}
object ResponseJWKS {
  
  inline def apply(keys: js.Array[Alg]): ResponseJWKS = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseJWKS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseJWKS] (val x: Self) extends AnyVal {
    
    inline def setKeys(value: js.Array[Alg]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: Alg*): Self = StObject.set(x, "keys", js.Array(value*))
  }
}
