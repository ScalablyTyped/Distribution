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
    afterDate: js.Function1[chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date, Assertion],
    afterTime: js.Function1[chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date, Assertion],
    beforeDate: js.Function1[chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date, Assertion],
    beforeTime: js.Function1[chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date, Assertion],
    equalDate: js.Function1[chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date, Assertion],
    equalTime: js.Function1[chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date, Assertion],
    withinDate: js.Function2[
      chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date, 
      chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date, 
      Assertion
    ],
    withinTime: js.Function2[
      chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date, 
      chaiDashDatetimeLib.chaiDashDatetimeMod.Global.Date, 
      Assertion
    ]
  ): Assertion = {
    val __obj = js.Dynamic.literal(afterDate = afterDate, afterTime = afterTime, beforeDate = beforeDate, beforeTime = beforeTime, equalDate = equalDate, equalTime = equalTime, withinDate = withinDate, withinTime = withinTime)
  
    __obj.asInstanceOf[Assertion]
  }
}

