package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionDescription extends js.Object {
  /**
    * Specifies which input caption selector to use as a caption source when generating output captions. This field should match a captionSelector name.
    */
  var CaptionSelectorName: string = js.native
  /**
    * Additional settings for captions destination that depend on the destination type.
    */
  var DestinationSettings: js.UndefOr[CaptionDestinationSettings] = js.native
  /**
    * ISO 639-2 three-digit code: http://www.loc.gov/standards/iso639-2/
    */
  var LanguageCode: js.UndefOr[string] = js.native
  /**
    * Human readable information to indicate captions available for players (eg. English, or Spanish).
    */
  var LanguageDescription: js.UndefOr[string] = js.native
  /**
    * Name of the caption description.  Used to associate a caption description with an output.  Names must be unique within an event.
    */
  var Name: string = js.native
}

object CaptionDescription {
  @scala.inline
  def apply(CaptionSelectorName: string, Name: string): CaptionDescription = {
    val __obj = js.Dynamic.literal(CaptionSelectorName = CaptionSelectorName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionDescription]
  }
  @scala.inline
  implicit class CaptionDescriptionOps[Self <: CaptionDescription] (val x: Self) extends AnyVal {
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
    def setCaptionSelectorName(value: string): Self = this.set("CaptionSelectorName", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationSettings(value: CaptionDestinationSettings): Self = this.set("DestinationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationSettings: Self = this.set("DestinationSettings", js.undefined)
    @scala.inline
    def setLanguageCode(value: string): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("LanguageCode", js.undefined)
    @scala.inline
    def setLanguageDescription(value: string): Self = this.set("LanguageDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageDescription: Self = this.set("LanguageDescription", js.undefined)
  }
  
}

