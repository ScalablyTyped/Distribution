package typings.backblazeB2.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateKeyOpts extends CommonArgs {
  var bucketId: js.UndefOr[String] = js.undefined
  var capabilities: js.Array[String]
  var keyName: String
  var namePrefix: js.UndefOr[String] = js.undefined
  var validDurationInSeconds: js.UndefOr[Double] = js.undefined
}

object CreateKeyOpts {
  @scala.inline
  def apply(
    capabilities: js.Array[String],
    keyName: String,
    axios: Record[String, _] = null,
    axiosOverride: Record[String, _] = null,
    bucketId: String = null,
    namePrefix: String = null,
    validDurationInSeconds: js.UndefOr[Double] = js.undefined
  ): CreateKeyOpts = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], keyName = keyName.asInstanceOf[js.Any])
    if (axios != null) __obj.updateDynamic("axios")(axios.asInstanceOf[js.Any])
    if (axiosOverride != null) __obj.updateDynamic("axiosOverride")(axiosOverride.asInstanceOf[js.Any])
    if (bucketId != null) __obj.updateDynamic("bucketId")(bucketId.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(validDurationInSeconds)) __obj.updateDynamic("validDurationInSeconds")(validDurationInSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKeyOpts]
  }
}

