package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * As of http://tools.ietf.org/html/draft-ietf-jose-json-web-key-18
  */
trait JsonWebKey2 extends StObject {
  
  /**
    * Elliptic curve name. For valid values, see KeyCurveName. Possible values include:
    * 'P-256', 'P-384', 'P-521', 'P-256K'
    */
  var crv: js.UndefOr[KeyCurveName] = js.undefined
  
  /**
    * RSA private exponent, or the D component of an EC private key.
    */
  var d: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * RSA private key parameter.
    */
  var dp: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * RSA private key parameter.
    */
  var dq: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * RSA public exponent.
    */
  var e: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * Symmetric key.
    */
  var k: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * Json web key operations. For more
    * information on possible key operations, see KeyOperation.
    */
  var keyOps: js.UndefOr[js.Array[KeyOperation]] = js.undefined
  
  /**
    * Key identifier.
    */
  var kid: js.UndefOr[String] = js.undefined
  
  /**
    * JsonWebKey Key Type (kty), as defined in
    * https://tools.ietf.org/html/draft-ietf-jose-json-web-algorithms-40. Possible values include:
    * 'EC', 'EC-HSM', 'RSA', 'RSA-HSM', 'oct', "oct-HSM"
    */
  var kty: js.UndefOr[KeyType2] = js.undefined
  
  /**
    * RSA modulus.
    */
  var n: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * RSA secret prime.
    */
  var p: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * RSA secret prime, with `p < q`.
    */
  var q: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * RSA private key parameter.
    */
  var qi: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * HSM Token, used with 'Bring Your Own Key'.
    */
  var t: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * X component of an EC public key.
    */
  var x: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * Y component of an EC public key.
    */
  var y: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
}
object JsonWebKey2 {
  
  inline def apply(): JsonWebKey2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonWebKey2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonWebKey2] (val x: Self) extends AnyVal {
    
    inline def setCrv(value: KeyCurveName): Self = StObject.set(x, "crv", value.asInstanceOf[js.Any])
    
    inline def setCrvUndefined: Self = StObject.set(x, "crv", js.undefined)
    
    inline def setD(value: js.typedarray.Uint8Array): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    inline def setDp(value: js.typedarray.Uint8Array): Self = StObject.set(x, "dp", value.asInstanceOf[js.Any])
    
    inline def setDpUndefined: Self = StObject.set(x, "dp", js.undefined)
    
    inline def setDq(value: js.typedarray.Uint8Array): Self = StObject.set(x, "dq", value.asInstanceOf[js.Any])
    
    inline def setDqUndefined: Self = StObject.set(x, "dq", js.undefined)
    
    inline def setE(value: js.typedarray.Uint8Array): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
    
    inline def setK(value: js.typedarray.Uint8Array): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    inline def setKUndefined: Self = StObject.set(x, "k", js.undefined)
    
    inline def setKeyOps(value: js.Array[KeyOperation]): Self = StObject.set(x, "keyOps", value.asInstanceOf[js.Any])
    
    inline def setKeyOpsUndefined: Self = StObject.set(x, "keyOps", js.undefined)
    
    inline def setKeyOpsVarargs(value: KeyOperation*): Self = StObject.set(x, "keyOps", js.Array(value*))
    
    inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
    
    inline def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
    
    inline def setKty(value: KeyType2): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
    
    inline def setKtyUndefined: Self = StObject.set(x, "kty", js.undefined)
    
    inline def setN(value: js.typedarray.Uint8Array): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def setNUndefined: Self = StObject.set(x, "n", js.undefined)
    
    inline def setP(value: js.typedarray.Uint8Array): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    inline def setQ(value: js.typedarray.Uint8Array): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setQi(value: js.typedarray.Uint8Array): Self = StObject.set(x, "qi", value.asInstanceOf[js.Any])
    
    inline def setQiUndefined: Self = StObject.set(x, "qi", js.undefined)
    
    inline def setT(value: js.typedarray.Uint8Array): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setTUndefined: Self = StObject.set(x, "t", js.undefined)
    
    inline def setX(value: js.typedarray.Uint8Array): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: js.typedarray.Uint8Array): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
