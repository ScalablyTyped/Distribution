package typings
package bootboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Bootbox options available for custom modals */
trait BootboxDialogOptions[T] extends BootboxBaseOptions[T] {
  var message: jqueryLib.JQuery[stdLib.HTMLElement] | js.Array[_] | stdLib.Element | stdLib.DocumentFragment | stdLib.Text | java.lang.String | (js.Function2[
    /* index */ scala.Double, 
    /* html */ java.lang.String, 
    java.lang.String | stdLib.Element | jqueryLib.JQuery[stdLib.HTMLElement]
  ])
}

