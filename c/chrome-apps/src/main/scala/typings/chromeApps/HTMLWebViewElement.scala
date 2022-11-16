package typings.chromeApps

import typings.chromeApps.WebView.ClearDataOptions
import typings.chromeApps.WebView.ClearDataTypeSet
import typings.chromeApps.WebView.ContentScriptDetails
import typings.chromeApps.WebView.ContentWindow
import typings.chromeApps.WebView.ContextMenus
import typings.chromeApps.WebView.Events.CloseEvent
import typings.chromeApps.WebView.Events.ConsoleMessageEvent
import typings.chromeApps.WebView.Events.ContentLoadEvent
import typings.chromeApps.WebView.Events.DialogEvent
import typings.chromeApps.WebView.Events.ExitEvent
import typings.chromeApps.WebView.Events.FindUpdateEvent
import typings.chromeApps.WebView.Events.LoadAbortEvent
import typings.chromeApps.WebView.Events.LoadCommitEvent
import typings.chromeApps.WebView.Events.LoadRedirectEvent
import typings.chromeApps.WebView.Events.LoadStartEvent
import typings.chromeApps.WebView.Events.LoadStopEvent
import typings.chromeApps.WebView.Events.NewWindowEvent
import typings.chromeApps.WebView.Events.PermissionRequestEvent
import typings.chromeApps.WebView.Events.ResponsiveEvent
import typings.chromeApps.WebView.Events.SizeChangedEvent
import typings.chromeApps.WebView.Events.UnresponsiveEvent
import typings.chromeApps.WebView.Events.ZoomChangeEvent
import typings.chromeApps.WebView.FindCallbackResults
import typings.chromeApps.WebView.FindOptions
import typings.chromeApps.WebView.InjectDetails
import typings.chromeApps.WebView.WebRequestEventInterface
import typings.chromeApps.WebView.ZoomMode
import typings.chromeApps.chrome.double
import typings.chromeApps.chrome.extensionTypes.ImageDetails
import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.abort_
import typings.chromeApps.chromeAppsStrings.activate
import typings.chromeApps.chromeAppsStrings.animationcancel
import typings.chromeApps.chromeAppsStrings.animationend
import typings.chromeApps.chromeAppsStrings.animationiteration
import typings.chromeApps.chromeAppsStrings.animationstart
import typings.chromeApps.chromeAppsStrings.auxclick
import typings.chromeApps.chromeAppsStrings.beforeinput
import typings.chromeApps.chromeAppsStrings.blur
import typings.chromeApps.chromeAppsStrings.cancel
import typings.chromeApps.chromeAppsStrings.canplay
import typings.chromeApps.chromeAppsStrings.canplaythrough
import typings.chromeApps.chromeAppsStrings.change
import typings.chromeApps.chromeAppsStrings.clear
import typings.chromeApps.chromeAppsStrings.click
import typings.chromeApps.chromeAppsStrings.close
import typings.chromeApps.chromeAppsStrings.compositionend
import typings.chromeApps.chromeAppsStrings.compositionstart
import typings.chromeApps.chromeAppsStrings.compositionupdate
import typings.chromeApps.chromeAppsStrings.consolemessage
import typings.chromeApps.chromeAppsStrings.contentload
import typings.chromeApps.chromeAppsStrings.contextmenu
import typings.chromeApps.chromeAppsStrings.copy
import typings.chromeApps.chromeAppsStrings.cuechange
import typings.chromeApps.chromeAppsStrings.cut
import typings.chromeApps.chromeAppsStrings.dblclick
import typings.chromeApps.chromeAppsStrings.dialog
import typings.chromeApps.chromeAppsStrings.drag
import typings.chromeApps.chromeAppsStrings.dragend
import typings.chromeApps.chromeAppsStrings.dragenter
import typings.chromeApps.chromeAppsStrings.dragleave
import typings.chromeApps.chromeAppsStrings.dragover
import typings.chromeApps.chromeAppsStrings.dragstart
import typings.chromeApps.chromeAppsStrings.drop
import typings.chromeApps.chromeAppsStrings.durationchange
import typings.chromeApps.chromeAppsStrings.emptied
import typings.chromeApps.chromeAppsStrings.ended
import typings.chromeApps.chromeAppsStrings.error_
import typings.chromeApps.chromeAppsStrings.exit
import typings.chromeApps.chromeAppsStrings.findupdate
import typings.chromeApps.chromeAppsStrings.focus
import typings.chromeApps.chromeAppsStrings.focusin
import typings.chromeApps.chromeAppsStrings.focusout
import typings.chromeApps.chromeAppsStrings.formdata
import typings.chromeApps.chromeAppsStrings.fullscreenchange
import typings.chromeApps.chromeAppsStrings.fullscreenerror
import typings.chromeApps.chromeAppsStrings.gotpointercapture
import typings.chromeApps.chromeAppsStrings.input_
import typings.chromeApps.chromeAppsStrings.invalid
import typings.chromeApps.chromeAppsStrings.keep
import typings.chromeApps.chromeAppsStrings.keydown
import typings.chromeApps.chromeAppsStrings.keypress
import typings.chromeApps.chromeAppsStrings.keyup
import typings.chromeApps.chromeAppsStrings.load
import typings.chromeApps.chromeAppsStrings.loadabort
import typings.chromeApps.chromeAppsStrings.loadcommit
import typings.chromeApps.chromeAppsStrings.loadeddata
import typings.chromeApps.chromeAppsStrings.loadedmetadata
import typings.chromeApps.chromeAppsStrings.loadredirect
import typings.chromeApps.chromeAppsStrings.loadstart
import typings.chromeApps.chromeAppsStrings.loadstop
import typings.chromeApps.chromeAppsStrings.lostpointercapture
import typings.chromeApps.chromeAppsStrings.mousedown
import typings.chromeApps.chromeAppsStrings.mouseenter
import typings.chromeApps.chromeAppsStrings.mouseleave
import typings.chromeApps.chromeAppsStrings.mousemove
import typings.chromeApps.chromeAppsStrings.mouseout
import typings.chromeApps.chromeAppsStrings.mouseover
import typings.chromeApps.chromeAppsStrings.mouseup
import typings.chromeApps.chromeAppsStrings.newwindow
import typings.chromeApps.chromeAppsStrings.on
import typings.chromeApps.chromeAppsStrings.paste
import typings.chromeApps.chromeAppsStrings.pause
import typings.chromeApps.chromeAppsStrings.permissionrequest
import typings.chromeApps.chromeAppsStrings.play
import typings.chromeApps.chromeAppsStrings.playing
import typings.chromeApps.chromeAppsStrings.pointercancel
import typings.chromeApps.chromeAppsStrings.pointerdown
import typings.chromeApps.chromeAppsStrings.pointerenter
import typings.chromeApps.chromeAppsStrings.pointerleave
import typings.chromeApps.chromeAppsStrings.pointermove
import typings.chromeApps.chromeAppsStrings.pointerout
import typings.chromeApps.chromeAppsStrings.pointerover
import typings.chromeApps.chromeAppsStrings.pointerup
import typings.chromeApps.chromeAppsStrings.progress_
import typings.chromeApps.chromeAppsStrings.ratechange
import typings.chromeApps.chromeAppsStrings.reset
import typings.chromeApps.chromeAppsStrings.resize
import typings.chromeApps.chromeAppsStrings.responsive
import typings.chromeApps.chromeAppsStrings.scroll
import typings.chromeApps.chromeAppsStrings.securitypolicyviolation
import typings.chromeApps.chromeAppsStrings.seeked
import typings.chromeApps.chromeAppsStrings.seeking
import typings.chromeApps.chromeAppsStrings.select
import typings.chromeApps.chromeAppsStrings.selectionchange
import typings.chromeApps.chromeAppsStrings.selectstart
import typings.chromeApps.chromeAppsStrings.sizechanged
import typings.chromeApps.chromeAppsStrings.slotchange
import typings.chromeApps.chromeAppsStrings.stalled
import typings.chromeApps.chromeAppsStrings.submit
import typings.chromeApps.chromeAppsStrings.suspend_
import typings.chromeApps.chromeAppsStrings.timeupdate
import typings.chromeApps.chromeAppsStrings.toggle
import typings.chromeApps.chromeAppsStrings.touchcancel
import typings.chromeApps.chromeAppsStrings.touchend
import typings.chromeApps.chromeAppsStrings.touchmove
import typings.chromeApps.chromeAppsStrings.touchstart
import typings.chromeApps.chromeAppsStrings.transitioncancel
import typings.chromeApps.chromeAppsStrings.transitionend
import typings.chromeApps.chromeAppsStrings.transitionrun
import typings.chromeApps.chromeAppsStrings.transitionstart
import typings.chromeApps.chromeAppsStrings.unresponsive
import typings.chromeApps.chromeAppsStrings.volumechange
import typings.chromeApps.chromeAppsStrings.waiting
import typings.chromeApps.chromeAppsStrings.webkitanimationend
import typings.chromeApps.chromeAppsStrings.webkitanimationiteration
import typings.chromeApps.chromeAppsStrings.webkitanimationstart
import typings.chromeApps.chromeAppsStrings.webkittransitionend
import typings.chromeApps.chromeAppsStrings.wheel
import typings.chromeApps.chromeAppsStrings.zoomchange
import typings.std.AddEventListenerOptions
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CompositionEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventListenerOptions
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.FormDataEvent
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

