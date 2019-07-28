package typings.cachefactory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cachefactoryMod {
  type OnExpireCallback = js.Function3[/* key */ String, /* value */ js.Any, /* done */ js.UndefOr[js.Function], Unit]
}
