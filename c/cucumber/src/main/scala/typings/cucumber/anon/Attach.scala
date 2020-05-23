package typings.cucumber.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attach extends js.Object {
  var attach: js.Function
  var parameters: StringDictionary[js.Any]
}

object Attach {
  @scala.inline
  def apply(attach: js.Function, parameters: StringDictionary[js.Any]): Attach = {
    val __obj = js.Dynamic.literal(attach = attach.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attach]
  }
}

