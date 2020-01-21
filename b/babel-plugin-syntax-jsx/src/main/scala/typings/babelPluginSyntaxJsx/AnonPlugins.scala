package typings.babelPluginSyntaxJsx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPlugins extends js.Object {
  var plugins: js.Array[String]
}

object AnonPlugins {
  @scala.inline
  def apply(plugins: js.Array[String]): AnonPlugins = {
    val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPlugins]
  }
}

