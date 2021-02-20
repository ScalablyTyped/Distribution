package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFunctionEventInvokeConfigsResponse extends StObject {
  
  /**
    * A list of configurations.
    */
  var FunctionEventInvokeConfigs: js.UndefOr[FunctionEventInvokeConfigList] = js.native
  
  /**
    * The pagination token that's included if more results are available.
    */
  var NextMarker: js.UndefOr[String] = js.native
}
object ListFunctionEventInvokeConfigsResponse {
  
  @scala.inline
  def apply(): ListFunctionEventInvokeConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFunctionEventInvokeConfigsResponse]
  }
  
  @scala.inline
  implicit class ListFunctionEventInvokeConfigsResponseMutableBuilder[Self <: ListFunctionEventInvokeConfigsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctionEventInvokeConfigs(value: FunctionEventInvokeConfigList): Self = StObject.set(x, "FunctionEventInvokeConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionEventInvokeConfigsUndefined: Self = StObject.set(x, "FunctionEventInvokeConfigs", js.undefined)
    
    @scala.inline
    def setFunctionEventInvokeConfigsVarargs(value: FunctionEventInvokeConfig*): Self = StObject.set(x, "FunctionEventInvokeConfigs", js.Array(value :_*))
    
    @scala.inline
    def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
