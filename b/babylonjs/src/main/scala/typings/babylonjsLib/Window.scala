package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var AudioContext: stdLib.AudioContext = js.native
  var CANNON: js.Any = js.native
  var DracoDecoderModule: js.Any = js.native
  var Float32Array: stdLib.Float32ArrayConstructor = js.native
  var MSGesture: stdLib.MSGesture = js.native
  var Math: babylonjsLib.Math = js.native
  var PointerEvent: js.Any = js.native
  var Uint8Array: stdLib.Uint8ArrayConstructor = js.native
  var VRFrameData: js.Any = js.native
  var WebGLRenderingContext: babylonjsLib.WebGLRenderingContext = js.native
  var mozIndexedDB: stdLib.IDBFactory = js.native
  var mozURL: Anon_Base = js.native
  var msIndexedDB: stdLib.IDBFactory = js.native
  var msURL: Anon_Base = js.native
  var onvrdisplayconnected: (js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]) | scala.Null = js.native
  var onvrdisplaydisconnected: (js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]) | scala.Null = js.native
  var onvrdisplaypresentchange: (js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]) | scala.Null = js.native
  var webkitAudioContext: stdLib.AudioContext = js.native
  var webkitIndexedDB: stdLib.IDBFactory = js.native
  var webkitURL: Anon_Base = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnected(
    `type`: babylonjsLib.babylonjsLibStrings.vrdisplayconnected,
    listener: js.Function1[/* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnected(
    `type`: babylonjsLib.babylonjsLibStrings.vrdisplayconnected,
    listener: js.Function1[/* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnected(
    `type`: babylonjsLib.babylonjsLibStrings.vrdisplaydisconnected,
    listener: js.Function1[/* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnected(
    `type`: babylonjsLib.babylonjsLibStrings.vrdisplaydisconnected,
    listener: js.Function1[/* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: babylonjsLib.babylonjsLibStrings.vrdisplaypresentchange,
    listener: js.Function1[/* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: babylonjsLib.babylonjsLibStrings.vrdisplaypresentchange,
    listener: js.Function1[/* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def mozRequestAnimationFrame(callback: stdLib.FrameRequestCallback): scala.Double = js.native
  def oRequestAnimationFrame(callback: stdLib.FrameRequestCallback): scala.Double = js.native
  def setImmediate(handler: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Double = js.native
}

