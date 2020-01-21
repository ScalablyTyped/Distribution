package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutParameterResult extends js.Object {
  /**
    * The tier assigned to the parameter.
    */
  var Tier: js.UndefOr[ParameterTier] = js.native
  /**
    * The new version number of a parameter. If you edit a parameter value, Parameter Store automatically creates a new version and assigns this new version a unique ID. You can reference a parameter version ID in API actions or in Systems Manager documents (SSM documents). By default, if you don't specify a specific version, the system returns the latest parameter value when a parameter is called.
    */
  var Version: js.UndefOr[PSParameterVersion] = js.native
}

object PutParameterResult {
  @scala.inline
  def apply(Tier: ParameterTier = null, Version: Int | Double = null): PutParameterResult = {
    val __obj = js.Dynamic.literal()
    if (Tier != null) __obj.updateDynamic("Tier")(Tier.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutParameterResult]
  }
}

