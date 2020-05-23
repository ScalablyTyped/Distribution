package typings.babelPluginTransformRuntime.anon

import typings.babelPluginTransformRuntime.mod.CorejsOption
import typings.babelPluginTransformRuntime.mod.CorejsVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Proposals extends CorejsOption {
  var proposals: Boolean
  var version: CorejsVersion
}

object Proposals {
  @scala.inline
  def apply(proposals: Boolean, version: CorejsVersion): Proposals = {
    val __obj = js.Dynamic.literal(proposals = proposals.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Proposals]
  }
}

