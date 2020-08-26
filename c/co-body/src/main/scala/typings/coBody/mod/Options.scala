package typings.coBody.mod

import typings.qs.mod.IParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var encoding: js.UndefOr[String] = js.native
  var formTypes: js.UndefOr[js.Array[String]] = js.native
  var jsonTypes: js.UndefOr[js.Array[String]] = js.native
  var length: js.UndefOr[Double] = js.native
  var limit: js.UndefOr[Double | String] = js.native
  var queryString: js.UndefOr[IParseOptions] = js.native
  var returnRawBody: js.UndefOr[Boolean] = js.native
  var strict: js.UndefOr[Boolean] = js.native
  var textTypes: js.UndefOr[js.Array[String]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setFormTypesVarargs(value: String*): Self = this.set("formTypes", js.Array(value :_*))
    @scala.inline
    def setFormTypes(value: js.Array[String]): Self = this.set("formTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormTypes: Self = this.set("formTypes", js.undefined)
    @scala.inline
    def setJsonTypesVarargs(value: String*): Self = this.set("jsonTypes", js.Array(value :_*))
    @scala.inline
    def setJsonTypes(value: js.Array[String]): Self = this.set("jsonTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonTypes: Self = this.set("jsonTypes", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setLimit(value: Double | String): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setQueryString(value: IParseOptions): Self = this.set("queryString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryString: Self = this.set("queryString", js.undefined)
    @scala.inline
    def setReturnRawBody(value: Boolean): Self = this.set("returnRawBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnRawBody: Self = this.set("returnRawBody", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    @scala.inline
    def setTextTypesVarargs(value: String*): Self = this.set("textTypes", js.Array(value :_*))
    @scala.inline
    def setTextTypes(value: js.Array[String]): Self = this.set("textTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextTypes: Self = this.set("textTypes", js.undefined)
  }
  
}

