package typings
package clearbladejsDashClientLib.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearBladeGlobal extends ClearBladeInt {
  var MESSAGING_QOS_AT_LEAST_ONCE: MessagingQOS = js.native
  var MESSAGING_QOS_AT_MOST_ONCE: MessagingQOS = js.native
  var MESSAGING_QOS_EXACTLY_ONCE: MessagingQOS = js.native
  def request(options: RequestOptions, callback: CbCallback): scala.Unit = js.native
}

