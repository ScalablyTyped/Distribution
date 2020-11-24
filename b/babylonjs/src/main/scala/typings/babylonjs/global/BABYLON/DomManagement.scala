package typings.babylonjs.global.BABYLON

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DomManagement")
@js.native
class DomManagement ()
  extends typings.babylonjs.BABYLON.DomManagement
/* static members */
@JSGlobal("BABYLON.DomManagement")
@js.native
object DomManagement extends js.Object {
  
  /**
    * Extracts text content from a DOM element hierarchy
    * @param element defines the root element
    * @returns a string
    */
  def GetDOMTextContent(element: HTMLElement): String = js.native
  
  /**
    * Check if the document object exists
    * @returns true if the document object exists
    */
  def IsDocumentAvailable(): Boolean = js.native
  
  /**
    * Checks if the navigator object exists
    * @returns true if the navigator object exists
    */
  def IsNavigatorAvailable(): Boolean = js.native
  
  /**
    * Checks if the window object exists
    * @returns true if the window object exists
    */
  def IsWindowObjectExist(): Boolean = js.native
}
