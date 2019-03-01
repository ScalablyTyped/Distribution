package typings
package ckeditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var CKEDITOR_BASEPATH: js.UndefOr[java.lang.String] = js.undefined
}

object Window {
  @scala.inline
  def apply(CKEDITOR_BASEPATH: java.lang.String = null): Window = {
    val __obj = js.Dynamic.literal()
    if (CKEDITOR_BASEPATH != null) __obj.updateDynamic("CKEDITOR_BASEPATH")(CKEDITOR_BASEPATH)
    __obj.asInstanceOf[Window]
  }
}

