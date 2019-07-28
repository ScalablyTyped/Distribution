package typings.bashDashGlob

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bashDashGlobMod {
  type Callback = js.Function2[/* err */ Error, /* files */ js.Array[String], Unit]
  type Patterns = String | js.Array[String]
}
