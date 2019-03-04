package typings
package chromeDashAppsLib.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebViewPartition extends js.Object {
  /**
    * Path to files, relative, absolute or pattern
    * @example
    * ['local_*.html', '*.png', '*.js']
    * ['img/epic.html']
    *
    */
  var accessible_resources: js.Array[java.lang.String]
  var name: java.lang.String
}

object WebViewPartition {
  @scala.inline
  def apply(accessible_resources: js.Array[java.lang.String], name: java.lang.String): WebViewPartition = {
    val __obj = js.Dynamic.literal(accessible_resources = accessible_resources, name = name)
  
    __obj.asInstanceOf[WebViewPartition]
  }
}

