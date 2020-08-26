package typings.babelPluginReactHtmlAttrs.mod

import typings.babelPluginReactHtmlAttrs.anon.Html
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMAttributes[T] extends js.Object {
  var children: js.UndefOr[ReactNode] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  // Media Events
  var onAbort: js.UndefOr[ReactEventHandler[T]] = js.native
  var onAbortCapture: js.UndefOr[ReactEventHandler[T]] = js.native
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[T]] = js.native
  var onAnimationEndCapture: js.UndefOr[AnimationEventHandler[T]] = js.native
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[T]] = js.native
  var onAnimationIterationCapture: js.UndefOr[AnimationEventHandler[T]] = js.native
  // Animation Events
  var onAnimationStart: js.UndefOr[AnimationEventHandler[T]] = js.native
  var onAnimationStartCapture: js.UndefOr[AnimationEventHandler[T]] = js.native
  // MouseEvents
  var onAuxClick: js.UndefOr[MouseEventHandler[T]] = js.native
  var onAuxClickCapture: js.UndefOr[MouseEventHandler[T]] = js.native
  var onBeforeInput: js.UndefOr[FormEventHandler[T]] = js.native
  var onBeforeInputCapture: js.UndefOr[FormEventHandler[T]] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[T]] = js.native
  var onBlurCapture: js.UndefOr[FocusEventHandler[T]] = js.native
  var onCanPlay: js.UndefOr[ReactEventHandler[T]] = js.native
  var onCanPlayCapture: js.UndefOr[ReactEventHandler[T]] = js.native
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[T]] = js.native
  var onCanPlayThroughCapture: js.UndefOr[ReactEventHandler[T]] = js.native
  // Form Events
  var onChange: js.UndefOr[FormEventHandler[T]] = js.native
  var onChangeCapture: js.UndefOr[FormEventHandler[T]] = js.native
  var onClick: js.UndefOr[MouseEventHandler[T]] = js.native
  var onClickCapture: js.UndefOr[MouseEventHandler[T]] = js.native
  // Composition Events
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[T]] = js.native
  var onCompositionEndCapture: js.UndefOr[CompositionEventHandler[T]] = js.native
  var onCompositionStart: js.UndefOr[CompositionEventHandler[T]] = js.native
  var onCompositionStartCapture: js.UndefOr[CompositionEventHandler[T]] = js.native
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[T]] = js.native
  var onCompositionUpdateCapture: js.UndefOr[CompositionEventHandler[T]] = js.native
  var onContextMenu: js.UndefOr[MouseEventHandler[T]] = js.native
  var onContextMenuCapture: js.UndefOr[MouseEventHandler[T]] = js.native
  // Clipboard Events
  var onCopy: js.UndefOr[ClipboardEventHandler[T]] = js.native
  var onCopyCapture: js.UndefOr[ClipboardEventHandler[T]] = js.native
  var onCut: js.UndefOr[ClipboardEventHandler[T]] = js.native
  var onCutCapture: js.UndefOr[ClipboardEventHandler[T]] = js.native
  var onDoubleClick: js.UndefOr[MouseEventHandler[T]] = js.native
  var onDoubleClickCapture: js.UndefOr[MouseEventHandler[T]] = js.native
  var onDrag: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragCapture: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragEnd: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragEndCapture: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragEnter: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragEnterCapture: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragExit: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragExitCapture: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragLeave: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragLeaveCapture: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragOver: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragOverCapture: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragStart: js.UndefOr[DragEventHandler[T]] = js.native
  var onDragStartCapture: js.UndefOr[DragEventHandler[T]] = js.native
  var onDrop: js.UndefOr[DragEventHandler[T]] = js.native
  var onDropCapture: js.UndefOr[DragEventHandler[T]] = js.native
  var onDurationChange: js.UndefOr[ReactEventHandler[T]] = js.native
  var onDurationChangeCapture: js.UndefOr[ReactEventHandler[T]] = js.native
  var onEmptied: js.UndefOr[ReactEventHandler[T]] = js.native
  var onEmptiedCapture: js.UndefOr[ReactEventHandler[T]] = js.native
  var onEncrypted: js.UndefOr[ReactEventHandler[T]] = js.native
  var onEncryptedCapture: js.UndefOr[ReactEventHandler[T]] = js.native
  var onEnded: js.UndefOr[ReactEventHandler[T]] = js.native
  var onEndedCapture: js.UndefOr[ReactEventHandler[T]] = js.native
  var onError: js.UndefOr[ReactEventHandler[T]] = js.native
   // also a Media Event
  var onErrorCapture: js.UndefOr[ReactEventHandler[T]] = js.native
  // Focus Events
  var onFocus: js.UndefOr[FocusEventHandler[T]] = js.native
  var onFocusCapture: js.UndefOr[FocusEventHandler[T]] = js.native
  var onGotPointerCapture: js.UndefOr[PointerEventHandler[T]] = js.native
  var onGotPointerCaptureCapture: js.UndefOr[PointerEventHandler[T]] = js.native
  var onInput: js.UndefOr[FormEventHandler[T]] = js.native
  var onInputCapture: js.UndefOr[FormEventHandler[T]] = js.native
  var onInvalid: js.UndefOr[FormEventHandler[T]] = js.native
  var onInvalidCapture: js.UndefOr[FormEventHandler[T]] = js.native
   // also a Media Event
  // Keyboard Events
  var onKeyDown: js.UndefOr[KeyboardEventHandler[T]] = js.native
  var onKeyDownCapture: js.UndefOr[KeyboardEventHandler[T]] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[T]] = js.native
  var onKeyPressCapture: js.UndefOr[KeyboardEventHandler[T]] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[T]] = js.native
  var onKeyUpCapture: js.UndefOr[KeyboardEventHandler[T]] = js.native
  // Image Events
  var onLoad: js.UndefOr[ReactEventHandler[T]] = js.native
  var onLoadCapture: js.UndefOr[ReactEventHandler[T]] = js.native
  var onLoadStart: js.UndefOr[ReactEventHandler[T]] = js.native
  var onLoadStartCapture: js.UndefOr[ReactEventHandler[T]] = js.native
  var onLoadedData: js.UndefOr[ReactEventHandler[T]] = js.native
  var onLoadedDataCapture: js.UndefOr[ReactEventHandler[T]] = js.native
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[T]] = js.native
  var onLoadedMetadataCapture: js.UndefOr[ReactEventHandler[T]] = js.native
  var onLostPointerCapture: js.UndefOr[PointerEventHandler[T]] = js.native
  var onLostPointerCaptureCapture: js.UndefOr[PointerEventHandler[T]] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseDownCapture: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseMove: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseMoveCapture: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseOut: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseOutCapture: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseOver: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseOverCapture: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[T]] = js.native
  var onMouseUpCapture: js.UndefOr[MouseEventHandler[T]] = js.native
  var onPaste: js.UndefOr[ClipboardEventHandler[T]] = js.native
  var onPasteCapture: js.UndefOr[ClipboardEventHandler[T]] = js.native
  var onPause: js.UndefOr[ReactEventHandler[T]] = js.native
  var onPauseCapture: js.UndefOr[ReactEventHandler[T]] = js.native
  var onPlay: js.UndefOr[ReactEventHandler[T]] = js.native
  var onPlayCapture: js.UndefOr[ReactEventHandler[T]] = js.native
  var onPlaying: js.UndefOr[ReactEventHandler[T]] = js.native
  var onPlayingCapture: js.UndefOr[ReactEventHandler[T]] = js.native
  var onPointerCancel: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerCancelCapture: js.UndefOr[PointerEventHandler[T]] = js.native
  // Pointer Events
  var onPointerDown: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerDownCapture: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerEnter: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerEnterCapture: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerLeave: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerLeaveCapture: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerMove: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerMoveCapture: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerOut: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerOutCapture: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerOver: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerOverCapture: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerUp: js.UndefOr[PointerEventHandler[T]] = js.native
  var onPointerUpCapture: js.UndefOr[PointerEventHandler[T]] = js.native
  var onProgress: js.UndefOr[ReactEventHandler[T]] = js.native
  var onProgressCapture: js.UndefOr[ReactEventHandler[T]] = js.native
  var onRateChange: js.UndefOr[ReactEventHandler[T]] = js.native
  var onRateChangeCapture: js.UndefOr[ReactEventHandler[T]] = js.native
  var onReset: js.UndefOr[FormEventHandler[T]] = js.native
  var onResetCapture: js.UndefOr[FormEventHandler[T]] = js.native
  // UI Events
  var onScroll: js.UndefOr[UIEventHandler[T]] = js.native
  var onScrollCapture: js.UndefOr[UIEventHandler[T]] = js.native
  var onSeeked: js.UndefOr[ReactEventHandler[T]] = js.native
  var onSeekedCapture: js.UndefOr[ReactEventHandler[T]] = js.native
  var onSeeking: js.UndefOr[ReactEventHandler[T]] = js.native
  var onSeekingCapture: js.UndefOr[ReactEventHandler[T]] = js.native
  // Selection Events
  var onSelect: js.UndefOr[ReactEventHandler[T]] = js.native
  var onSelectCapture: js.UndefOr[ReactEventHandler[T]] = js.native
  var onStalled: js.UndefOr[ReactEventHandler[T]] = js.native
  var onStalledCapture: js.UndefOr[ReactEventHandler[T]] = js.native
  var onSubmit: js.UndefOr[FormEventHandler[T]] = js.native
  var onSubmitCapture: js.UndefOr[FormEventHandler[T]] = js.native
  var onSuspend: js.UndefOr[ReactEventHandler[T]] = js.native
  var onSuspendCapture: js.UndefOr[ReactEventHandler[T]] = js.native
  var onTimeUpdate: js.UndefOr[ReactEventHandler[T]] = js.native
  var onTimeUpdateCapture: js.UndefOr[ReactEventHandler[T]] = js.native
  // Touch Events
  var onTouchCancel: js.UndefOr[TouchEventHandler[T]] = js.native
  var onTouchCancelCapture: js.UndefOr[TouchEventHandler[T]] = js.native
  var onTouchEnd: js.UndefOr[TouchEventHandler[T]] = js.native
  var onTouchEndCapture: js.UndefOr[TouchEventHandler[T]] = js.native
  var onTouchMove: js.UndefOr[TouchEventHandler[T]] = js.native
  var onTouchMoveCapture: js.UndefOr[TouchEventHandler[T]] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[T]] = js.native
  var onTouchStartCapture: js.UndefOr[TouchEventHandler[T]] = js.native
  // Transition Events
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[T]] = js.native
  var onTransitionEndCapture: js.UndefOr[TransitionEventHandler[T]] = js.native
  var onVolumeChange: js.UndefOr[ReactEventHandler[T]] = js.native
  var onVolumeChangeCapture: js.UndefOr[ReactEventHandler[T]] = js.native
  var onWaiting: js.UndefOr[ReactEventHandler[T]] = js.native
  var onWaitingCapture: js.UndefOr[ReactEventHandler[T]] = js.native
  // Wheel Events
  var onWheel: js.UndefOr[WheelEventHandler[T]] = js.native
  var onWheelCapture: js.UndefOr[WheelEventHandler[T]] = js.native
}

