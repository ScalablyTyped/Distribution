package typings.babylonjs.global.BABYLON

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebRequest")
@js.native
class WebRequest ()
  extends typings.babylonjs.BABYLON.WebRequest {
  /**
    * Returns client's response url
    */
  /* CompleteClass */
  override var responseURL: String = js.native
  /**
    * Returns client's status
    */
  /* CompleteClass */
  override var status: Double = js.native
  /**
    * Returns client's status as a text
    */
  /* CompleteClass */
  override var statusText: String = js.native
}

/* static members */
@JSGlobal("BABYLON.WebRequest")
@js.native
object WebRequest extends js.Object {
  /**
    * Custom HTTP Request Headers to be sent with XMLHttpRequests
    * i.e. when loading files, where the server/service expects an Authorization header
    */
  var CustomRequestHeaders: org.scalablytyped.runtime.StringDictionary[String] = js.native
  /**
    * Add callback functions in this array to update all the requests before they get sent to the network
    */
  var CustomRequestModifiers: js.Array[js.Function2[/* request */ XMLHttpRequest, /* url */ String, Unit]] = js.native
}

