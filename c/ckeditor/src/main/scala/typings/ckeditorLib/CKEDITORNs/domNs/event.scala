package typings
package ckeditorLib.CKEDITORNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.dom.event")
@js.native
class event protected () extends js.Object {
  def this(domEvent: stdLib.Event) = this()
  def getKey(): scala.Double = js.native
  def getKeystroke(): scala.Double = js.native
  def getPhase(): scala.Double = js.native
  def getPhaseOffset(): position = js.native
  def getTarget(): node = js.native
  def on(
    eventName: java.lang.String,
    listenerFunction: js.Function1[/* eventInfo */ ckeditorLib.CKEDITORNs.eventInfo, scala.Unit]
  ): ckeditorLib.Anon_RemoveListener = js.native
  def on(
    eventName: java.lang.String,
    listenerFunction: js.Function1[/* eventInfo */ ckeditorLib.CKEDITORNs.eventInfo, scala.Unit],
    scopeObj: js.Any
  ): ckeditorLib.Anon_RemoveListener = js.native
  def on(
    eventName: java.lang.String,
    listenerFunction: js.Function1[/* eventInfo */ ckeditorLib.CKEDITORNs.eventInfo, scala.Unit],
    scopeObj: js.Any,
    listenerData: js.Any
  ): ckeditorLib.Anon_RemoveListener = js.native
  def on(
    eventName: java.lang.String,
    listenerFunction: js.Function1[/* eventInfo */ ckeditorLib.CKEDITORNs.eventInfo, scala.Unit],
    scopeObj: js.Any,
    listenerData: js.Any,
    priority: scala.Double
  ): ckeditorLib.Anon_RemoveListener = js.native
  def preventDefault(): scala.Unit = js.native
  def preventDefault(stopPropagation: scala.Boolean): scala.Unit = js.native
  def stopPropagation(): scala.Unit = js.native
}

