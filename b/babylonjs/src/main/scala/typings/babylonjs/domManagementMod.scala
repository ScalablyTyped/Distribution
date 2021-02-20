package typings.babylonjs

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domManagementMod {
  
  @JSImport("babylonjs/Misc/domManagement", "DomManagement")
  @js.native
  class DomManagement () extends StObject
  /* static members */
  object DomManagement {
    
    /**
      * Extracts text content from a DOM element hierarchy
      * @param element defines the root element
      * @returns a string
      */
    @JSImport("babylonjs/Misc/domManagement", "DomManagement.GetDOMTextContent")
    @js.native
    def GetDOMTextContent(element: HTMLElement): String = js.native
    
    /**
      * Check if the document object exists
      * @returns true if the document object exists
      */
    @JSImport("babylonjs/Misc/domManagement", "DomManagement.IsDocumentAvailable")
    @js.native
    def IsDocumentAvailable(): Boolean = js.native
    
    /**
      * Checks if the navigator object exists
      * @returns true if the navigator object exists
      */
    @JSImport("babylonjs/Misc/domManagement", "DomManagement.IsNavigatorAvailable")
    @js.native
    def IsNavigatorAvailable(): Boolean = js.native
    
    /**
      * Checks if the window object exists
      * @returns true if the window object exists
      */
    @JSImport("babylonjs/Misc/domManagement", "DomManagement.IsWindowObjectExist")
    @js.native
    def IsWindowObjectExist(): Boolean = js.native
  }
}
