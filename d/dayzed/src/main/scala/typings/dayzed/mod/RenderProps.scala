package typings.dayzed.mod

import typings.dayzed.anon.Calendars
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderProps extends js.Object {
  var calendars: js.Array[Calendar] = js.native
  def getBackProps(data: Calendars): Record[String, _] = js.native
  def getDateProps(data: typings.dayzed.anon.DateObj): Record[String, _] = js.native
  def getForwardProps(data: Calendars): Record[String, _] = js.native
}

object RenderProps {
  @scala.inline
  def apply(
    calendars: js.Array[Calendar],
    getBackProps: Calendars => Record[String, _],
    getDateProps: typings.dayzed.anon.DateObj => Record[String, _],
    getForwardProps: Calendars => Record[String, _]
  ): RenderProps = {
    val __obj = js.Dynamic.literal(calendars = calendars.asInstanceOf[js.Any], getBackProps = js.Any.fromFunction1(getBackProps), getDateProps = js.Any.fromFunction1(getDateProps), getForwardProps = js.Any.fromFunction1(getForwardProps))
    __obj.asInstanceOf[RenderProps]
  }
  @scala.inline
  implicit class RenderPropsOps[Self <: RenderProps] (val x: Self) extends AnyVal {
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
    def setCalendarsVarargs(value: Calendar*): Self = this.set("calendars", js.Array(value :_*))
    @scala.inline
    def setCalendars(value: js.Array[Calendar]): Self = this.set("calendars", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetBackProps(value: Calendars => Record[String, _]): Self = this.set("getBackProps", js.Any.fromFunction1(value))
    @scala.inline
    def setGetDateProps(value: typings.dayzed.anon.DateObj => Record[String, _]): Self = this.set("getDateProps", js.Any.fromFunction1(value))
    @scala.inline
    def setGetForwardProps(value: Calendars => Record[String, _]): Self = this.set("getForwardProps", js.Any.fromFunction1(value))
  }
  
}

