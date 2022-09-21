package typings.bookshelf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.lodash.mod.ObjectIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bookshelf", "ModelBase")
@js.native
abstract class ModelBase[T /* <: Model[Any] */] ()
  extends Events[T | Collection[T]]
     with IModelBase {
  def this(attributes: Any) = this()
  def this(attributes: Any, options: ModelOptions) = this()
  def this(attributes: Unit, options: ModelOptions) = this()
  
  // See https://github.com/tgriesser/bookshelf/blob/0.9.4/src/base/model.js#L28
  var attributes: Any = js.native
  
  def clear(): T = js.native
  
  def escape(attribute: String): String = js.native
  
  def format(attributes: Any): Any = js.native
  
  def get(attribute: String): Any = js.native
  
  def has(attribute: String): Boolean = js.native
  
  def hasChanged(): Boolean = js.native
  def hasChanged(attribute: String): Boolean = js.native
  
  // See https://github.com/tgriesser/bookshelf/blob/0.9.4/src/base/model.js#L178
  // See https://github.com/tgriesser/bookshelf/blob/0.9.4/src/base/model.js#L213
  var id: Any = js.native
  
  /** If overriding, must use a getter instead of a plain property. */
  var idAttribute: String = js.native
  
  def isNew(): Boolean = js.native
  
  // lodash methods
  def omit[R /* <: js.Object */](): R = js.native
  def omit[R /* <: js.Object */](attributes: String*): R = js.native
  def omit[R /* <: js.Object */](predicate: Unit, thisArg: Any): R = js.native
  def omit[R /* <: js.Object */](predicate: ObjectIterator[Any, Boolean]): R = js.native
  def omit[R /* <: js.Object */](predicate: ObjectIterator[Any, Boolean], thisArg: Any): R = js.native
  
  def parse(response: js.Object): js.Object = js.native
  
  def pick[R /* <: js.Object */](): R = js.native
  def pick[R /* <: js.Object */](attributes: String*): R = js.native
  def pick[R /* <: js.Object */](predicate: Unit, thisArg: Any): R = js.native
  def pick[R /* <: js.Object */](predicate: ObjectIterator[Any, Boolean]): R = js.native
  def pick[R /* <: js.Object */](predicate: ObjectIterator[Any, Boolean], thisArg: Any): R = js.native
  
  def previous(attribute: String): Any = js.native
  
  def previousAttributes(): Any = js.native
  
  def related[R /* <: Model[Any] */](relation: String): R | Collection[R] = js.native
  
  def serialize(): Any = js.native
  def serialize(options: SerializeOptions): Any = js.native
  
  def set(): T = js.native
  def set(attribute: String): T = js.native
  def set(attribute: String, value: Any): T = js.native
  def set(attribute: String, value: Any, options: SetOptions): T = js.native
  def set(attribute: String, value: Unit, options: SetOptions): T = js.native
  def set(attribute: StringDictionary[Any]): T = js.native
  def set(attribute: StringDictionary[Any], options: SetOptions): T = js.native
  def set(attribute: Unit, options: SetOptions): T = js.native
  
  def timestamp(): Any = js.native
  def timestamp(options: TimestampOptions): Any = js.native
  
  def toJSON(): Any = js.native
  def toJSON(options: SerializeOptions): Any = js.native
  
  def unset(attribute: String): T = js.native
}
