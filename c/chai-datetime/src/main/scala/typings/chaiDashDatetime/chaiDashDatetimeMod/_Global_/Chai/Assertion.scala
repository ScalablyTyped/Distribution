package typings.chaiDashDatetime.chaiDashDatetimeMod._Global_.Chai

import typings.chaiDashDatetime.chaiDashDatetimeMod._Global_.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Assertion extends js.Object {
  def afterDate(date: Date): Assertion
  def afterTime(date: Date): Assertion
  def beforeDate(date: Date): Assertion
  def beforeTime(date: Date): Assertion
  def equalDate(date: Date): Assertion
  def equalTime(date: Date): Assertion
  def withinDate(dateFrom: Date, dateTo: Date): Assertion
  def withinTime(dateFrom: Date, dateTo: Date): Assertion
}

object Assertion {
  @scala.inline
  def apply(
    afterDate: Date => Assertion,
    afterTime: Date => Assertion,
    beforeDate: Date => Assertion,
    beforeTime: Date => Assertion,
    equalDate: Date => Assertion,
    equalTime: Date => Assertion,
    withinDate: (Date, Date) => Assertion,
    withinTime: (Date, Date) => Assertion
  ): Assertion = {
    val __obj = js.Dynamic.literal(afterDate = js.Any.fromFunction1(afterDate), afterTime = js.Any.fromFunction1(afterTime), beforeDate = js.Any.fromFunction1(beforeDate), beforeTime = js.Any.fromFunction1(beforeTime), equalDate = js.Any.fromFunction1(equalDate), equalTime = js.Any.fromFunction1(equalTime), withinDate = js.Any.fromFunction2(withinDate), withinTime = js.Any.fromFunction2(withinTime))
  
    __obj.asInstanceOf[Assertion]
  }
}

