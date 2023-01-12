package typings.blueprintjsCore

import typings.blueprintjsCore.anon.IsMoving
import typings.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typings.blueprintjsCore.libEsmComponentsSliderHandlePropsMod.IHandleProps
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsSliderHandleMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/slider/handle", "Handle")
  @js.native
  open class Handle protected ()
    extends AbstractPureComponent2[IInternalHandleProps, IHandleState, js.Object] {
    def this(props: IInternalHandleProps) = this()
    def this(props: IInternalHandleProps, context: Any) = this()
    
    def beginHandleMovement(event: MouseEvent[HTMLElement, NativeMouseEvent]): Unit = js.native
    def beginHandleMovement(event: typings.std.MouseEvent): Unit = js.native
    
    def beginHandleTouchMovement(event: TouchEvent[HTMLElement]): Unit = js.native
    def beginHandleTouchMovement(event: typings.std.TouchEvent): Unit = js.native
    
    /** Clamp value and invoke callback if it differs from current value */
    /* private */ var changeValue: Any = js.native
    
    /** Clamp value between min and max props */
    /* private */ var clamp: Any = js.native
    
    /** Convert client pixel to value between min and max. */
    def clientToValue(clientPixel: Double): Double = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MHandle(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MHandle(): Unit = js.native
    
    /* private */ var endHandleMovement: Any = js.native
    
    /* private */ var endHandleTouchMovement: Any = js.native
    
    /* private */ var getHandleElementCenterPixel: Any = js.native
    
    /* private */ var getHandleMidpointAndOffset: Any = js.native
    
    /* private */ var getStyleProperties: Any = js.native
    
    /* private */ var handleElement: Any = js.native
    
    /* private */ var handleHandleMovement: Any = js.native
    
    /* private */ var handleHandleTouchMovement: Any = js.native
    
    /* private */ var handleKeyDown: Any = js.native
    
    /* private */ var handleKeyUp: Any = js.native
    
    /* private */ var handleMoveEndedAt: Any = js.native
    
    /* private */ var handleMovedTo: Any = js.native
    
    def mouseEventClientOffset(event: MouseEvent[HTMLElement, NativeMouseEvent]): Double = js.native
    def mouseEventClientOffset(event: typings.std.MouseEvent): Double = js.native
    
    /* private */ var refHandlers: Any = js.native
    
    /* private */ var removeDocumentEventListeners: Any = js.native
    
    @JSName("state")
    var state_Handle: IsMoving = js.native
    
    def touchEventClientOffset(event: TouchEvent[HTMLElement]): Double = js.native
    def touchEventClientOffset(event: typings.std.TouchEvent): Double = js.native
  }
  /* static members */
  object Handle {
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/handle", "Handle")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/handle", "Handle.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait IHandleState extends StObject {
    
    /** whether slider handle is currently being dragged */
    var isMoving: js.UndefOr[Boolean] = js.undefined
  }
  object IHandleState {
    
    inline def apply(): IHandleState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHandleState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IHandleState] (val x: Self) extends AnyVal {
      
      inline def setIsMoving(value: Boolean): Self = StObject.set(x, "isMoving", value.asInstanceOf[js.Any])
      
      inline def setIsMovingUndefined: Self = StObject.set(x, "isMoving", js.undefined)
    }
  }
  
  trait IInternalHandleProps
    extends StObject
       with IHandleProps {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[Element | String] = js.undefined
    
    var max: Double
    
    var min: Double
    
    var stepSize: Double
    
    var tickSize: Double
    
    var tickSizeRatio: Double
    
    var vertical: Boolean
  }
  object IInternalHandleProps {
    
    inline def apply(
      max: Double,
      min: Double,
      stepSize: Double,
      tickSize: Double,
      tickSizeRatio: Double,
      value: Double,
      vertical: Boolean
    ): IInternalHandleProps = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], stepSize = stepSize.asInstanceOf[js.Any], tickSize = tickSize.asInstanceOf[js.Any], tickSizeRatio = tickSizeRatio.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[IInternalHandleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IInternalHandleProps] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: Element | String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setStepSize(value: Double): Self = StObject.set(x, "stepSize", value.asInstanceOf[js.Any])
      
      inline def setTickSize(value: Double): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
      
      inline def setTickSizeRatio(value: Double): Self = StObject.set(x, "tickSizeRatio", value.asInstanceOf[js.Any])
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
}
