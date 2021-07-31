package typings.blueprintjsTable

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragTypesMod {
  
  type IClientCoordinates = js.Tuple2[Double, Double]
  
  trait ICoordinateData extends StObject {
    
    /**
      * The client coordinates where the interaction was activated.
      */
    var activation: IClientCoordinates
    
    /**
      * The client coordinates of the current mouse event.
      */
    var current: IClientCoordinates
    
    /**
      * The difference between current and last client coordinates.
      */
    var delta: IClientCoordinates
    
    /**
      * The client coordinates of the previous mouse event.
      */
    var last: IClientCoordinates
    
    /**
      * The difference between current and activation client coordinates.
      */
    var offset: IClientCoordinates
  }
  object ICoordinateData {
    
    @scala.inline
    def apply(
      activation: IClientCoordinates,
      current: IClientCoordinates,
      delta: IClientCoordinates,
      last: IClientCoordinates,
      offset: IClientCoordinates
    ): ICoordinateData = {
      val __obj = js.Dynamic.literal(activation = activation.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICoordinateData]
    }
    
    @scala.inline
    implicit class ICoordinateDataMutableBuilder[Self <: ICoordinateData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivation(value: IClientCoordinates): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrent(value: IClientCoordinates): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelta(value: IClientCoordinates): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast(value: IClientCoordinates): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: IClientCoordinates): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDragHandler extends StObject {
    
    /**
      * Called when the mouse is pressed down. Drag and click operations may
      * be cancelled at this point by returning false from this method.
      */
    var onActivate: js.UndefOr[js.Function1[/* event */ MouseEvent, Boolean]] = js.undefined
    
    /**
      * Called when the mouse is released iff the mouse was NOT dragged after
      * activation.
      *
      * This will be called asynchronously if `onDoubleClick` is defined. See
      * that callback for more details.
      */
    var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
    
    /**
      * Called iff there are two click events within the timeout
      * `DragEvents.DOUBLE_CLICK_TIMEOUT_MSEC`, which defaults to 500 msec.
      *
      * NOTE: Defining this callback requires that we wait to invoke the
      * `onClick` callback until the timeout has expired and we are certain the
      * interaction was only a single click. If this callback is not defined,
      * the `onClick` callback will be invoked synchronously with the mouseup
      * event.
      */
    var onDoubleClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
    
    /**
      * Called when the mouse is released iff the mouse was dragged after
      * activation.
      */
    var onDragEnd: js.UndefOr[js.Function2[/* event */ MouseEvent, /* coords */ ICoordinateData, Unit]] = js.undefined
    
    /**
      * Called every time the mouse is moved after activation and before the
      * mouse is released. This method is also called on the last even when the
      * mouse is released.
      */
    var onDragMove: js.UndefOr[js.Function2[/* event */ MouseEvent, /* coords */ ICoordinateData, Unit]] = js.undefined
    
    /**
      * This prevents mouse events from performing their default operation such
      * as text selection.
      * @default true
      */
    var preventDefault: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This prevents the event from propagating up to parent elements.
      * @default false
      */
    var stopPropagation: js.UndefOr[Boolean] = js.undefined
  }
  object IDragHandler {
    
    @scala.inline
    def apply(): IDragHandler = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDragHandler]
    }
    
    @scala.inline
    implicit class IDragHandlerMutableBuilder[Self <: IDragHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnActivate(value: /* event */ MouseEvent => Boolean): Self = StObject.set(x, "onActivate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnActivateUndefined: Self = StObject.set(x, "onActivate", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* event */ MouseEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(value: /* event */ MouseEvent => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnDragEnd(value: (/* event */ MouseEvent, /* coords */ ICoordinateData) => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragMove(value: (/* event */ MouseEvent, /* coords */ ICoordinateData) => Unit): Self = StObject.set(x, "onDragMove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDragMoveUndefined: Self = StObject.set(x, "onDragMove", js.undefined)
      
      @scala.inline
      def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      @scala.inline
      def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
    }
  }
}
