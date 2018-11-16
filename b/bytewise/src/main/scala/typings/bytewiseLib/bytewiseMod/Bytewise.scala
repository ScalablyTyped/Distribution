package typings
package bytewiseLib.bytewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Bytewise
  extends /* k */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  def decode(value: nodeLib.Buffer): js.Any
  def encode(value: js.Any): nodeLib.Buffer
}

