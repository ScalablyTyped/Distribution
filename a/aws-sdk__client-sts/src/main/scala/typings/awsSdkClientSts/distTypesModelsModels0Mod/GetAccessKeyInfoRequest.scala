package typings.awsSdkClientSts.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessKeyInfoRequest extends StObject {
  
  /**
    * <p>The identifier of an access key.</p>
    *          <p>This parameter allows (through its regex pattern) a string of characters that can
    *          consist of any upper- or lowercase letter or digit.</p>
    */
  var AccessKeyId: js.UndefOr[String] = js.undefined
}
object GetAccessKeyInfoRequest {
  
  inline def apply(): GetAccessKeyInfoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessKeyInfoRequest]
  }
  
  extension [Self <: GetAccessKeyInfoRequest](x: Self) {
    
    inline def setAccessKeyId(value: String): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyIdUndefined: Self = StObject.set(x, "AccessKeyId", js.undefined)
  }
}
