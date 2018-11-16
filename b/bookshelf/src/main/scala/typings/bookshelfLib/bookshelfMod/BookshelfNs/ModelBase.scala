package typings
package bookshelfLib.bookshelfMod.BookshelfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelBase[T /* <: Model[_] */]
  extends Events[T | Collection[T]]
     with IModelBase {
  // See https://github.com/tgriesser/bookshelf/blob/0.9.4/src/base/model.js#L28
  var attributes: js.Any = js.native
  // See https://github.com/tgriesser/bookshelf/blob/0.9.4/src/base/model.js#L178
  // See https://github.com/tgriesser/bookshelf/blob/0.9.4/src/base/model.js#L213
  var id: js.Any = js.native
  /** If overriding, must use a getter instead of a plain property. */
  var idAttribute: java.lang.String = js.native
  def clear(): T = js.native
  def escape(attribute: java.lang.String): java.lang.String = js.native
  def format(attributes: js.Any): js.Any = js.native
  def get(attribute: java.lang.String): js.Any = js.native
  def has(attribute: java.lang.String): scala.Boolean = js.native
  def hasChanged(): scala.Boolean = js.native
  def hasChanged(attribute: java.lang.String): scala.Boolean = js.native
  // lodash methods
  def invert[R /* <: js.Object */](): R = js.native
  def isNew(): scala.Boolean = js.native
  def keys(): js.Array[java.lang.String] = js.native
  def omit[R /* <: js.Object */](): R = js.native
  def omit[R /* <: js.Object */](attributes: java.lang.String*): R = js.native
  def omit[R /* <: js.Object */](predicate: lodashLib.lodashMod.underscoreNs.ObjectIterator[_, scala.Boolean]): R = js.native
  def omit[R /* <: js.Object */](predicate: lodashLib.lodashMod.underscoreNs.ObjectIterator[_, scala.Boolean], thisArg: js.Any): R = js.native
  def pairs(): js.Array[js.Array[_]] = js.native
  def parse(response: js.Object): js.Object = js.native
  def pick[R /* <: js.Object */](): R = js.native
  def pick[R /* <: js.Object */](attributes: java.lang.String*): R = js.native
  def pick[R /* <: js.Object */](predicate: lodashLib.lodashMod.underscoreNs.ObjectIterator[_, scala.Boolean]): R = js.native
  def pick[R /* <: js.Object */](predicate: lodashLib.lodashMod.underscoreNs.ObjectIterator[_, scala.Boolean], thisArg: js.Any): R = js.native
  def previous(attribute: java.lang.String): js.Any = js.native
  def previousAttributes(): js.Any = js.native
  def related[R /* <: Model[_] */](relation: java.lang.String): R | Collection[R] = js.native
  def serialize(): js.Any = js.native
  def serialize(options: SerializeOptions): js.Any = js.native
  def set(): T = js.native
  def set(attribute: ScalablyTyped.runtime.StringDictionary[js.Any]): T = js.native
  def set(attribute: ScalablyTyped.runtime.StringDictionary[js.Any], options: SetOptions): T = js.native
  def set(attribute: java.lang.String): T = js.native
  def set(attribute: java.lang.String, value: js.Any): T = js.native
  def set(attribute: java.lang.String, value: js.Any, options: SetOptions): T = js.native
  def timestamp(): js.Any = js.native
  def timestamp(options: TimestampOptions): js.Any = js.native
  def toJSON(): js.Any = js.native
  def toJSON(options: SerializeOptions): js.Any = js.native
  def unset(attribute: java.lang.String): T = js.native
  def values(): js.Array[_] = js.native
}

