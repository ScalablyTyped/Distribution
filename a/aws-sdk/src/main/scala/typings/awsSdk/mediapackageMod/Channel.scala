package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel extends js.Object {
  /**
    * The Amazon Resource Name (ARN) assigned to the Channel.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * A short text description of the Channel.
    */
  var Description: js.UndefOr[string] = js.native
  var HlsIngest: js.UndefOr[typings.awsSdk.mediapackageMod.HlsIngest] = js.native
  /**
    * The ID of the Channel.
    */
  var Id: js.UndefOr[string] = js.native
  var Tags: js.UndefOr[typings.awsSdk.mediapackageMod.Tags] = js.native
}

object Channel {
  @scala.inline
  def apply(
    Arn: string = null,
    Description: string = null,
    HlsIngest: HlsIngest = null,
    Id: string = null,
    Tags: Tags = null
  ): Channel = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (HlsIngest != null) __obj.updateDynamic("HlsIngest")(HlsIngest.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
}

