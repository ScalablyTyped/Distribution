package typings.ckeditorCkeditor5Utils

import typings.ckeditorCkeditor5Utils.anon.CallbackOptionsreadonlyus
import typings.ckeditorCkeditor5Utils.anon.Instantiable
import typings.ckeditorCkeditor5Utils.srcEmittermixinMod.Emitter
import typings.ckeditorCkeditor5Utils.srcEventinfoMod.default
import typings.ckeditorCkeditor5Utils.srcMixMod.Constructor
import typings.ckeditorCkeditor5Utils.srcMixMod.Mixed
import typings.std.AnimationEvent
import typings.std.BeforeUnloadEvent
import typings.std.ClipboardEvent
import typings.std.CompositionEvent
import typings.std.DeviceMotionEvent
import typings.std.DeviceOrientationEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.FormDataEvent
import typings.std.GamepadEvent
import typings.std.HTMLElementEventMap
import typings.std.HashChangeEvent
import typings.std.InputEvent
import typings.std.KeyboardEvent
import typings.std.MessageEvent
import typings.std.MouseEvent
import typings.std.Node
import typings.std.PageTransitionEvent
import typings.std.PointerEvent
import typings.std.PopStateEvent
import typings.std.ProgressEvent
import typings.std.PromiseRejectionEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.StorageEvent
import typings.std.SubmitEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import typings.std.Window
import typings.std.WindowEventHandlersEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDomEmittermixinMod {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/dom/emittermixin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Instantiable = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Instantiable]
  inline def default[Base /* <: Constructor[Emitter] */](base: Base): Mixed[Base, DomEmitter] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(base.asInstanceOf[js.Any]).asInstanceOf[Mixed[Base, DomEmitter]]
  
  @js.native
  trait DomEmitter
    extends StObject
       with Emitter {
    
    /**
      * Registers a callback function to be executed when an event is fired in a specific Emitter or DOM Node.
      * It is backwards compatible with {@link module:utils/emittermixin~Emitter#listenTo}.
      *
      * @label HTML_EMITTER
      * @param emitter The object that fires the event.
      * @param event The name of the event.
      * @param callback The function to be called on event.
      * @param options Additional options.
      * @param options.useCapture Indicates that events of this type will be dispatched to the registered
      * listener before being dispatched to any EventTarget beneath it in the DOM tree.
      * @param options.usePassive Indicates that the function specified by listener will never call preventDefault()
      * and prevents blocking browser's main thread by this event handler.
      */
    def listenTo[K /* <: /* keyof @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/dom/emittermixin.DomEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 123, starting with typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.fullscreenchange, typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.fullscreenerror, typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.abort */ Any */](
      emitter: Node,
      event: K,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* ev */ default[String, Any], 
          /* import warning: importer.ImportType#apply Failed type conversion: @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/dom/emittermixin.DomEventMap[K] */ /* event */ js.Any, 
          Unit
        ]
    ): Unit = js.native
    def listenTo[K /* <: /* keyof @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/dom/emittermixin.DomEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 123, starting with typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.fullscreenchange, typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.fullscreenerror, typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.abort */ Any */](
      emitter: Node,
      event: K,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* ev */ default[String, Any], 
          /* import warning: importer.ImportType#apply Failed type conversion: @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/dom/emittermixin.DomEventMap[K] */ /* event */ js.Any, 
          Unit
        ],
      options: CallbackOptionsreadonlyus
    ): Unit = js.native
    def listenTo[K /* <: /* keyof @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/dom/emittermixin.DomEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 123, starting with typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.fullscreenchange, typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.fullscreenerror, typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.abort */ Any */](
      emitter: Window,
      event: K,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* ev */ default[String, Any], 
          /* import warning: importer.ImportType#apply Failed type conversion: @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/dom/emittermixin.DomEventMap[K] */ /* event */ js.Any, 
          Unit
        ]
    ): Unit = js.native
    def listenTo[K /* <: /* keyof @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/dom/emittermixin.DomEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 123, starting with typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.fullscreenchange, typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.fullscreenerror, typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.abort */ Any */](
      emitter: Window,
      event: K,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* ev */ default[String, Any], 
          /* import warning: importer.ImportType#apply Failed type conversion: @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/dom/emittermixin.DomEventMap[K] */ /* event */ js.Any, 
          Unit
        ],
      options: CallbackOptionsreadonlyus
    ): Unit = js.native
    
    def stopListening(emitter: Node): Unit = js.native
    def stopListening(emitter: Node, event: String): Unit = js.native
    def stopListening(emitter: Node, event: String, callback: js.Function): Unit = js.native
    def stopListening(emitter: Node, event: Unit, callback: js.Function): Unit = js.native
    def stopListening(emitter: Window): Unit = js.native
    def stopListening(emitter: Window, event: String): Unit = js.native
    def stopListening(emitter: Window, event: String, callback: js.Function): Unit = js.native
    def stopListening(emitter: Window, event: Unit, callback: js.Function): Unit = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.std.GlobalEventHandlersEventMap because Already inherited
  - typings.std.WindowEventMap because var conflicts: abort, animationcancel, animationend, animationiteration, animationstart, auxclick, beforeinput, blur, cancel, canplay, canplaythrough, change, click, close, compositionend, compositionstart, compositionupdate, contextmenu, copy, cuechange, cut, dblclick, drag, dragend, dragenter, dragleave, dragover, dragstart, drop, durationchange, emptied, ended, error, focus, focusin, focusout, formdata, gotpointercapture, input, invalid, keydown, keypress, keyup, load, loadeddata, loadedmetadata, loadstart, lostpointercapture, mousedown, mouseenter, mouseleave, mousemove, mouseout, mouseover, mouseup, paste, pause, play, playing, pointercancel, pointerdown, pointerenter, pointerleave, pointermove, pointerout, pointerover, pointerup, progress, ratechange, reset, resize, scroll, securitypolicyviolation, seeked, seeking, select, selectionchange, selectstart, slotchange, stalled, submit, suspend, timeupdate, toggle, touchcancel, touchend, touchmove, touchstart, transitioncancel, transitionend, transitionrun, transitionstart, volumechange, waiting, webkitanimationend, webkitanimationiteration, webkitanimationstart, webkittransitionend, wheel. Inlined devicemotion, DOMContentLoaded, orientationchange, deviceorientation */ trait DomEventMap
    extends StObject
       with HTMLElementEventMap
       with WindowEventHandlersEventMap {
    
    /* standard dom */
    var DOMContentLoaded: Event
    
    /* standard dom */
    var devicemotion: DeviceMotionEvent
    
    /* standard dom */
    var deviceorientation: DeviceOrientationEvent
    
    /* standard dom */
    var orientationchange: Event
  }
  object DomEventMap {
    
    inline def apply(
      DOMContentLoaded: Event,
      abort: UIEvent,
      afterprint: Event,
      animationcancel: AnimationEvent,
      animationend: AnimationEvent,
      animationiteration: AnimationEvent,
      animationstart: AnimationEvent,
      auxclick: MouseEvent,
      beforeinput: InputEvent,
      beforeprint: Event,
      beforeunload: BeforeUnloadEvent,
      blur: FocusEvent,
      cancel: Event,
      canplay: Event,
      canplaythrough: Event,
      change: Event,
      click: MouseEvent,
      close: Event,
      compositionend: CompositionEvent,
      compositionstart: CompositionEvent,
      compositionupdate: CompositionEvent,
      contextmenu: MouseEvent,
      copy: ClipboardEvent,
      cuechange: Event,
      cut: ClipboardEvent,
      dblclick: MouseEvent,
      devicemotion: DeviceMotionEvent,
      deviceorientation: DeviceOrientationEvent,
      drag: DragEvent,
      dragend: DragEvent,
      dragenter: DragEvent,
      dragleave: DragEvent,
      dragover: DragEvent,
      dragstart: DragEvent,
      drop: DragEvent,
      durationchange: Event,
      emptied: Event,
      ended: Event,
      error: ErrorEvent,
      focus: FocusEvent,
      focusin: FocusEvent,
      focusout: FocusEvent,
      formdata: FormDataEvent,
      fullscreenchange: Event,
      fullscreenerror: Event,
      gamepadconnected: GamepadEvent,
      gamepaddisconnected: GamepadEvent,
      gotpointercapture: PointerEvent,
      hashchange: HashChangeEvent,
      input: Event,
      invalid: Event,
      keydown: KeyboardEvent,
      keypress: KeyboardEvent,
      keyup: KeyboardEvent,
      languagechange: Event,
      load: Event,
      loadeddata: Event,
      loadedmetadata: Event,
      loadstart: Event,
      lostpointercapture: PointerEvent,
      message: MessageEvent[Any],
      messageerror: MessageEvent[Any],
      mousedown: MouseEvent,
      mouseenter: MouseEvent,
      mouseleave: MouseEvent,
      mousemove: MouseEvent,
      mouseout: MouseEvent,
      mouseover: MouseEvent,
      mouseup: MouseEvent,
      offline: Event,
      online: Event,
      orientationchange: Event,
      pagehide: PageTransitionEvent,
      pageshow: PageTransitionEvent,
      paste: ClipboardEvent,
      pause: Event,
      play: Event,
      playing: Event,
      pointercancel: PointerEvent,
      pointerdown: PointerEvent,
      pointerenter: PointerEvent,
      pointerleave: PointerEvent,
      pointermove: PointerEvent,
      pointerout: PointerEvent,
      pointerover: PointerEvent,
      pointerup: PointerEvent,
      popstate: PopStateEvent,
      progress: ProgressEvent[EventTarget],
      ratechange: Event,
      rejectionhandled: PromiseRejectionEvent,
      reset: Event,
      resize: UIEvent,
      scroll: Event,
      securitypolicyviolation: SecurityPolicyViolationEvent,
      seeked: Event,
      seeking: Event,
      select: Event,
      selectionchange: Event,
      selectstart: Event,
      slotchange: Event,
      stalled: Event,
      storage: StorageEvent,
      submit: SubmitEvent,
      suspend: Event,
      timeupdate: Event,
      toggle: Event,
      touchcancel: TouchEvent,
      touchend: TouchEvent,
      touchmove: TouchEvent,
      touchstart: TouchEvent,
      transitioncancel: TransitionEvent,
      transitionend: TransitionEvent,
      transitionrun: TransitionEvent,
      transitionstart: TransitionEvent,
      unhandledrejection: PromiseRejectionEvent,
      unload: Event,
      volumechange: Event,
      waiting: Event,
      webkitanimationend: Event,
      webkitanimationiteration: Event,
      webkitanimationstart: Event,
      webkittransitionend: Event,
      wheel: WheelEvent
    ): DomEventMap = {
      val __obj = js.Dynamic.literal(DOMContentLoaded = DOMContentLoaded.asInstanceOf[js.Any], abort = abort.asInstanceOf[js.Any], afterprint = afterprint.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], beforeprint = beforeprint.asInstanceOf[js.Any], beforeunload = beforeunload.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], devicemotion = devicemotion.asInstanceOf[js.Any], deviceorientation = deviceorientation.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gamepadconnected = gamepadconnected.asInstanceOf[js.Any], gamepaddisconnected = gamepaddisconnected.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], hashchange = hashchange.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], languagechange = languagechange.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], orientationchange = orientationchange.asInstanceOf[js.Any], pagehide = pagehide.asInstanceOf[js.Any], pageshow = pageshow.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], popstate = popstate.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], rejectionhandled = rejectionhandled.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], unhandledrejection = unhandledrejection.asInstanceOf[js.Any], unload = unload.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomEventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DomEventMap] (val x: Self) extends AnyVal {
      
      inline def setDOMContentLoaded(value: Event): Self = StObject.set(x, "DOMContentLoaded", value.asInstanceOf[js.Any])
      
      inline def setDevicemotion(value: DeviceMotionEvent): Self = StObject.set(x, "devicemotion", value.asInstanceOf[js.Any])
      
      inline def setDeviceorientation(value: DeviceOrientationEvent): Self = StObject.set(x, "deviceorientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationchange(value: Event): Self = StObject.set(x, "orientationchange", value.asInstanceOf[js.Any])
    }
  }
}
