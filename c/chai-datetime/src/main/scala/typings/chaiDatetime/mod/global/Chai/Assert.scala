package typings.chaiDatetime.mod.global.Chai

import typings.chaiDatetime.mod.global.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assert extends js.Object {
  def afterDate(`val`: Date, exp: Date): Unit = js.native
  def afterDate(`val`: Date, exp: Date, msg: String): Unit = js.native
  def afterTime(`val`: Date, exp: Date): Unit = js.native
  def afterTime(`val`: Date, exp: Date, msg: String): Unit = js.native
  def beforeDate(`val`: Date, exp: Date): Unit = js.native
  def beforeDate(`val`: Date, exp: Date, msg: String): Unit = js.native
  def beforeTime(`val`: Date, exp: Date): Unit = js.native
  def beforeTime(`val`: Date, exp: Date, msg: String): Unit = js.native
  def equalDate(`val`: Date, exp: Date): Unit = js.native
  def equalDate(`val`: Date, exp: Date, msg: String): Unit = js.native
  def equalTime(`val`: Date, exp: Date): Unit = js.native
  def equalTime(`val`: Date, exp: Date, msg: String): Unit = js.native
  def notAfterDate(`val`: Date, exp: Date): Unit = js.native
  def notAfterDate(`val`: Date, exp: Date, msg: String): Unit = js.native
  def notAfterTime(`val`: Date, exp: Date): Unit = js.native
  def notAfterTime(`val`: Date, exp: Date, msg: String): Unit = js.native
  def notBeforeDate(`val`: Date, exp: Date): Unit = js.native
  def notBeforeDate(`val`: Date, exp: Date, msg: String): Unit = js.native
  def notBeforeTime(`val`: Date, exp: Date): Unit = js.native
  def notBeforeTime(`val`: Date, exp: Date, msg: String): Unit = js.native
  def notEqualDate(`val`: Date, exp: Date): Unit = js.native
  def notEqualDate(`val`: Date, exp: Date, msg: String): Unit = js.native
  def notEqualTime(`val`: Date, exp: Date): Unit = js.native
  def notEqualTime(`val`: Date, exp: Date, msg: String): Unit = js.native
  def notWithinDate(`val`: Date, expFrom: Date, expTo: Date): Unit = js.native
  def notWithinDate(`val`: Date, expFrom: Date, expTo: Date, msg: String): Unit = js.native
  def notWithinTime(`val`: Date, expFrom: Date, expTo: Date): Unit = js.native
  def notWithinTime(`val`: Date, expFrom: Date, expTo: Date, msg: String): Unit = js.native
  def withinDate(`val`: Date, expFrom: Date, expTo: Date): Unit = js.native
  def withinDate(`val`: Date, expFrom: Date, expTo: Date, msg: String): Unit = js.native
  def withinTime(`val`: Date, expFrom: Date, expTo: Date): Unit = js.native
  def withinTime(`val`: Date, expFrom: Date, expTo: Date, msg: String): Unit = js.native
}

