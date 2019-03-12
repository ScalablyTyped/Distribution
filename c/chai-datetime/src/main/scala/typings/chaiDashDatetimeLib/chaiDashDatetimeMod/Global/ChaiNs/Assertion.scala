package typings
package chaiDashDatetimeLib.chaiDashDatetimeMod.Global.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Assertion extends js.Object {
  def afterDate(date: chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date): Assertion
  def afterTime(date: chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date): Assertion
  def beforeDate(date: chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date): Assertion
  def beforeTime(date: chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date): Assertion
  def equalDate(date: chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date): Assertion
  def equalTime(date: chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date): Assertion
  def withinDate(
    dateFrom: chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date,
    dateTo: chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date
  ): Assertion
  def withinTime(
    dateFrom: chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date,
    dateTo: chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date
  ): Assertion
}

object Assertion {
  @scala.inline
  def apply(
    afterDate: chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date => Assertion,
    afterTime: chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date => Assertion,
    beforeDate: chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date => Assertion,
    beforeTime: chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date => Assertion,
    equalDate: chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date => Assertion,
    equalTime: chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date => Assertion,
    withinDate: (chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date, chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date) => Assertion,
    withinTime: (chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date, chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date) => Assertion
  ): Assertion = {
    val __obj = js.Dynamic.literal(afterDate = js.Any.fromFunction1(afterDate), afterTime = js.Any.fromFunction1(afterTime), beforeDate = js.Any.fromFunction1(beforeDate), beforeTime = js.Any.fromFunction1(beforeTime), equalDate = js.Any.fromFunction1(equalDate), equalTime = js.Any.fromFunction1(equalTime), withinDate = js.Any.fromFunction2(withinDate), withinTime = js.Any.fromFunction2(withinTime))
  
    __obj.asInstanceOf[Assertion]
  }
}

