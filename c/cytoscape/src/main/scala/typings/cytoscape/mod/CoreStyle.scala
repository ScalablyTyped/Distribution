package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoreStyle extends js.Object {
  /**
    * Get the current style object.
    */
  def style(): ElementStylesheetStyle | ElementStylesheetCSS = js.native
  def style(sheet: String): Stylesheet = js.native
  def style(sheet: js.Array[Stylesheet]): Stylesheet = js.native
  /**
    * Assign a new stylesheet to replace the existing one.
    */
  def style(sheet: Stylesheet): Stylesheet = js.native
}

