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
  def apply(): CrawlerTargets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrawlerTargets]
  }
  @scala.inline
  implicit class CrawlerTargetsOps[Self <: CrawlerTargets] (val x: Self) extends AnyVal {
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
    def setCatalogTargetsVarargs(value: CatalogTarget*): Self = this.set("CatalogTargets", js.Array(value :_*))
    @scala.inline
    def setCatalogTargets(value: CatalogTargetList): Self = this.set("CatalogTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalogTargets: Self = this.set("CatalogTargets", js.undefined)
    @scala.inline
    def setDynamoDBTargetsVarargs(value: DynamoDBTarget*): Self = this.set("DynamoDBTargets", js.Array(value :_*))
    @scala.inline
    def setDynamoDBTargets(value: DynamoDBTargetList): Self = this.set("DynamoDBTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamoDBTargets: Self = this.set("DynamoDBTargets", js.undefined)
    @scala.inline
    def setJdbcTargetsVarargs(value: JdbcTarget*): Self = this.set("JdbcTargets", js.Array(value :_*))
    @scala.inline
    def setJdbcTargets(value: JdbcTargetList): Self = this.set("JdbcTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJdbcTargets: Self = this.set("JdbcTargets", js.undefined)
    @scala.inline
    def setS3TargetsVarargs(value: S3Target*): Self = this.set("S3Targets", js.Array(value :_*))
    @scala.inline
    def setS3Targets(value: S3TargetList): Self = this.set("S3Targets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Targets: Self = this.set("S3Targets", js.undefined)
  }
  
}

