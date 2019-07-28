package typings.bookshelf

import typings.bookshelf.bookshelfMod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object bookshelfStrings {
  @js.native
  sealed trait ASC extends SortOrder
  
  @js.native
  sealed trait DESC extends SortOrder
  
  @js.native
  sealed trait asc extends SortOrder
  
  @js.native
  sealed trait desc extends SortOrder
  
  @scala.inline
  def ASC: ASC = "ASC".asInstanceOf[ASC]
  @scala.inline
  def DESC: DESC = "DESC".asInstanceOf[DESC]
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
}

