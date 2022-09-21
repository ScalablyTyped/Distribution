package typings.awsSdk

import typings.awsSdk.cloudfrontSignerMod.Signer.CannedPolicy
import typings.awsSdk.cloudfrontSignerMod.Signer.CustomPolicy
import typings.awsSdk.cloudfrontSignerMod.Signer.SignerOptionsWithPolicy
import typings.awsSdk.cloudfrontSignerMod.Signer.SignerOptionsWithoutPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudfrontSignerMod {
  
  @JSImport("aws-sdk/lib/cloudfront/signer", "Signer")
  @js.native
  open class Signer protected () extends StObject {
    /**
      * A signer object can be used to generate signed URLs and cookies for granting access to content on restricted CloudFront distributions.
      * 
      * @param {string} keyPairId - The ID of the CloudFront key pair being used.
      * @param {string} privateKey - A private key in RSA format.
      */
    def this(keyPairId: String, privateKey: String) = this()
    
    /**
      * Create a signed Amazon CloudFront Cookie.
      */
    def getSignedCookie(options: SignerOptionsWithPolicy): CustomPolicy = js.native
    /**
      * Create a signed Amazon CloudFront Cookie.
      */
    def getSignedCookie(
      options: SignerOptionsWithPolicy,
      callback: js.Function2[/* err */ js.Error, /* cookie */ CustomPolicy, Unit]
    ): Unit = js.native
    /**
      * Create a signed Amazon CloudFront Cookie.
      */
    def getSignedCookie(options: SignerOptionsWithoutPolicy): CannedPolicy = js.native
    /**
      * Create a signed Amazon CloudFront Cookie.
      */
    def getSignedCookie(
      options: SignerOptionsWithoutPolicy,
      callback: js.Function2[/* err */ js.Error, /* cookie */ CannedPolicy, Unit]
    ): Unit = js.native
    
    /**
      * Create a signed Amazon CloudFront URL.
      * Keep in mind that URLs meant for use in media/flash players may have different requirements for URL formats (e.g. some require that the extension be removed, some require the file name to be prefixed - mp4:, some require you to add "/cfx/st" into your URL).
      */
    def getSignedUrl(options: SignerOptionsWithPolicy): String = js.native
    /**
      * Create a signed Amazon CloudFront URL.
      * Keep in mind that URLs meant for use in media/flash players may have different requirements for URL formats (e.g. some require that the extension be removed, some require the file name to be prefixed - mp4:, some require you to add "/cfx/st" into your URL).
      */
    def getSignedUrl(
      options: SignerOptionsWithPolicy,
      callback: js.Function2[/* err */ js.Error, /* url */ String, Unit]
    ): Unit = js.native
    def getSignedUrl(options: SignerOptionsWithoutPolicy): String = js.native
    def getSignedUrl(
      options: SignerOptionsWithoutPolicy,
      callback: js.Function2[/* err */ js.Error, /* url */ String, Unit]
    ): Unit = js.native
  }
  object Signer {
    
    trait CannedPolicy extends StObject {
      
      var `CloudFront-Expires`: Double
      
      var `CloudFront-Key-Pair-Id`: String
      
      var `CloudFront-Signature`: String
    }
    object CannedPolicy {
      
      inline def apply(`CloudFront-Expires`: Double, `CloudFront-Key-Pair-Id`: String, `CloudFront-Signature`: String): CannedPolicy = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("CloudFront-Expires")(`CloudFront-Expires`.asInstanceOf[js.Any])
        __obj.updateDynamic("CloudFront-Key-Pair-Id")(`CloudFront-Key-Pair-Id`.asInstanceOf[js.Any])
        __obj.updateDynamic("CloudFront-Signature")(`CloudFront-Signature`.asInstanceOf[js.Any])
        __obj.asInstanceOf[CannedPolicy]
      }
      
      extension [Self <: CannedPolicy](x: Self) {
        
        inline def `setCloudFront-Expires`(value: Double): Self = StObject.set(x, "CloudFront-Expires", value.asInstanceOf[js.Any])
        
        inline def `setCloudFront-Key-Pair-Id`(value: String): Self = StObject.set(x, "CloudFront-Key-Pair-Id", value.asInstanceOf[js.Any])
        
        inline def `setCloudFront-Signature`(value: String): Self = StObject.set(x, "CloudFront-Signature", value.asInstanceOf[js.Any])
      }
    }
    
    trait CustomPolicy extends StObject {
      
      var `CloudFront-Key-Pair-Id`: String
      
      var `CloudFront-Policy`: String
      
      var `CloudFront-Signature`: String
    }
    object CustomPolicy {
      
      inline def apply(`CloudFront-Key-Pair-Id`: String, `CloudFront-Policy`: String, `CloudFront-Signature`: String): CustomPolicy = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("CloudFront-Key-Pair-Id")(`CloudFront-Key-Pair-Id`.asInstanceOf[js.Any])
        __obj.updateDynamic("CloudFront-Policy")(`CloudFront-Policy`.asInstanceOf[js.Any])
        __obj.updateDynamic("CloudFront-Signature")(`CloudFront-Signature`.asInstanceOf[js.Any])
        __obj.asInstanceOf[CustomPolicy]
      }
      
      extension [Self <: CustomPolicy](x: Self) {
        
        inline def `setCloudFront-Key-Pair-Id`(value: String): Self = StObject.set(x, "CloudFront-Key-Pair-Id", value.asInstanceOf[js.Any])
        
        inline def `setCloudFront-Policy`(value: String): Self = StObject.set(x, "CloudFront-Policy", value.asInstanceOf[js.Any])
        
        inline def `setCloudFront-Signature`(value: String): Self = StObject.set(x, "CloudFront-Signature", value.asInstanceOf[js.Any])
      }
    }
    
    trait SignerOptionsWithPolicy extends StObject {
      
      /**
        * A CloudFront JSON policy. Required unless you pass in a url and an expiry time. 
        */
      var policy: String
    }
    object SignerOptionsWithPolicy {
      
      inline def apply(policy: String): SignerOptionsWithPolicy = {
        val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any])
        __obj.asInstanceOf[SignerOptionsWithPolicy]
      }
      
      extension [Self <: SignerOptionsWithPolicy](x: Self) {
        
        inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      }
    }
    
    trait SignerOptionsWithoutPolicy extends StObject {
      
      /**
        * A Unix UTC timestamp indicating when the signature should expire. Required unless you pass in a full policy.
        */
      var expires: Double
      
      /**
        * The URL to which the signature will grant access. Required unless you pass in a full policy.
        */
      var url: String
    }
    object SignerOptionsWithoutPolicy {
      
      inline def apply(expires: Double, url: String): SignerOptionsWithoutPolicy = {
        val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[SignerOptionsWithoutPolicy]
      }
      
      extension [Self <: SignerOptionsWithoutPolicy](x: Self) {
        
        inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
  }
}
