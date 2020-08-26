package typings.chromeApps.WebView.Events

import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.DocumentAndElementEventHandlersEventMap
import typings.std.DragEvent
import typings.std.ElementEventMap
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.GlobalEventHandlersEventMap
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebViewElementEventMap
  extends ElementEventMap
     with GlobalEventHandlersEventMap
     with DocumentAndElementEventHandlersEventMap {
  @JSName("close")
  var close_WebViewElementEventMap: CloseEvent = js.native
  var consolemessage: ConsoleMessageEvent = js.native
  var contentload: ContentLoadEvent = js.native
  var dialog: DialogEvent = js.native
  var exit: ExitEvent = js.native
  var findupdate: FindUpdateEvent = js.native
  var loadabort: LoadAbortEvent = js.native
  var loadcommit: LoadCommitEvent = js.native
  var loadredirect: LoadRedirectEvent = js.native
  @JSName("loadstart")
  var loadstart_WebViewElementEventMap: LoadStartEvent = js.native
  var loadstop: LoadStopEvent = js.native
  var newwindow: NewWindowEvent = js.native
  var permissionrequest: PermissionRequestEvent = js.native
  var responsive: ResponsiveEvent = js.native
  var sizechanged: SizeChangedEvent = js.native
  var unresponsive: UnresponsiveEvent = js.native
  var zoomchange: ZoomChangeEvent = js.native
}

object WebViewElementEventMap {
  @scala.inline
  def apply(
    abort: UIEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    auxclick: MouseEvent,
    blur: FocusEvent,
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    change: Event,
    click: MouseEvent,
    close: CloseEvent,
    consolemessage: ConsoleMessageEvent,
    contentload: ContentLoadEvent,
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    cut: ClipboardEvent,
    dblclick: MouseEvent,
    dialog: DialogEvent,
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragexit: Event,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drop: DragEvent,
    durationchange: Event,
    emptied: Event,
    ended: Event,
    error: ErrorEvent,
    exit: ExitEvent,
    findupdate: FindUpdateEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    load: Event,
    loadabort: LoadAbortEvent,
    loadcommit: LoadCommitEvent,
    loadeddata: Event,
    loadedmetadata: Event,
    loadredirect: LoadRedirectEvent,
    loadstart: LoadStartEvent,
    loadstop: LoadStopEvent,
    lostpointercapture: PointerEvent,
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    newwindow: NewWindowEvent,
    paste: ClipboardEvent,
    pause: Event,
    permissionrequest: PermissionRequestEvent,
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
    progress: ProgressEvent[EventTarget],
    ratechange: Event,
    reset: Event,
    resize: UIEvent,
    responsive: ResponsiveEvent,
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionchange: Event,
    selectstart: Event,
    sizechanged: SizeChangedEvent,
    stalled: Event,
    submit: Event,
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
    unresponsive: UnresponsiveEvent,
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent,
    zoomchange: ZoomChangeEvent
  ): WebViewElementEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], consolemessage = consolemessage.asInstanceOf[js.Any], contentload = contentload.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], findupdate = findupdate.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadabort = loadabort.asInstanceOf[js.Any], loadcommit = loadcommit.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadredirect = loadredirect.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], loadstop = loadstop.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], newwindow = newwindow.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], permissionrequest = permissionrequest.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], responsive = responsive.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], sizechanged = sizechanged.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], unresponsive = unresponsive.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any], zoomchange = zoomchange.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewElementEventMap]
  }
  @scala.inline
  implicit class WebViewElementEventMapOps[Self <: WebViewElementEventMap] (val x: Self) extends AnyVal {
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
    def setClose(value: CloseEvent): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsolemessage(value: ConsoleMessageEvent): Self = this.set("consolemessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentload(value: ContentLoadEvent): Self = this.set("contentload", value.asInstanceOf[js.Any])
    @scala.inline
    def setDialog(value: DialogEvent): Self = this.set("dialog", value.asInstanceOf[js.Any])
    @scala.inline
    def setExit(value: ExitEvent): Self = this.set("exit", value.asInstanceOf[js.Any])
    @scala.inline
    def setFindupdate(value: FindUpdateEvent): Self = this.set("findupdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadabort(value: LoadAbortEvent): Self = this.set("loadabort", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadcommit(value: LoadCommitEvent): Self = this.set("loadcommit", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadredirect(value: LoadRedirectEvent): Self = this.set("loadredirect", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadstart(value: LoadStartEvent): Self = this.set("loadstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadstop(value: LoadStopEvent): Self = this.set("loadstop", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewwindow(value: NewWindowEvent): Self = this.set("newwindow", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissionrequest(value: PermissionRequestEvent): Self = this.set("permissionrequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponsive(value: ResponsiveEvent): Self = this.set("responsive", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizechanged(value: SizeChangedEvent): Self = this.set("sizechanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnresponsive(value: UnresponsiveEvent): Self = this.set("unresponsive", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomchange(value: ZoomChangeEvent): Self = this.set("zoomchange", value.asInstanceOf[js.Any])
  }
  
}

