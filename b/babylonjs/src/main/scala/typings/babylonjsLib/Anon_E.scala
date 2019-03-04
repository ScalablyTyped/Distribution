package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_E extends js.Object {
  var handler: babylonjsLib.BABYLONNs.Nullable[js.Function1[/* e */ stdLib.FocusEvent, _]]
  var name: java.lang.String
}

object Anon_E {
  @scala.inline
  def apply(
    handler: babylonjsLib.BABYLONNs.Nullable[js.Function1[/* e */ stdLib.FocusEvent, _]],
    name: java.lang.String
  ): Anon_E = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], name = name)
  
    __obj.asInstanceOf[Anon_E]
  }
}

