package typings.charm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object charmMod {
  import typings.node.NodeJSNs.Process
  import typings.node.NodeJSNs.ReadableStream
  import typings.node.NodeJSNs.WritableStream

  type CharmAnyStream = WritableStream | ReadableStream | Process
  type CharmColor = CharmColorName | CharmColorHex
  type CharmColorHex = Double
}
