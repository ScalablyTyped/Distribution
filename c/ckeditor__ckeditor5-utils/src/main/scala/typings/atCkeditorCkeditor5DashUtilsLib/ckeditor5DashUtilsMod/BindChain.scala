package typings
package atCkeditorCkeditor5DashUtilsLib.ckeditor5DashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BindChain extends js.Object {
  def to(observable: Observable, bindProperties: (Observable | java.lang.String | js.Function)*): scala.Unit
  def toMany(observable: js.Array[Observable], bindProperties: (Observable | java.lang.String | js.Function)*): scala.Unit
}

