package typings.cloudeventsSdk

import org.scalablytyped.runtime.Instantiable1
import typings.cloudeventsSdk.cloudeventMod.CE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object receiverBinaryMod {
  
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
  class ^ ()
    extends StObject
       with BinaryHTTPReceiver {
    def this(version: String) = this()
    
    /**
      * Checks an incoming HTTP request to determine if it conforms to the
      * Cloud Event specification for this receiver.
      *
      * @param {Object} payload the HTTP request body
      * @param {Object} headers  the HTTP request headers
      * @returns {boolean} true if the the provided payload and headers conform to the spec
      * @throws {ValidationError} if the event does not conform to the spec
      */
    /* CompleteClass */
    override def check(payload: js.Object, headers: js.Object): Boolean = js.native
    
    /**
      * Parses an incoming HTTP request, converting it to a {CloudEvent}
      * instance if it conforms to the Cloud Event specification for this receiver.
      *
      * @param {Object} payload the HTTP request body
      * @param {Object} headers the HTTP request headers
      * @returns {CloudEvent} an instance of CloudEvent representing the incoming request
      * @throws {ValidationError} of the event does not conform to the spec
      */
    /* CompleteClass */
    override def parse(payload: js.Object, headers: js.Object): CloudEvent = js.native
    
    /* CompleteClass */
    var receiver: typings.cloudeventsSdk.receiverBinary1Mod.^ | typings.cloudeventsSdk.receiverBinary03Mod.^ = js.native
  }
  
  /** @typedef {import("../../cloudevent")} CloudEvent */
  /**
    * A class that receives binary CloudEvents over HTTP. This class can be used
    * if you know that all incoming events will be using binary transport. If
    * events can come as either binary or structured, use {HTTPReceiver}.
    */
  trait BinaryHTTPReceiver extends StObject {
    
    /**
      * Checks an incoming HTTP request to determine if it conforms to the
      * Cloud Event specification for this receiver.
      *
      * @param {Object} payload the HTTP request body
      * @param {Object} headers  the HTTP request headers
      * @returns {boolean} true if the the provided payload and headers conform to the spec
      * @throws {ValidationError} if the event does not conform to the spec
      */
    def check(payload: js.Object, headers: js.Object): Boolean
    
    /**
      * Parses an incoming HTTP request, converting it to a {CloudEvent}
      * instance if it conforms to the Cloud Event specification for this receiver.
      *
      * @param {Object} payload the HTTP request body
      * @param {Object} headers the HTTP request headers
      * @returns {CloudEvent} an instance of CloudEvent representing the incoming request
      * @throws {ValidationError} of the event does not conform to the spec
      */
    def parse(payload: js.Object, headers: js.Object): CloudEvent
    
    var receiver: typings.cloudeventsSdk.receiverBinary1Mod.^ | typings.cloudeventsSdk.receiverBinary03Mod.^
  }
  object BinaryHTTPReceiver {
    
    inline def apply(
      check: (js.Object, js.Object) => Boolean,
      parse: (js.Object, js.Object) => CloudEvent,
      receiver: typings.cloudeventsSdk.receiverBinary1Mod.^ | typings.cloudeventsSdk.receiverBinary03Mod.^
    ): BinaryHTTPReceiver = {
      val __obj = js.Dynamic.literal(check = js.Any.fromFunction2(check), parse = js.Any.fromFunction2(parse), receiver = receiver.asInstanceOf[js.Any])
      __obj.asInstanceOf[BinaryHTTPReceiver]
    }
    
    extension [Self <: BinaryHTTPReceiver](x: Self) {
      
      inline def setCheck(value: (js.Object, js.Object) => Boolean): Self = StObject.set(x, "check", js.Any.fromFunction2(value))
      
      inline def setParse(value: (js.Object, js.Object) => CloudEvent): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
      
      inline def setReceiver(value: typings.cloudeventsSdk.receiverBinary1Mod.^ | typings.cloudeventsSdk.receiverBinary03Mod.^): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    }
  }
  
  trait CloudEvent extends StObject {
    
    var CloudEvent: Instantiable1[/* event */ CE, typings.cloudeventsSdk.cloudeventMod.CloudEvent]
  }
  object CloudEvent {
    
    inline def apply(CloudEvent: Instantiable1[/* event */ CE, typings.cloudeventsSdk.cloudeventMod.CloudEvent]): CloudEvent = {
      val __obj = js.Dynamic.literal(CloudEvent = CloudEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudEvent]
    }
    
    extension [Self <: CloudEvent](x: Self) {
      
      inline def setCloudEvent(value: Instantiable1[/* event */ CE, typings.cloudeventsSdk.cloudeventMod.CloudEvent]): Self = StObject.set(x, "CloudEvent", value.asInstanceOf[js.Any])
    }
  }
}
