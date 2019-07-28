package typings.bloem.bloemMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bloem", "Bloem")
@js.native
class Bloem protected () extends js.Object {
  def this(size: Double, slices: Double, buffer: Buffer) = this()
  def add(key: Buffer): Unit = js.native
  def has(key: Buffer): Boolean = js.native
}

