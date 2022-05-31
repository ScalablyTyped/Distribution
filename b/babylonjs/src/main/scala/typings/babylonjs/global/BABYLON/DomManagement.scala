package typings.babylonjs.global.BABYLON

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DomManagement")
@js.native
class DomManagement ()
  extends StObject
     with typings.babylonjs.BABYLON.DomManagement
/* static members */
object DomManagement {
  
  @JSGlobal("BABYLON.DomManagement")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Extracts text content from a DOM element hierarchy
    * @param element defines the root element
    * @returns a string
    */
  inline def GetDOMTextContent(element: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDOMTextContent")(element.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Check if the document object exists
    * @returns true if the document object exists
    */
  inline def IsDocumentAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDocumentAvailable")().asInstanceOf[Boolean]
  
  /**
    * Checks if the navigator object exists
    * @returns true if the navigator object exists
    */
  inline def IsNavigatorAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNavigatorAvailable")().asInstanceOf[Boolean]
  
  /**
    * Checks if the window object exists
    * @returns true if the window object exists
    */
  inline def IsWindowObjectExist(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsWindowObjectExist")().asInstanceOf[Boolean]
}
