package typings
package clearbladejsDashServerLib.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerInstance extends js.Object {
  var name: java.lang.String
  var systemKey: java.lang.String
  def Delete(callback: CbCallback): scala.Unit
  def Update(options: js.Object, callback: CbCallback): scala.Unit
}

