package typings.braintreeWeb

import typings.braintreeWeb.anon.AddFrame
import typings.braintreeWeb.anon.BinNonce
import typings.braintreeWeb.anon.RemoveFrame
import typings.braintreeWeb.anon.Version
import typings.braintreeWeb.coreMod.BraintreeError
import typings.braintreeWeb.coreMod.callback
import typings.std.HTMLIFrameElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object threeDSecureMod {
  
  @js.native
  trait ThreeDSecure extends StObject {
    
    /**
      * @description The current version of the SDK, i.e. `3.0.2`.
      */
    var VERSION: String = js.native
    
    def addFrameCallback(): Unit = js.native
    def addFrameCallback(err: js.UndefOr[scala.Nothing], iframe: HTMLIFrameElement): Unit = js.native
    def addFrameCallback(err: BraintreeError): Unit = js.native
    def addFrameCallback(err: BraintreeError, iframe: HTMLIFrameElement): Unit = js.native
    
    /**
      * Cancel the 3DS flow and return the verification payload if available.     * @example
      * threeDSecure.cancelVerifyCard(function (err, verifyPayload) {
      *   if (err) {
      *     // Handle error
      *     console.log(err.message); // No verification payload available
      *     return;
      *   }
      *
      *   verifyPayload.nonce; // The nonce returned from the 3ds lookup call
      *   verifyPayload.liabilityShifted; // boolean
      *   verifyPayload.liabilityShiftPossible; // boolean
      * });
      */
    def cancelVerifyCard(callback: callback[_]): Unit = js.native
    
    /**
      * braintree.threeDSecure.create({
      *   client: client
      * }, callback);
      */
    def create(options: Version): js.Promise[ThreeDSecure] = js.native
    def create(options: Version, callback: callback[_]): Unit = js.native
    
    /**
      * Gather the data needed for a 3D Secure lookup call.
      *     * @example
      * <caption>Preparing data for a 3D Secure lookup</caption>
      * threeDSecure.prepareLookup({
      *   nonce: hostedFieldsTokenizationPayload.nonce,
      *   bin: hostedFieldsTokenizationPayload.details.bin
      * }, function (err, payload) {
      *   if (err) {
      *     console.error(err);
      *     return;
      *   }
      *
      *   // send payload to server to do server side lookup
      * });
      */
    def prepareLookup(options: BinNonce): js.Promise[String] = js.native
    def prepareLookup(options: BinNonce, callback: callback[_]): Unit = js.native
    
    /**
      * @description The callback used for options.removeFrame in {@link ThreeDSecure#verifyCard|verifyCard}.
      */
    def removeFrameCallback(): Unit = js.native
    
    /**
      * Cleanly tear down anything set up by {@link module:braintree-web/three-d-secure.create|create}
      */
    def teardown(): Unit = js.native
    def teardown(callback: callback[_]): Unit = js.native
    
    /**
      * Launch the 3D Secure login flow, returning a nonce payload.
      * @example
      * <caption>Verifying an existing nonce with 3DS</caption>
      * var my3DSContainer;
      *
      * threeDSecure.verifyCard({
      *   nonce: existingNonce,
      *   amount: 123.45,
      *   addFrame: function (err, iframe) {
      *     // Set up your UI and add the iframe.
      *     my3DSContainer = document.createElement('div');
      *     my3DSContainer.appendChild(iframe);
      *     document.body.appendChild(my3DSContainer);
      *   },
      *   removeFrame: function () {
      *     // Remove UI that you added in addFrame.
      *     document.body.removeChild(my3DSContainer);
      *   }
      * }, function (err, payload) {
      *   if (err) {
      *     console.error(err);
      *     return;
      *   }
      *
      *   if (payload.liabilityShifted) {
      *     // Liablity has shifted
      *     submitNonceToServer(payload.nonce);
      *   } else if (payload.liabilityShiftPossible) {
      *     // Liablity may still be shifted
      *     // Decide if you want to submit the nonce
      *   } else {
      *     // Liablity has not shifted and will not shift
      *     // Decide if you want to submit the nonce
      *   }
      * });
      */
    def verifyCard(options: AddFrame): js.Promise[ThreeDSecureVerifyPayload] = js.native
    def verifyCard(options: RemoveFrame, callback: callback[_]): Unit = js.native
  }
  
  @js.native
  trait ThreeDSecureAccountDetails extends StObject {
    
    var cardType: String = js.native
    
    var lastTwo: String = js.native
  }
  object ThreeDSecureAccountDetails {
    
    @scala.inline
    def apply(cardType: String, lastTwo: String): ThreeDSecureAccountDetails = {
      val __obj = js.Dynamic.literal(cardType = cardType.asInstanceOf[js.Any], lastTwo = lastTwo.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThreeDSecureAccountDetails]
    }
    
    @scala.inline
    implicit class ThreeDSecureAccountDetailsMutableBuilder[Self <: ThreeDSecureAccountDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCardType(value: String): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastTwo(value: String): Self = StObject.set(x, "lastTwo", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ThreeDSecureVerifyPayload extends StObject {
    
    var description: String = js.native
    
    var details: ThreeDSecureAccountDetails = js.native
    
    var liabilityShiftPossible: Boolean = js.native
    
    var liabilityShifted: Boolean = js.native
    
    var nonce: String = js.native
  }
  object ThreeDSecureVerifyPayload {
    
    @scala.inline
    def apply(
      description: String,
      details: ThreeDSecureAccountDetails,
      liabilityShiftPossible: Boolean,
      liabilityShifted: Boolean,
      nonce: String
    ): ThreeDSecureVerifyPayload = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], liabilityShiftPossible = liabilityShiftPossible.asInstanceOf[js.Any], liabilityShifted = liabilityShifted.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThreeDSecureVerifyPayload]
    }
    
    @scala.inline
    implicit class ThreeDSecureVerifyPayloadMutableBuilder[Self <: ThreeDSecureVerifyPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetails(value: ThreeDSecureAccountDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiabilityShiftPossible(value: Boolean): Self = StObject.set(x, "liabilityShiftPossible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiabilityShifted(value: Boolean): Self = StObject.set(x, "liabilityShifted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    }
  }
}
