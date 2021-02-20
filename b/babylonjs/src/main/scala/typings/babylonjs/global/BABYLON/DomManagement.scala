package typings.babylonjs.global.BABYLON

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DomManagement")
@js.native
class DomManagement ()
  extends typings.babylonjs.BABYLON.DomManagement
/* static members */
object DomManagement {
  
  /**
    * Extracts text content from a DOM element hierarchy
    * @param element defines the root element
    * @returns a string
    */
  @JSGlobal("BABYLON.DomManagement.GetDOMTextContent")
  @js.native
  def GetDOMTextContent(element: HTMLElement): String = js.native
  
  /**
    * Check if the document object exists
    * @returns true if the document object exists
    */
  @JSGlobal("BABYLON.DomManagement.IsDocumentAvailable")
  @js.native
  def IsDocumentAvailable(): Boolean = js.native
  
  /**
    * Checks if the navigator object exists
    * @returns true if the navigator object exists
    */
  @JSGlobal("BABYLON.DomManagement.IsNavigatorAvailable")
  @js.native
  def IsNavigatorAvailable(): Boolean = js.native
  
  /**
    * Checks if the window object exists
    * @returns true if the window object exists
    */
  @JSGlobal("BABYLON.DomManagement.IsWindowObjectExist")
  @js.native
  def IsWindowObjectExist(): Boolean = js.native
}
