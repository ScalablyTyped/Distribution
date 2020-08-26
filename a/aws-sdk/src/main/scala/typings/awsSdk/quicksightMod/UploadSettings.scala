package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadSettings extends js.Object {
  /**
    * Whether the file has a header row, or the files each have a header row.
    */
  var ContainsHeader: js.UndefOr[Boolean] = js.native
  /**
    * The delimiter between values in the file.
    */
  var Delimiter: js.UndefOr[typings.awsSdk.quicksightMod.Delimiter] = js.native
  /**
    * File format.
    */
  var Format: js.UndefOr[FileFormat] = js.native
  /**
    * A row number to start reading data from.
    */
  var StartFromRow: js.UndefOr[PositiveInteger] = js.native
  /**
    * Text qualifier.
    */
  var TextQualifier: js.UndefOr[typings.awsSdk.quicksightMod.TextQualifier] = js.native
}

object UploadSettings {
  @scala.inline
  def apply(): UploadSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadSettings]
  }
  @scala.inline
  implicit class UploadSettingsOps[Self <: UploadSettings] (val x: Self) extends AnyVal {
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
    def setContainsHeader(value: Boolean): Self = this.set("ContainsHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainsHeader: Self = this.set("ContainsHeader", js.undefined)
    @scala.inline
    def setDelimiter(value: Delimiter): Self = this.set("Delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("Delimiter", js.undefined)
    @scala.inline
    def setFormat(value: FileFormat): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("Format", js.undefined)
    @scala.inline
    def setStartFromRow(value: PositiveInteger): Self = this.set("StartFromRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartFromRow: Self = this.set("StartFromRow", js.undefined)
    @scala.inline
    def setTextQualifier(value: TextQualifier): Self = this.set("TextQualifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextQualifier: Self = this.set("TextQualifier", js.undefined)
  }
  
}

