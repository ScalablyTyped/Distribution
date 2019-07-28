package typings.chromeDashApps.chromeNs.runtimeNs

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
  var accessible_resources: js.Array[String]
  var name: String
}

object WebViewPartition {
  @scala.inline
  def apply(accessible_resources: js.Array[String], name: String): WebViewPartition = {
    val __obj = js.Dynamic.literal(accessible_resources = accessible_resources, name = name)
  
    __obj.asInstanceOf[WebViewPartition]
  }
}

