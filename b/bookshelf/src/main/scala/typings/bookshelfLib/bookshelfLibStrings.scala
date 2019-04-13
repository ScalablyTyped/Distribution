package typings
package bookshelfLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object bookshelfLibStrings {
  @js.native
  sealed trait ASC
    extends bookshelfLib.bookshelfMod.SortOrder
  
  @js.native
  sealed trait DESC
    extends bookshelfLib.bookshelfMod.SortOrder
  
  @js.native
  sealed trait asc
    extends bookshelfLib.bookshelfMod.SortOrder
  
  @js.native
  sealed trait desc
    extends bookshelfLib.bookshelfMod.SortOrder
  
  @scala.inline
  def ASC: ASC = "ASC".asInstanceOf[ASC]
  @scala.inline
  def DESC: DESC = "DESC".asInstanceOf[DESC]
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
}

