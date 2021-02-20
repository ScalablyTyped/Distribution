package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseConfiguration extends StObject {
  
  /**
    * Information about the database column that provides information for user context filtering.
    */
  var AclConfiguration: js.UndefOr[typings.awsSdk.kendraMod.AclConfiguration] = js.native
  
  /**
    * Information about where the index should get the document information from the database.
    */
  var ColumnConfiguration: typings.awsSdk.kendraMod.ColumnConfiguration = js.native
  
  /**
    * The information necessary to connect to a database.
    */
  var ConnectionConfiguration: typings.awsSdk.kendraMod.ConnectionConfiguration = js.native
  
  /**
    * The type of database engine that runs the database.
    */
  var DatabaseEngineType: typings.awsSdk.kendraMod.DatabaseEngineType = js.native
  
  /**
    * Provides information about how Amazon Kendra uses quote marks around SQL identifiers when querying a database data source.
    */
  var SqlConfiguration: js.UndefOr[typings.awsSdk.kendraMod.SqlConfiguration] = js.native
  
  var VpcConfiguration: js.UndefOr[DataSourceVpcConfiguration] = js.native
}
object DatabaseConfiguration {
  
  @scala.inline
  def apply(
    ColumnConfiguration: ColumnConfiguration,
    ConnectionConfiguration: ConnectionConfiguration,
    DatabaseEngineType: DatabaseEngineType
  ): DatabaseConfiguration = {
    val __obj = js.Dynamic.literal(ColumnConfiguration = ColumnConfiguration.asInstanceOf[js.Any], ConnectionConfiguration = ConnectionConfiguration.asInstanceOf[js.Any], DatabaseEngineType = DatabaseEngineType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseConfiguration]
  }
  
  @scala.inline
  implicit class DatabaseConfigurationMutableBuilder[Self <: DatabaseConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAclConfiguration(value: AclConfiguration): Self = StObject.set(x, "AclConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAclConfigurationUndefined: Self = StObject.set(x, "AclConfiguration", js.undefined)
    
    @scala.inline
    def setColumnConfiguration(value: ColumnConfiguration): Self = StObject.set(x, "ColumnConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionConfiguration(value: ConnectionConfiguration): Self = StObject.set(x, "ConnectionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseEngineType(value: DatabaseEngineType): Self = StObject.set(x, "DatabaseEngineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlConfiguration(value: SqlConfiguration): Self = StObject.set(x, "SqlConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlConfigurationUndefined: Self = StObject.set(x, "SqlConfiguration", js.undefined)
    
    @scala.inline
    def setVpcConfiguration(value: DataSourceVpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
  }
}
