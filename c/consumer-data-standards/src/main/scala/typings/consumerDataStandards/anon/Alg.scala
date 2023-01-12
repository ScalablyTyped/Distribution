package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alg
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The "alg" (algorithm) parameter identifies the algorithm intended for use with the key
    */
  var alg: String
  
  /**
    * The "e" RSA public exponent parameter
    */
  var e: String
  
  /**
    * The "key_ops" (key operations) parameter identifies the operation(s) for which the key is intended to be used
    */
  var key_ops: js.Array[String]
  
  /**
    * The "kid" (key ID) parameter is partially used to match a specific key. Note the "kid" parameter is not guaranteed unique and additional parameters should be used to progressively to identify a key within a set
    */
  var kid: String
  
  /**
    * The "kty" (key type) parameter identifies the cryptographic algorithm family used with the key
    */
  var kty: String
  
  /**
    * The "n" RSA public modulus parameter
    */
  var n: String
}
object Alg {
  
  inline def apply(alg: String, e: String, key_ops: js.Array[String], kid: String, kty: String, n: String): Alg = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], key_ops = key_ops.asInstanceOf[js.Any], kid = kid.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Alg] (val x: Self) extends AnyVal {
    
    inline def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    inline def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    inline def setKey_ops(value: js.Array[String]): Self = StObject.set(x, "key_ops", value.asInstanceOf[js.Any])
    
    inline def setKey_opsVarargs(value: String*): Self = StObject.set(x, "key_ops", js.Array(value*))
    
    inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
    
    inline def setKty(value: String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
    
    inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
  }
}
