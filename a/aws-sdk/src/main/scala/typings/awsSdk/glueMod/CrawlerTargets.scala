package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrawlerTargets extends js.Object {
  /**
    * Specifies AWS Glue Data Catalog targets.
    */
  var CatalogTargets: js.UndefOr[CatalogTargetList] = js.native
  /**
    * Specifies Amazon DynamoDB targets.
    */
  var DynamoDBTargets: js.UndefOr[DynamoDBTargetList] = js.native
  /**
    * Specifies JDBC targets.
    */
  var JdbcTargets: js.UndefOr[JdbcTargetList] = js.native
  /**
    * Specifies Amazon Simple Storage Service (Amazon S3) targets.
    */
  var S3Targets: js.UndefOr[S3TargetList] = js.native
}

object CrawlerTargets {
  @scala.inline
  def apply(
    CatalogTargets: CatalogTargetList = null,
    DynamoDBTargets: DynamoDBTargetList = null,
    JdbcTargets: JdbcTargetList = null,
    S3Targets: S3TargetList = null
  ): CrawlerTargets = {
    val __obj = js.Dynamic.literal()
    if (CatalogTargets != null) __obj.updateDynamic("CatalogTargets")(CatalogTargets.asInstanceOf[js.Any])
    if (DynamoDBTargets != null) __obj.updateDynamic("DynamoDBTargets")(DynamoDBTargets.asInstanceOf[js.Any])
    if (JdbcTargets != null) __obj.updateDynamic("JdbcTargets")(JdbcTargets.asInstanceOf[js.Any])
    if (S3Targets != null) __obj.updateDynamic("S3Targets")(S3Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerTargets]
  }
}

