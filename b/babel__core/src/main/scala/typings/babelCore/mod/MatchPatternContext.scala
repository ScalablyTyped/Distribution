package typings.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchPatternContext extends js.Object {
  var caller: js.UndefOr[TransformCaller] = js.undefined
  var dirname: String
  var envName: String
}

object MatchPatternContext {
  @scala.inline
  def apply(dirname: String, envName: String, caller: TransformCaller = null): MatchPatternContext = {
    val __obj = js.Dynamic.literal(dirname = dirname.asInstanceOf[js.Any], envName = envName.asInstanceOf[js.Any])
    if (caller != null) __obj.updateDynamic("caller")(caller.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchPatternContext]
  }
}

