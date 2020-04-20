package typings.datastoreCore.mod

import typings.interfaceDatastore.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform extends js.Object {
  /**
    * Forward transform function.
    * @param key Input key.
    * @example
    * // Forward prefix transform
    * const convert = (key: Key) => new Key('/abc').child(key)
    */
  def convert(key: Key): Key
  /**
    * Inverse transform function.
    * @param key Input key.
    * @example
    * // Inverse prefix transform
    * const invert = (key: Key) => Key.withNamespaces(key.list().slice(1))
    */
  def invert(key: Key): Key
}

object Transform {
  @scala.inline
  def apply(convert: Key => Key, invert: Key => Key): Transform = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert), invert = js.Any.fromFunction1(invert))
    __obj.asInstanceOf[Transform]
  }
}

