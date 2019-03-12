package typings
package clearbladejsDashServerLib.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerClass extends js.Object {
  def Create(name: java.lang.String, options: TriggerCreateOptions, callback: CbCallback): scala.Unit
  def Fetch(name: java.lang.String, callback: CbCallback): scala.Unit
}

object TriggerClass {
  @scala.inline
  def apply(
    Create: (java.lang.String, TriggerCreateOptions, CbCallback) => scala.Unit,
    Fetch: (java.lang.String, CbCallback) => scala.Unit
  ): TriggerClass = {
    val __obj = js.Dynamic.literal(Create = js.Any.fromFunction3(Create), Fetch = js.Any.fromFunction2(Fetch))
  
    __obj.asInstanceOf[TriggerClass]
  }
}

