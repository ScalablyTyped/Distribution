package typings.awsSdk.timestreamwriteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDatabasesResponse extends js.Object {
  
  /**
    * A list of database names.
    */
  var Databases: js.UndefOr[DatabaseList] = js.native
  
  /**
    * The pagination token. This parameter is returned when the response is truncated.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListDatabasesResponse {
  
  @scala.inline
  def apply(): ListDatabasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatabasesResponse]
  }
  
  @scala.inline
  implicit class ListDatabasesResponseOps[Self <: ListDatabasesResponse] (val x: Self) extends AnyVal {
    
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
    def setDatabasesVarargs(value: Database*): Self = this.set("Databases", js.Array(value :_*))
    
    @scala.inline
    def setDatabases(value: DatabaseList): Self = this.set("Databases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabases: Self = this.set("Databases", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
