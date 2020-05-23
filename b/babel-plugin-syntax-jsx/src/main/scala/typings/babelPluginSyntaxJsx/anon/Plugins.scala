package typings.babelPluginSyntaxJsx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugins extends js.Object {
  var plugins: js.Array[String]
}

object Plugins {
  @scala.inline
  def apply(plugins: js.Array[String]): Plugins = {
    val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugins]
  }
}

