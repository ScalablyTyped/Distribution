package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseConfiguration extends js.Object {
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
  implicit class DatabaseConfigurationOps[Self <: DatabaseConfiguration] (val x: Self) extends AnyVal {
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
    def setColumnConfiguration(value: ColumnConfiguration): Self = this.set("ColumnConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionConfiguration(value: ConnectionConfiguration): Self = this.set("ConnectionConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatabaseEngineType(value: DatabaseEngineType): Self = this.set("DatabaseEngineType", value.asInstanceOf[js.Any])
    @scala.inline
    def setAclConfiguration(value: AclConfiguration): Self = this.set("AclConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAclConfiguration: Self = this.set("AclConfiguration", js.undefined)
    @scala.inline
    def setSqlConfiguration(value: SqlConfiguration): Self = this.set("SqlConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSqlConfiguration: Self = this.set("SqlConfiguration", js.undefined)
    @scala.inline
    def setVpcConfiguration(value: DataSourceVpcConfiguration): Self = this.set("VpcConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcConfiguration: Self = this.set("VpcConfiguration", js.undefined)
  }
  
}

