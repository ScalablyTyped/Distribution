package typings.cloudeventsSdk.emitterBinaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class to emit binary CloudEvents over HTTP.
  */
@JSImport("cloudevents-sdk/lib/bindings/http/emitter_binary", JSImport.Namespace)
@js.native
class ^ protected () extends BinaryHTTPEmitter {
  /**
    * Create a new {BinaryHTTPEmitter} for the provided CloudEvent specification version.
    * Once an instance is created for a given spec version, it may only be used to send
    * events for that version.
    * Default version is 1.0
    * @param {string} version - the CloudEvent HTTP specification version.
    * Default: 1.0
    */
  def this(version: String) = this()
}

