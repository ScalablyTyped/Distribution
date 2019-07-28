package typings.cassandraDashDriver

import typings.cassandraDashDriver.cassandraDashDriverMod.metadataNs.caching
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object cassandraDashDriverStrings {
  @js.native
  sealed trait all extends caching
  
  @js.native
  sealed trait keys_only extends caching
  
  @js.native
  sealed trait none extends caching
  
  @js.native
  sealed trait rows_only extends caching
  
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def keys_only: keys_only = "keys_only".asInstanceOf[keys_only]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def rows_only: rows_only = "rows_only".asInstanceOf[rows_only]
}

