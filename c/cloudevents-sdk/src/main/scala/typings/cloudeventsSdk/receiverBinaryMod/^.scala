package typings.cloudeventsSdk.receiverBinaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @typedef {import("../../cloudevent")} CloudEvent */
/**
  * A class that receives binary CloudEvents over HTTP. This class can be used
  * if you know that all incoming events will be using binary transport. If
  * events can come as either binary or structured, use {HTTPReceiver}.
  */
@JSImport("cloudevents-sdk/lib/bindings/http/receiver_binary", JSImport.Namespace)
@js.native
/**
  * Creates a new BinaryHTTPReceiver to accept events over HTTP.
  *
  * @param {string} version the Cloud Event specification version to use. Default "1.0"
  */
class ^ () extends BinaryHTTPReceiver {
  def this(version: String) = this()
}

