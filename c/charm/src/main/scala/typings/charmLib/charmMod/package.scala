package typings
package charmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object charmMod {
  type CharmAnyStream = nodeLib.NodeJSNs.WritableStream | nodeLib.NodeJSNs.ReadableStream | nodeLib.NodeJSNs.Process
  type CharmColor = CharmColorName | CharmColorHex
  type CharmColorHex = scala.Double
}
