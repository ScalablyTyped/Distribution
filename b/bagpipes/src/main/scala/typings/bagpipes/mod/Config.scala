package typings.bagpipes.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config
  extends /* prop */ StringDictionary[js.Any] {
  var connectMiddlewareDirs: js.UndefOr[js.Array[String]] = js.undefined
  var userFittingsDirs: js.UndefOr[js.Array[String]] = js.undefined
  var userViewsDirs: js.UndefOr[js.Array[String]] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    connectMiddlewareDirs: js.Array[String] = null,
    userFittingsDirs: js.Array[String] = null,
    userViewsDirs: js.Array[String] = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (connectMiddlewareDirs != null) __obj.updateDynamic("connectMiddlewareDirs")(connectMiddlewareDirs.asInstanceOf[js.Any])
    if (userFittingsDirs != null) __obj.updateDynamic("userFittingsDirs")(userFittingsDirs.asInstanceOf[js.Any])
    if (userViewsDirs != null) __obj.updateDynamic("userViewsDirs")(userViewsDirs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

