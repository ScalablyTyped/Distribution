package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HkdfParams
  extends StObject
     with Algorithm {
  
  var hash: HashAlgorithmIdentifier
  
  var info: BufferSource
  
  var salt: BufferSource
}
object HkdfParams {
  
  inline def apply(hash: HashAlgorithmIdentifier, info: BufferSource, name: java.lang.String, salt: BufferSource): HkdfParams = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[HkdfParams]
  }
  
  extension [Self <: HkdfParams](x: Self) {
    
    inline def setHash(value: HashAlgorithmIdentifier): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: BufferSource): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setSalt(value: BufferSource): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
  }
}
