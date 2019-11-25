package typings.cucumber

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attach extends js.Object {
  var attach: js.Function
  var parameters: StringDictionary[js.Any]
}

object Anon_Attach {
  @scala.inline
  def apply(attach: js.Function, parameters: StringDictionary[js.Any]): Anon_Attach = {
    val __obj = js.Dynamic.literal(attach = attach.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Attach]
  }
}

