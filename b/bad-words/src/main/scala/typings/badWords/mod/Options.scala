package typings.badWords.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var emptyList: js.UndefOr[Boolean] = js.native
  var exclude: js.UndefOr[js.Array[String]] = js.native
  var list: js.UndefOr[js.Array[String]] = js.native
  var placeHolder: js.UndefOr[String] = js.native
  var regex: js.UndefOr[RegExp] = js.native
  var replaceRegex: js.UndefOr[RegExp] = js.native
  var splitRegex: js.UndefOr[RegExp] = js.native
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
    def setEmptyList(value: Boolean): Self = this.set("emptyList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyList: Self = this.set("emptyList", js.undefined)
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setListVarargs(value: String*): Self = this.set("list", js.Array(value :_*))
    @scala.inline
    def setList(value: js.Array[String]): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    @scala.inline
    def setPlaceHolder(value: String): Self = this.set("placeHolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceHolder: Self = this.set("placeHolder", js.undefined)
    @scala.inline
    def setRegex(value: RegExp): Self = this.set("regex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegex: Self = this.set("regex", js.undefined)
    @scala.inline
    def setReplaceRegex(value: RegExp): Self = this.set("replaceRegex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceRegex: Self = this.set("replaceRegex", js.undefined)
    @scala.inline
    def setSplitRegex(value: RegExp): Self = this.set("splitRegex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitRegex: Self = this.set("splitRegex", js.undefined)
  }
  
}

