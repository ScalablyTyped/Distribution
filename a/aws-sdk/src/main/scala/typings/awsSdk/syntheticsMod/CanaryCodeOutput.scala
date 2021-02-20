package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanaryCodeOutput extends StObject {
  
  /**
    * The entry point to use for the source code when running the canary.
    */
  var Handler: js.UndefOr[String] = js.native
  
  /**
    * The ARN of the Lambda layer where Synthetics stores the canary script code.
    */
  var SourceLocationArn: js.UndefOr[String] = js.native
}
object CanaryCodeOutput {
  
  @scala.inline
  def apply(): CanaryCodeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanaryCodeOutput]
  }
  
  @scala.inline
  implicit class CanaryCodeOutputMutableBuilder[Self <: CanaryCodeOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler(value: String): Self = StObject.set(x, "Handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlerUndefined: Self = StObject.set(x, "Handler", js.undefined)
    
    @scala.inline
    def setSourceLocationArn(value: String): Self = StObject.set(x, "SourceLocationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLocationArnUndefined: Self = StObject.set(x, "SourceLocationArn", js.undefined)
  }
}
