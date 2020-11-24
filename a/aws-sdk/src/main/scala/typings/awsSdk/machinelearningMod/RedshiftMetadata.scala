package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedshiftMetadata extends js.Object {
  
  var DatabaseUserName: js.UndefOr[RedshiftDatabaseUsername] = js.native
  
  var RedshiftDatabase: js.UndefOr[typings.awsSdk.machinelearningMod.RedshiftDatabase] = js.native
  
  /**
    *  The SQL query that is specified during CreateDataSourceFromRedshift. Returns only if Verbose is true in GetDataSourceInput. 
    */
  var SelectSqlQuery: js.UndefOr[RedshiftSelectSqlQuery] = js.native
}
object RedshiftMetadata {
  
  @scala.inline
  def apply(): RedshiftMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedshiftMetadata]
  }
  
  @scala.inline
  implicit class RedshiftMetadataOps[Self <: RedshiftMetadata] (val x: Self) extends AnyVal {
    
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
    def setDatabaseUserName(value: RedshiftDatabaseUsername): Self = this.set("DatabaseUserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseUserName: Self = this.set("DatabaseUserName", js.undefined)
    
    @scala.inline
    def setRedshiftDatabase(value: RedshiftDatabase): Self = this.set("RedshiftDatabase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedshiftDatabase: Self = this.set("RedshiftDatabase", js.undefined)
    
    @scala.inline
    def setSelectSqlQuery(value: RedshiftSelectSqlQuery): Self = this.set("SelectSqlQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectSqlQuery: Self = this.set("SelectSqlQuery", js.undefined)
  }
}
