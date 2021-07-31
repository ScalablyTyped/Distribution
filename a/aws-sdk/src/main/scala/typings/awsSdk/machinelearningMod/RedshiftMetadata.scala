package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedshiftMetadata extends StObject {
  
  var DatabaseUserName: js.UndefOr[RedshiftDatabaseUsername] = js.undefined
  
  var RedshiftDatabase: js.UndefOr[typings.awsSdk.machinelearningMod.RedshiftDatabase] = js.undefined
  
  /**
    *  The SQL query that is specified during CreateDataSourceFromRedshift. Returns only if Verbose is true in GetDataSourceInput. 
    */
  var SelectSqlQuery: js.UndefOr[RedshiftSelectSqlQuery] = js.undefined
}
object RedshiftMetadata {
  
  @scala.inline
  def apply(): RedshiftMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedshiftMetadata]
  }
  
  @scala.inline
  implicit class RedshiftMetadataMutableBuilder[Self <: RedshiftMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseUserName(value: RedshiftDatabaseUsername): Self = StObject.set(x, "DatabaseUserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseUserNameUndefined: Self = StObject.set(x, "DatabaseUserName", js.undefined)
    
    @scala.inline
    def setRedshiftDatabase(value: RedshiftDatabase): Self = StObject.set(x, "RedshiftDatabase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedshiftDatabaseUndefined: Self = StObject.set(x, "RedshiftDatabase", js.undefined)
    
    @scala.inline
    def setSelectSqlQuery(value: RedshiftSelectSqlQuery): Self = StObject.set(x, "SelectSqlQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectSqlQueryUndefined: Self = StObject.set(x, "SelectSqlQuery", js.undefined)
  }
}
