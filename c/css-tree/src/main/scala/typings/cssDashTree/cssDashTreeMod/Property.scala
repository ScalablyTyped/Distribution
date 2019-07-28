package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Property extends js.Object {
  val basename: String
  val custom: Boolean
  val hack: String
  val name: String
  val prefix: String
  val vendor: String
}

object Property {
  @scala.inline
  def apply(basename: String, custom: Boolean, hack: String, name: String, prefix: String, vendor: String): Property = {
    val __obj = js.Dynamic.literal(basename = basename, custom = custom, hack = hack, name = name, prefix = prefix, vendor = vendor)
  
    __obj.asInstanceOf[Property]
  }
}

