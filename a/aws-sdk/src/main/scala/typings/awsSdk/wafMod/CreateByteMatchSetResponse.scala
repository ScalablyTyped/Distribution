package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateByteMatchSetResponse extends StObject {
  
  /**
    * A ByteMatchSet that contains no ByteMatchTuple objects.
    */
  var ByteMatchSet: js.UndefOr[typings.awsSdk.wafMod.ByteMatchSet] = js.undefined
  
  /**
    * The ChangeToken that you used to submit the CreateByteMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.wafMod.ChangeToken] = js.undefined
}
object CreateByteMatchSetResponse {
  
  inline def apply(): CreateByteMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateByteMatchSetResponse]
  }
  
  extension [Self <: CreateByteMatchSetResponse](x: Self) {
    
    inline def setByteMatchSet(value: ByteMatchSet): Self = StObject.set(x, "ByteMatchSet", value.asInstanceOf[js.Any])
    
    inline def setByteMatchSetUndefined: Self = StObject.set(x, "ByteMatchSet", js.undefined)
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
  }
}
