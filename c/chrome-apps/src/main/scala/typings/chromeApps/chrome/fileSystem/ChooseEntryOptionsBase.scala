package typings.chromeApps.chrome.fileSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseEntryOptionsBase extends ChooseEntryOptions {
  /**
    * The optional list of accept options for this file opener.
    * Each option will be presented as a unique group to the end-user.
    */
  var accepts: js.UndefOr[js.Array[AcceptOptions]] = js.native
  /**
    * Whether to accept all file types, in addition to the options specified in the accepts argument.
    * If the accepts field is unset or contains no valid entries, this will always be reset to true.
    * @default true
    */
  var acceptsAllTypes: js.UndefOr[Boolean] = js.native
  /**
    * Type of the prompt to show.
    * @default 'openFile'
    * @see ChooseEntryType
    */
  // type?: ToStringLiteral<typeof ChooseEntryType>;
  /**
    * The suggested file name that will be presented to the user as the default name to read or write.
    */
  var suggestedName: js.UndefOr[String] = js.native
}

object ChooseEntryOptionsBase {
  @scala.inline
  def apply(): ChooseEntryOptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseEntryOptionsBase]
  }
  @scala.inline
  implicit class ChooseEntryOptionsBaseOps[Self <: ChooseEntryOptionsBase] (val x: Self) extends AnyVal {
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
    def setAcceptsVarargs(value: AcceptOptions*): Self = this.set("accepts", js.Array(value :_*))
    @scala.inline
    def setAccepts(value: js.Array[AcceptOptions]): Self = this.set("accepts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccepts: Self = this.set("accepts", js.undefined)
    @scala.inline
    def setAcceptsAllTypes(value: Boolean): Self = this.set("acceptsAllTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptsAllTypes: Self = this.set("acceptsAllTypes", js.undefined)
    @scala.inline
    def setSuggestedName(value: String): Self = this.set("suggestedName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedName: Self = this.set("suggestedName", js.undefined)
  }
  
}

