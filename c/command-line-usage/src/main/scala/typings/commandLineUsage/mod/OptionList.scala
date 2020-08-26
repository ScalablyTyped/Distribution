package typings.commandLineUsage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A OptionList section adds a table displaying details of the available options. */
@js.native
trait OptionList extends Section {
  /** If specified, only options from this particular group will be printed.  */
  var group: js.UndefOr[String | js.Array[String]] = js.native
  var header: js.UndefOr[String] = js.native
  /** The names of one of more option definitions to hide from the option list.  */
  var hide: js.UndefOr[String | js.Array[String]] = js.native
  /** An array of option definition objects. */
  var optionList: js.UndefOr[js.Array[OptionDefinition]] = js.native
  /** If true, the option alias will be displayed after the name, i.e. --verbose, -v instead of -v, --verbose). */
  var reverseNameOrder: js.UndefOr[Boolean] = js.native
  /** An options object suitable for passing into table-layout. */
  var tableOptions: js.UndefOr[js.Any] = js.native
}

object OptionList {
  @scala.inline
  def apply(): OptionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionList]
  }
  @scala.inline
  implicit class OptionListOps[Self <: OptionList] (val x: Self) extends AnyVal {
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
    def setGroupVarargs(value: String*): Self = this.set("group", js.Array(value :_*))
    @scala.inline
    def setGroup(value: String | js.Array[String]): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHideVarargs(value: String*): Self = this.set("hide", js.Array(value :_*))
    @scala.inline
    def setHide(value: String | js.Array[String]): Self = this.set("hide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    @scala.inline
    def setOptionListVarargs(value: OptionDefinition*): Self = this.set("optionList", js.Array(value :_*))
    @scala.inline
    def setOptionList(value: js.Array[OptionDefinition]): Self = this.set("optionList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionList: Self = this.set("optionList", js.undefined)
    @scala.inline
    def setReverseNameOrder(value: Boolean): Self = this.set("reverseNameOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverseNameOrder: Self = this.set("reverseNameOrder", js.undefined)
    @scala.inline
    def setTableOptions(value: js.Any): Self = this.set("tableOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableOptions: Self = this.set("tableOptions", js.undefined)
  }
  
}

