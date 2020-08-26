package typings.cassandraDriver.mappingMod.mapping

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertDocInfo extends js.Object {
  var fields: js.UndefOr[js.Array[String]] = js.native
  var ifNotExists: js.UndefOr[Boolean] = js.native
  var ttl: js.UndefOr[Double] = js.native
}

object InsertDocInfo {
  @scala.inline
  def apply(): InsertDocInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertDocInfo]
  }
  @scala.inline
  implicit class InsertDocInfoOps[Self <: InsertDocInfo] (val x: Self) extends AnyVal {
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
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setIfNotExists(value: Boolean): Self = this.set("ifNotExists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfNotExists: Self = this.set("ifNotExists", js.undefined)
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
  
}

