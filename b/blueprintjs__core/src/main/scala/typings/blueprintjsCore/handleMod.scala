package typings.blueprintjsCore

import typings.blueprintjsCore.anon.IsMoving
import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.handlePropsMod.IHandleProps
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handleMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/slider/handle", "Handle")
  @js.native
  class Handle protected ()
    extends AbstractPureComponent2[IInternalHandleProps, IHandleState, js.Object] {
    def this(props: IInternalHandleProps) = this()
    def this(props: IInternalHandleProps, context: js.Any) = this()
    
    def beginHandleMovement(event: MouseEvent[HTMLElement, NativeMouseEvent]): Unit = js.native
    def beginHandleMovement(event: typings.std.MouseEvent): Unit = js.native
    
    def beginHandleTouchMovement(event: TouchEvent[HTMLElement]): Unit = js.native
    def beginHandleTouchMovement(event: typings.std.TouchEvent): Unit = js.native
    
    /** Clamp value and invoke callback if it differs from current value */
    var changeValue: js.Any = js.native
    
    /** Clamp value between min and max props */
    var clamp: js.Any = js.native
    
    /** Convert client pixel to value between min and max. */
    def clientToValue(clientPixel: Double): Double = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MHandle(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MHandle(): Unit = js.native
    
    var endHandleMovement: js.Any = js.native
    
    var endHandleTouchMovement: js.Any = js.native
    
    var getHandleElementCenterPixel: js.Any = js.native
    
    var getHandleMidpointAndOffset: js.Any = js.native
    
    var getStyleProperties: js.Any = js.native
    
    var handleElement: js.Any = js.native
    
    var handleHandleMovement: js.Any = js.native
    
    var handleHandleTouchMovement: js.Any = js.native
    
    var handleKeyDown: js.Any = js.native
    
    var handleKeyUp: js.Any = js.native
    
    var handleMoveEndedAt: js.Any = js.native
    
    var handleMovedTo: js.Any = js.native
    
    def mouseEventClientOffset(event: MouseEvent[HTMLElement, NativeMouseEvent]): Double = js.native
    def mouseEventClientOffset(event: typings.std.MouseEvent): Double = js.native
    
    var refHandlers: js.Any = js.native
    
    var removeDocumentEventListeners: js.Any = js.native
    
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
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IHandleState extends StObject {
    
    /** whether slider handle is currently being dragged */
    var isMoving: js.UndefOr[Boolean] = js.native
  }
  object IHandleState {
    
    @scala.inline
    def apply(): IHandleState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHandleState]
    }
    
    @scala.inline
    implicit class IHandleStateMutableBuilder[Self <: IHandleState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsMoving(value: Boolean): Self = StObject.set(x, "isMoving", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMovingUndefined: Self = StObject.set(x, "isMoving", js.undefined)
    }
  }
  
  @js.native
  trait IInternalHandleProps extends IHandleProps {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var label: js.UndefOr[Element | String] = js.native
    
    var max: Double = js.native
    
    var min: Double = js.native
    
    var stepSize: Double = js.native
    
    var tickSize: Double = js.native
    
    var tickSizeRatio: Double = js.native
    
    var vertical: Boolean = js.native
  }
  object IInternalHandleProps {
    
    @scala.inline
    def apply(
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
    implicit class IInternalHandlePropsMutableBuilder[Self <: IInternalHandleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setLabel(value: Element | String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepSize(value: Double): Self = StObject.set(x, "stepSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickSize(value: Double): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickSizeRatio(value: Double): Self = StObject.set(x, "tickSizeRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
}
