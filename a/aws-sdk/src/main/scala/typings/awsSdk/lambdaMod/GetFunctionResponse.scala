package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFunctionResponse extends StObject {
  
  /**
    * The deployment package of the function or version.
    */
  var Code: js.UndefOr[FunctionCodeLocation] = js.native
  
  /**
    * The function's reserved concurrency.
    */
  var Concurrency: js.UndefOr[typings.awsSdk.lambdaMod.Concurrency] = js.native
  
  /**
    * The configuration of the function or version.
    */
  var Configuration: js.UndefOr[FunctionConfiguration] = js.native
  
  /**
    * The function's tags.
    */
  var Tags: js.UndefOr[typings.awsSdk.lambdaMod.Tags] = js.native
}
object GetFunctionResponse {
  
  @scala.inline
  def apply(): GetFunctionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFunctionResponse]
  }
  
  @scala.inline
  implicit class GetFunctionResponseMutableBuilder[Self <: GetFunctionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: FunctionCodeLocation): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setConcurrency(value: Concurrency): Self = StObject.set(x, "Concurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcurrencyUndefined: Self = StObject.set(x, "Concurrency", js.undefined)
    
    @scala.inline
    def setConfiguration(value: FunctionConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
