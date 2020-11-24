package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDatabaseResponse extends js.Object {
  
  /**
    * The definition of the specified database in the Data Catalog.
    */
  var Database: js.UndefOr[typings.awsSdk.glueMod.Database] = js.native
}
object GetDatabaseResponse {
  
  @scala.inline
  def apply(): GetDatabaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDatabaseResponse]
  }
  
  @scala.inline
  implicit class GetDatabaseResponseOps[Self <: GetDatabaseResponse] (val x: Self) extends AnyVal {
    
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
    def setDatabase(value: Database): Self = this.set("Database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabase: Self = this.set("Database", js.undefined)
  }
}
