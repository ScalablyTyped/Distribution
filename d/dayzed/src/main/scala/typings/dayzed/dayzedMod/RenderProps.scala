package typings.dayzed.dayzedMod

import typings.dayzed.Anon_Calendars
import typings.dayzed.Anon_DateObj
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProps extends js.Object {
  var calendars: js.Array[Calendar]
  def getBackProps(data: Anon_Calendars): Record[String, _]
  def getDateProps(data: Anon_DateObj): Record[String, _]
  def getForwardProps(data: Anon_Calendars): Record[String, _]
}

object RenderProps {
  @scala.inline
  def apply(
    calendars: js.Array[Calendar],
    getBackProps: Anon_Calendars => Record[String, _],
    getDateProps: Anon_DateObj => Record[String, _],
    getForwardProps: Anon_Calendars => Record[String, _]
  ): RenderProps = {
    val __obj = js.Dynamic.literal(calendars = calendars, getBackProps = js.Any.fromFunction1(getBackProps), getDateProps = js.Any.fromFunction1(getDateProps), getForwardProps = js.Any.fromFunction1(getForwardProps))
  
    __obj.asInstanceOf[RenderProps]
  }
}

