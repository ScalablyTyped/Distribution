package typings
package chocolatechipjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Data extends js.Object {
  /**
    * Use this method to render declarative temlate repeaters. This expects a "data-repeater" attribute whose value points to data stored on $.template.data.
    */
  def apply(): scala.Unit = js.native
  /**
    * A method to repeated output a template.
    *
    * @param element The target container into which the content will be inserted.
    * @param template A string of markup.
    * @param data The iterable data the template will consume.
    */
  def apply(element: ChocolateChipElementArray, template: java.lang.String, data: js.Any): scala.Unit = js.native
}

