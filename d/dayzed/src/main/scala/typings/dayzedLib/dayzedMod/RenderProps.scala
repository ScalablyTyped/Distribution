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

