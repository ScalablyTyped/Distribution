package typings
package chaiDashHttpLib.chaiDashHttpMod.Global.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertion extends js.Object {
  var headers: Assertion = js.native
  var html: Assertion = js.native
  var json: Assertion = js.native
  var redirect: Assertion = js.native
  var text: Assertion = js.native
  def cookie(key: java.lang.String): Assertion = js.native
  def cookie(key: java.lang.String, value: java.lang.String): Assertion = js.native
  def header(key: java.lang.String): Assertion = js.native
  def header(key: java.lang.String, value: java.lang.String): Assertion = js.native
  def header(key: java.lang.String, value: stdLib.RegExp): Assertion = js.native
  def param(key: java.lang.String): Assertion = js.native
  def param(key: java.lang.String, value: java.lang.String): Assertion = js.native
  def redirectTo(location: java.lang.String): Assertion = js.native
  def status(code: scala.Double): Assertion = js.native
  def statusCode(code: scala.Double): Assertion = js.native
}

