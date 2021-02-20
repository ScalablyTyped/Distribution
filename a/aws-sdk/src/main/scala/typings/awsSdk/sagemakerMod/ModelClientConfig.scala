package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelClientConfig extends StObject {
  
  /**
    * The maximum number of retries when invocation requests are failing.
    */
  var InvocationsMaxRetries: js.UndefOr[typings.awsSdk.sagemakerMod.InvocationsMaxRetries] = js.native
  
  /**
    * The timeout value in seconds for an invocation request.
    */
  var InvocationsTimeoutInSeconds: js.UndefOr[typings.awsSdk.sagemakerMod.InvocationsTimeoutInSeconds] = js.native
}
object ModelClientConfig {
  
  @scala.inline
  def apply(): ModelClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelClientConfig]
  }
  
  @scala.inline
  implicit class ModelClientConfigMutableBuilder[Self <: ModelClientConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvocationsMaxRetries(value: InvocationsMaxRetries): Self = StObject.set(x, "InvocationsMaxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvocationsMaxRetriesUndefined: Self = StObject.set(x, "InvocationsMaxRetries", js.undefined)
    
    @scala.inline
    def setInvocationsTimeoutInSeconds(value: InvocationsTimeoutInSeconds): Self = StObject.set(x, "InvocationsTimeoutInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvocationsTimeoutInSecondsUndefined: Self = StObject.set(x, "InvocationsTimeoutInSeconds", js.undefined)
  }
}
