package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyword extends js.Object {
  val basename: java.lang.String
  val custom: scala.Boolean
  val name: java.lang.String
  val prefix: java.lang.String
  val vendor: java.lang.String
}

object Keyword {
  @scala.inline
  def apply(
    basename: java.lang.String,
    custom: scala.Boolean,
    name: java.lang.String,
    prefix: java.lang.String,
    vendor: java.lang.String
  ): Keyword = {
    val __obj = js.Dynamic.literal(basename = basename, custom = custom, name = name, prefix = prefix, vendor = vendor)
  
    __obj.asInstanceOf[Keyword]
  }
}

