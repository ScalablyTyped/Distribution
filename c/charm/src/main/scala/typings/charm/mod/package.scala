package typings.charm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CharmAnyStream = typings.node.NodeJS.WritableStream | typings.node.NodeJS.ReadableStream | typings.node.NodeJS.Process
  type CharmColor = typings.charm.mod.CharmColorName | typings.charm.mod.CharmColorHex
  type CharmColorHex = scala.Double
}
