package typings.bagpipes.bagpipesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config
  extends // allow to store custom values e.g. for swagger-node-runner
// see https://github.com/theganyo/swagger-node-runner/blob/v0.7.1/index.js#L304
/* name */ StringDictionary[js.Any] {
  var connectMiddlewareDirs: js.UndefOr[js.Array[String]] = js.undefined
  var userFittingsDirs: js.UndefOr[js.Array[String]] = js.undefined
  var userViewsDirs: js.UndefOr[js.Array[String]] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    StringDictionary: // allow to store custom values e.g. for swagger-node-runner
  // see https://github.com/theganyo/swagger-node-runner/blob/v0.7.1/index.js#L304
  /* name */ StringDictionary[js.Any] = null,
    connectMiddlewareDirs: js.Array[String] = null,
    userFittingsDirs: js.Array[String] = null,
    userViewsDirs: js.Array[String] = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (connectMiddlewareDirs != null) __obj.updateDynamic("connectMiddlewareDirs")(connectMiddlewareDirs)
    if (userFittingsDirs != null) __obj.updateDynamic("userFittingsDirs")(userFittingsDirs)
    if (userViewsDirs != null) __obj.updateDynamic("userViewsDirs")(userViewsDirs)
    __obj.asInstanceOf[Config]
  }
}

