package typings.bookshelf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.lodash.mod.ObjectIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bookshelf", "ModelBase")
@js.native
abstract class ModelBase[T /* <: Model[_] */] ()
  extends Events[T | Collection[T]]
     with IModelBase {
  def this(attributes: js.Any) = this()
  def this(attributes: js.Any, options: ModelOptions) = this()
  // See https://github.com/tgriesser/bookshelf/blob/0.9.4/src/base/model.js#L28
  var attributes: js.Any = js.native
  // See https://github.com/tgriesser/bookshelf/blob/0.9.4/src/base/model.js#L178
  // See https://github.com/tgriesser/bookshelf/blob/0.9.4/src/base/model.js#L213
  var id: js.Any = js.native
  /** If overriding, must use a getter instead of a plain property. */
  var idAttribute: String = js.native
  def clear(): T = js.native
  def escape(attribute: String): String = js.native
  def format(attributes: js.Any): js.Any = js.native
  def get(attribute: String): js.Any = js.native
  def has(attribute: String): Boolean = js.native
  def hasChanged(): Boolean = js.native
  def hasChanged(attribute: String): Boolean = js.native
  def isNew(): Boolean = js.native
  // lodash methods
  def omit[R /* <: js.Object */](): R = js.native
  def omit[R /* <: js.Object */](attributes: String*): R = js.native
  def omit[R /* <: js.Object */](predicate: ObjectIterator[_, Boolean]): R = js.native
  def omit[R /* <: js.Object */](predicate: ObjectIterator[_, Boolean], thisArg: js.Any): R = js.native
  def parse(response: js.Object): js.Object = js.native
  def pick[R /* <: js.Object */](): R = js.native
  def pick[R /* <: js.Object */](attributes: String*): R = js.native
  def pick[R /* <: js.Object */](predicate: ObjectIterator[_, Boolean]): R = js.native
  def pick[R /* <: js.Object */](predicate: ObjectIterator[_, Boolean], thisArg: js.Any): R = js.native
  def previous(attribute: String): js.Any = js.native
  def previousAttributes(): js.Any = js.native
  def related[R /* <: Model[_] */](relation: String): R | Collection[R] = js.native
  def serialize(): js.Any = js.native
  def serialize(options: SerializeOptions): js.Any = js.native
  def set(): T = js.native
  def set(attribute: String): T = js.native
  def set(attribute: String, value: js.Any): T = js.native
  def set(attribute: String, value: js.Any, options: SetOptions): T = js.native
  def set(attribute: StringDictionary[js.Any]): T = js.native
  def set(attribute: StringDictionary[js.Any], options: SetOptions): T = js.native
  def timestamp(): js.Any = js.native
  def timestamp(options: TimestampOptions): js.Any = js.native
  def toJSON(): js.Any = js.native
  def toJSON(options: SerializeOptions): js.Any = js.native
  def unset(attribute: String): T = js.native
}

