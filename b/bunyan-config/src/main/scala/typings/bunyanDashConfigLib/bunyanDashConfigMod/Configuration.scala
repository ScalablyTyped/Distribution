package typings
package bunyanDashConfigLib.bunyanDashConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Configuration.
     * @interface
     */

trait Configuration extends js.Object {
  var level: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var name: java.lang.String
  var serializers: js.UndefOr[js.Object] = js.undefined
  var src: js.UndefOr[scala.Boolean] = js.undefined
  var stream: js.UndefOr[nodeLib.NodeJSNs.WritableStream] = js.undefined
  var streams: js.UndefOr[js.Array[Stream]] = js.undefined
}

