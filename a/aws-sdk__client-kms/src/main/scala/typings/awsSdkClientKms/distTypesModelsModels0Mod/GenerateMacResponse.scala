package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateMacResponse extends StObject {
  
  /**
    * <p>The HMAC KMS key used in the operation.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The hash-based message authentication code (HMAC) that was generated for the
    *       specified message, HMAC KMS key, and MAC algorithm.</p>
    *          <p>This is the standard, raw HMAC defined in <a href="https://datatracker.ietf.org/doc/html/rfc2104">RFC 2104</a>.</p>
    */
  var Mac: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * <p>The MAC algorithm that was used to generate the HMAC.</p>
    */
  var MacAlgorithm: js.UndefOr[MacAlgorithmSpec | String] = js.undefined
}
object GenerateMacResponse {
  
  inline def apply(): GenerateMacResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateMacResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenerateMacResponse] (val x: Self) extends AnyVal {
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setMac(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Mac", value.asInstanceOf[js.Any])
    
    inline def setMacAlgorithm(value: MacAlgorithmSpec | String): Self = StObject.set(x, "MacAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setMacAlgorithmUndefined: Self = StObject.set(x, "MacAlgorithm", js.undefined)
    
    inline def setMacUndefined: Self = StObject.set(x, "Mac", js.undefined)
  }
}
