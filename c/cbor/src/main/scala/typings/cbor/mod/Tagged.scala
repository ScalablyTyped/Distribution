package typings.cbor.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cbor", "Tagged")
@js.native
class Tagged protected () extends js.Object {
  def this(tag: Double) = this()
  def this(tag: Double, value: js.Any) = this()
  def this(tag: Double, value: js.UndefOr[scala.Nothing], err: Error) = this()
  def this(tag: Double, value: js.Any, err: Error) = this()
  def convert(): js.Any = js.native
  def convert(converters: NumberDictionary[js.Function1[/* val */ js.Any, _]]): js.Any = js.native
  def encodeCBOR(gen: Encoder): Boolean = js.native
}

