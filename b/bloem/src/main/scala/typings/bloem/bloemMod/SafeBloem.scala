package typings.bloem.bloemMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bloem", "SafeBloem")
@js.native
class SafeBloem protected () extends js.Object {
  def this(capacity: Double, error_rate: Double, buffer: Buffer) = this()
  def add(key: Buffer): Boolean = js.native
  def has(key: Buffer): Boolean = js.native
}

