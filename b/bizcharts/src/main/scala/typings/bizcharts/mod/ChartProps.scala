package typings.bizcharts.mod

import org.scalablytyped.runtime.StringDictionary
import typings.antvG2.mod.EventParams
import typings.antvG2.mod.Styles.background
import typings.bizcharts.AnonBottom
import typings.bizcharts.AnonData
import typings.bizcharts.AnonItems
import typings.bizcharts.AnonTooltip
import typings.bizcharts.AnonTooltipAny
import typings.react.AnonHtml
import typings.react.mod.AnimationEvent
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEvent
import typings.react.mod.CompositionEvent
import typings.react.mod.DOMAttributes
import typings.react.mod.DragEvent
import typings.react.mod.FocusEvent
import typings.react.mod.FormEvent
import typings.react.mod.Key
import typings.react.mod.KeyboardEvent
import typings.react.mod.LegacyRef
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PointerEvent
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TransitionEvent
import typings.react.mod.UIEvent
import typings.react.mod.WheelEvent
import typings.std.Event_
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.react.mod.Props because var conflicts: children. Inlined key, ref */ trait ChartProps
  extends DOMAttributes[js.Object]
     with /* event */ StringDictionary[js.Any] {
  var animate: js.UndefOr[Boolean] = js.undefined
  var background: js.UndefOr[typings.antvG2.mod.Styles.background] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var filter: js.UndefOr[js.Array[_]] = js.undefined
  var forceFit: js.UndefOr[Boolean] = js.undefined
  var height: Double
  var key: js.UndefOr[Key] = js.undefined
  // 事件属性
  var onGetG2Instance: js.UndefOr[js.Function1[/* chart */ typings.antvG2.mod.Chart, Unit]] = js.undefined
  var onItemSelected: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.undefined
  var onItemSelectedChange: js.UndefOr[js.Function1[/* ev */ AnonData, Unit]] = js.undefined
  var onItemUnselected: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.undefined
  var onPlotClick: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.undefined
  var onPlotDblClick: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.undefined
  var onPlotEnter: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.undefined
  var onPlotLeave: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.undefined
  var onPlotMove: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.undefined
  var onTooltipChange: js.UndefOr[js.Function1[/* ev */ AnonItems, Unit]] = js.undefined
  var onTooltipHide: js.UndefOr[js.Function1[/* ev */ AnonTooltipAny, Unit]] = js.undefined
  var onTooltipShow: js.UndefOr[js.Function1[/* ev */ AnonTooltip, Unit]] = js.undefined
  var padding: js.UndefOr[
    String | AnonBottom | Double | (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple2[String, String])
  ] = js.undefined
  var pixelRatio: js.UndefOr[Double] = js.undefined
  var placeholder: js.UndefOr[Node | String | Boolean] = js.undefined
  var plotBackground: js.UndefOr[background] = js.undefined
  var ref: js.UndefOr[LegacyRef[js.Any]] = js.undefined
  var scale: js.UndefOr[js.Any] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ChartProps {
  @scala.inline
  def apply(
    height: Double,
    StringDictionary: /* event */ StringDictionary[js.Any] = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    background: background = null,
    children: ReactNode = null,
    className: String = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    data: js.Any = null,
    filter: js.Array[_] = null,
    forceFit: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    onAbort: SyntheticEvent[js.Object, Event_] => Unit = null,
    onAnimationEnd: AnimationEvent[js.Object] => Unit = null,
    onAnimationIteration: AnimationEvent[js.Object] => Unit = null,
    onAnimationStart: AnimationEvent[js.Object] => Unit = null,
    onAuxClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onBeforeInput: FormEvent[js.Object] => Unit = null,
    onBlur: FocusEvent[js.Object] => Unit = null,
    onCanPlay: SyntheticEvent[js.Object, Event_] => Unit = null,
    onCanPlayThrough: SyntheticEvent[js.Object, Event_] => Unit = null,
    onChange: FormEvent[js.Object] => Unit = null,
    onClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onCompositionEnd: CompositionEvent[js.Object] => Unit = null,
    onCompositionStart: CompositionEvent[js.Object] => Unit = null,
    onCompositionUpdate: CompositionEvent[js.Object] => Unit = null,
    onContextMenu: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onCopy: ClipboardEvent[js.Object] => Unit = null,
    onCut: ClipboardEvent[js.Object] => Unit = null,
    onDoubleClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onDrag: DragEvent[js.Object] => Unit = null,
    onDragEnd: DragEvent[js.Object] => Unit = null,
    onDragEnter: DragEvent[js.Object] => Unit = null,
    onDragExit: DragEvent[js.Object] => Unit = null,
    onDragLeave: DragEvent[js.Object] => Unit = null,
    onDragOver: DragEvent[js.Object] => Unit = null,
    onDragStart: DragEvent[js.Object] => Unit = null,
    onDrop: DragEvent[js.Object] => Unit = null,
    onDurationChange: SyntheticEvent[js.Object, Event_] => Unit = null,
    onEmptied: SyntheticEvent[js.Object, Event_] => Unit = null,
    onEncrypted: SyntheticEvent[js.Object, Event_] => Unit = null,
    onEnded: SyntheticEvent[js.Object, Event_] => Unit = null,
    onError: SyntheticEvent[js.Object, Event_] => Unit = null,
    onFocus: FocusEvent[js.Object] => Unit = null,
    onGetG2Instance: /* chart */ typings.antvG2.mod.Chart => Unit = null,
    onInput: FormEvent[js.Object] => Unit = null,
    onInvalid: FormEvent[js.Object] => Unit = null,
    onItemSelected: /* ev */ EventParams => Unit = null,
    onItemSelectedChange: /* ev */ AnonData => Unit = null,
    onItemUnselected: /* ev */ EventParams => Unit = null,
    onKeyDown: KeyboardEvent[js.Object] => Unit = null,
    onKeyPress: KeyboardEvent[js.Object] => Unit = null,
    onKeyUp: KeyboardEvent[js.Object] => Unit = null,
    onLoad: SyntheticEvent[js.Object, Event_] => Unit = null,
    onLoadStart: SyntheticEvent[js.Object, Event_] => Unit = null,
    onLoadedData: SyntheticEvent[js.Object, Event_] => Unit = null,
    onLoadedMetadata: SyntheticEvent[js.Object, Event_] => Unit = null,
    onMouseDown: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseOut: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseOver: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onPaste: ClipboardEvent[js.Object] => Unit = null,
    onPause: SyntheticEvent[js.Object, Event_] => Unit = null,
    onPlay: SyntheticEvent[js.Object, Event_] => Unit = null,
    onPlaying: SyntheticEvent[js.Object, Event_] => Unit = null,
    onPlotClick: /* ev */ EventParams => Unit = null,
    onPlotDblClick: /* ev */ EventParams => Unit = null,
    onPlotEnter: /* ev */ EventParams => Unit = null,
    onPlotLeave: /* ev */ EventParams => Unit = null,
    onPlotMove: /* ev */ EventParams => Unit = null,
    onPointerCancel: PointerEvent[js.Object] => Unit = null,
    onPointerDown: PointerEvent[js.Object] => Unit = null,
    onPointerEnter: PointerEvent[js.Object] => Unit = null,
    onPointerLeave: PointerEvent[js.Object] => Unit = null,
    onPointerMove: PointerEvent[js.Object] => Unit = null,
    onPointerOut: PointerEvent[js.Object] => Unit = null,
    onPointerOver: PointerEvent[js.Object] => Unit = null,
    onPointerUp: PointerEvent[js.Object] => Unit = null,
    onProgress: SyntheticEvent[js.Object, Event_] => Unit = null,
    onRateChange: SyntheticEvent[js.Object, Event_] => Unit = null,
    onReset: FormEvent[js.Object] => Unit = null,
    onScroll: UIEvent[js.Object] => Unit = null,
    onSeeked: SyntheticEvent[js.Object, Event_] => Unit = null,
    onSeeking: SyntheticEvent[js.Object, Event_] => Unit = null,
    onSelect: SyntheticEvent[js.Object, Event_] => Unit = null,
    onStalled: SyntheticEvent[js.Object, Event_] => Unit = null,
    onSubmit: FormEvent[js.Object] => Unit = null,
    onSuspend: SyntheticEvent[js.Object, Event_] => Unit = null,
    onTimeUpdate: SyntheticEvent[js.Object, Event_] => Unit = null,
    onTooltipChange: /* ev */ AnonItems => Unit = null,
    onTooltipHide: /* ev */ AnonTooltipAny => Unit = null,
    onTooltipShow: /* ev */ AnonTooltip => Unit = null,
    onTouchCancel: TouchEvent[js.Object] => Unit = null,
    onTouchEnd: TouchEvent[js.Object] => Unit = null,
    onTouchMove: TouchEvent[js.Object] => Unit = null,
    onTouchStart: TouchEvent[js.Object] => Unit = null,
    onTransitionEnd: TransitionEvent[js.Object] => Unit = null,
    onVolumeChange: SyntheticEvent[js.Object, Event_] => Unit = null,
    onWaiting: SyntheticEvent[js.Object, Event_] => Unit = null,
    onWheel: WheelEvent[js.Object] => Unit = null,
    padding: String | AnonBottom | Double | (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple2[String, String]) = null,
    pixelRatio: Int | Double = null,
    placeholder: Node | String | Boolean = null,
    plotBackground: background = null,
    ref: LegacyRef[js.Any] = null,
    scale: js.Any = null,
    style: CSSProperties = null,
    width: Int | Double = null
  ): ChartProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFit)) __obj.updateDynamic("forceFit")(forceFit.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onGetG2Instance != null) __obj.updateDynamic("onGetG2Instance")(js.Any.fromFunction1(onGetG2Instance))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
    if (onItemSelected != null) __obj.updateDynamic("onItemSelected")(js.Any.fromFunction1(onItemSelected))
    if (onItemSelectedChange != null) __obj.updateDynamic("onItemSelectedChange")(js.Any.fromFunction1(onItemSelectedChange))
    if (onItemUnselected != null) __obj.updateDynamic("onItemUnselected")(js.Any.fromFunction1(onItemUnselected))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
    if (onPlotClick != null) __obj.updateDynamic("onPlotClick")(js.Any.fromFunction1(onPlotClick))
    if (onPlotDblClick != null) __obj.updateDynamic("onPlotDblClick")(js.Any.fromFunction1(onPlotDblClick))
    if (onPlotEnter != null) __obj.updateDynamic("onPlotEnter")(js.Any.fromFunction1(onPlotEnter))
    if (onPlotLeave != null) __obj.updateDynamic("onPlotLeave")(js.Any.fromFunction1(onPlotLeave))
    if (onPlotMove != null) __obj.updateDynamic("onPlotMove")(js.Any.fromFunction1(onPlotMove))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
    if (onTooltipChange != null) __obj.updateDynamic("onTooltipChange")(js.Any.fromFunction1(onTooltipChange))
    if (onTooltipHide != null) __obj.updateDynamic("onTooltipHide")(js.Any.fromFunction1(onTooltipHide))
    if (onTooltipShow != null) __obj.updateDynamic("onTooltipShow")(js.Any.fromFunction1(onTooltipShow))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (plotBackground != null) __obj.updateDynamic("plotBackground")(plotBackground.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartProps]
  }
}

