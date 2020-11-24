package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDatabasesResponse extends js.Object {
  
  /**
    * A list of Database objects from the specified catalog.
    */
  var DatabaseList: typings.awsSdk.glueMod.DatabaseList = js.native
  
  /**
    * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is not the last.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object GetDatabasesResponse {
  
  @scala.inline
  def apply(DatabaseList: DatabaseList): GetDatabasesResponse = {
    val __obj = js.Dynamic.literal(DatabaseList = DatabaseList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDatabasesResponse]
  }
  
  @scala.inline
  implicit class GetDatabasesResponseOps[Self <: GetDatabasesResponse] (val x: Self) extends AnyVal {
    
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
    def setDatabaseListVarargs(value: Database*): Self = this.set("DatabaseList", js.Array(value :_*))
    
    @scala.inline
    def setDatabaseList(value: DatabaseList): Self = this.set("DatabaseList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
