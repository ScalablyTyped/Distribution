package typings.codemirror.mod

import typings.codemirror.anon.From
import typings.codemirror.codemirrorStrings.beforeCursorEnter
import typings.codemirror.codemirrorStrings.clear
import typings.codemirror.codemirrorStrings.hide
import typings.codemirror.codemirrorStrings.unhide
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<codemirror.codemirror.TextMarkerOptions> */
@js.native
trait TextMarker extends StObject {
  
  var addToHistory: js.UndefOr[Boolean] = js.native
  
  var atomic: js.UndefOr[Boolean] = js.native
  
  /**  Called when you've done something that might change the size of the marker and want to cheaply update the display*/
  def changed(): Unit = js.native
  
  var className: js.UndefOr[String] = js.native
  
  /** Remove the mark. */
  def clear(): Unit = js.native
  
  var clearOnEnter: js.UndefOr[Boolean] = js.native
  
  var clearWhenEmpty: js.UndefOr[Boolean] = js.native
  
  var collapsed: js.UndefOr[Boolean] = js.native
  
  var css: js.UndefOr[String] = js.native
  
  var endStyle: js.UndefOr[String] = js.native
  
  /** Returns a {from, to} object (both holding document positions), indicating the current position of the marked range,
    or undefined if the marker is no longer in the document. */
  def find(): From = js.native
  
  var handleMouseEvents: js.UndefOr[Boolean] = js.native
  
  var inclusiveLeft: js.UndefOr[Boolean] = js.native
  
  var inclusiveRight: js.UndefOr[Boolean] = js.native
  
  @JSName("off")
  def off_beforeCursorEnter(eventName: beforeCursorEnter, handler: js.Function0[Unit]): Unit = js.native
  @JSName("off")
  def off_clear(eventName: clear, handler: js.Function0[Unit]): Unit = js.native
  @JSName("off")
  def off_hide(eventname: hide, handler: js.Function0[Unit]): Unit = js.native
  @JSName("off")
  def off_unhide(eventname: unhide, handler: js.Function0[Unit]): Unit = js.native
  
  /** Fired when the cursor enters the marked range */
  @JSName("on")
  def on_beforeCursorEnter(eventName: beforeCursorEnter, handler: js.Function0[Unit]): Unit = js.native
  /** Fired when the range is cleared, either through cursor movement in combination with clearOnEnter or through a call to its clear() method */
  @JSName("on")
  def on_clear(eventName: clear, handler: js.Function2[/* from */ Position, /* to */ Position, Unit]): Unit = js.native
  /** Fired when the last part of the marker is removed from the document by editing operations */
  @JSName("on")
  def on_hide(eventName: hide, handler: js.Function0[Unit]): Unit = js.native
  /** Fired when, after the marker was removed by editing, a undo operation brough the marker back */
  @JSName("on")
  def on_unhide(eventName: unhide, handler: js.Function0[Unit]): Unit = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var replacedWith: js.UndefOr[HTMLElement] = js.native
  
  var shared: js.UndefOr[Boolean] = js.native
  
  var startStyle: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
