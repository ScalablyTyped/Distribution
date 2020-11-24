package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTableVersionsResponse extends js.Object {
  
  /**
    * A continuation token, if the list of available versions does not include the last one.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * A list of strings identifying available versions of the specified table.
    */
  var TableVersions: js.UndefOr[GetTableVersionsList] = js.native
}
object GetTableVersionsResponse {
  
  @scala.inline
  def apply(): GetTableVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTableVersionsResponse]
  }
  
  @scala.inline
  implicit class GetTableVersionsResponseOps[Self <: GetTableVersionsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setTableVersionsVarargs(value: TableVersion*): Self = this.set("TableVersions", js.Array(value :_*))
    
    @scala.inline
    def setTableVersions(value: GetTableVersionsList): Self = this.set("TableVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableVersions: Self = this.set("TableVersions", js.undefined)
  }
}
