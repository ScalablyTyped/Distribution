package typings.cloudeventsSdk.receiverStructuredMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import("../../cloudevent")} CloudEvent */
/**
  * A utility class used to receive structured CloudEvents
  * over HTTP.
  * @see {StructuredReceiver}
  */
@JSImport("cloudevents-sdk/lib/bindings/http/receiver_structured", JSImport.Namespace)
@js.native
/**
  * Creates a new StructuredHTTPReceiver. Supports Cloud Events specification
  * versions 0.3 and 1.0 (default).
  *
  * @param {string} version the Cloud Events specification version. Default: 1.0.
  */
class ^ () extends StructuredHTTPReceiver {
  def this(version: String) = this()
}
