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
  def apply(NextToken: string = null, Presets: listOfPreset = null): ListPresetsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Presets != null) __obj.updateDynamic("Presets")(Presets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPresetsResponse]
  }
}

