package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSGlobal("HTMLWebViewElement")
@js.native
/** Create a new element */
class HTMLWebViewElement () extends HTMLElement {
  /**
    * Allow scaling?
    * @default false
    */
  var allowscaling: js.UndefOr[scala.Boolean] = js.native
  /**
    * If present, portions of the embedder could be visible through the webview,
    * where the contents are transparent. Without allowtransparency enabled,
    * no part of the embedder will be shown through the webview,
    * even if elements exist that are specified as transparent.
    * This does not affect transparency within the contents of the webview itself.
    */
  var allowtransparency: js.UndefOr[scala.Boolean] = js.native
  /**
    * If 'on', the webview container will automatically resize within the bounds specified by the attributes minwidth, minheight, maxwidth, and maxheight.
    * These constraints do not impact the webview UNLESS autosize is enabled.
    * When autosize is enabled, the webview container size cannot be less than the minimum values or greater than the maximum.
    */
  var autosize: js.UndefOr[chromeDashAppsLib.chromeDashAppsLibStrings.on | scala.Boolean] = js.native
  /**
    * Object reference which can be used to post messages into the guest page.
    */
  var contentWindow: chromeDashAppsLib.WebViewNs.ContentWindow = js.native
  /** Similar to chrome's ContextMenus API, but applies to webview instead of browser.
    * Use the webview.contextMenus API to add items to webview's context menu.
    * You can choose what types of objects your context menu additions apply to, such as images, hyperlinks, and pages. */
  var contextMenus: chromeDashAppsLib.WebViewNs.ContextMenus = js.native
  ///
  /// STYLE
  ///
  /** Maximum height */
  var maxheight: scala.Double = js.native
  /** Maximum width */
  var maxwidth: scala.Double = js.native
  /** Minimum height */
  var minheight: scala.Double = js.native
  /** Minimum width */
  var minwidth: scala.Double = js.native
  /** This sets the guest content's window.name object.**/
  var name: java.lang.String = js.native
  ///
  /// DOM Events
  ///
  /** Fired when the guest window logs a console message. */
  var onconsolemessage: (js.ThisFunction1[
    /* this */ this.type, 
    /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ConsoleMessageEvent, 
    _
  ]) | scala.Null = js.native
  /**
    * Fired when the guest window fires a load event, i.e.,
    * when a new document is loaded. This does not include
    * page navigation within the current document or
    * asynchronous resource loads.
    */
  var oncontentload: (js.ThisFunction1[
    /* this */ this.type, 
    /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ContentLoadEvent, 
    _
  ]) | scala.Null = js.native
  /**
    * Fired when the guest window attempts to open a modal dialog via
    * window.alert, window.confirm, or window.prompt.
    * Handling this event will block the guest process until each event listener
    * returns or the dialog object becomes unreachable
    * (if preventDefault() was called.)
    */
  var ondialog: (js.ThisFunction1[/* this */ this.type, /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.DialogEvent, _]) | scala.Null = js.native
  /**
    * Fired when the process rendering the guest web content has exited.
    */
  var onexit: (js.ThisFunction1[/* this */ this.type, /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ExitEvent, _]) | scala.Null = js.native
  /**
    * Fired when new find results are available for an active find request.
    * This might happen multiple times for a single find request as matches are found.
    */
  var onfindupdate: (js.ThisFunction1[
    /* this */ this.type, 
    /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.FindUpdateEvent, 
    _
  ]) | scala.Null = js.native
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
  var onloadabort: (js.ThisFunction1[
    /* this */ this.type, 
    /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadAbortEvent, 
    _
  ]) | scala.Null = js.native
  /**
    * Fired when a load has committed. This includes navigation within the current document
    * as well as subframe document-level loads, but does not include asynchronous resource loads.
    */
  var onloadcommit: (js.ThisFunction1[
    /* this */ this.type, 
    /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadCommitEvent, 
    _
  ]) | scala.Null = js.native
  /**
    * Fired when a top-level load request has redirected to a different URL.
    */
  var onloadredirect: (js.ThisFunction1[
    /* this */ this.type, 
    /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadRedirectEvent, 
    _
  ]) | scala.Null = js.native
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
  var onloadstop: (js.ThisFunction1[/* this */ this.type, /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadStopEvent, _]) | scala.Null = js.native
  /**
    * Fired when the guest page attempts to open a new browser window.
    */
  var onnewwwindow: (js.ThisFunction1[
    /* this */ this.type, 
    /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.NewWindowEvent, 
    _
  ]) | scala.Null = js.native
  /**
    * Fired when the guest page needs to request special permission from the embedder.
    */
  var onpermissionrequest: (js.ThisFunction1[
    /* this */ this.type, 
    /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.PermissionRequestEvent, 
    _
  ]) | scala.Null = js.native
  /**
    * Fired when the process rendering the guest web content has become responsive again after being unresponsive.
    */
  var onresponsive: (js.ThisFunction1[
    /* this */ this.type, 
    /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ResponsiveEvent, 
    _
  ]) | scala.Null = js.native
  /**
    * @requires autosize: enabled
    * Fired when the embedded web content has been resized via autosize.
    * Only fires if autosize is enabled.
    */
  var onsizechanged: (js.ThisFunction1[
    /* this */ this.type, 
    /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.SizeChangedEvent, 
    _
  ]) | scala.Null = js.native
  /**
    * Fired when the process rendering the guest web content has become unresponsive.
    * This event will be generated once with a matching responsive event if the guest
    * begins to respond again.
    */
  var onunresponsive: (js.ThisFunction1[
    /* this */ this.type, 
    /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.UnresponsiveEvent, 
    _
  ]) | scala.Null = js.native
  /**
    * Fired when the page's zoom changes.
    */
  var onzoomchange: (js.ThisFunction1[
    /* this */ this.type, 
    /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ZoomChangeEvent, 
    _
  ]) | scala.Null = js.native
  /**
    * Storage partition ID used by the webview tag.
    * If the storage partition ID starts with persist: (partition='persist:googlepluswidgets'),
    * the webview will use a persistent storage partition available to all guests in the app with the same storage partition ID.
    * If the ID is unset or if there is no 'persist': prefix, the webview will use an in-memory storage partition.
    * his value can only be modified before the first navigation, since the storage partition of an active renderer process cannot change.
    * Subsequent attempts to modify the value will fail with a DOM exception.
    * By assigning the same partition ID, multiple webviews can share the same storage partition.
    */
  var partition: js.UndefOr[java.lang.String] = js.native
  /** Interface which provides access to webRequest events on the guest page. */
  var request: chromeDashAppsLib.WebViewNs.WebRequestEventInterface = js.native
  /**
    * Returns the visible URL. Mirrors the logic in the browser's omnibox: either returning a pending new navigation if initiated by the embedder page, or the last committed navigation. Writing to this attribute initiates top-level navigation.
    * Assigning src its own value will reload the current page.
    * The src attribute cannot be cleared or removed once it has been set, unless the webview is removed from the DOM.
    * The src attribute can also accept data URLs, such as 'data:text/plain,Hello, world!'.
    */
  var src: java.lang.String = js.native
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
  def addContentScripts(contentScriptList: js.Array[chromeDashAppsLib.WebViewNs.ContentScriptDetails]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.abort,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.UIEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.abort,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.abort,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.UIEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.AnimationEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.AnimationEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.AnimationEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.AnimationEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.blur,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.blur,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.FocusEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.blur,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.FocusEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.change,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.change,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.change,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.click,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.click,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.click,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.close,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.CloseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.close,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.CloseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.close,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.CloseEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_consolemessage(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.consolemessage,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ConsoleMessageEvent, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_consolemessage(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.consolemessage,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ConsoleMessageEvent, 
      _
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_consolemessage(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.consolemessage,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ConsoleMessageEvent, 
      _
    ],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contentload(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.contentload,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ContentLoadEvent, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contentload(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.contentload,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ContentLoadEvent, 
      _
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contentload(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.contentload,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ContentLoadEvent, 
      _
    ],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.copy,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ClipboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.copy,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ClipboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.copy,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ClipboardEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.cut,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ClipboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.cut,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ClipboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.cut,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ClipboardEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dialog(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dialog,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.DialogEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dialog(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dialog,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.DialogEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dialog(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dialog,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.DialogEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.drag,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.drag,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.drag,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.drop,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.drop,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.drop,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.ended,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.ended,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.ended,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.error,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.error,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ErrorEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.error,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ErrorEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_exit(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.exit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ExitEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_exit(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.exit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ExitEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_exit(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.exit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ExitEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_findupdate(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.findupdate,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.FindUpdateEvent, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_findupdate(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.findupdate,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.FindUpdateEvent, 
      _
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_findupdate(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.findupdate,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.FindUpdateEvent, 
      _
    ],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.focus,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.focus,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.FocusEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.focus,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.FocusEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.input,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.input,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.input,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.KeyboardEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.KeyboardEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.KeyboardEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.load,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.load,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.load,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadabort(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadabort,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadAbortEvent, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadabort(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadabort,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadAbortEvent, 
      _
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadabort(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadabort,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadAbortEvent, 
      _
    ],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadcommit(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadcommit,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadCommitEvent, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadcommit(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadcommit,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadCommitEvent, 
      _
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadcommit(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadcommit,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadCommitEvent, 
      _
    ],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ProgressEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadredirect(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadredirect,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadRedirectEvent, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadredirect(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadredirect,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadRedirectEvent, 
      _
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadredirect(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadredirect,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadRedirectEvent, 
      _
    ],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadstart,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadStartEvent, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadstart,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadStartEvent, 
      _
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadstart,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadStartEvent, 
      _
    ],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstop(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadstop,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadStopEvent, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstop(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadstop,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadStopEvent, 
      _
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstop(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadstop,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadStopEvent, 
      _
    ],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_newwindow(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.newwindow,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.NewWindowEvent, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_newwindow(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.newwindow,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.NewWindowEvent, 
      _
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_newwindow(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.newwindow,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.NewWindowEvent, 
      _
    ],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.paste,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ClipboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.paste,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ClipboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.paste,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ClipboardEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pause,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pause,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pause,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_permissionrequest(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.permissionrequest,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.PermissionRequestEvent, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_permissionrequest(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.permissionrequest,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.PermissionRequestEvent, 
      _
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_permissionrequest(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.permissionrequest,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.PermissionRequestEvent, 
      _
    ],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.play,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.play,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.play,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.playing,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.playing,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.playing,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.progress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.progress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.progress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ProgressEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.reset,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.reset,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.reset,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.resize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.UIEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.resize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.resize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.UIEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_responsive(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.responsive,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ResponsiveEvent, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_responsive(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.responsive,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ResponsiveEvent, 
      _
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_responsive(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.responsive,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ResponsiveEvent, 
      _
    ],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.UIEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.UIEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.SecurityPolicyViolationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.SecurityPolicyViolationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.SecurityPolicyViolationEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.select,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.UIEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.select,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.select,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.UIEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sizechanged(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.sizechanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.SizeChangedEvent, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sizechanged(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.sizechanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.SizeChangedEvent, 
      _
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sizechanged(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.sizechanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.SizeChangedEvent, 
      _
    ],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.submit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.submit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.submit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TouchEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TouchEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TouchEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TouchEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TransitionEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TransitionEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TransitionEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TransitionEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unresponsive(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.unresponsive,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.UnresponsiveEvent, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unresponsive(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.unresponsive,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.UnresponsiveEvent, 
      _
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unresponsive(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.unresponsive,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.UnresponsiveEvent, 
      _
    ],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.WheelEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.WheelEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.WheelEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_zoomchange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.zoomchange,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ZoomChangeEvent, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_zoomchange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.zoomchange,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ZoomChangeEvent, 
      _
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_zoomchange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.zoomchange,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ZoomChangeEvent, 
      _
    ],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  /**
    * Navigates backward one history entry if possible.
    * Equivalent to go(-1).
    * @param [callback] Called after the navigation has either failed or completed successfully. Success parameter indicates whether the navigation was successful.
    */
  def back(): scala.Unit = js.native
  def back(callback: js.Function1[/* success */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  /**
    * Indicates whether or not it is possible to navigate backward through history.
    * The state of this function is cached, and updated before each loadcommit,
    * so the best place to call it is on loadcommit.
    */
  def canGoBack(): scala.Unit = js.native
  /**
    * Indicates whether or not it is possible to navigate forward through history.
    * The state of this function is cached, and updated before each loadcommit,
    * so the best place to call it is on loadcommit.
    */
  def canGoForward(): scala.Unit = js.native
  /**
    * Captures the visible region of the webview.
    * @param callback Provides a data URL which encodes an image of the visible area of the captured webview.
    *                 May be assigned to the 'src' property of an HTML Image element for display.
    * @since Chrome 50.
    */
  def captureVisibleRegion(callback: js.Function1[/* dataUrl */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
    * Captures the visible region of the webview.
    * @param options Extension type
    * @param callback Provides a data URL which encodes an image of the visible area of the captured webview.
    *                 May be assigned to the 'src' property of an HTML Image element for display.
    * @since Chrome 50.
    */
  def captureVisibleRegion(
    options: chromeDashAppsLib.chromeNs.extensionTypesNs.ImageDetails,
    callback: js.Function1[/* dataUrl */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Clears browsing data for the webview partition.
    * @param options Options determining which data to clear.
    * @param types The types of data to be cleared.
    * @param callback Called after the data has been successfully cleared.
    * @since Chrome 33.
    */
  def clearData(
    options: chromeDashAppsLib.WebViewNs.ClearDataOptions,
    types: chromeDashAppsLib.WebViewNs.ClearDataTypeSet
  ): scala.Unit = js.native
  def clearData(
    options: chromeDashAppsLib.WebViewNs.ClearDataOptions,
    types: chromeDashAppsLib.WebViewNs.ClearDataTypeSet,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
    * Injects JavaScript code into the guest page.
    * The following sample code uses script injection
    * to set the guest page's background color to red:
    * @example
    * webview.executeScript({ code: 'document.body.style.backgroundColor = 'red'' });
    * @param details  Details of the script to run.
    * @param [callback] Called after all the JavaScript has been executed.
    */
  def executeScript(details: chromeDashAppsLib.WebViewNs.InjectDetails): scala.Unit = js.native
  def executeScript(
    details: chromeDashAppsLib.WebViewNs.InjectDetails,
    callback: js.Function1[/* result */ js.UndefOr[js.Array[_]], scala.Unit]
  ): scala.Unit = js.native
  /**
    * @requires Permissions: 'pointerLock'
    */
  /* CompleteClass */
  override def exitPointerLock(): scala.Unit = js.native
  /**
    * ❗ Unprefixed version are not available as of Chrome 68, in Chrome apps ❗
    */
  /* CompleteClass */
  override def exitrequestFullscreen(): scala.Unit = js.native
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
  def find(searchText: java.lang.String): scala.Unit = js.native
  def find(searchText: java.lang.String, options: chromeDashAppsLib.WebViewNs.FindOptions): scala.Unit = js.native
  def find(
    searchText: java.lang.String,
    options: chromeDashAppsLib.WebViewNs.FindOptions,
    callback: js.Function1[
      /* results */ js.UndefOr[chromeDashAppsLib.WebViewNs.FindCallbackResults], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Navigates forward one history entry if possible. Equivalent to go(1).
    * @param [callback] Called after the navigation has either failed or completed successfully.
    *                   Provides *success* which indicates whether the navigation was successful.
    */
  def forward(): scala.Unit = js.native
  def forward(callback: js.Function1[/* success */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  /**
    * Queries audio state.
    * @since Chrome 62.
    **/
  def getAudioState(callback: js.Function1[/* audible */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  /**
    * Returns Chrome's internal process ID for the guest web page's current process,
    * allowing embedders to know how many guests would be affected by terminating
    * the process. Two guests will share a process only if they belong to the same
    * app and have the same **storage partition ID**. The call is synchronous and returns
    * the embedder's cached notion of the current process ID. The process ID isn't
    * the same as the operating system's process ID.
    */
  def getProcessId(): chromeDashAppsLib.chromeNs.integer = js.native
  /**
    * Returns the user agent string used by the webview for guest page requests.
    * @since Chrome 33.
    */
  def getUserAgent(): java.lang.String = js.native
  /**
    * Gets the current zoom factor.
    * @param callback Called after the current zoom factor is retrieved. Provides the current zoom factor.
    * @since Chrome 36.
    */
  def getZoom(callback: js.Function1[/* zoomFactor */ chromeDashAppsLib.chromeNs.double, scala.Unit]): scala.Unit = js.native
  /**
    * Gets the current zoom mode.
    * @param callback Called with the webview's current zoom mode.
    * @since Chrome 43.
    */
  def getZoomMode(callback: js.Function1[/* ZoomMode */ chromeDashAppsLib.WebViewNs.ZoomMode, scala.Unit]): scala.Unit = js.native
  /**
    * Navigates to a history entry using a history index relative to the current navigation.
    * If the requested navigation is impossible, this method has no effect.
    * @param relativeIndex Relative history index to which the webview should be navigated.
    *                      For example, a value of 2 will navigate forward 2 history entries if possible;
    *                        a value of -3 will navigate backward 3 entries.
    * @param [callback] Called after the navigation has either failed or completed successfully.
    *                   Provides a boolean, *success*, which indicates whether the navigation was successful.
    */
  def go(relativeIndex: chromeDashAppsLib.chromeNs.integer): scala.Unit = js.native
  def go(
    relativeIndex: chromeDashAppsLib.chromeNs.integer,
    callback: js.Function1[/* success */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Injects CSS into the guest page.
    * @param details Details of the CSS to insert.
    * @param callback Called after the CSS has been inserted.
    */
  def insertCSS(details: chromeDashAppsLib.WebViewNs.InjectDetails): scala.Unit = js.native
  def insertCSS(details: chromeDashAppsLib.WebViewNs.InjectDetails, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Queries whether audio is muted.
    * @since Chrome 62.
    */
  def isAudioMuted(callback: js.Function1[/* muted */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  /**
    * @since Chrome 71
    * @description Queries whether spatial navigation is enabled for the webview.
    * @param callback Callback that will provide the value of the spatial navigation state.
    */
  def isSpatialNavigationEnabled(callback: js.Function1[/* enabled */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  /**
    * Indicates whether or not the webview's user agent string has been overridden by *setUserAgentOverride*.
    * @since Chrome 33.
    */
  def isUserAgentOverridden(): scala.Unit = js.native
  /**
    * Loads a data URL with a specified base URL used for relative links.
    * Optionally, a virtual URL can be provided to be shown to the user instead of the data URL.
    * @param dataUrl The data URL to load.
    * @param baseUrl The base URL that will be used for relative links.
    * @param virtualUrl The URL that will be displayed to the user (in the address bar).
    * @since Chrome 40.
    */
  def loadDataWithBaseUrl(dataUrl: java.lang.String, baseUrl: java.lang.String): scala.Unit = js.native
  def loadDataWithBaseUrl(dataUrl: java.lang.String, baseUrl: java.lang.String, virtualUrl: java.lang.String): scala.Unit = js.native
  /**
    * Prints the contents of the webview.
    * This is equivalent to calling scripted print function from the webview itself.
    * @since Chrome 38.
    */
  def print(): scala.Unit = js.native
  /** Reloads the current top-level page. */
  def reload(): scala.Unit = js.native
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
  def removeContentScripts(): scala.Unit = js.native
  def removeContentScripts(scriptNameList: js.Array[java.lang.String]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.abort,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.UIEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.abort,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.abort,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.UIEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.AnimationEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.AnimationEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.AnimationEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.AnimationEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.blur,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.blur,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.FocusEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.blur,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.FocusEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.change,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.change,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.change,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.click,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.click,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.click,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.close,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.CloseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.close,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.CloseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.close,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.CloseEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_consolemessage(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.consolemessage,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ConsoleMessageEvent, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_consolemessage(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.consolemessage,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ConsoleMessageEvent, 
      _
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_consolemessage(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.consolemessage,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ConsoleMessageEvent, 
      _
    ],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contentload(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.contentload,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ContentLoadEvent, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contentload(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.contentload,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ContentLoadEvent, 
      _
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contentload(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.contentload,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ContentLoadEvent, 
      _
    ],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_copy(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.copy,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ClipboardEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_copy(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.copy,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ClipboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_copy(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.copy,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ClipboardEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cut(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.cut,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ClipboardEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cut(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.cut,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ClipboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cut(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.cut,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ClipboardEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dialog(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dialog,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.DialogEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dialog(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dialog,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.DialogEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dialog(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dialog,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.DialogEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.drag,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.drag,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.drag,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.drop,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.drop,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.drop,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.DragEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.ended,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.ended,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.ended,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.error,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.error,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ErrorEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.error,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ErrorEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_exit(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.exit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ExitEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_exit(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.exit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ExitEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_exit(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.exit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ExitEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_findupdate(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.findupdate,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.FindUpdateEvent, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_findupdate(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.findupdate,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.FindUpdateEvent, 
      _
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_findupdate(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.findupdate,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.FindUpdateEvent, 
      _
    ],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.focus,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.focus,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.FocusEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.focus,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.FocusEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.input,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.input,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.input,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.KeyboardEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.KeyboardEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.KeyboardEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.load,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.load,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.load,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadabort(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadabort,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadAbortEvent, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadabort(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadabort,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadAbortEvent, 
      _
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadabort(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadabort,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadAbortEvent, 
      _
    ],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadcommit(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadcommit,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadCommitEvent, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadcommit(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadcommit,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadCommitEvent, 
      _
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadcommit(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadcommit,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadCommitEvent, 
      _
    ],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ProgressEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadredirect(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadredirect,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadRedirectEvent, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadredirect(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadredirect,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadRedirectEvent, 
      _
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadredirect(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadredirect,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadRedirectEvent, 
      _
    ],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadstart,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadStartEvent, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadstart,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadStartEvent, 
      _
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadstart,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadStartEvent, 
      _
    ],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstop(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadstop,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadStopEvent, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstop(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadstop,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadStopEvent, 
      _
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstop(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.loadstop,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.LoadStopEvent, 
      _
    ],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_newwindow(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.newwindow,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.NewWindowEvent, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_newwindow(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.newwindow,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.NewWindowEvent, 
      _
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_newwindow(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.newwindow,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.NewWindowEvent, 
      _
    ],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paste(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.paste,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ClipboardEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paste(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.paste,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ClipboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paste(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.paste,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ClipboardEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pause,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pause,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pause,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_permissionrequest(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.permissionrequest,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.PermissionRequestEvent, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_permissionrequest(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.permissionrequest,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.PermissionRequestEvent, 
      _
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_permissionrequest(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.permissionrequest,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.PermissionRequestEvent, 
      _
    ],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.play,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.play,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.play,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.playing,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.playing,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.playing,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.progress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.progress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.progress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.ProgressEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.reset,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.reset,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.reset,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.resize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.UIEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.resize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.resize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.UIEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_responsive(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.responsive,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ResponsiveEvent, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_responsive(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.responsive,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ResponsiveEvent, 
      _
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_responsive(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.responsive,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ResponsiveEvent, 
      _
    ],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.UIEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.UIEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.SecurityPolicyViolationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.SecurityPolicyViolationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.SecurityPolicyViolationEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.select,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.UIEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.select,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.select,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.UIEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sizechanged(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.sizechanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.SizeChangedEvent, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sizechanged(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.sizechanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.SizeChangedEvent, 
      _
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sizechanged(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.sizechanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.SizeChangedEvent, 
      _
    ],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.submit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.submit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.submit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TouchEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TouchEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TouchEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TouchEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TransitionEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TransitionEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TransitionEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.TransitionEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unresponsive(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.unresponsive,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.UnresponsiveEvent, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unresponsive(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.unresponsive,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.UnresponsiveEvent, 
      _
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unresponsive(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.unresponsive,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.UnresponsiveEvent, 
      _
    ],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.WheelEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.WheelEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ stdLib.WheelEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_zoomchange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.zoomchange,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ZoomChangeEvent, 
      _
    ]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_zoomchange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.zoomchange,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ZoomChangeEvent, 
      _
    ],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_zoomchange(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.zoomchange,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ chromeDashAppsLib.WebViewNs.EventsNs.ZoomChangeEvent, 
      _
    ],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  /**
    * ❗ Unprefixed version are not available as of Chrome 68, in Chrome apps ❗
    */
  /* CompleteClass */
  override def requestFullscreen(): js.Promise[scala.Unit] = js.native
  /**
    * @requires Permissions: 'pointerLock'
    */
  /* CompleteClass */
  override def requestPointerLock(): scala.Unit = js.native
  /** Set an attribute */
  def setAttribute(attributeName: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setAttribute(attributeName: java.lang.String, value: scala.Boolean): scala.Unit = js.native
  def setAttribute(attributeName: java.lang.String, value: scala.Double): scala.Unit = js.native
  /**
    * Sets audio mute state of the webview.
    * @param mute Mute audio value
    * @since Chrome 62.
    */
  def setAudioMuted(mute: scala.Boolean): scala.Unit = js.native
  /**
    * @since Chrome 71
    * @description Sets spatial navigation state of the webview.
    * @param enabled Spatial navigation state value.
    */
  def setSpatialNavigationEnabled(enabled: scala.Boolean): scala.Unit = js.native
  /**
    * Override the user agent string used by the webview for guest page requests.
    * @param userAgent The user agent string to use.
    * @since Chrome 33.
    */
  def setUserAgentOverride(userAgent: java.lang.String): scala.Unit = js.native
  /**
    * Changes the zoom factor of the page.
    * The scope and persistence of this change
    * are determined by the webview's current zoom mode.
    * @param zoomFactor The new zoom factor.
    * @param [callback] Called after the page has been zoomed.
    * @since Chrome 36.
    */
  def setZoom(zoomFactor: chromeDashAppsLib.chromeNs.double): scala.Unit = js.native
  def setZoom(zoomFactor: chromeDashAppsLib.chromeNs.double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Sets the zoom mode of the webview.
    * @param ZoomMode Defines how zooming is handled in the webview.
    * @param [callback] Called after the zoom mode has been changed.
    * @since Chrome 43.
    */
  def setZoomMode(ZoomMode: chromeDashAppsLib.WebViewNs.ZoomMode): scala.Unit = js.native
  def setZoomMode(ZoomMode: chromeDashAppsLib.WebViewNs.ZoomMode, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /** Stops loading the current webview navigation if in progress. */
  def stop(): scala.Unit = js.native
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
  def stopFinding(): scala.Unit = js.native
  @JSName("stopFinding")
  def stopFinding_activate(action: chromeDashAppsLib.chromeDashAppsLibStrings.activate): scala.Unit = js.native
  @JSName("stopFinding")
  def stopFinding_clear(action: chromeDashAppsLib.chromeDashAppsLibStrings.clear): scala.Unit = js.native
  @JSName("stopFinding")
  def stopFinding_keep(action: chromeDashAppsLib.chromeDashAppsLibStrings.keep): scala.Unit = js.native
  /**
    * Forcibly kills the guest web page's renderer process.
    * This may affect multiple webview tags in the current app if they share the same process,
    * but it will not affect webview tags in other apps.
    */
  def terminate(): scala.Unit = js.native
  /**
    * @requires Permissions: 'app.window.fullscreen', 'app.window.fullscreen.overrideEsc'
    * @description
    * In Chrome Apps, fullscreen is entered without prompting the user or providing
    * exit instructions. HTML5 fullscreen requires the app.window.fullscreen permission
    * in the manifest. In normal webpages, the browser intercepts the ESC key to exit
    * pointer lock ensuring a consistent escape method for users. That is also the
    * behavior in Chrome Apps unless the app.window.fullscreen.overrideEsc permission
    * is used to enable the app to call preventDefault on keydown and keyup events.
    *
    * Then to exit fullscreen, the document exposes a method for that:
    * @example
    * document.webkitExitFullscreen();
    */
  /* CompleteClass */
  override def webkitRequestFullscreen(): scala.Unit = js.native
}

