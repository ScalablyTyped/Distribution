package typings
package consulLib.consulMod.ConsulNs.EventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FireOptions
  extends consulLib.consulMod.ConsulNs.CommonOptions {
  var name: java.lang.String
  var node: js.UndefOr[java.lang.String] = js.undefined
  var payload: java.lang.String | nodeLib.Buffer
  var service: js.UndefOr[java.lang.String] = js.undefined
  var tag: js.UndefOr[java.lang.String] = js.undefined
}

