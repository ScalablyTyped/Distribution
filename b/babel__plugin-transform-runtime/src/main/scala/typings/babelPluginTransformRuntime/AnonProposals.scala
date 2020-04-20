package typings.babelPluginTransformRuntime

import typings.babelPluginTransformRuntime.mod.CorejsOption
import typings.babelPluginTransformRuntime.mod.CorejsVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProposals extends CorejsOption {
  var proposals: Boolean
  var version: CorejsVersion
}

object AnonProposals {
  @scala.inline
  def apply(proposals: Boolean, version: CorejsVersion): AnonProposals = {
    val __obj = js.Dynamic.literal(proposals = proposals.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProposals]
  }
}

