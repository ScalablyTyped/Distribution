package typings
package charmLib.charmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object charmNs {
  type CharmAnyStream = nodeLib.NodeJSNs.WritableStream | nodeLib.NodeJSNs.ReadableStream | nodeLib.NodeJSNs.Process
  type CharmColor = CharmColorName | CharmColorHex
  type CharmColorHex = scala.Double
  type CharmColorName = charmLib.charmLibStrings.red | charmLib.charmLibStrings.yellow | charmLib.charmLibStrings.green | charmLib.charmLibStrings.blue | charmLib.charmLibStrings.cyan | charmLib.charmLibStrings.magenta | charmLib.charmLibStrings.black | charmLib.charmLibStrings.white
}
