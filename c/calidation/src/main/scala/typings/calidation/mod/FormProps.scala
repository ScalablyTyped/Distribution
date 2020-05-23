package typings.calidation.mod

import typings.calidation.calidationStrings.`additions text`
import typings.calidation.calidationStrings.`inline`
import typings.calidation.calidationStrings.additions
import typings.calidation.calidationStrings.all
import typings.calidation.calidationStrings.ascending
import typings.calidation.calidationStrings.assertive
import typings.calidation.calidationStrings.both
import typings.calidation.calidationStrings.copy
import typings.calidation.calidationStrings.date
import typings.calidation.calidationStrings.decimal
import typings.calidation.calidationStrings.descending
import typings.calidation.calidationStrings.dialog
import typings.calidation.calidationStrings.email
import typings.calidation.calidationStrings.execute
import typings.calidation.calidationStrings.grammar
import typings.calidation.calidationStrings.grid
import typings.calidation.calidationStrings.horizontal
import typings.calidation.calidationStrings.inherit
import typings.calidation.calidationStrings.link
import typings.calidation.calidationStrings.list
import typings.calidation.calidationStrings.listbox
import typings.calidation.calidationStrings.location
import typings.calidation.calidationStrings.menu
import typings.calidation.calidationStrings.mixed
import typings.calidation.calidationStrings.move
import typings.calidation.calidationStrings.no
import typings.calidation.calidationStrings.none
import typings.calidation.calidationStrings.numeric
import typings.calidation.calidationStrings.off
import typings.calidation.calidationStrings.on
import typings.calidation.calidationStrings.other
import typings.calidation.calidationStrings.page
import typings.calidation.calidationStrings.polite
import typings.calidation.calidationStrings.popup
import typings.calidation.calidationStrings.removals
import typings.calidation.calidationStrings.search
import typings.calidation.calidationStrings.spelling
import typings.calidation.calidationStrings.step
import typings.calidation.calidationStrings.tel
import typings.calidation.calidationStrings.text
import typings.calidation.calidationStrings.time
import typings.calidation.calidationStrings.tree
import typings.calidation.calidationStrings.url
import typings.calidation.calidationStrings.vertical
import typings.calidation.calidationStrings.yes
import typings.react.anon.Html
import typings.react.mod.AnimationEventHandler
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ChangeEvent
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEventHandler
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEventHandler
import typings.react.mod.Key
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.LegacyRef
import typings.react.mod.MouseEventHandler
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEventHandler
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<react.react.DetailedHTMLProps<react.react.FormHTMLAttributes<std.HTMLFormElement>, std.HTMLFormElement>, 'onSubmit'> */
@js.native
trait FormProps extends js.Object {
  var about: js.UndefOr[String] = js.native
  var acceptCharset: js.UndefOr[String] = js.native
  var accessKey: js.UndefOr[String] = js.native
  var action: js.UndefOr[String] = js.native
  var `aria-activedescendant`: js.UndefOr[String] = js.native
  var `aria-atomic`: js.UndefOr[Boolean] = js.native
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
  var `aria-busy`: js.UndefOr[Boolean] = js.native
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
  var `aria-colcount`: js.UndefOr[Double] = js.native
  var `aria-colindex`: js.UndefOr[Double] = js.native
  var `aria-colspan`: js.UndefOr[Double] = js.native
  var `aria-controls`: js.UndefOr[String] = js.native
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
  var `aria-describedby`: js.UndefOr[String] = js.native
  var `aria-details`: js.UndefOr[String] = js.native
  var `aria-disabled`: js.UndefOr[Boolean] = js.native
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
  var `aria-errormessage`: js.UndefOr[String] = js.native
  var `aria-expanded`: js.UndefOr[Boolean] = js.native
  var `aria-flowto`: js.UndefOr[String] = js.native
  var `aria-grabbed`: js.UndefOr[Boolean] = js.native
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
  var `aria-hidden`: js.UndefOr[Boolean] = js.native
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
  var `aria-keyshortcuts`: js.UndefOr[String] = js.native
  var `aria-label`: js.UndefOr[String] = js.native
  var `aria-labelledby`: js.UndefOr[String] = js.native
  var `aria-level`: js.UndefOr[Double] = js.native
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
  var `aria-modal`: js.UndefOr[Boolean] = js.native
  var `aria-multiline`: js.UndefOr[Boolean] = js.native
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
  var `aria-owns`: js.UndefOr[String] = js.native
  var `aria-placeholder`: js.UndefOr[String] = js.native
  var `aria-posinset`: js.UndefOr[Double] = js.native
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
  var `aria-readonly`: js.UndefOr[Boolean] = js.native
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.native
  var `aria-required`: js.UndefOr[Boolean] = js.native
  var `aria-roledescription`: js.UndefOr[String] = js.native
  var `aria-rowcount`: js.UndefOr[Double] = js.native
  var `aria-rowindex`: js.UndefOr[Double] = js.native
  var `aria-rowspan`: js.UndefOr[Double] = js.native
  var `aria-selected`: js.UndefOr[Boolean] = js.native
  var `aria-setsize`: js.UndefOr[Double] = js.native
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
  var `aria-valuemax`: js.UndefOr[Double] = js.native
  var `aria-valuemin`: js.UndefOr[Double] = js.native
  var `aria-valuenow`: js.UndefOr[Double] = js.native
  var `aria-valuetext`: js.UndefOr[String] = js.native
  var autoCapitalize: js.UndefOr[String] = js.native
  var autoComplete: js.UndefOr[String] = js.native
  var autoCorrect: js.UndefOr[String] = js.native
  var autoSave: js.UndefOr[String] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var className: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  var contextMenu: js.UndefOr[String] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  var datatype: js.UndefOr[String] = js.native
  var defaultChecked: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  var dir: js.UndefOr[String] = js.native
  var draggable: js.UndefOr[Booleanish] = js.native
  var encType: js.UndefOr[String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var inlist: js.UndefOr[js.Any] = js.native
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  var is: js.UndefOr[String] = js.native
  var itemID: js.UndefOr[String] = js.native
  var itemProp: js.UndefOr[String] = js.native
  var itemRef: js.UndefOr[String] = js.native
  var itemScope: js.UndefOr[Boolean] = js.native
  var itemType: js.UndefOr[String] = js.native
  var key: js.UndefOr[Key] = js.native
  var lang: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var noValidate: js.UndefOr[Boolean] = js.native
  var onAbort: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLFormElement]] = js.native
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLFormElement]] = js.native
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLFormElement]] = js.native
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.native
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLFormElement]] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[HTMLFormElement]] = js.native
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onChange: js.UndefOr[
    FormEventHandler[HTMLFormElement] | (js.Function1[/* event */ ChangeEvent[HTMLFormElement], Unit])
  ] = js.native
  var onClick: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.native
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLFormElement]] = js.native
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLFormElement]] = js.native
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLFormElement]] = js.native
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.native
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLFormElement]] = js.native
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLFormElement]] = js.native
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.native
  var onDrag: js.UndefOr[DragEventHandler[HTMLFormElement]] = js.native
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLFormElement]] = js.native
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLFormElement]] = js.native
  var onDragExit: js.UndefOr[DragEventHandler[HTMLFormElement]] = js.native
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLFormElement]] = js.native
  var onDragOver: js.UndefOr[DragEventHandler[HTMLFormElement]] = js.native
  var onDragStart: js.UndefOr[DragEventHandler[HTMLFormElement]] = js.native
  var onDrop: js.UndefOr[DragEventHandler[HTMLFormElement]] = js.native
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onEnded: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onError: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onFocus: js.UndefOr[FocusEventHandler[HTMLFormElement]] = js.native
  var onInput: js.UndefOr[FormEventHandler[HTMLFormElement]] = js.native
  var onInvalid: js.UndefOr[FormEventHandler[HTMLFormElement]] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLFormElement]] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLFormElement]] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLFormElement]] = js.native
  var onLoad: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.native
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.native
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.native
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLFormElement]] = js.native
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLFormElement]] = js.native
  var onPause: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onPlay: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLFormElement]] = js.native
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLFormElement]] = js.native
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLFormElement]] = js.native
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLFormElement]] = js.native
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLFormElement]] = js.native
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLFormElement]] = js.native
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLFormElement]] = js.native
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLFormElement]] = js.native
  var onProgress: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onReset: js.UndefOr[FormEventHandler[HTMLFormElement] | js.Function0[Unit]] = js.native
  var onScroll: js.UndefOr[UIEventHandler[HTMLFormElement]] = js.native
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onSelect: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onStalled: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onSubmit: js.UndefOr[js.Function1[/* context */ FormContext, Unit]] = js.native
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLFormElement]] = js.native
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLFormElement]] = js.native
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLFormElement]] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLFormElement]] = js.native
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLFormElement]] = js.native
  var onUpdate: js.UndefOr[js.Function1[/* context */ FormContext, Unit]] = js.native
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLFormElement]] = js.native
  var onWheel: js.UndefOr[WheelEventHandler[HTMLFormElement]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var property: js.UndefOr[String] = js.native
  var radioGroup: js.UndefOr[String] = js.native
  var ref: js.UndefOr[LegacyRef[HTMLFormElement]] = js.native
  var resource: js.UndefOr[String] = js.native
  var results: js.UndefOr[Double] = js.native
  var role: js.UndefOr[String] = js.native
  var security: js.UndefOr[String] = js.native
  var slot: js.UndefOr[String] = js.native
  var spellCheck: js.UndefOr[Booleanish] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var target: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var translate: js.UndefOr[yes | no] = js.native
  var typeof: js.UndefOr[String] = js.native
  var unselectable: js.UndefOr[on | off] = js.native
  var vocab: js.UndefOr[String] = js.native
}

