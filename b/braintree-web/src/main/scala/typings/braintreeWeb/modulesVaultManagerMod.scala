package typings.braintreeWeb

import typings.braintreeWeb.anon.Authorization
import typings.braintreeWeb.anon.DefaultFirst
import typings.braintreeWeb.modulesCoreMod.callback
import typings.braintreeWeb.modulesGooglePaymentMod.GooglePaymentDetails
import typings.braintreeWeb.modulesHostedFieldsMod.HostedFieldsAccountDetails
import typings.braintreeWeb.modulesPaypalMod.PayPalAccountDetails
import typings.braintreeWeb.modulesThreeDSecureMod.ThreeDSecureAccountDetails
import typings.braintreeWeb.modulesUnionpayMod.UnionPayAccountDetails
import typings.braintreeWeb.modulesVenmoMod.VenmoAccountDetails
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesVaultManagerMod {
  
  @JSImport("braintree-web/modules/vault-manager", "VaultManager")
  @js.native
  open class VaultManager () extends StObject {
    
    /**
      * Fetches payment methods owned by the customer whose id was used to generate the client token used to create the client.
      * @see https://braintree.github.io/braintree-web/3.75.0/VaultManager.html#fetchPaymentMethods
      */
    def fetchPaymentMethods(): js.Promise[js.Array[FetchPaymentMethodsPayload]] = js.native
    def fetchPaymentMethods(callback: callback[js.Array[FetchPaymentMethodsPayload]]): Unit = js.native
    def fetchPaymentMethods(options: DefaultFirst): js.Promise[js.Array[FetchPaymentMethodsPayload]] = js.native
    def fetchPaymentMethods(options: DefaultFirst, callback: callback[js.Array[FetchPaymentMethodsPayload]]): Unit = js.native
    
    /**
      * Cleanly tear down anything set up by create.
      * @see https://braintree.github.io/braintree-web/3.75.0/VaultManager.html#teardown
      */
    def teardown(): js.Promise[Unit] = js.native
    def teardown(callback: callback[Unit]): Unit = js.native
  }
  /* static members */
  object VaultManager {
    
    @JSImport("braintree-web/modules/vault-manager", "VaultManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(options: Authorization): js.Promise[VaultManager] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[VaultManager]]
    inline def create(options: Authorization, callback: callback[VaultManager]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  trait FetchPaymentMethodsPayload extends StObject {
    
    var default: Boolean
    
    var binData: js.UndefOr[Record[String, Any]] = js.undefined
    
    var description: String | Null
    
    var details: js.UndefOr[
        HostedFieldsAccountDetails | ThreeDSecureAccountDetails | GooglePaymentDetails | PayPalAccountDetails | UnionPayAccountDetails | VenmoAccountDetails | (Record[String, Any])
      ] = js.undefined
    
    var nonce: String
    
    var `type`: String
  }
  object FetchPaymentMethodsPayload {
    
    inline def apply(default: Boolean, nonce: String, `type`: String): FetchPaymentMethodsPayload = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], description = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchPaymentMethodsPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetchPaymentMethodsPayload] (val x: Self) extends AnyVal {
      
      inline def setBinData(value: Record[String, Any]): Self = StObject.set(x, "binData", value.asInstanceOf[js.Any])
      
      inline def setBinDataUndefined: Self = StObject.set(x, "binData", js.undefined)
      
      inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDetails(
        value: HostedFieldsAccountDetails | ThreeDSecureAccountDetails | GooglePaymentDetails | PayPalAccountDetails | UnionPayAccountDetails | VenmoAccountDetails | (Record[String, Any])
      ): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
