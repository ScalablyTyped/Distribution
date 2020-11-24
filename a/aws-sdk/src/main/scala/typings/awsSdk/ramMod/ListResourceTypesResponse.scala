package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResourceTypesResponse extends js.Object {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * The shareable resource types supported by AWS RAM.
    */
  var resourceTypes: js.UndefOr[ServiceNameAndResourceTypeList] = js.native
}
object ListResourceTypesResponse {
  
  @scala.inline
  def apply(): ListResourceTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceTypesResponse]
  }
  
  @scala.inline
  implicit class ListResourceTypesResponseOps[Self <: ListResourceTypesResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setResourceTypesVarargs(value: ServiceNameAndResourceType*): Self = this.set("resourceTypes", js.Array(value :_*))
    
    @scala.inline
    def setResourceTypes(value: ServiceNameAndResourceTypeList): Self = this.set("resourceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceTypes: Self = this.set("resourceTypes", js.undefined)
  }
}
