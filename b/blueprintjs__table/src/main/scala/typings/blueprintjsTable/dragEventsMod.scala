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
  open class DragEvents () extends StObject {
    
    /* private */ var activationCoordinates: Any = js.native
    
    def attach(element: HTMLElement, handler: IDragHandler): this.type = js.native
    
    /* private */ var attachDocumentEventListeners: Any = js.native
    
    def detach(): Unit = js.native
    
    /* private */ var detachDocumentEventListeners: Any = js.native
    
    /* private */ var doubleClickTimeoutToken: Any = js.native
    
    /* private */ var element: Any = js.native
    
    /* private */ var handleMouseDown: Any = js.native
    
    /* private */ var handleMouseMove: Any = js.native
    
    /* private */ var handleMouseUp: Any = js.native
    
    /* private */ var handler: Any = js.native
    
    /* private */ var initCoordinateData: Any = js.native
    
    /* private */ var isActivated: Any = js.native
    
    /* private */ var isDragging: Any = js.native
    
    /* private */ var isValidDragHandler: Any = js.native
    
    /* private */ var lastCoordinates: Any = js.native
    
    /* private */ var maybeAlterEventChain: Any = js.native
    
    /* private */ var updateCoordinateData: Any = js.native
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
      *
      * @param event the mouse event for the drag interaction
      */
    inline def isAdditive(event: MouseEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAdditive")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
