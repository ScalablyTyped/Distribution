package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestinationConfig extends StObject {
  
  /**
    * The destination configuration for failed invocations.
    */
  var OnFailure: js.UndefOr[typings.awsSdk.lambdaMod.OnFailure] = js.native
  
  /**
    * The destination configuration for successful invocations.
    */
  var OnSuccess: js.UndefOr[typings.awsSdk.lambdaMod.OnSuccess] = js.native
}
object DestinationConfig {
  
  @scala.inline
  def apply(): DestinationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationConfig]
  }
  
  @scala.inline
  implicit class DestinationConfigMutableBuilder[Self <: DestinationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnFailure(value: OnFailure): Self = StObject.set(x, "OnFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFailureUndefined: Self = StObject.set(x, "OnFailure", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: OnSuccess): Self = StObject.set(x, "OnSuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSuccessUndefined: Self = StObject.set(x, "OnSuccess", js.undefined)
  }
}
