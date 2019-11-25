package typings.charm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object charmMod {
  import typings.node.NodeJS.Process
  import typings.node.NodeJS.ReadableStream
  import typings.node.NodeJS.WritableStream

  type CharmAnyStream = WritableStream | ReadableStream | Process
  type CharmColor = CharmColorName | CharmColorHex
  type CharmColorHex = Double
}
