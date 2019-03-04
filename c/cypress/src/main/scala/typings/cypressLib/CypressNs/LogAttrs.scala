package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogAttrs extends js.Object {
  var consoleProps: ObjectLike
  var url: java.lang.String
}

object LogAttrs {
  @scala.inline
  def apply(consoleProps: ObjectLike, url: java.lang.String): LogAttrs = {
    val __obj = js.Dynamic.literal(consoleProps = consoleProps, url = url)
  
    __obj.asInstanceOf[LogAttrs]
  }
}

