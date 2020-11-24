package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAppImageConfigsResponse extends js.Object {
  
  /**
    * A list of AppImageConfigs and their properties.
    */
  var AppImageConfigs: js.UndefOr[AppImageConfigList] = js.native
  
  /**
    * A token for getting the next set of AppImageConfigs, if there are any.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
}
object ListAppImageConfigsResponse {
  
  @scala.inline
  def apply(): ListAppImageConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppImageConfigsResponse]
  }
  
  @scala.inline
  implicit class ListAppImageConfigsResponseOps[Self <: ListAppImageConfigsResponse] (val x: Self) extends AnyVal {
    
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
    def setAppImageConfigsVarargs(value: AppImageConfigDetails*): Self = this.set("AppImageConfigs", js.Array(value :_*))
    
    @scala.inline
    def setAppImageConfigs(value: AppImageConfigList): Self = this.set("AppImageConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppImageConfigs: Self = this.set("AppImageConfigs", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
