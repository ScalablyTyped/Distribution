package typings
package bonjourLib.bonjourMod.bonjourNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service
  extends nodeLib.NodeJSNs.EventEmitter {
  var fqdn: java.lang.String = js.native
  var host: java.lang.String = js.native
  var name: java.lang.String = js.native
  var port: scala.Double = js.native
  var protocol: java.lang.String = js.native
  var published: scala.Boolean = js.native
  var subtypes: js.Array[java.lang.String] = js.native
  var txt: js.Object = js.native
  var `type`: java.lang.String = js.native
  def start(): scala.Unit = js.native
  def stop(cb: js.Function0[_]): scala.Unit = js.native
}

