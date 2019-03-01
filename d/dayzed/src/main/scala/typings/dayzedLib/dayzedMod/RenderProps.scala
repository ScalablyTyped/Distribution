package typings
package dayzedLib.dayzedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProps extends js.Object {
  var calendars: js.Array[Calendar]
  def getBackProps(data: dayzedLib.Anon_Calendars): stdLib.Record[java.lang.String, _]
  def getDateProps(data: dayzedLib.Anon_DateObj): stdLib.Record[java.lang.String, _]
  def getForwardProps(data: dayzedLib.Anon_Calendars): stdLib.Record[java.lang.String, _]
}

object RenderProps {
  @scala.inline
  def apply(
    calendars: js.Array[Calendar],
    getBackProps: js.Function1[dayzedLib.Anon_Calendars, stdLib.Record[java.lang.String, _]],
    getDateProps: js.Function1[dayzedLib.Anon_DateObj, stdLib.Record[java.lang.String, _]],
    getForwardProps: js.Function1[dayzedLib.Anon_Calendars, stdLib.Record[java.lang.String, _]]
  ): RenderProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("calendars")(calendars)
    __obj.updateDynamic("getBackProps")(getBackProps)
    __obj.updateDynamic("getDateProps")(getDateProps)
    __obj.updateDynamic("getForwardProps")(getForwardProps)
    __obj.asInstanceOf[RenderProps]
  }
}

