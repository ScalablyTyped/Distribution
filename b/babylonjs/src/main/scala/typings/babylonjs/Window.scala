package typings.babylonjs

import typings.babylonjs.babylonjsStrings.vrdisplayconnected
import typings.babylonjs.babylonjsStrings.vrdisplaydisconnected
import typings.babylonjs.babylonjsStrings.vrdisplaypresentchange
import typings.std.AudioContext
import typings.std.Event_
import typings.std.Float32ArrayConstructor
import typings.std.FrameRequestCallback
import typings.std.IDBFactory
import typings.std.Uint8ArrayConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Mixins
@js.native
trait Window extends js.Object {
  var AudioContext: typings.std.AudioContext = js.native
  var CANNON: js.Any = js.native
   // WebVR, from specs 1.1
  var DracoDecoderModule: js.Any = js.native
  var Float32Array: Float32ArrayConstructor = js.native
  var MSGesture: typings.std.MSGesture = js.native
  var Math: typings.babylonjs.Math = js.native
  var PointerEvent: js.Any = js.native
  var Uint8Array: Uint8ArrayConstructor = js.native
  var VRFrameData: js.Any = js.native
  var WebGLRenderingContext: typings.babylonjs.WebGLRenderingContext = js.native
  var mozIndexedDB: IDBFactory = js.native
  var mozURL: AnonInstantiable = js.native
  var msIndexedDB: IDBFactory = js.native
  var msURL: AnonInstantiable = js.native
  var onvrdisplayconnected: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onvrdisplaydisconnected: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onvrdisplaypresentchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var webkitAudioContext: AudioContext = js.native
  var webkitIndexedDB: IDBFactory = js.native
  var webkitURL: AnonInstantiable = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnected(`type`: vrdisplayconnected, listener: js.Function1[/* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnected(`type`: vrdisplayconnected, listener: js.Function1[/* ev */ Event_, _], useCapture: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnected(`type`: vrdisplaydisconnected, listener: js.Function1[/* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnected(`type`: vrdisplaydisconnected, listener: js.Function1[/* ev */ Event_, _], useCapture: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(`type`: vrdisplaypresentchange, listener: js.Function1[/* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(`type`: vrdisplaypresentchange, listener: js.Function1[/* ev */ Event_, _], useCapture: Boolean): Unit = js.native
  def mozRequestAnimationFrame(callback: FrameRequestCallback): Double = js.native
  def oRequestAnimationFrame(callback: FrameRequestCallback): Double = js.native
  def setImmediate(handler: js.Function1[/* repeated */ js.Any, Unit]): Double = js.native
}

