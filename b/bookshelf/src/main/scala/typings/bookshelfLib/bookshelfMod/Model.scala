package typings
package bookshelfLib.bookshelfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bookshelf", "Model")
@js.native
class Model[T /* <: bookshelfLib.bookshelfMod.BookshelfNs.Model[_] */] ()
  extends bookshelfLib.bookshelfMod.BookshelfNs.Model[T]

@JSImport("bookshelf", "Model")
@js.native
object Model extends js.Object {
  var NoRowsDeletedError: createDashErrorLib.createDashErrorMod.createErrorNs.Error[nodeLib.Error] = js.native
  var NoRowsUpdatedError: createDashErrorLib.createDashErrorMod.createErrorNs.Error[nodeLib.Error] = js.native
  // See https://github.com/tgriesser/bookshelf/blob/0.9.4/src/errors.js
  // See https://github.com/tgriesser/bookshelf/blob/0.9.4/src/model.js#L1280
  var NotFoundError: createDashErrorLib.createDashErrorMod.createErrorNs.Error[nodeLib.Error] = js.native
  def collection[T /* <: bookshelfLib.bookshelfMod.BookshelfNs.Model[_] */](): bookshelfLib.bookshelfMod.BookshelfNs.Collection[T] = js.native
  def collection[T /* <: bookshelfLib.bookshelfMod.BookshelfNs.Model[_] */](models: js.Array[T]): bookshelfLib.bookshelfMod.BookshelfNs.Collection[T] = js.native
  def collection[T /* <: bookshelfLib.bookshelfMod.BookshelfNs.Model[_] */](models: js.Array[T], options: bookshelfLib.bookshelfMod.BookshelfNs.CollectionOptions[T]): bookshelfLib.bookshelfMod.BookshelfNs.Collection[T] = js.native
  def count(): bluebirdLib.bluebirdMod.namespaced[scala.Double] = js.native
  def count(column: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Double] = js.native
  def count(column: java.lang.String, options: bookshelfLib.bookshelfMod.BookshelfNs.SyncOptions): bluebirdLib.bluebirdMod.namespaced[scala.Double] = js.native
  /** @deprecated use Typescript classes */
  def extend[T /* <: bookshelfLib.bookshelfMod.BookshelfNs.Model[_] */](): js.Function = js.native
  /** @deprecated use Typescript classes */
  def extend[T /* <: bookshelfLib.bookshelfMod.BookshelfNs.Model[_] */](prototypeProperties: js.Any): js.Function = js.native
  /** @deprecated use Typescript classes */
  def extend[T /* <: bookshelfLib.bookshelfMod.BookshelfNs.Model[_] */](prototypeProperties: js.Any, classProperties: js.Any): js.Function = js.native
   // should return a type
  def fetchAll[T /* <: bookshelfLib.bookshelfMod.BookshelfNs.Model[_] */](): bluebirdLib.bluebirdMod.namespaced[bookshelfLib.bookshelfMod.BookshelfNs.Collection[T]] = js.native
  /** @deprecated should use `new` objects instead. */
  def forge[T](): T = js.native
  /** @deprecated should use `new` objects instead. */
  def forge[T](attributes: js.Any): T = js.native
  /** @deprecated should use `new` objects instead. */
  def forge[T](attributes: js.Any, options: bookshelfLib.bookshelfMod.BookshelfNs.ModelOptions): T = js.native
  def where[T](key: java.lang.String, operatorOrValue: java.lang.String): T = js.native
  def where[T](key: java.lang.String, operatorOrValue: java.lang.String, valueIfOperator: java.lang.String): T = js.native
  def where[T](
    key: java.lang.String,
    operatorOrValue: java.lang.String,
    valueIfOperator: js.Array[java.lang.String | scala.Double]
  ): T = js.native
  def where[T](key: java.lang.String, operatorOrValue: java.lang.String, valueIfOperator: scala.Boolean): T = js.native
  def where[T](key: java.lang.String, operatorOrValue: java.lang.String, valueIfOperator: scala.Double): T = js.native
  def where[T](key: java.lang.String, operatorOrValue: scala.Boolean): T = js.native
  def where[T](key: java.lang.String, operatorOrValue: scala.Boolean, valueIfOperator: java.lang.String): T = js.native
  def where[T](
    key: java.lang.String,
    operatorOrValue: scala.Boolean,
    valueIfOperator: js.Array[java.lang.String | scala.Double]
  ): T = js.native
  def where[T](key: java.lang.String, operatorOrValue: scala.Boolean, valueIfOperator: scala.Boolean): T = js.native
  def where[T](key: java.lang.String, operatorOrValue: scala.Boolean, valueIfOperator: scala.Double): T = js.native
  def where[T](key: java.lang.String, operatorOrValue: scala.Double): T = js.native
  def where[T](key: java.lang.String, operatorOrValue: scala.Double, valueIfOperator: java.lang.String): T = js.native
  def where[T](
    key: java.lang.String,
    operatorOrValue: scala.Double,
    valueIfOperator: js.Array[java.lang.String | scala.Double]
  ): T = js.native
  def where[T](key: java.lang.String, operatorOrValue: scala.Double, valueIfOperator: scala.Boolean): T = js.native
  def where[T](key: java.lang.String, operatorOrValue: scala.Double, valueIfOperator: scala.Double): T = js.native
  def where[T](properties: ScalablyTyped.runtime.StringDictionary[js.Any]): T = js.native
}

