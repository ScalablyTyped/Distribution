package typings.chromeApps.WebView

import typings.chromeApps.chrome.double
import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.filesystem_
import typings.chromeApps.chromeAppsStrings.fullscreen_
import typings.chromeApps.chromeAppsStrings.normal_
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CompositionEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.FormDataEvent
import typings.std.HTMLElementEventMap
import typings.std.InputEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.SubmitEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * WebView Events are different from Chrome Events, they extend the normal DOM Events.
  */
object Events {
  
  /**
    * Fired when the guest window attempts to close itself.
    * The following example code navigates the webview to about:blank when the guest attempts to close itself.
    */
  type CloseEvent = Event
  
  /**
    * Fired when the guest window logs a console message.
    * The following example code forwards all log messages to the embedder's console without regard for log level or other properties.
    */
  @js.native
  trait ConsoleMessageEvent
    extends StObject
       with Event {
    
    /**
      * The severity level of the log message.
      * Ranges from -1 to 2.
      * LOG_VERBOSE (console.debug) = -1
      * LOG_INFO (console.log, console.info) = 0
      * LOG_WARNING (console.warn) = 1
      * LOG_ERROR (console.error) = 2
      */
    var level: ConsoleMessageLevel = js.native
    
    /** The line number of the message source. */
    var line: integer = js.native
    
    /** The logged message contents. */
    var message: String = js.native
    
    /** A string identifying the resource which logged the message. */
    var sourceId: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsInts.`-1`
    - typings.chromeApps.chromeAppsInts.`0`
    - typings.chromeApps.chromeAppsInts.`1`
    - typings.chromeApps.chromeAppsInts.`2`
  */
  trait ConsoleMessageLevel extends StObject
  object ConsoleMessageLevel {
    
    inline def `-1`: typings.chromeApps.chromeAppsInts.`-1` = -1.asInstanceOf[typings.chromeApps.chromeAppsInts.`-1`]
    
    inline def `0`: typings.chromeApps.chromeAppsInts.`0` = 0.asInstanceOf[typings.chromeApps.chromeAppsInts.`0`]
    
    inline def `1`: typings.chromeApps.chromeAppsInts.`1` = 1.asInstanceOf[typings.chromeApps.chromeAppsInts.`1`]
    
    inline def `2`: typings.chromeApps.chromeAppsInts.`2` = 2.asInstanceOf[typings.chromeApps.chromeAppsInts.`2`]
  }
  
  /**
    * Fired when the guest window fires a load event, i.e., when a new document is loaded. This does not include page navigation within the current document or asynchronous resource loads.
    * The following example code modifies the default font size of the guest's body element after the page loads:
    * @example
    * webview.addEventListener('contentload', function() {
    *  webview.executeScript({ code: 'document.body.style.fontSize = '42px'' })
    * });
    */
  type ContentLoadEvent = Event
  
  /**
    * Fired when the guest window attempts to open a modal dialog via window.alert, window.confirm, or window.prompt.
    * Handling this event will block the guest process until each event listener returns or the dialog object becomes unreachable (if preventDefault() was called.)
    * The default behavior is to cancel the dialog.
    */
  @js.native
  trait DialogEvent
    extends StObject
       with Event {
    
    /**
      * An interface that can be used to respond to the guest's modal request.
      */
    var dialog: DialogController = js.native
    
    /**
      * The text the guest attempted to display in the modal dialog.
      */
    var messageText: String = js.native
    
    /**
      * The type of modal dialog requested by the guest.
      */
    var messageType: DialogMessageType = js.native
  }
  
  /**
    * The type of modal dialog requested by the guest.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.alert
    - typings.chromeApps.chromeAppsStrings.confirm
    - typings.chromeApps.chromeAppsStrings.prompt
  */
  trait DialogMessageType extends StObject
  object DialogMessageType {
    
    inline def alert: typings.chromeApps.chromeAppsStrings.alert = "alert".asInstanceOf[typings.chromeApps.chromeAppsStrings.alert]
    
    inline def confirm: typings.chromeApps.chromeAppsStrings.confirm = "confirm".asInstanceOf[typings.chromeApps.chromeAppsStrings.confirm]
    
    inline def prompt: typings.chromeApps.chromeAppsStrings.prompt = "prompt".asInstanceOf[typings.chromeApps.chromeAppsStrings.prompt]
  }
  
  /**
    * Fired when the process rendering the guest web content has exited.
    */
  @js.native
  trait ExitEvent
    extends StObject
       with Event {
    
    /** Chrome's internal ID of the process that exited. */
    var processID: integer = js.native
    
    /** String indicating the reason for the exit. */
    var reason: ExitEventReason = js.native
  }
  
  /**
    * String indicating the reason for the exit.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.normal_
    - typings.chromeApps.chromeAppsStrings.abnormal
    - typings.chromeApps.chromeAppsStrings.crash
    - typings.chromeApps.chromeAppsStrings.kill
  */
  trait ExitEventReason extends StObject
  object ExitEventReason {
    
    inline def abnormal: typings.chromeApps.chromeAppsStrings.abnormal = "abnormal".asInstanceOf[typings.chromeApps.chromeAppsStrings.abnormal]
    
    inline def crash: typings.chromeApps.chromeAppsStrings.crash = "crash".asInstanceOf[typings.chromeApps.chromeAppsStrings.crash]
    
    inline def kill: typings.chromeApps.chromeAppsStrings.kill = "kill".asInstanceOf[typings.chromeApps.chromeAppsStrings.kill]
    
    inline def normal: normal_ = "normal".asInstanceOf[normal_]
  }
  
  /**
    * Fired when new find results are available for an active find request.
    * This might happen multiple times for a single find request as matches are found.
    */
  @js.native
  trait FindUpdateEvent
    extends StObject
       with Event {
    
    /**
      * The ordinal number of the current active match,
      * if it has been found. This will be 0 until then.
      */
    var activeMatchOrdinal: integer = js.native
    
    /**
      * Indicates whether the find request was canceled.
      */
    var canceled: Boolean = js.native
    
    /**
      * Indicates that all find requests have completed
      * and that no more findupdate events will be fired
      * until more find requests are made.
      */
    var finalUpdate: String = js.native
    
    /**
      * The number of matches found for searchText on the page so far.
      */
    var numberOfMatches: integer = js.native
    
    /**
      * The string that is being searched for in the page.
      */
    var searchText: String = js.native
    
    /**
      * Describes a rectangle around the active match,
      * if it has been found, in screen coordinates.
      */
    var selectionRect: SelectionRect = js.native
  }
  
  /**
    * Fired when a top-level load has aborted without committing.
    * An error message will be printed to the console unless the event is default-prevented.
    *
    * **Note:**
    * When a resource load is aborted, a loadabort event will eventually be followed by a loadstop event,
    * even if all committed loads since the last loadstop event (if any) were aborted.
    *
    * **Note:**
    * When the load of either an about URL or a JavaScript URL is aborted,
    * loadabort will be fired and then the webview will be navigated to 'about:blank'.
    */
  @js.native
  trait LoadAbortEvent
    extends StObject
       with Event {
    
    /**
      * Unique chrome.integer ID for the type of abort.
      * Note that this ID is `not` guaranteed to
      * remain backwards compatible between releases.
      * You must not act based upon this specific chrome.integer.
      */
    var code: integer = js.native
    
    /** Whether the load was top-level or in a subframe. */
    var isTopLevel: Boolean = js.native
    
    /**
      * String indicating what type of abort occurred.
      * This string is `not` guaranteed to remain
      * backwards compatible between releases.
      * You must not parse and act based upon its content.
      * It is also possible that, in some cases,
      * an error not listed here could be reported.
      */
    var reason: LoadAbortReason = js.native
    
    /** Requested URL. */
    var url: String = js.native
  }
  
  /**
    * String indicating what type of abort occurred.
    * This string is *not* guaranteed to remain backwards compatible between releases.
    * You must not parse and act based upon its content. It is also possible that,
    * in some cases, an error not listed here could be reported.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.ERR_ABORTED
    - typings.chromeApps.chromeAppsStrings.ERR_INVALID_URL
    - typings.chromeApps.chromeAppsStrings.ERR_DISALLOWED_URL_SCHEME
    - typings.chromeApps.chromeAppsStrings.ERR_BLOCKED_BY_CLIENT
    - typings.chromeApps.chromeAppsStrings.ERR_ADDRESS_UNREACHABLE
    - typings.chromeApps.chromeAppsStrings.ERR_EMPTY_RESPONSE
    - typings.chromeApps.chromeAppsStrings.ERR_FILE_NOT_FOUND
    - typings.chromeApps.chromeAppsStrings.ERR_UNKNOWN_URL_SCHEME
  */
  trait LoadAbortReason extends StObject
  object LoadAbortReason {
    
    inline def ERR_ABORTED: typings.chromeApps.chromeAppsStrings.ERR_ABORTED = "ERR_ABORTED".asInstanceOf[typings.chromeApps.chromeAppsStrings.ERR_ABORTED]
    
    inline def ERR_ADDRESS_UNREACHABLE: typings.chromeApps.chromeAppsStrings.ERR_ADDRESS_UNREACHABLE = "ERR_ADDRESS_UNREACHABLE".asInstanceOf[typings.chromeApps.chromeAppsStrings.ERR_ADDRESS_UNREACHABLE]
    
    inline def ERR_BLOCKED_BY_CLIENT: typings.chromeApps.chromeAppsStrings.ERR_BLOCKED_BY_CLIENT = "ERR_BLOCKED_BY_CLIENT".asInstanceOf[typings.chromeApps.chromeAppsStrings.ERR_BLOCKED_BY_CLIENT]
    
    inline def ERR_DISALLOWED_URL_SCHEME: typings.chromeApps.chromeAppsStrings.ERR_DISALLOWED_URL_SCHEME = "ERR_DISALLOWED_URL_SCHEME".asInstanceOf[typings.chromeApps.chromeAppsStrings.ERR_DISALLOWED_URL_SCHEME]
    
    inline def ERR_EMPTY_RESPONSE: typings.chromeApps.chromeAppsStrings.ERR_EMPTY_RESPONSE = "ERR_EMPTY_RESPONSE".asInstanceOf[typings.chromeApps.chromeAppsStrings.ERR_EMPTY_RESPONSE]
    
    inline def ERR_FILE_NOT_FOUND: typings.chromeApps.chromeAppsStrings.ERR_FILE_NOT_FOUND = "ERR_FILE_NOT_FOUND".asInstanceOf[typings.chromeApps.chromeAppsStrings.ERR_FILE_NOT_FOUND]
    
    inline def ERR_INVALID_URL: typings.chromeApps.chromeAppsStrings.ERR_INVALID_URL = "ERR_INVALID_URL".asInstanceOf[typings.chromeApps.chromeAppsStrings.ERR_INVALID_URL]
    
    inline def ERR_UNKNOWN_URL_SCHEME: typings.chromeApps.chromeAppsStrings.ERR_UNKNOWN_URL_SCHEME = "ERR_UNKNOWN_URL_SCHEME".asInstanceOf[typings.chromeApps.chromeAppsStrings.ERR_UNKNOWN_URL_SCHEME]
  }
  
  /**
    * Fired when a load has committed. This includes navigation within the current document as well as subframe document-level loads, but does not include asynchronous resource loads.
    */
  @js.native
  trait LoadCommitEvent
    extends StObject
       with Event {
    
    /** Whether the load is top-level or in a subframe. */
    var isTopLevel: Boolean = js.native
    
    /** The URL that committed. */
    var url: String = js.native
  }
  
  /**
    * Fired when a top-level load request has redirected to a different URL.
    */
  trait LoadRedirectEvent extends StObject {
    
    /** Whether or not the redirect happened at top-level or in a subframe. */
    var isTopLevel: Boolean
    
    /** The new URL after the redirect. */
    var newUrl: String
    
    /** The requested URL before the redirect. */
    var oldUrl: String
  }
  object LoadRedirectEvent {
    
    inline def apply(isTopLevel: Boolean, newUrl: String, oldUrl: String): LoadRedirectEvent = {
      val __obj = js.Dynamic.literal(isTopLevel = isTopLevel.asInstanceOf[js.Any], newUrl = newUrl.asInstanceOf[js.Any], oldUrl = oldUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadRedirectEvent]
    }
    
    extension [Self <: LoadRedirectEvent](x: Self) {
      
      inline def setIsTopLevel(value: Boolean): Self = StObject.set(x, "isTopLevel", value.asInstanceOf[js.Any])
      
      inline def setNewUrl(value: String): Self = StObject.set(x, "newUrl", value.asInstanceOf[js.Any])
      
      inline def setOldUrl(value: String): Self = StObject.set(x, "oldUrl", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Fired when a load has begun.
    */
  @js.native
  trait LoadStartEvent
    extends StObject
       with Event {
    
    /** Whether the load is top-level or in a subframe. */
    var isTopLevel: Boolean = js.native
    
    /** Requested URL. */
    var url: String = js.native
  }
  
  /**
    * Fired when all frame-level loads in a guest page (including all its subframes) have completed.
    * This includes navigation within the current document as well as subframe document-level loads,
    * but does not include asynchronous resource loads.
    *
    * This event fires every time the number of document-level loads transitions from one (or more) to zero.
    * For example, if a page that has already finished loading (i.e., loadstop already fired once) creates
    * a new iframe which loads a page, then a second loadstop will fire when the iframe page load completes.
    *
    * This pattern is commonly observed on pages that load ads.
    *
    * **Note:**
    * When a committed load is aborted, a loadstop event will eventually follow a loadabort event,
    * even if all committed loads since the last loadstop event (if any) were aborted.
    */
  type LoadStopEvent = Event
  
  /**
    * Fired when the guest page attempts to open a new browser window.
    * The following example code will create and navigate a new webview in the embedder for each requested new window:
    * @example
    * webview.addEventListener('newwindow', function(e) {
    *  const newWebview = document.createElement('webview');
    *  document.body.appendChild(newWebview);
    *  e.window.attach(newWebview);
    * });
    */
  @js.native
  trait NewWindowEvent
    extends StObject
       with Event {
    
    /** The initial height requested for the new window. */
    var initialHeight: integer = js.native
    
    /** The initial width requested for the new window. */
    var initialWidth: integer = js.native
    
    /** The requested name of the new window. */
    var name: String = js.native
    
    /** The target URL requested for the new window. */
    var targetUrl: String = js.native
    
    /**
      * An interface that can be used to either attach the requested
      * target page to an existing webview element or explicitly
      * discard the request.
      **/
    var window: NewWindow = js.native
    
    /** The requested disposition of the new window. */
    var windowOpenDisposition: WindowOpenDisposition = js.native
  }
  
  /**
    * @requires `Permissions:` `audioCapture` and/or `videoCapture`
    * @description
    *
    * Fired when the guest page needs to request special permission from the embedder.
    *
    * The following example code will grant the guest page access to the `webkitGetUserMedia` API.
    * Note that an app using this example code must itself specify `audioCapture` and/or `videoCapture`
    * manifest permissions:
    *
    * @example
    * webview.addEventListener('permissionrequest', (e) => { if (e.permission === 'media') e.request.allow(); });
    */
  @js.native
  trait PermissionRequestEvent
    extends StObject
       with Event {
    
    /** The type of permission being requested. */
    var permission: RequestedPermission = js.native
    
    /** An object which holds details of the requested permission.*/
    var request: PermissionRequestHandler = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.media
    - typings.chromeApps.chromeAppsStrings.geolocation
    - typings.chromeApps.chromeAppsStrings.pointerLock
    - typings.chromeApps.chromeAppsStrings.download
    - typings.chromeApps.chromeAppsStrings.loadplugin
    - typings.chromeApps.chromeAppsStrings.filesystem_
    - typings.chromeApps.chromeAppsStrings.fullscreen_
  */
  trait RequestedPermission extends StObject
  object RequestedPermission {
    
    inline def download: typings.chromeApps.chromeAppsStrings.download = "download".asInstanceOf[typings.chromeApps.chromeAppsStrings.download]
    
    inline def filesystem: filesystem_ = "filesystem".asInstanceOf[filesystem_]
    
    inline def fullscreen: fullscreen_ = "fullscreen".asInstanceOf[fullscreen_]
    
    inline def geolocation: typings.chromeApps.chromeAppsStrings.geolocation = "geolocation".asInstanceOf[typings.chromeApps.chromeAppsStrings.geolocation]
    
    inline def loadplugin: typings.chromeApps.chromeAppsStrings.loadplugin = "loadplugin".asInstanceOf[typings.chromeApps.chromeAppsStrings.loadplugin]
    
    inline def media: typings.chromeApps.chromeAppsStrings.media = "media".asInstanceOf[typings.chromeApps.chromeAppsStrings.media]
    
    inline def pointerLock: typings.chromeApps.chromeAppsStrings.pointerLock = "pointerLock".asInstanceOf[typings.chromeApps.chromeAppsStrings.pointerLock]
  }
  
  /**
    * Fired when the process rendering the guest web content has become responsive again
    * after being unresponsive.
    *
    * The following example code will fade the `webview` element in or out as it becomes
    * responsive or unresponsive:
    *
    * @example
    * webview.style.webkitTransition = 'opacity 250ms';
    * webview.addEventListener('unresponsive', () => {
    *     webview.style.opacity = '0.5';
    * });
    * webview.addEventListener('responsive', () => {
    *     webview.style.opacity = '1';
    * });
    */
  @js.native
  trait ResponsiveEvent
    extends StObject
       with Event {
    
    /** Chrome's internal ID of the process that became responsive. */
    var processID: integer = js.native
  }
  
  /**
    * Fired when the embedded web content has been resized via autosize.
    * Only fires if autosize is enabled.
    */
  @js.native
  trait SizeChangedEvent
    extends StObject
       with Event {
    
    /** New height of embedded web content. */
    var newHeight: integer = js.native
    
    /** New width of embedded web content. */
    var newWidth: integer = js.native
    
    /** Old height of embedded web content. */
    var oldHeight: integer = js.native
    
    /** Old width of embedded web content. */
    var oldWidth: integer = js.native
  }
  
  /**
    * Fired when the process rendering the guest web content has become unresponsive.
    * This event will be generated once with a matching responsive event if the guest begins to respond again.
    */
  @js.native
  trait UnresponsiveEvent
    extends StObject
       with Event {
    
    /** Chrome's internal ID of the process that has become unresponsive. */
    var processID: integer = js.native
  }
  
  trait WebViewElementEventMap
    extends StObject
       with HTMLElementEventMap {
    
    @JSName("close")
    var close_WebViewElementEventMap: CloseEvent
    
    var consolemessage: ConsoleMessageEvent
    
    var contentload: ContentLoadEvent
    
    var dialog: DialogEvent
    
    var exit: ExitEvent
    
    var findupdate: FindUpdateEvent
    
    var loadabort: LoadAbortEvent
    
    var loadcommit: LoadCommitEvent
    
    var loadredirect: LoadRedirectEvent
    
    @JSName("loadstart")
    var loadstart_WebViewElementEventMap: LoadStartEvent
    
    var loadstop: LoadStopEvent
    
    var newwindow: NewWindowEvent
    
    var permissionrequest: PermissionRequestEvent
    
    var responsive: ResponsiveEvent
    
    var sizechanged: SizeChangedEvent
    
    var unresponsive: UnresponsiveEvent
    
    var zoomchange: ZoomChangeEvent
  }
  object WebViewElementEventMap {
    
    inline def apply(
      abort: UIEvent,
      animationcancel: AnimationEvent,
      animationend: AnimationEvent,
      animationiteration: AnimationEvent,
      animationstart: AnimationEvent,
      auxclick: MouseEvent,
      beforeinput: InputEvent,
      blur: FocusEvent,
      canplay: Event,
      canplaythrough: Event,
      change: Event,
      click: MouseEvent,
      close: CloseEvent,
      compositionend: CompositionEvent,
      compositionstart: CompositionEvent,
      compositionupdate: CompositionEvent,
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
      formdata: FormDataEvent,
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
      slotchange: Event,
      stalled: Event,
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
      unresponsive: UnresponsiveEvent,
      volumechange: Event,
      waiting: Event,
      webkitanimationend: Event,
      webkitanimationiteration: Event,
      webkitanimationstart: Event,
      webkittransitionend: Event,
      wheel: WheelEvent,
      zoomchange: ZoomChangeEvent
    ): WebViewElementEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], consolemessage = consolemessage.asInstanceOf[js.Any], contentload = contentload.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], findupdate = findupdate.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadabort = loadabort.asInstanceOf[js.Any], loadcommit = loadcommit.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadredirect = loadredirect.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], loadstop = loadstop.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], newwindow = newwindow.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], permissionrequest = permissionrequest.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], responsive = responsive.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], sizechanged = sizechanged.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], unresponsive = unresponsive.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any], zoomchange = zoomchange.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebViewElementEventMap]
    }
    
    extension [Self <: WebViewElementEventMap](x: Self) {
      
      inline def setClose(value: CloseEvent): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setConsolemessage(value: ConsoleMessageEvent): Self = StObject.set(x, "consolemessage", value.asInstanceOf[js.Any])
      
      inline def setContentload(value: ContentLoadEvent): Self = StObject.set(x, "contentload", value.asInstanceOf[js.Any])
      
      inline def setDialog(value: DialogEvent): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
      
      inline def setExit(value: ExitEvent): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setFindupdate(value: FindUpdateEvent): Self = StObject.set(x, "findupdate", value.asInstanceOf[js.Any])
      
      inline def setLoadabort(value: LoadAbortEvent): Self = StObject.set(x, "loadabort", value.asInstanceOf[js.Any])
      
      inline def setLoadcommit(value: LoadCommitEvent): Self = StObject.set(x, "loadcommit", value.asInstanceOf[js.Any])
      
      inline def setLoadredirect(value: LoadRedirectEvent): Self = StObject.set(x, "loadredirect", value.asInstanceOf[js.Any])
      
      inline def setLoadstart(value: LoadStartEvent): Self = StObject.set(x, "loadstart", value.asInstanceOf[js.Any])
      
      inline def setLoadstop(value: LoadStopEvent): Self = StObject.set(x, "loadstop", value.asInstanceOf[js.Any])
      
      inline def setNewwindow(value: NewWindowEvent): Self = StObject.set(x, "newwindow", value.asInstanceOf[js.Any])
      
      inline def setPermissionrequest(value: PermissionRequestEvent): Self = StObject.set(x, "permissionrequest", value.asInstanceOf[js.Any])
      
      inline def setResponsive(value: ResponsiveEvent): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      inline def setSizechanged(value: SizeChangedEvent): Self = StObject.set(x, "sizechanged", value.asInstanceOf[js.Any])
      
      inline def setUnresponsive(value: UnresponsiveEvent): Self = StObject.set(x, "unresponsive", value.asInstanceOf[js.Any])
      
      inline def setZoomchange(value: ZoomChangeEvent): Self = StObject.set(x, "zoomchange", value.asInstanceOf[js.Any])
    }
  }
  
  /** The requested disposition of the new window. */
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.ignore
    - typings.chromeApps.chromeAppsStrings.save_to_disk
    - typings.chromeApps.chromeAppsStrings.current_tab
    - typings.chromeApps.chromeAppsStrings.new_background_tab
    - typings.chromeApps.chromeAppsStrings.new_foreground_tab
    - typings.chromeApps.chromeAppsStrings.new_window
    - typings.chromeApps.chromeAppsStrings.new_popup
  */
  trait WindowOpenDisposition extends StObject
  object WindowOpenDisposition {
    
    inline def current_tab: typings.chromeApps.chromeAppsStrings.current_tab = "current_tab".asInstanceOf[typings.chromeApps.chromeAppsStrings.current_tab]
    
    inline def ignore: typings.chromeApps.chromeAppsStrings.ignore = "ignore".asInstanceOf[typings.chromeApps.chromeAppsStrings.ignore]
    
    inline def new_background_tab: typings.chromeApps.chromeAppsStrings.new_background_tab = "new_background_tab".asInstanceOf[typings.chromeApps.chromeAppsStrings.new_background_tab]
    
    inline def new_foreground_tab: typings.chromeApps.chromeAppsStrings.new_foreground_tab = "new_foreground_tab".asInstanceOf[typings.chromeApps.chromeAppsStrings.new_foreground_tab]
    
    inline def new_popup: typings.chromeApps.chromeAppsStrings.new_popup = "new_popup".asInstanceOf[typings.chromeApps.chromeAppsStrings.new_popup]
    
    inline def new_window: typings.chromeApps.chromeAppsStrings.new_window = "new_window".asInstanceOf[typings.chromeApps.chromeAppsStrings.new_window]
    
    inline def save_to_disk: typings.chromeApps.chromeAppsStrings.save_to_disk = "save_to_disk".asInstanceOf[typings.chromeApps.chromeAppsStrings.save_to_disk]
  }
  
  /** Fired when the page's zoom changes. */
  @js.native
  trait ZoomChangeEvent
    extends StObject
       with Event {
    
    /** The new zoom factor that the page was zoomed to. */
    var newzoomFactor: double = js.native
    
    /** The page's previous zoom factor. */
    var oldzoomFactor: double = js.native
  }
}
