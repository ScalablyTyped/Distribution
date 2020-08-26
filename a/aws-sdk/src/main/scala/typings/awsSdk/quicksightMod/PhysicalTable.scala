package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhysicalTable extends js.Object {
  /**
    * A physical table type built from the results of the custom SQL query.
    */
  var CustomSql: js.UndefOr[typings.awsSdk.quicksightMod.CustomSql] = js.native
  /**
    * A physical table type for relational data sources.
    */
  var RelationalTable: js.UndefOr[typings.awsSdk.quicksightMod.RelationalTable] = js.native
  /**
    * A physical table type for as S3 data source.
    */
  var S3Source: js.UndefOr[typings.awsSdk.quicksightMod.S3Source] = js.native
}

object PhysicalTable {
  @scala.inline
  def apply(): PhysicalTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicalTable]
  }
  @scala.inline
  implicit class PhysicalTableOps[Self <: PhysicalTable] (val x: Self) extends AnyVal {
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
    def setCustomSql(value: CustomSql): Self = this.set("CustomSql", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomSql: Self = this.set("CustomSql", js.undefined)
    @scala.inline
    def setRelationalTable(value: RelationalTable): Self = this.set("RelationalTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationalTable: Self = this.set("RelationalTable", js.undefined)
    @scala.inline
    def setS3Source(value: S3Source): Self = this.set("S3Source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Source: Self = this.set("S3Source", js.undefined)
  }
  
}

