package typings.bl.mod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bl", JSImport.Namespace)
@js.native
class ^ () extends BufferList {
  def this(callbackOrData: String) = this()
  def this(callbackOrData: js.Array[Buffer | BufferList]) = this()
  def this(callbackOrData: js.Function2[/* err */ Error, /* buffer */ Buffer, Unit]) = this()
  def this(callbackOrData: BufferList) = this()
  def this(callbackOrData: Buffer) = this()
}

