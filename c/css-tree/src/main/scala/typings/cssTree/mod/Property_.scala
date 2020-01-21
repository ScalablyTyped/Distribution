package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Property_ extends js.Object {
  val basename: String
  val custom: Boolean
  val hack: String
  val name: String
  val prefix: String
  val vendor: String
}

object Property_ {
  @scala.inline
  def apply(basename: String, custom: Boolean, hack: String, name: String, prefix: String, vendor: String): Property_ = {
    val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], hack = hack.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Property_]
  }
}

