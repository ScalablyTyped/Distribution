package typings
package cliDashBoxesLib.cliDashBoxesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object boxesNs {
  type BoxNames = cliDashBoxesLib.cliDashBoxesLibStrings.single | cliDashBoxesLib.cliDashBoxesLibStrings.double | cliDashBoxesLib.cliDashBoxesLibStrings.round | cliDashBoxesLib.cliDashBoxesLibStrings.`single-double` | cliDashBoxesLib.cliDashBoxesLibStrings.`double-single` | cliDashBoxesLib.cliDashBoxesLibStrings.classic
  type Boxes = stdLib.Record[BoxNames, BoxDefinition]
}
