package typings
package bagpipesLib.bagpipesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config
  extends // allow to store custom values e.g. for swagger-node-runner
// see https://github.com/theganyo/swagger-node-runner/blob/v0.7.1/index.js#L304
/* name */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var connectMiddlewareDirs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var userFittingsDirs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var userViewsDirs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    StringDictionary: // allow to store custom values e.g. for swagger-node-runner
  // see https://github.com/theganyo/swagger-node-runner/blob/v0.7.1/index.js#L304
  /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    connectMiddlewareDirs: js.Array[java.lang.String] = null,
    userFittingsDirs: js.Array[java.lang.String] = null,
    userViewsDirs: js.Array[java.lang.String] = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (connectMiddlewareDirs != null) __obj.updateDynamic("connectMiddlewareDirs")(connectMiddlewareDirs)
    if (userFittingsDirs != null) __obj.updateDynamic("userFittingsDirs")(userFittingsDirs)
    if (userViewsDirs != null) __obj.updateDynamic("userViewsDirs")(userViewsDirs)
    __obj.asInstanceOf[Config]
  }
}

