package typings
package bunnymqLib.bunnymqMod.bunnymqNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var consumerSuffix: js.UndefOr[java.lang.String] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number of fetched messages at once on the channel.
    *
    */
  var prefetch: js.UndefOr[scala.Double] = js.undefined
  /**
    * Requeue put back message into the broker if consumer crashes/trigger exception.
    *
    */
  var requeue: js.UndefOr[scala.Boolean] = js.undefined
  var rpcTimeout: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var transport: js.UndefOr[js.Any] = js.undefined
}

