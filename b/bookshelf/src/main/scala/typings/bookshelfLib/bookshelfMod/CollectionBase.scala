package typings
package bookshelfLib.bookshelfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bookshelf", "CollectionBase")
@js.native
// See https://github.com/tgriesser/bookshelf/blob/0.9.4/src/base/collection.js#L21
abstract class CollectionBase[T /* <: bookshelfLib.bookshelfMod.BookshelfNs.Model[_] */] ()
  extends bookshelfLib.bookshelfMod.BookshelfNs.CollectionBase[T] {
  def this(models: js.Array[T]) = this()
  def this(models: js.Array[T], options: bookshelfLib.bookshelfMod.BookshelfNs.CollectionOptions[T]) = this()
}

