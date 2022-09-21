package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`authenticated-read`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`private`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`public-read-write`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`public-read`
import typings.awsSdkClientS3Browser.inputTypesUnionMod._InputTypesUnion
import typings.awsSdkClientS3Browser.typesAccessControlPolicyMod.AccessControlPolicy
import typings.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutBucketAclInputMod {
  
  trait PutBucketAclInput
    extends StObject
       with _InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Whether to use the bucket name as the endpoint for this request. The bucket
      * name must be a domain name with a CNAME record alias to an appropriate virtual
      * hosted-style S3 hostname, e.g. a bucket of `images.johnsmith.net` and a DNS
      * record of:
      *
      * ```
      * images.johnsmith.net CNAME 			images.johnsmith.net.s3.amazonaws.com.
      * ```
      *
      * @see https://docs.aws.amazon.com/AmazonS3/latest/dev/VirtualHosting.html#VirtualHostingCustomURLs
      */
    @JSName("$bucketEndpoint")
    var $bucketEndpoint: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to force path style URLs for S3 objects (e.g., https://s3.amazonaws.com/<bucketName>/<key> instead of https://<bucketName>.s3.amazonaws.com/<key>
      */
    @JSName("$forcePathStyle")
    var $forcePathStyle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ] = js.undefined
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to use the S3 Transfer Acceleration endpoint by default
      */
    @JSName("$useAccelerateEndpoint")
    var $useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables IPv6/IPv4 dualstack endpoint. When a DNS lookup is performed on an endpoint of this type, it returns an “A” record with an IPv4 address and an “AAAA” record with an IPv6 address. In most cases the network stack in the client environment will automatically prefer the AAAA record and make a connection using the IPv6 address. Note, however, that currently on Windows, the IPv4 address will be preferred.
      */
    @JSName("$useDualstackEndpoint")
    var $useDualstackEndpoint: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>The canned ACL to apply to the bucket.</p>
      */
    var ACL: js.UndefOr[`private` | `public-read` | `public-read-write` | `authenticated-read` | String] = js.undefined
    
    /**
      * _AccessControlPolicy shape
      */
    var AccessControlPolicy: js.UndefOr[typings.awsSdkClientS3Browser.typesAccessControlPolicyMod.AccessControlPolicy] = js.undefined
    
    /**
      * _BucketName shape
      */
    var Bucket: String
    
    /**
      * _ContentMD5 shape
      */
    var ContentMD5: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.</p>
      */
    var GrantFullControl: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Allows grantee to list the objects in the bucket.</p>
      */
    var GrantRead: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Allows grantee to read the bucket ACL.</p>
      */
    var GrantReadACP: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Allows grantee to create, overwrite, and delete any object in the bucket.</p>
      */
    var GrantWrite: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Allows grantee to write the ACL for the applicable bucket.</p>
      */
    var GrantWriteACP: js.UndefOr[String] = js.undefined
  }
  object PutBucketAclInput {
    
    inline def apply(Bucket: String): PutBucketAclInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutBucketAclInput]
    }
    
    extension [Self <: PutBucketAclInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$bucketEndpoint(value: String): Self = StObject.set(x, "$bucketEndpoint", value.asInstanceOf[js.Any])
      
      inline def set$bucketEndpointUndefined: Self = StObject.set(x, "$bucketEndpoint", js.undefined)
      
      inline def set$forcePathStyle(value: Boolean): Self = StObject.set(x, "$forcePathStyle", value.asInstanceOf[js.Any])
      
      inline def set$forcePathStyleUndefined: Self = StObject.set(x, "$forcePathStyle", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def set$useAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "$useAccelerateEndpoint", value.asInstanceOf[js.Any])
      
      inline def set$useAccelerateEndpointUndefined: Self = StObject.set(x, "$useAccelerateEndpoint", js.undefined)
      
      inline def set$useDualstackEndpoint(value: Boolean): Self = StObject.set(x, "$useDualstackEndpoint", value.asInstanceOf[js.Any])
      
      inline def set$useDualstackEndpointUndefined: Self = StObject.set(x, "$useDualstackEndpoint", js.undefined)
      
      inline def setACL(value: `private` | `public-read` | `public-read-write` | `authenticated-read` | String): Self = StObject.set(x, "ACL", value.asInstanceOf[js.Any])
      
      inline def setACLUndefined: Self = StObject.set(x, "ACL", js.undefined)
      
      inline def setAccessControlPolicy(value: AccessControlPolicy): Self = StObject.set(x, "AccessControlPolicy", value.asInstanceOf[js.Any])
      
      inline def setAccessControlPolicyUndefined: Self = StObject.set(x, "AccessControlPolicy", js.undefined)
      
      inline def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
      
      inline def setContentMD5(value: String): Self = StObject.set(x, "ContentMD5", value.asInstanceOf[js.Any])
      
      inline def setContentMD5Undefined: Self = StObject.set(x, "ContentMD5", js.undefined)
      
      inline def setGrantFullControl(value: String): Self = StObject.set(x, "GrantFullControl", value.asInstanceOf[js.Any])
      
      inline def setGrantFullControlUndefined: Self = StObject.set(x, "GrantFullControl", js.undefined)
      
      inline def setGrantRead(value: String): Self = StObject.set(x, "GrantRead", value.asInstanceOf[js.Any])
      
      inline def setGrantReadACP(value: String): Self = StObject.set(x, "GrantReadACP", value.asInstanceOf[js.Any])
      
      inline def setGrantReadACPUndefined: Self = StObject.set(x, "GrantReadACP", js.undefined)
      
      inline def setGrantReadUndefined: Self = StObject.set(x, "GrantRead", js.undefined)
      
      inline def setGrantWrite(value: String): Self = StObject.set(x, "GrantWrite", value.asInstanceOf[js.Any])
      
      inline def setGrantWriteACP(value: String): Self = StObject.set(x, "GrantWriteACP", value.asInstanceOf[js.Any])
      
      inline def setGrantWriteACPUndefined: Self = StObject.set(x, "GrantWriteACP", js.undefined)
      
      inline def setGrantWriteUndefined: Self = StObject.set(x, "GrantWrite", js.undefined)
    }
  }
}
