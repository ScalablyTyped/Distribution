package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchTablesResponse extends js.Object {
  
  /**
    * A continuation token, present if the current list segment is not the last.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * A list of the requested Table objects. The SearchTables response returns only the tables that you have access to.
    */
  var TableList: js.UndefOr[typings.awsSdk.glueMod.TableList] = js.native
}
object SearchTablesResponse {
  
  @scala.inline
  def apply(): SearchTablesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchTablesResponse]
  }
  
  @scala.inline
  implicit class SearchTablesResponseOps[Self <: SearchTablesResponse] (val x: Self) extends AnyVal {
    
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
    def setTableListVarargs(value: Table*): Self = this.set("TableList", js.Array(value :_*))
    
    @scala.inline
    def setTableList(value: TableList): Self = this.set("TableList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableList: Self = this.set("TableList", js.undefined)
  }
}
