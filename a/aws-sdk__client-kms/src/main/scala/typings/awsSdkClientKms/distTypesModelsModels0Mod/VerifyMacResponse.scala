package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyMacResponse extends StObject {
  
  /**
    * <p>The HMAC KMS key used in the verification.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The MAC algorithm used in the verification.</p>
    */
  var MacAlgorithm: js.UndefOr[MacAlgorithmSpec | String] = js.undefined
  
  /**
    * <p>A Boolean value that indicates whether the HMAC was verified. A value of <code>True</code>
    *       indicates that the HMAC (<code>Mac</code>) was generated with the specified
    *         <code>Message</code>, HMAC KMS key (<code>KeyID</code>) and
    *       <code>MacAlgorithm.</code>.</p>
    *          <p>If the HMAC is not verified, the <code>VerifyMac</code> operation fails with a
    *         <code>KMSInvalidMacException</code> exception. This exception indicates that one or more of
    *       the inputs changed since the HMAC was computed.</p>
    */
  var MacValid: js.UndefOr[Boolean] = js.undefined
}
object VerifyMacResponse {
  
  inline def apply(): VerifyMacResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyMacResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifyMacResponse] (val x: Self) extends AnyVal {
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setMacAlgorithm(value: MacAlgorithmSpec | String): Self = StObject.set(x, "MacAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setMacAlgorithmUndefined: Self = StObject.set(x, "MacAlgorithm", js.undefined)
    
    inline def setMacValid(value: Boolean): Self = StObject.set(x, "MacValid", value.asInstanceOf[js.Any])
    
    inline def setMacValidUndefined: Self = StObject.set(x, "MacValid", js.undefined)
  }
}
