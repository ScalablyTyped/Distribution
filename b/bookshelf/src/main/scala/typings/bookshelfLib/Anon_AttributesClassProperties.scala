package typings
package bookshelfLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AttributesClassProperties
  extends org.scalablytyped.runtime.Instantiable0[
      bookshelfLib.bookshelfMod.BookshelfNs.Collection[bookshelfLib.bookshelfMod.BookshelfNs.Model[js.Any]]
    ] {
  // See https://github.com/tgriesser/bookshelf/blob/0.9.4/src/collection.js#L389
  var EmptyError: createDashErrorLib.createDashErrorMod.createErrorNs.Error[stdLib.Error] = js.native
  /** @deprecated use Typescript classes */
  def extend[T](): js.Function = js.native
  def extend[T](prototypeProperties: js.Any): js.Function = js.native
  def extend[T](prototypeProperties: js.Any, classProperties: js.Any): js.Function = js.native
  /** @deprecated should use `new` objects instead. */
  def forge[T](): T = js.native
  def forge[T](attributes: js.Any): T = js.native
  def forge[T](attributes: js.Any, options: bookshelfLib.bookshelfMod.BookshelfNs.ModelOptions): T = js.native
}

