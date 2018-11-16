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

