package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatalogTarget extends js.Object {
  
  /**
    * The name of the database to be synchronized.
    */
  var DatabaseName: NameString = js.native
  
  /**
    * A list of the tables to be synchronized.
    */
  var Tables: CatalogTablesList = js.native
}
object CatalogTarget {
  
  @scala.inline
  def apply(DatabaseName: NameString, Tables: CatalogTablesList): CatalogTarget = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], Tables = Tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogTarget]
  }
  
  @scala.inline
  implicit class CatalogTargetOps[Self <: CatalogTarget] (val x: Self) extends AnyVal {
    
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
    def setDatabaseName(value: NameString): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesVarargs(value: NameString*): Self = this.set("Tables", js.Array(value :_*))
    
    @scala.inline
    def setTables(value: CatalogTablesList): Self = this.set("Tables", value.asInstanceOf[js.Any])
  }
}
