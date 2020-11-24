package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFunctionEventInvokeConfigsResponse extends js.Object {
  
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
  implicit class ListFunctionEventInvokeConfigsResponseOps[Self <: ListFunctionEventInvokeConfigsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFunctionEventInvokeConfigsVarargs(value: FunctionEventInvokeConfig*): Self = this.set("FunctionEventInvokeConfigs", js.Array(value :_*))
    
    @scala.inline
    def setFunctionEventInvokeConfigs(value: FunctionEventInvokeConfigList): Self = this.set("FunctionEventInvokeConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctionEventInvokeConfigs: Self = this.set("FunctionEventInvokeConfigs", js.undefined)
    
    @scala.inline
    def setNextMarker(value: String): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
  }
}
