package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVariablesRequest extends js.Object {
  
  /**
    * The max size per page determined for the get variable request. 
    */
  var maxResults: js.UndefOr[VariablesMaxResults] = js.native
  
  /**
    * The name of the variable. 
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The next page token of the get variable request. 
    */
  var nextToken: js.UndefOr[String] = js.native
}
object GetVariablesRequest {
  
  @scala.inline
  def apply(): GetVariablesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVariablesRequest]
  }
  
  @scala.inline
  implicit class GetVariablesRequestOps[Self <: GetVariablesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaxResults(value: VariablesMaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
