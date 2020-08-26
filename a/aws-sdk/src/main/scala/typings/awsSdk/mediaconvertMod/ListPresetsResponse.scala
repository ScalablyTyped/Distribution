package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPresetsResponse extends js.Object {
  /**
    * Use this string to request the next batch of presets.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * List of presets
    */
  var Presets: js.UndefOr[listOfPreset] = js.native
}

object ListPresetsResponse {
  @scala.inline
  def apply(): ListPresetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPresetsResponse]
  }
  @scala.inline
  implicit class ListPresetsResponseOps[Self <: ListPresetsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setPresetsVarargs(value: Preset*): Self = this.set("Presets", js.Array(value :_*))
    @scala.inline
    def setPresets(value: listOfPreset): Self = this.set("Presets", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePresets: Self = this.set("Presets", js.undefined)
  }
  
}