// Type definitions for Chrome packaged application development
// Project: http://developer.chrome.com/apps/
// Definitions by: Nikolai Ommundsen <https://github.com/niikoo>, Adam Lay <https://github.com/AdamLay>, MIZUNE Pine <https://github.com/pine613>, MIZUSHIMA Junki <https://github.com/mzsm>, Ingconst Stepanyan <https://github.com/RReverser>, Adam Pyle <https://github.com/pyle>, Matthew Kimber <https://github.com/matthewkimber>, otiai10 <https://github.com/otiai10>, couven92 <https://github.com/couven92>, RReverser <https://github.com/rreverser>, sreimer15 <https://github.com/sreimer15>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.8
/////////////////
// Webview Tag //
/////////////////
/**
  * Use the webview tag to actively load live content from the web over the network and embed it in your Chrome App.
  * Your app can control the appearance of the *webview* and interact with the web content, initiate navigations in
  * an embedded web page, react to error events that happen within it.
  */
@js.native
trait HTMLWebViewElement
  extends StObject
     with HTMLElement {
  
  /**
    * Adds content script injection rules to the webview.
    * When the webview navigates to a page matching one or more rules, the associated scripts will be injected.
    * You can programmatically add rules or update existing rules.
    * The following example adds two rules to the webview: 'myRule' and 'anotherRule'.
    * @example
    * webview.addContentScripts([
    * {
    *    name: 'myRule',
    *    matches: ['http://www.foo.com/ *'],
    *    css: { files: ['mystyles.css'] },
    *    js: { files: ['jquery.js', 'myscript.js'] },
    *    run_at: 'document_start'
    *  },
    *  {
    *    name: 'anotherRule',
    *    matches: ['http://www.bar.com/ *'],
    *    js: { code: 'document.body.style.backgroundColor = 'red';' },
    *    run_at: 'document_end'
    *  }]);
    * ...
    * // Navigates webview.
    * webview.src = 'http://www.foo.com';
    *
    * @description
    * You can defer addContentScripts call until you needs to inject scripts.
    * The following example shows how to overwrite an existing rule.
    * @example
    * webview.addContentScripts([{
    *    name: 'rule',
    *    matches: ['http://www.foo.com/ *'],
    *    js: { files: ['scriptA.js'] },
    *    run_at: 'document_start'}]);
    *
    * // Do something.
    * webview.src = 'http://www.foo.com/ *';
    * ...
    * // Overwrite 'rule' defined before.
    * webview.addContentScripts([{
    *   name: 'rule',
    *   matches: ['http://www.bar.com/ *'],
    *   js: { files: ['scriptB.js'] },
    *   run_at: 'document_end'}]);
    * @description
    * If webview has been naviagted to the origin (e.g., foo.com) and
    * calls webview.addContentScripts to add 'myRule',
    * you need to wait for next navigation to make the scripts injected.
    * If you want immediate injection, executeScript will do the right thing.
    * Rules are preserved even if the guest process crashes
    * or is killed or even if the webview is reparented.
    * Refer to the /extensions/content_scripts documentation for more details.
    * @param contentScriptList Details of the content scripts to add.
    * @since Chrome 44.
    */
  def addContentScripts(contentScriptList: js.Array[ContentScriptDetails]): Unit = js.native
  
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort_, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(`type`: auxclick, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeinput(`type`: beforeinput, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ InputEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeinput(
    `type`: beforeinput,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ InputEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeinput(
    `type`: beforeinput,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ InputEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(`type`: blur, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(`type`: cancel, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(`type`: canplay, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(`type`: canplaythrough, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(`type`: click, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CloseEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CloseEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CloseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionend(
    `type`: compositionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionend(
    `type`: compositionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionend(
    `type`: compositionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionstart(
    `type`: compositionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionstart(
    `type`: compositionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionstart(
    `type`: compositionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionupdate(
    `type`: compositionupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionupdate(
    `type`: compositionupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionupdate(
    `type`: compositionupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_consolemessage(
    `type`: consolemessage,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ConsoleMessageEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_consolemessage(
    `type`: consolemessage,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ConsoleMessageEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_consolemessage(
    `type`: consolemessage,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ConsoleMessageEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contentload(
    `type`: contentload,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ContentLoadEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contentload(
    `type`: contentload,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ContentLoadEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contentload(
    `type`: contentload,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ContentLoadEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(`type`: contextmenu, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(`type`: copy, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(`type`: cuechange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(`type`: cut, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(`type`: dblclick, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dialog(`type`: dialog, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DialogEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dialog(
    `type`: dialog,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DialogEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dialog(
    `type`: dialog,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DialogEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(`type`: drag, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(`type`: dragend, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(`type`: dragenter, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(`type`: dragleave, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(`type`: dragover, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(`type`: dragstart, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(`type`: drop, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(`type`: durationchange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(`type`: emptied, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error_, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_exit(`type`: exit, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ExitEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_exit(
    `type`: exit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ExitEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_exit(
    `type`: exit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ExitEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_findupdate(
    `type`: findupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FindUpdateEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_findupdate(
    `type`: findupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FindUpdateEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_findupdate(
    `type`: findupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FindUpdateEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(`type`: focus, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(`type`: focusin, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(`type`: focusout, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_formdata(`type`: formdata, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FormDataEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_formdata(
    `type`: formdata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FormDataEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_formdata(
    `type`: formdata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FormDataEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(`type`: fullscreenchange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: fullscreenchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: fullscreenchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(`type`: fullscreenerror, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: fullscreenerror,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: fullscreenerror,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(`type`: input_, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: input_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: input_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(`type`: invalid, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(`type`: keydown, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(`type`: keypress, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(`type`: keyup, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(`type`: load, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadabort(
    `type`: loadabort,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadAbortEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadabort(
    `type`: loadabort,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadAbortEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadabort(
    `type`: loadabort,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadAbortEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadcommit(
    `type`: loadcommit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadCommitEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadcommit(
    `type`: loadcommit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadCommitEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadcommit(
    `type`: loadcommit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadCommitEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(`type`: loadeddata, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(`type`: loadedmetadata, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadredirect(
    `type`: loadredirect,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadRedirectEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadredirect(
    `type`: loadredirect,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadRedirectEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadredirect(
    `type`: loadredirect,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadRedirectEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadStartEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadStartEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadStartEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstop(`type`: loadstop, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadStopEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstop(
    `type`: loadstop,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadStopEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstop(
    `type`: loadstop,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadStopEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(`type`: mousedown, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(`type`: mouseenter, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(`type`: mouseleave, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(`type`: mousemove, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(`type`: mouseout, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(`type`: mouseover, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(`type`: mouseup, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_newwindow(
    `type`: newwindow,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ NewWindowEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_newwindow(
    `type`: newwindow,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ NewWindowEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_newwindow(
    `type`: newwindow,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ NewWindowEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(`type`: paste, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(`type`: pause, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_permissionrequest(
    `type`: permissionrequest,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PermissionRequestEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_permissionrequest(
    `type`: permissionrequest,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PermissionRequestEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_permissionrequest(
    `type`: permissionrequest,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PermissionRequestEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(`type`: play, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(`type`: playing, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(`type`: pointerout, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(`type`: pointerup, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent[EventTarget], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent[EventTarget], Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent[EventTarget], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(`type`: ratechange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(`type`: reset, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(`type`: resize, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_responsive(
    `type`: responsive,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ResponsiveEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_responsive(
    `type`: responsive,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ResponsiveEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_responsive(
    `type`: responsive,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ResponsiveEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(`type`: scroll, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(`type`: seeked, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(`type`: seeking, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(`type`: select, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(`type`: selectionchange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(`type`: selectstart, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sizechanged(
    `type`: sizechanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SizeChangedEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sizechanged(
    `type`: sizechanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SizeChangedEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sizechanged(
    `type`: sizechanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SizeChangedEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_slotchange(`type`: slotchange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_slotchange(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_slotchange(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(`type`: stalled, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(`type`: submit, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SubmitEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SubmitEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SubmitEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(`type`: suspend_, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: suspend_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: suspend_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(`type`: timeupdate, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(`type`: toggle, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(`type`: touchcancel, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(`type`: touchend, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(`type`: touchmove, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(`type`: touchstart, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unresponsive(
    `type`: unresponsive,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UnresponsiveEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unresponsive(
    `type`: unresponsive,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UnresponsiveEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unresponsive(
    `type`: unresponsive,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UnresponsiveEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(`type`: volumechange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(`type`: waiting, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitanimationend(
    `type`: webkitanimationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitanimationend(
    `type`: webkitanimationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitanimationend(
    `type`: webkitanimationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitanimationiteration(
    `type`: webkitanimationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitanimationiteration(
    `type`: webkitanimationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitanimationiteration(
    `type`: webkitanimationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitanimationstart(
    `type`: webkitanimationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitanimationstart(
    `type`: webkitanimationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitanimationstart(
    `type`: webkitanimationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkittransitionend(
    `type`: webkittransitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkittransitionend(
    `type`: webkittransitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkittransitionend(
    `type`: webkittransitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(`type`: wheel, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_zoomchange(
    `type`: zoomchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ZoomChangeEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_zoomchange(
    `type`: zoomchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ZoomChangeEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_zoomchange(
    `type`: zoomchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ZoomChangeEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /**
    * Allow scaling?
    * @default false
    */
  var allowscaling: js.UndefOr[Boolean] = js.native
  
  /**
    * If present, portions of the embedder could be visible through the webview,
    * where the contents are transparent. Without allowtransparency enabled,
    * no part of the embedder will be shown through the webview,
    * even if elements exist that are specified as transparent.
    * This does not affect transparency within the contents of the webview itself.
    */
  var allowtransparency: js.UndefOr[Boolean] = js.native
  
  /**
    * If 'on', the webview container will automatically resize within the bounds specified by the attributes minwidth, minheight, maxwidth, and maxheight.
    * These constraints do not impact the webview UNLESS autosize is enabled.
    * When autosize is enabled, the webview container size cannot be less than the minimum values or greater than the maximum.
    */
  var autosize: js.UndefOr[on | Boolean] = js.native
  
  /**
    * Navigates backward one history entry if possible.
    * Equivalent to go(-1).
    * @param [callback] Called after the navigation has either failed or completed successfully. Success parameter indicates whether the navigation was successful.
    */
  def back(): Unit = js.native
  def back(callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  
  /**
    * Indicates whether or not it is possible to navigate backward through history.
    * The state of this function is cached, and updated before each loadcommit,
    * so the best place to call it is on loadcommit.
    */
  def canGoBack(): Unit = js.native
  
  /**
    * Indicates whether or not it is possible to navigate forward through history.
    * The state of this function is cached, and updated before each loadcommit,
    * so the best place to call it is on loadcommit.
    */
  def canGoForward(): Unit = js.native
  
  /**
    * Captures the visible region of the webview.
    * @param callback Provides a data URL which encodes an image of the visible area of the captured webview.
    *                 May be assigned to the 'src' property of an HTML Image element for display.
    * @since Chrome 50.
    */
  def captureVisibleRegion(callback: js.Function1[/* dataUrl */ String, Unit]): Unit = js.native
  /**
    * Captures the visible region of the webview.
    * @param options Extension type
    * @param callback Provides a data URL which encodes an image of the visible area of the captured webview.
    *                 May be assigned to the 'src' property of an HTML Image element for display.
    * @since Chrome 50.
    */
  def captureVisibleRegion(options: ImageDetails, callback: js.Function1[/* dataUrl */ String, Unit]): Unit = js.native
  
  /**
    * Clears browsing data for the webview partition.
    * @param options Options determining which data to clear.
    * @param types The types of data to be cleared.
    * @param callback Called after the data has been successfully cleared.
    * @since Chrome 33.
    */
  def clearData(options: ClearDataOptions, types: ClearDataTypeSet): Unit = js.native
  def clearData(options: ClearDataOptions, types: ClearDataTypeSet, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Object reference which can be used to post messages into the guest page.
    */
  var contentWindow: ContentWindow = js.native
  
  /** Similar to chrome's ContextMenus API, but applies to webview instead of browser.
    * Use the webview.contextMenus API to add items to webview's context menu.
    * You can choose what types of objects your context menu additions apply to, such as images, hyperlinks, and pages. */
  var contextMenus: ContextMenus = js.native
  
  /**
    * Injects JavaScript code into the guest page.
    * The following sample code uses script injection
    * to set the guest page's background color to red:
    * @example
    * webview.executeScript({ code: 'document.body.style.backgroundColor = 'red'' });
    * @param details  Details of the script to run.
    * @param [callback] Called after all the JavaScript has been executed.
    */
  def executeScript(details: InjectDetails): Unit = js.native
  def executeScript(details: InjectDetails, callback: js.Function1[/* result */ js.UndefOr[js.Array[Any]], Unit]): Unit = js.native
  
  /**
    * Initiates a find-in-page request.
    * @param searchText The string to find in the page.
    * @param [options]  Options for the find request.
    * @param [callback] Called after all find results have been returned for this find request.
    *                 Provides optionally:
    *                 results: Contains all of the results of the find request.
    *                 results can be omitted if it is not utilized in the callback function body;
    *                 e.g. if the callback is only used to discern when the find request has completed.
    */
  def find(searchText: String): Unit = js.native
  def find(
    searchText: String,
    options: Unit,
    callback: js.Function1[/* results */ js.UndefOr[FindCallbackResults], Unit]
  ): Unit = js.native
  def find(searchText: String, options: FindOptions): Unit = js.native
  def find(
    searchText: String,
    options: FindOptions,
    callback: js.Function1[/* results */ js.UndefOr[FindCallbackResults], Unit]
  ): Unit = js.native
  
  /**
    * Navigates forward one history entry if possible. Equivalent to go(1).
    * @param [callback] Called after the navigation has either failed or completed successfully.
    *                   Provides *success* which indicates whether the navigation was successful.
    */
  def forward(): Unit = js.native
  def forward(callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  
  /**
    * Queries audio state.
    * @since Chrome 62.
    **/
  def getAudioState(callback: js.Function1[/* audible */ Boolean, Unit]): Unit = js.native
  
  /**
    * Returns Chrome's internal process ID for the guest web page's current process,
    * allowing embedders to know how many guests would be affected by terminating
    * the process. Two guests will share a process only if they belong to the same
    * app and have the same **storage partition ID**. The call is synchronous and returns
    * the embedder's cached notion of the current process ID. The process ID isn't
    * the same as the operating system's process ID.
    */
  def getProcessId(): integer = js.native
  
  /**
    * Returns the user agent string used by the webview for guest page requests.
    * @since Chrome 33.
    */
  def getUserAgent(): String = js.native
  
  /**
    * Gets the current zoom factor.
    * @param callback Called after the current zoom factor is retrieved. Provides the current zoom factor.
    * @since Chrome 36.
    */
  def getZoom(callback: js.Function1[/* zoomFactor */ double, Unit]): Unit = js.native
  
  /**
    * Gets the current zoom mode.
    * @param callback Called with the webview's current zoom mode.
    * @since Chrome 43.
    */
  def getZoomMode(callback: js.Function1[/* ZoomMode */ ZoomMode, Unit]): Unit = js.native
  
  /**
    * Navigates to a history entry using a history index relative to the current navigation.
    * If the requested navigation is impossible, this method has no effect.
    * @param relativeIndex Relative history index to which the webview should be navigated.
    *                      For example, a value of 2 will navigate forward 2 history entries if possible;
    *                        a value of -3 will navigate backward 3 entries.
    * @param [callback] Called after the navigation has either failed or completed successfully.
    *                   Provides a boolean, *success*, which indicates whether the navigation was successful.
    */
  def go(relativeIndex: integer): Unit = js.native
  def go(relativeIndex: integer, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  
  /**
    * Injects CSS into the guest page.
    * @param details Details of the CSS to insert.
    * @param callback Called after the CSS has been inserted.
    */
  def insertCSS(details: InjectDetails): Unit = js.native
  def insertCSS(details: InjectDetails, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Queries whether audio is muted.
    * @since Chrome 62.
    */
  def isAudioMuted(callback: js.Function1[/* muted */ Boolean, Unit]): Unit = js.native
  
  /**
    * @since Chrome 71
    * @description Queries whether spatial navigation is enabled for the webview.
    * @param callback Callback that will provide the value of the spatial navigation state.
    */
  def isSpatialNavigationEnabled(callback: js.Function1[/* enabled */ Boolean, Unit]): Unit = js.native
  
  /**
    * Indicates whether or not the webview's user agent string has been overridden by *setUserAgentOverride*.
    * @since Chrome 33.
    */
  def isUserAgentOverridden(): Unit = js.native
  
  /**
    * Loads a data URL with a specified base URL used for relative links.
    * Optionally, a virtual URL can be provided to be shown to the user instead of the data URL.
    * @param dataUrl The data URL to load.
    * @param baseUrl The base URL that will be used for relative links.
    * @param virtualUrl The URL that will be displayed to the user (in the address bar).
    * @since Chrome 40.
    */
  def loadDataWithBaseUrl(dataUrl: String, baseUrl: String): Unit = js.native
  def loadDataWithBaseUrl(dataUrl: String, baseUrl: String, virtualUrl: String): Unit = js.native
  
  ///
  /// STYLE
  ///
  /** Maximum height */
  var maxheight: Double = js.native
  
  /** Maximum width */
  var maxwidth: Double = js.native
  
  /** Minimum height */
  var minheight: Double = js.native
  
  /** Minimum width */
  var minwidth: Double = js.native
  
  /** This sets the guest content's window.name object.**/
  var name: String = js.native
  
  ///
  /// DOM Events
  ///
  /** Fired when the guest window logs a console message. */
  var onconsolemessage: (js.ThisFunction1[/* this */ this.type, /* ev */ ConsoleMessageEvent, Any]) | Null = js.native
  
  /**
    * Fired when the guest window fires a load event, i.e.,
    * when a new document is loaded. This does not include
    * page navigation within the current document or
    * asynchronous resource loads.
    */
  var oncontentload: (js.ThisFunction1[/* this */ this.type, /* ev */ ContentLoadEvent, Any]) | Null = js.native
  
  /**
    * Fired when the guest window attempts to open a modal dialog via
    * window.alert, window.confirm, or window.prompt.
    * Handling this event will block the guest process until each event listener
    * returns or the dialog object becomes unreachable
    * (if preventDefault() was called.)
    */
  var ondialog: (js.ThisFunction1[/* this */ this.type, /* ev */ DialogEvent, Any]) | Null = js.native
  
  /**
    * Fired when the process rendering the guest web content has exited.
    */
  var onexit: (js.ThisFunction1[/* this */ this.type, /* ev */ ExitEvent, Any]) | Null = js.native
  
  /**
    * Fired when new find results are available for an active find request.
    * This might happen multiple times for a single find request as matches are found.
    */
  var onfindupdate: (js.ThisFunction1[/* this */ this.type, /* ev */ FindUpdateEvent, Any]) | Null = js.native
  
  /**
    * Fired when a top-level load has aborted without committing.
    * An error message will be printed to the console unless the
    * event is default-prevented.
    *
    * Note: When a resource load is aborted, a loadabort event will
    * eventually be followed by a loadstop event, even if all
    * committed loads since the last loadstop event (if any) were aborted.
    *
    * Note: When the load of either an about URL or a JavaScript URL is aborted,
    * loadabort will be fired and then the webview will be navigated to 'about:blank'.
    */
  var onloadabort: (js.ThisFunction1[/* this */ this.type, /* ev */ LoadAbortEvent, Any]) | Null = js.native
  
  /**
    * Fired when a load has committed. This includes navigation within the current document
    * as well as subframe document-level loads, but does not include asynchronous resource loads.
    */
  var onloadcommit: (js.ThisFunction1[/* this */ this.type, /* ev */ LoadCommitEvent, Any]) | Null = js.native
  
  /**
    * Fired when a top-level load request has redirected to a different URL.
    */
  var onloadredirect: (js.ThisFunction1[/* this */ this.type, /* ev */ LoadRedirectEvent, Any]) | Null = js.native
  
  /**
    * Fired when all frame-level loads in a guest page (including all its subframes)
    * have completed. This includes navigation within the current document as well
    * as subframe document-level loads, but does not include asynchronous resource
    * loads. This event fires every time the number of document-level loads
    * transitions from one (or more) to zero. For example, if a page that has
    * already finished loading (i.e., loadstop already fired once) creates a new
    * iframe which loads a page, then a second loadstop will fire when the iframe
    * page load completes. This pattern is commonly observed on pages that load ads.
    *
    * Note: When a committed load is aborted, a loadstop event will eventually
    * follow a loadabort event, even if all committed loads since the last loadstop
    * event (if any) were aborted.
    */
  var onloadstop: (js.ThisFunction1[/* this */ this.type, /* ev */ LoadStopEvent, Any]) | Null = js.native
  
  /**
    * Fired when the guest page attempts to open a new browser window.
    */
  var onnewwwindow: (js.ThisFunction1[/* this */ this.type, /* ev */ NewWindowEvent, Any]) | Null = js.native
  
  /**
    * Fired when the guest page needs to request special permission from the embedder.
    */
  var onpermissionrequest: (js.ThisFunction1[/* this */ this.type, /* ev */ PermissionRequestEvent, Any]) | Null = js.native
  
  /**
    * Fired when the process rendering the guest web content has become responsive again after being unresponsive.
    */
  var onresponsive: (js.ThisFunction1[/* this */ this.type, /* ev */ ResponsiveEvent, Any]) | Null = js.native
  
  /**
    * @requires autosize: enabled
    * Fired when the embedded web content has been resized via autosize.
    * Only fires if autosize is enabled.
    */
  var onsizechanged: (js.ThisFunction1[/* this */ this.type, /* ev */ SizeChangedEvent, Any]) | Null = js.native
  
  /**
    * Fired when the process rendering the guest web content has become unresponsive.
    * This event will be generated once with a matching responsive event if the guest
    * begins to respond again.
    */
  var onunresponsive: (js.ThisFunction1[/* this */ this.type, /* ev */ UnresponsiveEvent, Any]) | Null = js.native
  
  /**
    * Fired when the page's zoom changes.
    */
  var onzoomchange: (js.ThisFunction1[/* this */ this.type, /* ev */ ZoomChangeEvent, Any]) | Null = js.native
  
  /**
    * Storage partition ID used by the webview tag.
    * If the storage partition ID starts with persist: (partition='persist:googlepluswidgets'),
    * the webview will use a persistent storage partition available to all guests in the app with the same storage partition ID.
    * If the ID is unset or if there is no 'persist': prefix, the webview will use an in-memory storage partition.
    * This value can only be modified before the first navigation, since the storage partition of an active renderer process cannot change.
    * Subsequent attempts to modify the value will fail with a DOM exception.
    * By assigning the same partition ID, multiple webviews can share the same storage partition.
    */
  var partition: js.UndefOr[String] = js.native
  
  /**
    * Prints the contents of the webview.
    * This is equivalent to calling scripted print function from the webview itself.
    * @since Chrome 38.
    */
  def print(): Unit = js.native
  
  /** Reloads the current top-level page. */
  def reload(): Unit = js.native
  
  /**
    * Removes content scripts from a webview.
    * The following example removes 'myRule' which was added before.
    * @example webview.removeContentScripts(['myRule']);
    * @description You can remove all the rules by calling:
    * @example webview.removeContentScripts();
    * @param scriptNameList A list of names of content scripts that will be removed.
    *                       If the list is empty, all the content scripts added to the webview will be removed.
    * @since Chrome 44.
    */
  def removeContentScripts(): Unit = js.native
  def removeContentScripts(scriptNameList: js.Array[String]): Unit = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_abort(`type`: abort_, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(`type`: auxclick, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeinput(`type`: beforeinput, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ InputEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeinput(
    `type`: beforeinput,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ InputEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeinput(
    `type`: beforeinput,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ InputEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(`type`: blur, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(`type`: cancel, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(`type`: canplay, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(`type`: canplaythrough, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(`type`: click, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CloseEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CloseEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CloseEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionend(
    `type`: compositionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionend(
    `type`: compositionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionend(
    `type`: compositionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionstart(
    `type`: compositionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionstart(
    `type`: compositionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionstart(
    `type`: compositionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionupdate(
    `type`: compositionupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionupdate(
    `type`: compositionupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionupdate(
    `type`: compositionupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_consolemessage(
    `type`: consolemessage,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ConsoleMessageEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_consolemessage(
    `type`: consolemessage,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ConsoleMessageEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_consolemessage(
    `type`: consolemessage,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ConsoleMessageEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contentload(
    `type`: contentload,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ContentLoadEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contentload(
    `type`: contentload,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ContentLoadEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contentload(
    `type`: contentload,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ContentLoadEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(`type`: contextmenu, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_copy(`type`: copy, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(`type`: cuechange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cut(`type`: cut, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(`type`: dblclick, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dialog(`type`: dialog, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DialogEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dialog(
    `type`: dialog,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DialogEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dialog(
    `type`: dialog,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DialogEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(`type`: drag, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(`type`: dragend, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(`type`: dragenter, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(`type`: dragleave, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(`type`: dragover, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(`type`: dragstart, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(`type`: drop, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(`type`: durationchange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(`type`: emptied, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(`type`: error_, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_exit(`type`: exit, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ExitEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_exit(
    `type`: exit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ExitEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_exit(
    `type`: exit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ExitEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_findupdate(
    `type`: findupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FindUpdateEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_findupdate(
    `type`: findupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FindUpdateEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_findupdate(
    `type`: findupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FindUpdateEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(`type`: focus, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusin(`type`: focusin, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusout(`type`: focusout, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_formdata(`type`: formdata, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FormDataEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_formdata(
    `type`: formdata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FormDataEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_formdata(
    `type`: formdata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FormDataEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(`type`: fullscreenchange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(
    `type`: fullscreenchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(
    `type`: fullscreenchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(`type`: fullscreenerror, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    `type`: fullscreenerror,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    `type`: fullscreenerror,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(`type`: input_, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: input_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: input_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(`type`: invalid, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(`type`: keydown, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(`type`: keypress, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(`type`: keyup, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(`type`: load, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadabort(
    `type`: loadabort,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadAbortEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadabort(
    `type`: loadabort,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadAbortEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadabort(
    `type`: loadabort,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadAbortEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadcommit(
    `type`: loadcommit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadCommitEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadcommit(
    `type`: loadcommit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadCommitEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadcommit(
    `type`: loadcommit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadCommitEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(`type`: loadeddata, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(`type`: loadedmetadata, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadredirect(
    `type`: loadredirect,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadRedirectEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadredirect(
    `type`: loadredirect,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadRedirectEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadredirect(
    `type`: loadredirect,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadRedirectEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadStartEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadStartEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadStartEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstop(`type`: loadstop, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadStopEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstop(
    `type`: loadstop,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadStopEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstop(
    `type`: loadstop,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ LoadStopEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(`type`: mousedown, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(`type`: mouseenter, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(`type`: mouseleave, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(`type`: mousemove, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(`type`: mouseout, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(`type`: mouseover, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(`type`: mouseup, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_newwindow(
    `type`: newwindow,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ NewWindowEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_newwindow(
    `type`: newwindow,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ NewWindowEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_newwindow(
    `type`: newwindow,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ NewWindowEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paste(`type`: paste, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(`type`: pause, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_permissionrequest(
    `type`: permissionrequest,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PermissionRequestEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_permissionrequest(
    `type`: permissionrequest,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PermissionRequestEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_permissionrequest(
    `type`: permissionrequest,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PermissionRequestEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(`type`: play, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(`type`: playing, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(`type`: pointerout, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(`type`: pointerup, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent[EventTarget], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent[EventTarget], Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent[EventTarget], Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(`type`: ratechange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(`type`: reset, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(`type`: resize, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_responsive(
    `type`: responsive,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ResponsiveEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_responsive(
    `type`: responsive,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ResponsiveEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_responsive(
    `type`: responsive,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ResponsiveEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(`type`: scroll, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(`type`: seeked, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(`type`: seeking, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(`type`: select, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionchange(`type`: selectionchange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(`type`: selectstart, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sizechanged(
    `type`: sizechanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SizeChangedEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sizechanged(
    `type`: sizechanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SizeChangedEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sizechanged(
    `type`: sizechanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SizeChangedEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_slotchange(`type`: slotchange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_slotchange(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_slotchange(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(`type`: stalled, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(`type`: submit, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SubmitEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SubmitEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SubmitEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(`type`: suspend_, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: suspend_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: suspend_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(`type`: timeupdate, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(`type`: toggle, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(`type`: touchcancel, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(`type`: touchend, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(`type`: touchmove, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(`type`: touchstart, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unresponsive(
    `type`: unresponsive,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UnresponsiveEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unresponsive(
    `type`: unresponsive,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UnresponsiveEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unresponsive(
    `type`: unresponsive,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UnresponsiveEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(`type`: volumechange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(`type`: waiting, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkitanimationend(
    `type`: webkitanimationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkitanimationend(
    `type`: webkitanimationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkitanimationend(
    `type`: webkitanimationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkitanimationiteration(
    `type`: webkitanimationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkitanimationiteration(
    `type`: webkitanimationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkitanimationiteration(
    `type`: webkitanimationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkitanimationstart(
    `type`: webkitanimationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkitanimationstart(
    `type`: webkitanimationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkitanimationstart(
    `type`: webkitanimationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkittransitionend(
    `type`: webkittransitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkittransitionend(
    `type`: webkittransitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkittransitionend(
    `type`: webkittransitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(`type`: wheel, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_zoomchange(
    `type`: zoomchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ZoomChangeEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_zoomchange(
    `type`: zoomchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ZoomChangeEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_zoomchange(
    `type`: zoomchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ZoomChangeEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /** Interface which provides access to webRequest events on the guest page. */
  var request: WebRequestEventInterface = js.native
  
  /** Set an attribute */
  def setAttribute(attributeName: String, value: String): Unit = js.native
  def setAttribute(attributeName: String, value: Boolean): Unit = js.native
  def setAttribute(attributeName: String, value: Double): Unit = js.native
  
  /**
    * Sets audio mute state of the webview.
    * @param mute Mute audio value
    * @since Chrome 62.
    */
  def setAudioMuted(mute: Boolean): Unit = js.native
  
  /**
    * @since Chrome 71
    * @description Sets spatial navigation state of the webview.
    * @param enabled Spatial navigation state value.
    */
  def setSpatialNavigationEnabled(enabled: Boolean): Unit = js.native
  
  /**
    * Override the user agent string used by the webview for guest page requests.
    * @param userAgent The user agent string to use.
    * @since Chrome 33.
    */
  def setUserAgentOverride(userAgent: String): Unit = js.native
  
  /**
    * Changes the zoom factor of the page.
    * The scope and persistence of this change
    * are determined by the webview's current zoom mode.
    * @param zoomFactor The new zoom factor.
    * @param [callback] Called after the page has been zoomed.
    * @since Chrome 36.
    */
  def setZoom(zoomFactor: double): Unit = js.native
  def setZoom(zoomFactor: double, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Sets the zoom mode of the webview.
    * @param ZoomMode Defines how zooming is handled in the webview.
    * @param [callback] Called after the zoom mode has been changed.
    * @since Chrome 43.
    */
  def setZoomMode(ZoomMode: ZoomMode): Unit = js.native
  def setZoomMode(ZoomMode: ZoomMode, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Returns the visible URL. Mirrors the logic in the browser's omnibox: either returning a pending new navigation if initiated by the embedder page, or the last committed navigation. Writing to this attribute initiates top-level navigation.
    * Assigning src its own value will reload the current page.
    * The src attribute cannot be cleared or removed once it has been set, unless the webview is removed from the DOM.
    * The src attribute can also accept data URLs, such as 'data:text/plain,Hello, world!'.
    */
  var src: String = js.native
  
  /** Stops loading the current webview navigation if in progress. */
  def stop(): Unit = js.native
  
  /**
    * Ends the current find session (clearing all highlighting)
    * and cancels all find requests in progress.
    * @param action Determines what to do with the active match after the find session has ended.
    *               *clear* will clear the highlighting over the active match;
    *               keep will keep the active match highlighted;
    *               activate will keep the active match highlighted and simulate a user click on that match.
    *               The default action is keep.
    * @since Chrome 35.
    */
  def stopFinding(): Unit = js.native
  def stopFinding(action: clear | keep | activate): Unit = js.native
  
  /**
    * Forcibly kills the guest web page's renderer process.
    * This may affect multiple webview tags in the current app if they share the same process,
    * but it will not affect webview tags in other apps.
    */
  def terminate(): Unit = js.native
}
