package typings.bonjour.bonjourMod

import typings.node.NodeJSNs.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service extends EventEmitter {
  var fqdn: String = js.native
  var host: String = js.native
  var name: String = js.native
  var port: Double = js.native
  var protocol: String = js.native
  var published: Boolean = js.native
  var subtypes: js.Array[String] = js.native
  var txt: js.Object = js.native
  var `type`: String = js.native
  def start(): Unit = js.native
  def stop(cb: js.Function0[_]): Unit = js.native
}

