package typings.chaiHttp.mod._Global_.Chai

import typings.std.RegExp
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
  def cookie(key: String): Assertion = js.native
  def cookie(key: String, value: String): Assertion = js.native
  def header(key: String): Assertion = js.native
  def header(key: String, value: String): Assertion = js.native
  def header(key: String, value: RegExp): Assertion = js.native
  def param(key: String): Assertion = js.native
  def param(key: String, value: String): Assertion = js.native
  def redirectTo(location: String): Assertion = js.native
  def redirectTo(location: RegExp): Assertion = js.native
  def status(code: Double): Assertion = js.native
  def statusCode(code: Double): Assertion = js.native
}

