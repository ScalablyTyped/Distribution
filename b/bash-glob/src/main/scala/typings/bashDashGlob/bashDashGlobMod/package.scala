package typings.bashDashGlob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bashDashGlobMod {
  import typings.std.Error

  type Callback = js.Function2[/* err */ Error, /* files */ js.Array[String], Unit]
  type Patterns = String | js.Array[String]
}
