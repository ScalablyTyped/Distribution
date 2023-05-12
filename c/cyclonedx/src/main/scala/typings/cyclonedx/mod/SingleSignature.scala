package typings.cyclonedx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingleSignature
  extends StObject
     with Signature {
  
  var algorithm: SigAlgorithm
  
  var certificatePath: js.UndefOr[js.Array[String]] = js.undefined
  
  var excludes: js.UndefOr[js.Array[String]] = js.undefined
  
  var keyId: js.UndefOr[String] = js.undefined
  
  var publicKey: js.UndefOr[PublicKey] = js.undefined
  
  var value: String
}
object SingleSignature {
  
  inline def apply(algorithm: SigAlgorithm, value: String): SingleSignature = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleSignature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SingleSignature] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: SigAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setCertificatePath(value: js.Array[String]): Self = StObject.set(x, "certificatePath", value.asInstanceOf[js.Any])
    
    inline def setCertificatePathUndefined: Self = StObject.set(x, "certificatePath", js.undefined)
    
    inline def setCertificatePathVarargs(value: String*): Self = StObject.set(x, "certificatePath", js.Array(value*))
    
    inline def setExcludes(value: js.Array[String]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
    
    inline def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
    
    inline def setExcludesVarargs(value: String*): Self = StObject.set(x, "excludes", js.Array(value*))
    
    inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    inline def setPublicKey(value: PublicKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
