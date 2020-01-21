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
  var VpcConfiguration: js.UndefOr[DataSourceVpcConfiguration] = js.native
}

object DatabaseConfiguration {
  @scala.inline
  def apply(
    ColumnConfiguration: ColumnConfiguration,
    ConnectionConfiguration: ConnectionConfiguration,
    DatabaseEngineType: DatabaseEngineType,
    AclConfiguration: AclConfiguration = null,
    VpcConfiguration: DataSourceVpcConfiguration = null
  ): DatabaseConfiguration = {
    val __obj = js.Dynamic.literal(ColumnConfiguration = ColumnConfiguration.asInstanceOf[js.Any], ConnectionConfiguration = ConnectionConfiguration.asInstanceOf[js.Any], DatabaseEngineType = DatabaseEngineType.asInstanceOf[js.Any])
    if (AclConfiguration != null) __obj.updateDynamic("AclConfiguration")(AclConfiguration.asInstanceOf[js.Any])
    if (VpcConfiguration != null) __obj.updateDynamic("VpcConfiguration")(VpcConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseConfiguration]
  }
}

