package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawString extends StObject {
  
  /**
    * The YAML-formatted or JSON-formatted revision string. It includes information about which Lambda function to update and optional Lambda functions that validate deployment lifecycle events.
    */
  var content: js.UndefOr[RawStringContent] = js.undefined
  
  /**
    * The SHA256 hash value of the revision content.
    */
  var sha256: js.UndefOr[RawStringSha256] = js.undefined
}
object RawString {
  
  inline def apply(): RawString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RawString]
  }
  
  extension [Self <: RawString](x: Self) {
    
    inline def setContent(value: RawStringContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setSha256(value: RawStringSha256): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
  }
}
