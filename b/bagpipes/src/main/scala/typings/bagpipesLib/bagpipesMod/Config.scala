package typings
package bagpipesLib.bagpipesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Config
  extends // allow to store custom values e.g. for swagger-node-runner
// see https://github.com/theganyo/swagger-node-runner/blob/v0.7.1/index.js#L304
/* name */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  var connectMiddlewareDirs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var userFittingsDirs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var userViewsDirs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

