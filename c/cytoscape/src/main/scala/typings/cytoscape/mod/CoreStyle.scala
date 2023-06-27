package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoreStyle extends StObject {
  
  /**
    * Assign a new stylesheet to replace the existing one (if provided)
    * and return the style.
    */
  def style(): Style = js.native
  def style(sheet: String): Style = js.native
  def style(sheet: js.Array[Stylesheet]): Style = js.native
  def style(sheet: Stylesheet): Style = js.native
}
