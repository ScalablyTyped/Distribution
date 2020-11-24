package typings.awsSdk.redshiftdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTablesResponse extends js.Object {
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned NextToken value in the next NextToken parameter and retrying the command. If the NextToken field is empty, all response records have been retrieved for the request. 
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The tables that match the request pattern. 
    */
  var Tables: js.UndefOr[TableList] = js.native
}
object ListTablesResponse {
  
  @scala.inline
  def apply(): ListTablesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTablesResponse]
  }
  
  @scala.inline
  implicit class ListTablesResponseOps[Self <: ListTablesResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setTablesVarargs(value: TableMember*): Self = this.set("Tables", js.Array(value :_*))
    
    @scala.inline
    def setTables(value: TableList): Self = this.set("Tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTables: Self = this.set("Tables", js.undefined)
  }
}
