package typings.chaiDatetime.mod.global.Chai

import typings.chaiDatetime.mod.global.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertion extends js.Object {
  def afterDate(date: Date): Assertion = js.native
  def afterTime(date: Date): Assertion = js.native
  def beforeDate(date: Date): Assertion = js.native
  def beforeTime(date: Date): Assertion = js.native
  def equalDate(date: Date): Assertion = js.native
  def equalTime(date: Date): Assertion = js.native
  def withinDate(dateFrom: Date, dateTo: Date): Assertion = js.native
  def withinTime(dateFrom: Date, dateTo: Date): Assertion = js.native
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
  @scala.inline
  implicit class AssertionOps[Self <: Assertion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfterDate(value: Date => Assertion): Self = this.set("afterDate", js.Any.fromFunction1(value))
    @scala.inline
    def setAfterTime(value: Date => Assertion): Self = this.set("afterTime", js.Any.fromFunction1(value))
    @scala.inline
    def setBeforeDate(value: Date => Assertion): Self = this.set("beforeDate", js.Any.fromFunction1(value))
    @scala.inline
    def setBeforeTime(value: Date => Assertion): Self = this.set("beforeTime", js.Any.fromFunction1(value))
    @scala.inline
    def setEqualDate(value: Date => Assertion): Self = this.set("equalDate", js.Any.fromFunction1(value))
    @scala.inline
    def setEqualTime(value: Date => Assertion): Self = this.set("equalTime", js.Any.fromFunction1(value))
    @scala.inline
    def setWithinDate(value: (Date, Date) => Assertion): Self = this.set("withinDate", js.Any.fromFunction2(value))
    @scala.inline
    def setWithinTime(value: (Date, Date) => Assertion): Self = this.set("withinTime", js.Any.fromFunction2(value))
  }
  
}

