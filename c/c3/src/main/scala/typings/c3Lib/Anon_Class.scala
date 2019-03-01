package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Class extends js.Object {
  var `class`: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object Anon_Class {
  @scala.inline
  def apply(`class`: java.lang.String = null, value: scala.Double | java.lang.String = null): Anon_Class = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Class]
  }
}

