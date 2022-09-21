package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportModelResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the custom model being imported.
    */
  var ModelArn: js.UndefOr[ComprehendModelArn] = js.undefined
}
object ImportModelResponse {
  
  inline def apply(): ImportModelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportModelResponse]
  }
  
  extension [Self <: ImportModelResponse](x: Self) {
    
    inline def setModelArn(value: ComprehendModelArn): Self = StObject.set(x, "ModelArn", value.asInstanceOf[js.Any])
    
    inline def setModelArnUndefined: Self = StObject.set(x, "ModelArn", js.undefined)
  }
}
