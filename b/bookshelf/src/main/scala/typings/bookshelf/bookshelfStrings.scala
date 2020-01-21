package typings.bookshelf

import typings.bookshelf.mod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object bookshelfStrings {
  @js.native
  sealed trait ASC extends SortOrder
  
  @js.native
  sealed trait DESC extends SortOrder
  
  @js.native
  sealed trait asc_ extends SortOrder
  
  @js.native
  sealed trait desc_ extends SortOrder
  
  @scala.inline
  def ASC: ASC = "ASC".asInstanceOf[ASC]
  @scala.inline
  def DESC: DESC = "DESC".asInstanceOf[DESC]
  @scala.inline
  def asc_ : asc_ = "asc".asInstanceOf[asc_]
  @scala.inline
  def desc_ : desc_ = "desc".asInstanceOf[desc_]
}

