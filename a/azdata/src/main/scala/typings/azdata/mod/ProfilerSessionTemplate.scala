package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfilerSessionTemplate extends js.Object {
  /**
    * TSQL for creating a session
    */
  var createStatement: String
  /**
    * Default view for template
    */
  var defaultView: String
  /**
    * Template name
    */
  var name: String
}

object ProfilerSessionTemplate {
  @scala.inline
  def apply(createStatement: String, defaultView: String, name: String): ProfilerSessionTemplate = {
    val __obj = js.Dynamic.literal(createStatement = createStatement.asInstanceOf[js.Any], defaultView = defaultView.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilerSessionTemplate]
  }
}

