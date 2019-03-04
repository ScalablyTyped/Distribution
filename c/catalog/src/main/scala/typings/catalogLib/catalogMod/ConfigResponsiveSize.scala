package typings
package catalogLib.catalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigResponsiveSize extends js.Object {
  var height: scala.Double
  var name: java.lang.String
  var width: scala.Double
}

object ConfigResponsiveSize {
  @scala.inline
  def apply(height: scala.Double, name: java.lang.String, width: scala.Double): ConfigResponsiveSize = {
    val __obj = js.Dynamic.literal(height = height, name = name, width = width)
  
    __obj.asInstanceOf[ConfigResponsiveSize]
  }
}

