package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPresetsResponse extends js.Object {
  /**
    * A value that you use to access the second and subsequent pages of results, if any. When the presets fit on one page or when you've reached the last page of results, the value of NextPageToken is null.
    */
  var NextPageToken: js.UndefOr[Id] = js.native
  /**
    * An array of Preset objects.
    */
  var Presets: js.UndefOr[typings.awsSdk.elastictranscoderMod.Presets] = js.native
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextPageToken(value: Id): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
    @scala.inline
    def setPresetsVarargs(value: Preset*): Self = this.set("Presets", js.Array(value :_*))
    @scala.inline
    def setPresets(value: Presets): Self = this.set("Presets", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePresets: Self = this.set("Presets", js.undefined)
  }
  
}

