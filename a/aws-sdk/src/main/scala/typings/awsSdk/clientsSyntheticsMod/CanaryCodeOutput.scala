package typings.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanaryCodeOutput extends StObject {
  
  /**
    * The entry point to use for the source code when running the canary.
    */
  var Handler: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the Lambda layer where Synthetics stores the canary script code.
    */
  var SourceLocationArn: js.UndefOr[String] = js.undefined
}
object CanaryCodeOutput {
  
  inline def apply(): CanaryCodeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanaryCodeOutput]
  }
  
  extension [Self <: CanaryCodeOutput](x: Self) {
    
    inline def setHandler(value: String): Self = StObject.set(x, "Handler", value.asInstanceOf[js.Any])
    
    inline def setHandlerUndefined: Self = StObject.set(x, "Handler", js.undefined)
    
    inline def setSourceLocationArn(value: String): Self = StObject.set(x, "SourceLocationArn", value.asInstanceOf[js.Any])
    
    inline def setSourceLocationArnUndefined: Self = StObject.set(x, "SourceLocationArn", js.undefined)
  }
}
