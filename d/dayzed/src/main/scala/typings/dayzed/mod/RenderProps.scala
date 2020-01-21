package typings.dayzed.mod

import typings.dayzed.AnonCalendars
import typings.dayzed.AnonDateObj
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProps extends js.Object {
  var calendars: js.Array[Calendar]
  def getBackProps(data: AnonCalendars): Record[String, _]
  def getDateProps(data: AnonDateObj): Record[String, _]
  def getForwardProps(data: AnonCalendars): Record[String, _]
}

object RenderProps {
  @scala.inline
  def apply(
    calendars: js.Array[Calendar],
    getBackProps: AnonCalendars => Record[String, _],
    getDateProps: AnonDateObj => Record[String, _],
    getForwardProps: AnonCalendars => Record[String, _]
  ): RenderProps = {
    val __obj = js.Dynamic.literal(calendars = calendars.asInstanceOf[js.Any], getBackProps = js.Any.fromFunction1(getBackProps), getDateProps = js.Any.fromFunction1(getDateProps), getForwardProps = js.Any.fromFunction1(getForwardProps))
  
    __obj.asInstanceOf[RenderProps]
  }
}

