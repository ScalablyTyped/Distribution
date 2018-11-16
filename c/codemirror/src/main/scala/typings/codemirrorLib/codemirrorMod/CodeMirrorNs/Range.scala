package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Range extends js.Object {
  var anchor: Position
  var head: Position
  def from(): Position
  def to(): Position
}

