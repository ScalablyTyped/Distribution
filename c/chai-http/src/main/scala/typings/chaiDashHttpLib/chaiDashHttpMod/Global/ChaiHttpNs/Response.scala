package typings
package chaiDashHttpLib.chaiDashHttpMod.Global.ChaiHttpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Response extends js.Object {
  var body: js.Any
  var status: scala.Double
  var text: java.lang.String
  var `type`: java.lang.String
  def on(event: java.lang.String, fn: js.Function1[/* repeated */js.Any, scala.Unit]): scala.Unit
  def setEncoding(encoding: java.lang.String): scala.Unit
}

