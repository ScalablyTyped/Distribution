package typings
package cryptojsLib.CryptoJSNs.libNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  //arguments of create() is same as init(). This is true for all subclasses
  def create(args: js.Any*): Base
  def extend(overrides: js.Object): js.Object
  def init(args: js.Any*): scala.Unit
  def mixIn(properties: js.Object): scala.Unit
}

