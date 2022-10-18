package typings.babylonjs

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscDomManagementMod {
  
  @JSImport("babylonjs/Misc/domManagement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object DomManagement {
    
    @JSImport("babylonjs/Misc/domManagement", "DomManagement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Extracts text content from a DOM element hierarchy
      * @param element defines the root element
      * @returns a string
      */
    @JSImport("babylonjs/Misc/domManagement", "DomManagement.GetDOMTextContent")
    @js.native
    def GetDOMTextContent: js.Function1[/* element */ HTMLElement, String] = js.native
    /**
      * Extracts text content from a DOM element hierarchy
      * @param element defines the root element
      * @returns a string
      */
    inline def GetDOMTextContent(element: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDOMTextContent")(element.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def GetDOMTextContent_=(x: js.Function1[/* element */ HTMLElement, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GetDOMTextContent")(x.asInstanceOf[js.Any])
    
    /**
      * Check if the document object exists
      * @returns true if the document object exists
      */
    inline def IsDocumentAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDocumentAvailable")().asInstanceOf[Boolean]
    /**
      * Check if the document object exists
      * @returns true if the document object exists
      */
    @JSImport("babylonjs/Misc/domManagement", "DomManagement.IsDocumentAvailable")
    @js.native
    def IsDocumentAvailable_FDomManagement: js.Function0[Boolean] = js.native
    
    inline def IsDocumentAvailable_FDomManagement_=(x: js.Function0[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IsDocumentAvailable")(x.asInstanceOf[js.Any])
    
    /**
      * Checks if the navigator object exists
      * @returns true if the navigator object exists
      */
    inline def IsNavigatorAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNavigatorAvailable")().asInstanceOf[Boolean]
    /**
      * Checks if the navigator object exists
      * @returns true if the navigator object exists
      */
    @JSImport("babylonjs/Misc/domManagement", "DomManagement.IsNavigatorAvailable")
    @js.native
    def IsNavigatorAvailable_FDomManagement: js.Function0[Boolean] = js.native
    
    inline def IsNavigatorAvailable_FDomManagement_=(x: js.Function0[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IsNavigatorAvailable")(x.asInstanceOf[js.Any])
    
    /**
      * Checks if the window object exists
      * @returns true if the window object exists
      */
    inline def IsWindowObjectExist(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsWindowObjectExist")().asInstanceOf[Boolean]
    /**
      * Checks if the window object exists
      * @returns true if the window object exists
      */
    @JSImport("babylonjs/Misc/domManagement", "DomManagement.IsWindowObjectExist")
    @js.native
    def IsWindowObjectExist_FDomManagement: js.Function0[Boolean] = js.native
    
    inline def IsWindowObjectExist_FDomManagement_=(x: js.Function0[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IsWindowObjectExist")(x.asInstanceOf[js.Any])
  }
  
  inline def GetDOMTextContent(element: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDOMTextContent")(element.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def IsDocumentAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDocumentAvailable")().asInstanceOf[Boolean]
  
  inline def IsNavigatorAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNavigatorAvailable")().asInstanceOf[Boolean]
  
  inline def IsWindowObjectExist(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsWindowObjectExist")().asInstanceOf[Boolean]
}
