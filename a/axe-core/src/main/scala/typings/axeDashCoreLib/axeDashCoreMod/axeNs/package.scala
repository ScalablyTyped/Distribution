package typings
package axeDashCoreLib.axeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object axeNs {
  type ElementContext = stdLib.Node | java.lang.String | RunOnlyObject
  type RunCallback = js.Function2[/* error */ stdLib.Error, /* results */ AxeResults, scala.Unit]
}
