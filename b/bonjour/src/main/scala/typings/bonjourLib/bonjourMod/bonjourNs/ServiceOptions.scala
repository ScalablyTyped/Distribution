package typings
package bonjourLib.bonjourMod.bonjourNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceOptions extends js.Object {
  var host: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var port: scala.Double
  var protocol: js.UndefOr[bonjourLib.bonjourLibStrings.udp | bonjourLib.bonjourLibStrings.tcp] = js.undefined
  var subtypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var txt: js.UndefOr[js.Object] = js.undefined
  var `type`: java.lang.String
}

