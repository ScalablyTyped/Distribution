package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCodeSigningConfigResponse extends StObject {
  
  /**
    * The code signing configuration
    */
  var CodeSigningConfig: typings.awsSdk.lambdaMod.CodeSigningConfig
}
object UpdateCodeSigningConfigResponse {
  
  inline def apply(CodeSigningConfig: CodeSigningConfig): UpdateCodeSigningConfigResponse = {
    val __obj = js.Dynamic.literal(CodeSigningConfig = CodeSigningConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCodeSigningConfigResponse]
  }
  
  extension [Self <: UpdateCodeSigningConfigResponse](x: Self) {
    
    inline def setCodeSigningConfig(value: CodeSigningConfig): Self = StObject.set(x, "CodeSigningConfig", value.asInstanceOf[js.Any])
  }
}
