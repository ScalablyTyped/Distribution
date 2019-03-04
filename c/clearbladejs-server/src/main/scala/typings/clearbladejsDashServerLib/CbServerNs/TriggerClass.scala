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
    Create: js.Function3[java.lang.String, TriggerCreateOptions, CbCallback, scala.Unit],
    Fetch: js.Function2[java.lang.String, CbCallback, scala.Unit]
  ): TriggerClass = {
    val __obj = js.Dynamic.literal(Create = Create, Fetch = Fetch)
  
    __obj.asInstanceOf[TriggerClass]
  }
}

