package typings
package bookshelfLib.bookshelfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BookshelfNs {
  type EventFunction[T] = js.Function3[
    /* model */ T, 
    /* attrs */ js.Any, 
    /* options */ js.Any, 
    bluebirdLib.bluebirdMod.namespaced[js.Any] | scala.Unit
  ]
  type FetchAllOptions = FetchOptions
  type SortOrder = bookshelfLib.bookshelfLibStrings.ASC | bookshelfLib.bookshelfLibStrings.asc | bookshelfLib.bookshelfLibStrings.DESC | bookshelfLib.bookshelfLibStrings.desc
}
