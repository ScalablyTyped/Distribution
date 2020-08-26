package typings.cassandraDriver.mappingMod.mapping

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDocInfo extends js.Object {
  var deleteOnlyColumns: js.UndefOr[Boolean] = js.native
  var fields: js.UndefOr[js.Array[String]] = js.native
  var ifExists: js.UndefOr[Boolean] = js.native
  var limit: js.UndefOr[Double] = js.native
  var orderBy: js.UndefOr[StringDictionary[String]] = js.native
  var ttl: js.UndefOr[Double] = js.native
  var when: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object UpdateDocInfo {
  @scala.inline
  def apply(): UpdateDocInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDocInfo]
  }
  @scala.inline
  implicit class UpdateDocInfoOps[Self <: UpdateDocInfo] (val x: Self) extends AnyVal {
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
    def setDeleteOnlyColumns(value: Boolean): Self = this.set("deleteOnlyColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteOnlyColumns: Self = this.set("deleteOnlyColumns", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setIfExists(value: Boolean): Self = this.set("ifExists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfExists: Self = this.set("ifExists", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setOrderBy(value: StringDictionary[String]): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
    @scala.inline
    def setWhen(value: StringDictionary[js.Any]): Self = this.set("when", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhen: Self = this.set("when", js.undefined)
  }
  
}

