package typings
package bashDashGlobLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bashDashGlobMod {
  type Callback = js.Function2[/* err */ stdLib.Error, /* files */ js.Array[java.lang.String], scala.Unit]
  type Patterns = java.lang.String | js.Array[java.lang.String]
}
