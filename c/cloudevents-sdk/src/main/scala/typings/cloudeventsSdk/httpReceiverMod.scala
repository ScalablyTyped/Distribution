package typings.cloudeventsSdk

import typings.cloudeventsSdk.anon.V03
import typings.cloudeventsSdk.cloudeventMod.CloudEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cloudevents-sdk/lib/bindings/http/http_receiver", JSImport.Namespace)
@js.native
object httpReceiverMod extends js.Object {
  @js.native
  /**
    * Create an instance of an HTTPReceiver to accept incoming CloudEvents.
    */
  class HTTPReceiver () extends js.Object {
    var receivers: V03 = js.native
    /**
      * Acceptor for an incoming HTTP CloudEvent POST. Can process
      * binary and structured incoming CloudEvents.
      *
      * @param {Object} headers HTTP headers keyed by header name ("Content-Type")
      * @param {Object|JSON} body The body of the HTTP request
      * @return {CloudEvent} A new {CloudEvent} instance
      */
    def accept(headers: js.Object, body: js.Object): CloudEvent = js.native
  }
  
}

