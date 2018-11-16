package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextMarker extends js.Object {
  /**  Called when you've done something that might change the size of the marker and want to cheaply update the display*/
  def changed(): scala.Unit = js.native
  /** Remove the mark. */
  def clear(): scala.Unit = js.native
  /** Returns a {from, to} object (both holding document positions), indicating the current position of the marked range,
          or undefined if the marker is no longer in the document. */
  def find(): codemirrorLib.Anon_From = js.native
  /**  Returns an object representing the options for the marker. If copyWidget is given true, it will clone the value of the replacedWith option, if any. */
  def getOptions(copyWidget: scala.Boolean): TextMarkerOptions = js.native
  @JSName("off")
  def off_beforeCursorEnter(eventName: codemirrorLib.codemirrorLibStrings.beforeCursorEnter, handler: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("off")
  def off_clear(eventName: codemirrorLib.codemirrorLibStrings.clear, handler: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("off")
  def off_hide(eventname: codemirrorLib.codemirrorLibStrings.hide, handler: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("off")
  def off_unhide(eventname: codemirrorLib.codemirrorLibStrings.unhide, handler: js.Function0[scala.Unit]): scala.Unit = js.native
  /** Fired when the cursor enters the marked range */
  @JSName("on")
  def on_beforeCursorEnter(eventName: codemirrorLib.codemirrorLibStrings.beforeCursorEnter, handler: js.Function0[scala.Unit]): scala.Unit = js.native
  /** Fired when the range is cleared, either through cursor movement in combination with clearOnEnter or through a call to its clear() method */
  @JSName("on")
  def on_clear(
    eventName: codemirrorLib.codemirrorLibStrings.clear,
    handler: js.Function2[/* from */ Position, /* to */ Position, scala.Unit]
  ): scala.Unit = js.native
  /** Fired when the last part of the marker is removed from the document by editing operations */
  @JSName("on")
  def on_hide(eventName: codemirrorLib.codemirrorLibStrings.hide, handler: js.Function0[scala.Unit]): scala.Unit = js.native
  /** Fired when, after the marker was removed by editing, a undo operation brough the marker back */
  @JSName("on")
  def on_unhide(eventName: codemirrorLib.codemirrorLibStrings.unhide, handler: js.Function0[scala.Unit]): scala.Unit = js.native
}

