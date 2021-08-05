package typings.blueprintjsTable

import typings.blueprintjsTable.dragTypesMod.IDragHandler
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragEventsMod {
  
  @JSImport("@blueprintjs/table/lib/esm/interactions/dragEvents", "DragEvents")
  @js.native
  class DragEvents () extends StObject {
    
    /* private */ var activationCoordinates: js.Any = js.native
    
    def attach(element: HTMLElement, handler: IDragHandler): this.type = js.native
    
    /* private */ var attachDocumentEventListeners: js.Any = js.native
    
    def detach(): Unit = js.native
    
    /* private */ var detachDocumentEventListeners: js.Any = js.native
    
    /* private */ var doubleClickTimeoutToken: js.Any = js.native
    
    /* private */ var element: js.Any = js.native
    
    /* private */ var handleMouseDown: js.Any = js.native
    
    /* private */ var handleMouseMove: js.Any = js.native
    
    /* private */ var handleMouseUp: js.Any = js.native
    
    /* private */ var handler: js.Any = js.native
    
    /* private */ var initCoordinateData: js.Any = js.native
    
    /* private */ var isActivated: js.Any = js.native
    
    /* private */ var isDragging: js.Any = js.native
    
    /* private */ var isValidDragHandler: js.Any = js.native
    
    /* private */ var lastCoordinates: js.Any = js.native
    
    /* private */ var maybeAlterEventChain: js.Any = js.native
    
    /* private */ var updateCoordinateData: js.Any = js.native
  }
  /* static members */
  object DragEvents {
    
    @JSImport("@blueprintjs/table/lib/esm/interactions/dragEvents", "DragEvents")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/interactions/dragEvents", "DragEvents.DOUBLE_CLICK_TIMEOUT_MSEC")
    @js.native
    def DOUBLE_CLICK_TIMEOUT_MSEC: Double = js.native
    inline def DOUBLE_CLICK_TIMEOUT_MSEC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOUBLE_CLICK_TIMEOUT_MSEC")(x.asInstanceOf[js.Any])
    
    /**
      * Returns true if the event includes a modifier key that often adds the result of the drag
      * event to any existing state. For example, holding CTRL before dragging may select another
      * region in addition to an existing one, while the absence of a modifier key may clear the
      * existing selection first.
      * @param event the mouse event for the drag interaction
      */
    inline def isAdditive(event: MouseEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAdditive")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
