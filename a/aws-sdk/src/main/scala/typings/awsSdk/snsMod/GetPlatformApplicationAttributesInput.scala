package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPlatformApplicationAttributesInput extends StObject {
  
  /**
    * PlatformApplicationArn for GetPlatformApplicationAttributesInput.
    */
  var PlatformApplicationArn: String
}
object GetPlatformApplicationAttributesInput {
  
  inline def apply(PlatformApplicationArn: String): GetPlatformApplicationAttributesInput = {
    val __obj = js.Dynamic.literal(PlatformApplicationArn = PlatformApplicationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlatformApplicationAttributesInput]
  }
  
  extension [Self <: GetPlatformApplicationAttributesInput](x: Self) {
    
    inline def setPlatformApplicationArn(value: String): Self = StObject.set(x, "PlatformApplicationArn", value.asInstanceOf[js.Any])
  }
}
