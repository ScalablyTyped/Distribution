package typings.cypress.cypressMod.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogAttrs extends js.Object {
  var consoleProps: ObjectLike
  var url: String
}

object LogAttrs {
  @scala.inline
  def apply(consoleProps: ObjectLike, url: String): LogAttrs = {
    val __obj = js.Dynamic.literal(consoleProps = consoleProps.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LogAttrs]
  }
}

