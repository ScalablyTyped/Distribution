package typings.awsSdk

import typings.awsSdk.cloudfrontSignerMod.Signer.CannedPolicy
import typings.awsSdk.cloudfrontSignerMod.Signer.CustomPolicy
import typings.awsSdk.cloudfrontSignerMod.Signer.SignerOptionsWithPolicy
import typings.awsSdk.cloudfrontSignerMod.Signer.SignerOptionsWithoutPolicy
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudfrontSignerMod {
  
  @JSImport("aws-sdk/lib/cloudfront/signer", "Signer")
  @js.native
  class Signer protected () extends StObject {
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
      callback: js.Function2[/* err */ Error, /* cookie */ CustomPolicy, Unit]
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
      callback: js.Function2[/* err */ Error, /* cookie */ CannedPolicy, Unit]
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
    def getSignedUrl(options: SignerOptionsWithPolicy, callback: js.Function2[/* err */ Error, /* url */ String, Unit]): Unit = js.native
    def getSignedUrl(options: SignerOptionsWithoutPolicy): String = js.native
    def getSignedUrl(
      options: SignerOptionsWithoutPolicy,
      callback: js.Function2[/* err */ Error, /* url */ String, Unit]
    ): Unit = js.native
  }
  object Signer {
    
    @js.native
    trait CannedPolicy extends StObject {
      
      var `CloudFront-Expires`: Double = js.native
      
      var `CloudFront-Key-Pair-Id`: String = js.native
      
      var `CloudFront-Signature`: String = js.native
    }
    object CannedPolicy {
      
      @scala.inline
      def apply(`CloudFront-Expires`: Double, `CloudFront-Key-Pair-Id`: String, `CloudFront-Signature`: String): CannedPolicy = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("CloudFront-Expires")(`CloudFront-Expires`.asInstanceOf[js.Any])
        __obj.updateDynamic("CloudFront-Key-Pair-Id")(`CloudFront-Key-Pair-Id`.asInstanceOf[js.Any])
        __obj.updateDynamic("CloudFront-Signature")(`CloudFront-Signature`.asInstanceOf[js.Any])
        __obj.asInstanceOf[CannedPolicy]
      }
      
      @scala.inline
      implicit class CannedPolicyMutableBuilder[Self <: CannedPolicy] (val x: Self) extends AnyVal {
        
        @scala.inline
        def `setCloudFront-Expires`(value: Double): Self = StObject.set(x, "CloudFront-Expires", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setCloudFront-Key-Pair-Id`(value: String): Self = StObject.set(x, "CloudFront-Key-Pair-Id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setCloudFront-Signature`(value: String): Self = StObject.set(x, "CloudFront-Signature", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait CustomPolicy extends StObject {
      
      var `CloudFront-Key-Pair-Id`: String = js.native
      
      var `CloudFront-Policy`: String = js.native
      
      var `CloudFront-Signature`: String = js.native
    }
    object CustomPolicy {
      
      @scala.inline
      def apply(`CloudFront-Key-Pair-Id`: String, `CloudFront-Policy`: String, `CloudFront-Signature`: String): CustomPolicy = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("CloudFront-Key-Pair-Id")(`CloudFront-Key-Pair-Id`.asInstanceOf[js.Any])
        __obj.updateDynamic("CloudFront-Policy")(`CloudFront-Policy`.asInstanceOf[js.Any])
        __obj.updateDynamic("CloudFront-Signature")(`CloudFront-Signature`.asInstanceOf[js.Any])
        __obj.asInstanceOf[CustomPolicy]
      }
      
      @scala.inline
      implicit class CustomPolicyMutableBuilder[Self <: CustomPolicy] (val x: Self) extends AnyVal {
        
        @scala.inline
        def `setCloudFront-Key-Pair-Id`(value: String): Self = StObject.set(x, "CloudFront-Key-Pair-Id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setCloudFront-Policy`(value: String): Self = StObject.set(x, "CloudFront-Policy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setCloudFront-Signature`(value: String): Self = StObject.set(x, "CloudFront-Signature", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait SignerOptionsWithPolicy extends StObject {
      
      /**
        * A CloudFront JSON policy. Required unless you pass in a url and an expiry time. 
        */
      var policy: String = js.native
    }
    object SignerOptionsWithPolicy {
      
      @scala.inline
      def apply(policy: String): SignerOptionsWithPolicy = {
        val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any])
        __obj.asInstanceOf[SignerOptionsWithPolicy]
      }
      
      @scala.inline
      implicit class SignerOptionsWithPolicyMutableBuilder[Self <: SignerOptionsWithPolicy] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait SignerOptionsWithoutPolicy extends StObject {
      
      /**
        * A Unix UTC timestamp indicating when the signature should expire. Required unless you pass in a full policy.
        */
      var expires: Double = js.native
      
      /**
        * The URL to which the signature will grant access. Required unless you pass in a full policy.
        */
      var url: String = js.native
    }
    object SignerOptionsWithoutPolicy {
      
      @scala.inline
      def apply(expires: Double, url: String): SignerOptionsWithoutPolicy = {
        val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[SignerOptionsWithoutPolicy]
      }
      
      @scala.inline
      implicit class SignerOptionsWithoutPolicyMutableBuilder[Self <: SignerOptionsWithoutPolicy] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
  }
}
