package typings.babelPresetEnv

import typings.babelPresetEnv.mod.CorejsOption
import typings.babelPresetEnv.mod.CorejsVersion
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

