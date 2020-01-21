package typings.bookshelf.mod

import typings.bookshelf.bookshelfStrings.asc_
import typings.bookshelf.bookshelfStrings.desc_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bookshelf.bookshelfStrings.ASC
  - typings.bookshelf.bookshelfStrings.asc_
  - typings.bookshelf.bookshelfStrings.DESC
  - typings.bookshelf.bookshelfStrings.desc_
*/
trait SortOrder extends js.Object

object SortOrder {
  @scala.inline
  def ASC: typings.bookshelf.bookshelfStrings.ASC = this.cast("ASC")
  @scala.inline
  def DESC: typings.bookshelf.bookshelfStrings.DESC = this.cast("DESC")
  @scala.inline
  def asc: asc_ = this.cast("asc")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def desc: desc_ = this.cast("desc")
}

