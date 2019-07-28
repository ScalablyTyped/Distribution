package typings.charm

import typings.node.NodeJSNs.Process
import typings.node.NodeJSNs.ReadableStream
import typings.node.NodeJSNs.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object charmMod {
  type CharmAnyStream = WritableStream | ReadableStream | Process
  type CharmColor = CharmColorName | CharmColorHex
  type CharmColorHex = Double
}
