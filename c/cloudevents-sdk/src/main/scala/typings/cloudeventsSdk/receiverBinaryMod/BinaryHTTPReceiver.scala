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
@js.native
trait BinaryHTTPReceiver extends js.Object {
  var receiver: typings.cloudeventsSdk.receiverBinary1Mod.^  | typings.cloudeventsSdk.receiverBinary03Mod.^  = js.native
  /**
    * Checks an incoming HTTP request to determine if it conforms to the
    * Cloud Event specification for this receiver.
    *
    * @param {Object} payload the HTTP request body
    * @param {Object} headers  the HTTP request headers
    * @returns {boolean} true if the the provided payload and headers conform to the spec
    * @throws {ValidationError} if the event does not conform to the spec
    */
  def check(payload: js.Object, headers: js.Object): Boolean = js.native
  /**
    * Parses an incoming HTTP request, converting it to a {CloudEvent}
    * instance if it conforms to the Cloud Event specification for this receiver.
    *
    * @param {Object} payload the HTTP request body
    * @param {Object} headers the HTTP request headers
    * @returns {CloudEvent} an instance of CloudEvent representing the incoming request
    * @throws {ValidationError} of the event does not conform to the spec
    */
  def parse(payload: js.Object, headers: js.Object): CloudEvent = js.native
}

object BinaryHTTPReceiver {
  @scala.inline
  def apply(
    check: (js.Object, js.Object) => Boolean,
    parse: (js.Object, js.Object) => CloudEvent,
    receiver: typings.cloudeventsSdk.receiverBinary1Mod.^  | typings.cloudeventsSdk.receiverBinary03Mod.^ 
  ): BinaryHTTPReceiver = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction2(check), parse = js.Any.fromFunction2(parse), receiver = receiver.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryHTTPReceiver]
  }
  @scala.inline
  implicit class BinaryHTTPReceiverOps[Self <: BinaryHTTPReceiver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCheck(value: (js.Object, js.Object) => Boolean): Self = this.set("check", js.Any.fromFunction2(value))
    @scala.inline
    def setParse(value: (js.Object, js.Object) => CloudEvent): Self = this.set("parse", js.Any.fromFunction2(value))
    @scala.inline
    def setReceiver(
      value: typings.cloudeventsSdk.receiverBinary1Mod.^  | typings.cloudeventsSdk.receiverBinary03Mod.^ 
    ): Self = this.set("receiver", value.asInstanceOf[js.Any])
  }
  
}

