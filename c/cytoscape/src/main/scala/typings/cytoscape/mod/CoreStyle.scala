package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoreStyle extends StObject {
  
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
