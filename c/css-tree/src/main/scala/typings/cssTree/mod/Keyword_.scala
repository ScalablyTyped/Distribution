package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyword_ extends js.Object {
  val basename: String
  val custom: Boolean
  val name: String
  val prefix: String
  val vendor: String
}

object Keyword_ {
  @scala.inline
  def apply(basename: String, custom: Boolean, name: String, prefix: String, vendor: String): Keyword_ = {
    val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyword_]
  }
}

