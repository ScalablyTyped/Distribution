package typings
package bunyanDashSeqLib.bunyanDashSeqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var apiKey: js.UndefOr[java.lang.String] = js.undefined
  var batchSizeLimit: js.UndefOr[scala.Double] = js.undefined
  var eventSizeLimit: js.UndefOr[scala.Double] = js.undefined
  var level: js.UndefOr[java.lang.String] = js.undefined
  var maxBatchingTime: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onError: js.UndefOr[js.Function1[/* e */ nodeLib.Error, scala.Unit]] = js.undefined
  var reemitErrorEvents: js.UndefOr[scala.Boolean] = js.undefined
  var serverUrl: js.UndefOr[java.lang.String] = js.undefined
}

