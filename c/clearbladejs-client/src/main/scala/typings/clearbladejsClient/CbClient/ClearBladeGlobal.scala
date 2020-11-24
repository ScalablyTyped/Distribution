package typings.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearBladeGlobal extends ClearBladeInt {
  
  var MESSAGING_QOS_AT_LEAST_ONCE: typings.clearbladejsClient.CbClient.MessagingQOS.MESSAGING_QOS_AT_LEAST_ONCE = js.native
  
  var MESSAGING_QOS_AT_MOST_ONCE: typings.clearbladejsClient.CbClient.MessagingQOS.MESSAGING_QOS_AT_MOST_ONCE = js.native
  
  var MESSAGING_QOS_EXACTLY_ONCE: typings.clearbladejsClient.CbClient.MessagingQOS.MESSAGING_QOS_EXACTLY_ONCE = js.native
  
  def request(options: RequestOptions, callback: CbCallback): Unit = js.native
}
