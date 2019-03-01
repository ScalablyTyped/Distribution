package typings
package charmLib.charmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object charmNs {
  type CharmAnyStream = nodeLib.NodeJSNs.WritableStream | nodeLib.NodeJSNs.ReadableStream | nodeLib.NodeJSNs.Process
  type CharmColor = CharmColorName | CharmColorHex
  type CharmColorHex = scala.Double
}
