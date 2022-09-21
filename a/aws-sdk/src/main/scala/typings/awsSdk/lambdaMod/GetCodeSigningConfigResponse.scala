package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCodeSigningConfigResponse extends StObject {
  
  /**
    * The code signing configuration
    */
  var CodeSigningConfig: typings.awsSdk.lambdaMod.CodeSigningConfig
}
object GetCodeSigningConfigResponse {
  
  inline def apply(CodeSigningConfig: CodeSigningConfig): GetCodeSigningConfigResponse = {
    val __obj = js.Dynamic.literal(CodeSigningConfig = CodeSigningConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCodeSigningConfigResponse]
  }
  
  extension [Self <: GetCodeSigningConfigResponse](x: Self) {
    
    inline def setCodeSigningConfig(value: CodeSigningConfig): Self = StObject.set(x, "CodeSigningConfig", value.asInstanceOf[js.Any])
  }
}
