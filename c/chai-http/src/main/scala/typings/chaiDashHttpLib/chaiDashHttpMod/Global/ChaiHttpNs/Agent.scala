package typings
package chaiDashHttpLib.chaiDashHttpMod.Global.ChaiHttpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Agent extends js.Object {
  def close(): Agent = js.native
  def close(callback: js.Function1[/* err */ js.Any, scala.Unit]): Agent = js.native
  def del(url: java.lang.String): superagentLib.superagentMod.requestNs.Request = js.native
  def del(url: java.lang.String, callback: js.Function2[/* err */ js.Any, /* res */ Response, scala.Unit]): superagentLib.superagentMod.requestNs.Request = js.native
  def get(url: java.lang.String): superagentLib.superagentMod.requestNs.Request = js.native
  def get(url: java.lang.String, callback: js.Function2[/* err */ js.Any, /* res */ Response, scala.Unit]): superagentLib.superagentMod.requestNs.Request = js.native
  def head(url: java.lang.String): superagentLib.superagentMod.requestNs.Request = js.native
  def head(url: java.lang.String, callback: js.Function2[/* err */ js.Any, /* res */ Response, scala.Unit]): superagentLib.superagentMod.requestNs.Request = js.native
  def keepOpen(): Agent = js.native
  def options(url: java.lang.String): superagentLib.superagentMod.requestNs.Request = js.native
  def options(url: java.lang.String, callback: js.Function2[/* err */ js.Any, /* res */ Response, scala.Unit]): superagentLib.superagentMod.requestNs.Request = js.native
  def patch(url: java.lang.String): superagentLib.superagentMod.requestNs.Request = js.native
  def patch(url: java.lang.String, callback: js.Function2[/* err */ js.Any, /* res */ Response, scala.Unit]): superagentLib.superagentMod.requestNs.Request = js.native
  def post(url: java.lang.String): superagentLib.superagentMod.requestNs.Request = js.native
  def post(url: java.lang.String, callback: js.Function2[/* err */ js.Any, /* res */ Response, scala.Unit]): superagentLib.superagentMod.requestNs.Request = js.native
  def put(url: java.lang.String): superagentLib.superagentMod.requestNs.Request = js.native
  def put(url: java.lang.String, callback: js.Function2[/* err */ js.Any, /* res */ Response, scala.Unit]): superagentLib.superagentMod.requestNs.Request = js.native
}