object DOMAttributes {
  @scala.inline
  def apply[T](): DOMAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMAttributes[T]]
  }
  @scala.inline
  implicit class DOMAttributesOps[Self <: DOMAttributes[_], T] (val x: Self with DOMAttributes[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setChildrenNull: Self = this.set("children", null)
    @scala.inline
    def setDangerouslySetInnerHTML(value: Html): Self = this.set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDangerouslySetInnerHTML: Self = this.set("dangerouslySetInnerHTML", js.undefined)
    @scala.inline
    def setOnAbort(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onAbort", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAbort: Self = this.set("onAbort", js.undefined)
    @scala.inline
    def setOnAbortCapture(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onAbortCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAbortCapture: Self = this.set("onAbortCapture", js.undefined)
    @scala.inline
    def setOnAnimationEnd(value: AnimationEvent[T] => Unit): Self = this.set("onAnimationEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAnimationEnd: Self = this.set("onAnimationEnd", js.undefined)
    @scala.inline
    def setOnAnimationEndCapture(value: AnimationEvent[T] => Unit): Self = this.set("onAnimationEndCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAnimationEndCapture: Self = this.set("onAnimationEndCapture", js.undefined)
    @scala.inline
    def setOnAnimationIteration(value: AnimationEvent[T] => Unit): Self = this.set("onAnimationIteration", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAnimationIteration: Self = this.set("onAnimationIteration", js.undefined)
    @scala.inline
    def setOnAnimationIterationCapture(value: AnimationEvent[T] => Unit): Self = this.set("onAnimationIterationCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAnimationIterationCapture: Self = this.set("onAnimationIterationCapture", js.undefined)
    @scala.inline
    def setOnAnimationStart(value: AnimationEvent[T] => Unit): Self = this.set("onAnimationStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAnimationStart: Self = this.set("onAnimationStart", js.undefined)
    @scala.inline
    def setOnAnimationStartCapture(value: AnimationEvent[T] => Unit): Self = this.set("onAnimationStartCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAnimationStartCapture: Self = this.set("onAnimationStartCapture", js.undefined)
    @scala.inline
    def setOnAuxClick(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onAuxClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAuxClick: Self = this.set("onAuxClick", js.undefined)
    @scala.inline
    def setOnAuxClickCapture(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onAuxClickCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAuxClickCapture: Self = this.set("onAuxClickCapture", js.undefined)
    @scala.inline
    def setOnBeforeInput(value: FormEvent[T] => Unit): Self = this.set("onBeforeInput", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeInput: Self = this.set("onBeforeInput", js.undefined)
    @scala.inline
    def setOnBeforeInputCapture(value: FormEvent[T] => Unit): Self = this.set("onBeforeInputCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeInputCapture: Self = this.set("onBeforeInputCapture", js.undefined)
    @scala.inline
    def setOnBlur(value: FocusEvent[T] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnBlurCapture(value: FocusEvent[T] => Unit): Self = this.set("onBlurCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlurCapture: Self = this.set("onBlurCapture", js.undefined)
    @scala.inline
    def setOnCanPlay(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onCanPlay", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCanPlay: Self = this.set("onCanPlay", js.undefined)
    @scala.inline
    def setOnCanPlayCapture(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onCanPlayCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCanPlayCapture: Self = this.set("onCanPlayCapture", js.undefined)
    @scala.inline
    def setOnCanPlayThrough(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onCanPlayThrough", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCanPlayThrough: Self = this.set("onCanPlayThrough", js.undefined)
    @scala.inline
    def setOnCanPlayThroughCapture(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onCanPlayThroughCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCanPlayThroughCapture: Self = this.set("onCanPlayThroughCapture", js.undefined)
    @scala.inline
    def setOnChange(value: FormEvent[T] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnChangeCapture(value: FormEvent[T] => Unit): Self = this.set("onChangeCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChangeCapture: Self = this.set("onChangeCapture", js.undefined)
    @scala.inline
    def setOnClick(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnClickCapture(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onClickCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClickCapture: Self = this.set("onClickCapture", js.undefined)
    @scala.inline
    def setOnCompositionEnd(value: CompositionEvent[T] => Unit): Self = this.set("onCompositionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCompositionEnd: Self = this.set("onCompositionEnd", js.undefined)
    @scala.inline
    def setOnCompositionEndCapture(value: CompositionEvent[T] => Unit): Self = this.set("onCompositionEndCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCompositionEndCapture: Self = this.set("onCompositionEndCapture", js.undefined)
    @scala.inline
    def setOnCompositionStart(value: CompositionEvent[T] => Unit): Self = this.set("onCompositionStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCompositionStart: Self = this.set("onCompositionStart", js.undefined)
    @scala.inline
    def setOnCompositionStartCapture(value: CompositionEvent[T] => Unit): Self = this.set("onCompositionStartCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCompositionStartCapture: Self = this.set("onCompositionStartCapture", js.undefined)
    @scala.inline
    def setOnCompositionUpdate(value: CompositionEvent[T] => Unit): Self = this.set("onCompositionUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCompositionUpdate: Self = this.set("onCompositionUpdate", js.undefined)
    @scala.inline
    def setOnCompositionUpdateCapture(value: CompositionEvent[T] => Unit): Self = this.set("onCompositionUpdateCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCompositionUpdateCapture: Self = this.set("onCompositionUpdateCapture", js.undefined)
    @scala.inline
    def setOnContextMenu(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onContextMenu", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    @scala.inline
    def setOnContextMenuCapture(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onContextMenuCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContextMenuCapture: Self = this.set("onContextMenuCapture", js.undefined)
    @scala.inline
    def setOnCopy(value: ClipboardEvent[T] => Unit): Self = this.set("onCopy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCopy: Self = this.set("onCopy", js.undefined)
    @scala.inline
    def setOnCopyCapture(value: ClipboardEvent[T] => Unit): Self = this.set("onCopyCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCopyCapture: Self = this.set("onCopyCapture", js.undefined)
    @scala.inline
    def setOnCut(value: ClipboardEvent[T] => Unit): Self = this.set("onCut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCut: Self = this.set("onCut", js.undefined)
    @scala.inline
    def setOnCutCapture(value: ClipboardEvent[T] => Unit): Self = this.set("onCutCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCutCapture: Self = this.set("onCutCapture", js.undefined)
    @scala.inline
    def setOnDoubleClick(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onDoubleClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDoubleClick: Self = this.set("onDoubleClick", js.undefined)
    @scala.inline
    def setOnDoubleClickCapture(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onDoubleClickCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDoubleClickCapture: Self = this.set("onDoubleClickCapture", js.undefined)
    @scala.inline
    def setOnDrag(value: DragEvent[T] => Unit): Self = this.set("onDrag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    @scala.inline
    def setOnDragCapture(value: DragEvent[T] => Unit): Self = this.set("onDragCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragCapture: Self = this.set("onDragCapture", js.undefined)
    @scala.inline
    def setOnDragEnd(value: DragEvent[T] => Unit): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    @scala.inline
    def setOnDragEndCapture(value: DragEvent[T] => Unit): Self = this.set("onDragEndCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEndCapture: Self = this.set("onDragEndCapture", js.undefined)
    @scala.inline
    def setOnDragEnter(value: DragEvent[T] => Unit): Self = this.set("onDragEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", js.undefined)
    @scala.inline
    def setOnDragEnterCapture(value: DragEvent[T] => Unit): Self = this.set("onDragEnterCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEnterCapture: Self = this.set("onDragEnterCapture", js.undefined)
    @scala.inline
    def setOnDragExit(value: DragEvent[T] => Unit): Self = this.set("onDragExit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragExit: Self = this.set("onDragExit", js.undefined)
    @scala.inline
    def setOnDragExitCapture(value: DragEvent[T] => Unit): Self = this.set("onDragExitCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragExitCapture: Self = this.set("onDragExitCapture", js.undefined)
    @scala.inline
    def setOnDragLeave(value: DragEvent[T] => Unit): Self = this.set("onDragLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragLeave: Self = this.set("onDragLeave", js.undefined)
    @scala.inline
    def setOnDragLeaveCapture(value: DragEvent[T] => Unit): Self = this.set("onDragLeaveCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragLeaveCapture: Self = this.set("onDragLeaveCapture", js.undefined)
    @scala.inline
    def setOnDragOver(value: DragEvent[T] => Unit): Self = this.set("onDragOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", js.undefined)
    @scala.inline
    def setOnDragOverCapture(value: DragEvent[T] => Unit): Self = this.set("onDragOverCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragOverCapture: Self = this.set("onDragOverCapture", js.undefined)
    @scala.inline
    def setOnDragStart(value: DragEvent[T] => Unit): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    @scala.inline
    def setOnDragStartCapture(value: DragEvent[T] => Unit): Self = this.set("onDragStartCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragStartCapture: Self = this.set("onDragStartCapture", js.undefined)
    @scala.inline
    def setOnDrop(value: DragEvent[T] => Unit): Self = this.set("onDrop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    @scala.inline
    def setOnDropCapture(value: DragEvent[T] => Unit): Self = this.set("onDropCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDropCapture: Self = this.set("onDropCapture", js.undefined)
    @scala.inline
    def setOnDurationChange(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onDurationChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDurationChange: Self = this.set("onDurationChange", js.undefined)
    @scala.inline
    def setOnDurationChangeCapture(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onDurationChangeCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDurationChangeCapture: Self = this.set("onDurationChangeCapture", js.undefined)
    @scala.inline
    def setOnEmptied(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onEmptied", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEmptied: Self = this.set("onEmptied", js.undefined)
    @scala.inline
    def setOnEmptiedCapture(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onEmptiedCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEmptiedCapture: Self = this.set("onEmptiedCapture", js.undefined)
    @scala.inline
    def setOnEncrypted(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onEncrypted", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEncrypted: Self = this.set("onEncrypted", js.undefined)
    @scala.inline
    def setOnEncryptedCapture(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onEncryptedCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEncryptedCapture: Self = this.set("onEncryptedCapture", js.undefined)
    @scala.inline
    def setOnEnded(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onEnded", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEnded: Self = this.set("onEnded", js.undefined)
    @scala.inline
    def setOnEndedCapture(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onEndedCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEndedCapture: Self = this.set("onEndedCapture", js.undefined)
    @scala.inline
    def setOnError(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnErrorCapture(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onErrorCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnErrorCapture: Self = this.set("onErrorCapture", js.undefined)
    @scala.inline
    def setOnFocus(value: FocusEvent[T] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnFocusCapture(value: FocusEvent[T] => Unit): Self = this.set("onFocusCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocusCapture: Self = this.set("onFocusCapture", js.undefined)
    @scala.inline
    def setOnGotPointerCapture(value: PointerEvent[T] => Unit): Self = this.set("onGotPointerCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnGotPointerCapture: Self = this.set("onGotPointerCapture", js.undefined)
    @scala.inline
    def setOnGotPointerCaptureCapture(value: PointerEvent[T] => Unit): Self = this.set("onGotPointerCaptureCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnGotPointerCaptureCapture: Self = this.set("onGotPointerCaptureCapture", js.undefined)
    @scala.inline
    def setOnInput(value: FormEvent[T] => Unit): Self = this.set("onInput", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInput: Self = this.set("onInput", js.undefined)
    @scala.inline
    def setOnInputCapture(value: FormEvent[T] => Unit): Self = this.set("onInputCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInputCapture: Self = this.set("onInputCapture", js.undefined)
    @scala.inline
    def setOnInvalid(value: FormEvent[T] => Unit): Self = this.set("onInvalid", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInvalid: Self = this.set("onInvalid", js.undefined)
    @scala.inline
    def setOnInvalidCapture(value: FormEvent[T] => Unit): Self = this.set("onInvalidCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInvalidCapture: Self = this.set("onInvalidCapture", js.undefined)
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[T] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setOnKeyDownCapture(value: KeyboardEvent[T] => Unit): Self = this.set("onKeyDownCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDownCapture: Self = this.set("onKeyDownCapture", js.undefined)
    @scala.inline
    def setOnKeyPress(value: KeyboardEvent[T] => Unit): Self = this.set("onKeyPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    @scala.inline
    def setOnKeyPressCapture(value: KeyboardEvent[T] => Unit): Self = this.set("onKeyPressCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyPressCapture: Self = this.set("onKeyPressCapture", js.undefined)
    @scala.inline
    def setOnKeyUp(value: KeyboardEvent[T] => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    @scala.inline
    def setOnKeyUpCapture(value: KeyboardEvent[T] => Unit): Self = this.set("onKeyUpCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyUpCapture: Self = this.set("onKeyUpCapture", js.undefined)
    @scala.inline
    def setOnLoad(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onLoad", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    @scala.inline
    def setOnLoadCapture(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onLoadCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadCapture: Self = this.set("onLoadCapture", js.undefined)
    @scala.inline
    def setOnLoadStart(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onLoadStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadStart: Self = this.set("onLoadStart", js.undefined)
    @scala.inline
    def setOnLoadStartCapture(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onLoadStartCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadStartCapture: Self = this.set("onLoadStartCapture", js.undefined)
    @scala.inline
    def setOnLoadedData(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onLoadedData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadedData: Self = this.set("onLoadedData", js.undefined)
    @scala.inline
    def setOnLoadedDataCapture(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onLoadedDataCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadedDataCapture: Self = this.set("onLoadedDataCapture", js.undefined)
    @scala.inline
    def setOnLoadedMetadata(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onLoadedMetadata", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadedMetadata: Self = this.set("onLoadedMetadata", js.undefined)
    @scala.inline
    def setOnLoadedMetadataCapture(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onLoadedMetadataCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadedMetadataCapture: Self = this.set("onLoadedMetadataCapture", js.undefined)
    @scala.inline
    def setOnLostPointerCapture(value: PointerEvent[T] => Unit): Self = this.set("onLostPointerCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLostPointerCapture: Self = this.set("onLostPointerCapture", js.undefined)
    @scala.inline
    def setOnLostPointerCaptureCapture(value: PointerEvent[T] => Unit): Self = this.set("onLostPointerCaptureCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLostPointerCaptureCapture: Self = this.set("onLostPointerCaptureCapture", js.undefined)
    @scala.inline
    def setOnMouseDown(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnMouseDownCapture(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onMouseDownCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseDownCapture: Self = this.set("onMouseDownCapture", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnMouseMove(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    @scala.inline
    def setOnMouseMoveCapture(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onMouseMoveCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseMoveCapture: Self = this.set("onMouseMoveCapture", js.undefined)
    @scala.inline
    def setOnMouseOut(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onMouseOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseOut: Self = this.set("onMouseOut", js.undefined)
    @scala.inline
    def setOnMouseOutCapture(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onMouseOutCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseOutCapture: Self = this.set("onMouseOutCapture", js.undefined)
    @scala.inline
    def setOnMouseOver(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onMouseOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseOver: Self = this.set("onMouseOver", js.undefined)
    @scala.inline
    def setOnMouseOverCapture(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onMouseOverCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseOverCapture: Self = this.set("onMouseOverCapture", js.undefined)
    @scala.inline
    def setOnMouseUp(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    @scala.inline
    def setOnMouseUpCapture(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = this.set("onMouseUpCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseUpCapture: Self = this.set("onMouseUpCapture", js.undefined)
    @scala.inline
    def setOnPaste(value: ClipboardEvent[T] => Unit): Self = this.set("onPaste", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPaste: Self = this.set("onPaste", js.undefined)
    @scala.inline
    def setOnPasteCapture(value: ClipboardEvent[T] => Unit): Self = this.set("onPasteCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPasteCapture: Self = this.set("onPasteCapture", js.undefined)
    @scala.inline
    def setOnPause(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onPause", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", js.undefined)
    @scala.inline
    def setOnPauseCapture(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onPauseCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPauseCapture: Self = this.set("onPauseCapture", js.undefined)
    @scala.inline
    def setOnPlay(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onPlay", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", js.undefined)
    @scala.inline
    def setOnPlayCapture(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onPlayCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlayCapture: Self = this.set("onPlayCapture", js.undefined)
    @scala.inline
    def setOnPlaying(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onPlaying", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlaying: Self = this.set("onPlaying", js.undefined)
    @scala.inline
    def setOnPlayingCapture(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onPlayingCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlayingCapture: Self = this.set("onPlayingCapture", js.undefined)
    @scala.inline
    def setOnPointerCancel(value: PointerEvent[T] => Unit): Self = this.set("onPointerCancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerCancel: Self = this.set("onPointerCancel", js.undefined)
    @scala.inline
    def setOnPointerCancelCapture(value: PointerEvent[T] => Unit): Self = this.set("onPointerCancelCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerCancelCapture: Self = this.set("onPointerCancelCapture", js.undefined)
    @scala.inline
    def setOnPointerDown(value: PointerEvent[T] => Unit): Self = this.set("onPointerDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerDown: Self = this.set("onPointerDown", js.undefined)
    @scala.inline
    def setOnPointerDownCapture(value: PointerEvent[T] => Unit): Self = this.set("onPointerDownCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerDownCapture: Self = this.set("onPointerDownCapture", js.undefined)
    @scala.inline
    def setOnPointerEnter(value: PointerEvent[T] => Unit): Self = this.set("onPointerEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerEnter: Self = this.set("onPointerEnter", js.undefined)
    @scala.inline
    def setOnPointerEnterCapture(value: PointerEvent[T] => Unit): Self = this.set("onPointerEnterCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerEnterCapture: Self = this.set("onPointerEnterCapture", js.undefined)
    @scala.inline
    def setOnPointerLeave(value: PointerEvent[T] => Unit): Self = this.set("onPointerLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerLeave: Self = this.set("onPointerLeave", js.undefined)
    @scala.inline
    def setOnPointerLeaveCapture(value: PointerEvent[T] => Unit): Self = this.set("onPointerLeaveCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerLeaveCapture: Self = this.set("onPointerLeaveCapture", js.undefined)
    @scala.inline
    def setOnPointerMove(value: PointerEvent[T] => Unit): Self = this.set("onPointerMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerMove: Self = this.set("onPointerMove", js.undefined)
    @scala.inline
    def setOnPointerMoveCapture(value: PointerEvent[T] => Unit): Self = this.set("onPointerMoveCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerMoveCapture: Self = this.set("onPointerMoveCapture", js.undefined)
    @scala.inline
    def setOnPointerOut(value: PointerEvent[T] => Unit): Self = this.set("onPointerOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerOut: Self = this.set("onPointerOut", js.undefined)
    @scala.inline
    def setOnPointerOutCapture(value: PointerEvent[T] => Unit): Self = this.set("onPointerOutCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerOutCapture: Self = this.set("onPointerOutCapture", js.undefined)
    @scala.inline
    def setOnPointerOver(value: PointerEvent[T] => Unit): Self = this.set("onPointerOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerOver: Self = this.set("onPointerOver", js.undefined)
    @scala.inline
    def setOnPointerOverCapture(value: PointerEvent[T] => Unit): Self = this.set("onPointerOverCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerOverCapture: Self = this.set("onPointerOverCapture", js.undefined)
    @scala.inline
    def setOnPointerUp(value: PointerEvent[T] => Unit): Self = this.set("onPointerUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerUp: Self = this.set("onPointerUp", js.undefined)
    @scala.inline
    def setOnPointerUpCapture(value: PointerEvent[T] => Unit): Self = this.set("onPointerUpCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerUpCapture: Self = this.set("onPointerUpCapture", js.undefined)
    @scala.inline
    def setOnProgress(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onProgress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    @scala.inline
    def setOnProgressCapture(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onProgressCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnProgressCapture: Self = this.set("onProgressCapture", js.undefined)
    @scala.inline
    def setOnRateChange(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onRateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRateChange: Self = this.set("onRateChange", js.undefined)
    @scala.inline
    def setOnRateChangeCapture(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onRateChangeCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRateChangeCapture: Self = this.set("onRateChangeCapture", js.undefined)
    @scala.inline
    def setOnReset(value: FormEvent[T] => Unit): Self = this.set("onReset", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
    @scala.inline
    def setOnResetCapture(value: FormEvent[T] => Unit): Self = this.set("onResetCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResetCapture: Self = this.set("onResetCapture", js.undefined)
    @scala.inline
    def setOnScroll(value: UIEvent[T, NativeUIEvent] => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    @scala.inline
    def setOnScrollCapture(value: UIEvent[T, NativeUIEvent] => Unit): Self = this.set("onScrollCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnScrollCapture: Self = this.set("onScrollCapture", js.undefined)
    @scala.inline
    def setOnSeeked(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onSeeked", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSeeked: Self = this.set("onSeeked", js.undefined)
    @scala.inline
    def setOnSeekedCapture(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onSeekedCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSeekedCapture: Self = this.set("onSeekedCapture", js.undefined)
    @scala.inline
    def setOnSeeking(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onSeeking", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSeeking: Self = this.set("onSeeking", js.undefined)
    @scala.inline
    def setOnSeekingCapture(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onSeekingCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSeekingCapture: Self = this.set("onSeekingCapture", js.undefined)
    @scala.inline
    def setOnSelect(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOnSelectCapture(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onSelectCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelectCapture: Self = this.set("onSelectCapture", js.undefined)
    @scala.inline
    def setOnStalled(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onStalled", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStalled: Self = this.set("onStalled", js.undefined)
    @scala.inline
    def setOnStalledCapture(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onStalledCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStalledCapture: Self = this.set("onStalledCapture", js.undefined)
    @scala.inline
    def setOnSubmit(value: FormEvent[T] => Unit): Self = this.set("onSubmit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    @scala.inline
    def setOnSubmitCapture(value: FormEvent[T] => Unit): Self = this.set("onSubmitCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSubmitCapture: Self = this.set("onSubmitCapture", js.undefined)
    @scala.inline
    def setOnSuspend(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onSuspend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSuspend: Self = this.set("onSuspend", js.undefined)
    @scala.inline
    def setOnSuspendCapture(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onSuspendCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSuspendCapture: Self = this.set("onSuspendCapture", js.undefined)
    @scala.inline
    def setOnTimeUpdate(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onTimeUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTimeUpdate: Self = this.set("onTimeUpdate", js.undefined)
    @scala.inline
    def setOnTimeUpdateCapture(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onTimeUpdateCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTimeUpdateCapture: Self = this.set("onTimeUpdateCapture", js.undefined)
    @scala.inline
    def setOnTouchCancel(value: TouchEvent[T] => Unit): Self = this.set("onTouchCancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    @scala.inline
    def setOnTouchCancelCapture(value: TouchEvent[T] => Unit): Self = this.set("onTouchCancelCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchCancelCapture: Self = this.set("onTouchCancelCapture", js.undefined)
    @scala.inline
    def setOnTouchEnd(value: TouchEvent[T] => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    @scala.inline
    def setOnTouchEndCapture(value: TouchEvent[T] => Unit): Self = this.set("onTouchEndCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchEndCapture: Self = this.set("onTouchEndCapture", js.undefined)
    @scala.inline
    def setOnTouchMove(value: TouchEvent[T] => Unit): Self = this.set("onTouchMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    @scala.inline
    def setOnTouchMoveCapture(value: TouchEvent[T] => Unit): Self = this.set("onTouchMoveCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchMoveCapture: Self = this.set("onTouchMoveCapture", js.undefined)
    @scala.inline
    def setOnTouchStart(value: TouchEvent[T] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    @scala.inline
    def setOnTouchStartCapture(value: TouchEvent[T] => Unit): Self = this.set("onTouchStartCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchStartCapture: Self = this.set("onTouchStartCapture", js.undefined)
    @scala.inline
    def setOnTransitionEnd(value: TransitionEvent[T] => Unit): Self = this.set("onTransitionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTransitionEnd: Self = this.set("onTransitionEnd", js.undefined)
    @scala.inline
    def setOnTransitionEndCapture(value: TransitionEvent[T] => Unit): Self = this.set("onTransitionEndCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTransitionEndCapture: Self = this.set("onTransitionEndCapture", js.undefined)
    @scala.inline
    def setOnVolumeChange(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onVolumeChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnVolumeChange: Self = this.set("onVolumeChange", js.undefined)
    @scala.inline
    def setOnVolumeChangeCapture(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onVolumeChangeCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnVolumeChangeCapture: Self = this.set("onVolumeChangeCapture", js.undefined)
    @scala.inline
    def setOnWaiting(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onWaiting", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWaiting: Self = this.set("onWaiting", js.undefined)
    @scala.inline
    def setOnWaitingCapture(value: SyntheticEvent[T, Event] => Unit): Self = this.set("onWaitingCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWaitingCapture: Self = this.set("onWaitingCapture", js.undefined)
    @scala.inline
    def setOnWheel(value: WheelEvent[T] => Unit): Self = this.set("onWheel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWheel: Self = this.set("onWheel", js.undefined)
    @scala.inline
    def setOnWheelCapture(value: WheelEvent[T] => Unit): Self = this.set("onWheelCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWheelCapture: Self = this.set("onWheelCapture", js.undefined)
  }
  
}

