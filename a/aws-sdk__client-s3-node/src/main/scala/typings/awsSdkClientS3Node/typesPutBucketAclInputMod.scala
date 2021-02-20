package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`authenticated-read`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`private`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`public-read-write`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`public-read`
import typings.awsSdkClientS3Node.inputTypesUnionMod._InputTypesUnion
import typings.awsSdkClientS3Node.typesAccessControlPolicyMod.AccessControlPolicy
import typings.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutBucketAclInputMod {
  
  @js.native
  trait PutBucketAclInput extends _InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.native
    
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
    var $bucketEndpoint: js.UndefOr[String] = js.native
    
    /**
      * Whether to force path style URLs for S3 objects (e.g., https://s3.amazonaws.com/<bucketName>/<key> instead of https://<bucketName>.s3.amazonaws.com/<key>
      */
    @JSName("$forcePathStyle")
    var $forcePathStyle: js.UndefOr[Boolean] = js.native
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ] = js.native
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    
    /**
      * Whether to use the S3 Transfer Acceleration endpoint by default
      */
    @JSName("$useAccelerateEndpoint")
    var $useAccelerateEndpoint: js.UndefOr[Boolean] = js.native
    
    /**
      * Enables IPv6/IPv4 dualstack endpoint. When a DNS lookup is performed on an endpoint of this type, it returns an “A” record with an IPv4 address and an “AAAA” record with an IPv6 address. In most cases the network stack in the client environment will automatically prefer the AAAA record and make a connection using the IPv6 address. Note, however, that currently on Windows, the IPv4 address will be preferred.
      */
    @JSName("$useDualstackEndpoint")
    var $useDualstackEndpoint: js.UndefOr[Boolean] = js.native
    
    /**
      * <p>The canned ACL to apply to the bucket.</p>
      */
    var ACL: js.UndefOr[`private` | `public-read` | `public-read-write` | `authenticated-read` | String] = js.native
    
    /**
      * _AccessControlPolicy shape
      */
    var AccessControlPolicy: js.UndefOr[typings.awsSdkClientS3Node.typesAccessControlPolicyMod.AccessControlPolicy] = js.native
    
    /**
      * _BucketName shape
      */
    var Bucket: String = js.native
    
    /**
      * _ContentMD5 shape
      */
    var ContentMD5: js.UndefOr[String] = js.native
    
    /**
      * <p>Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.</p>
      */
    var GrantFullControl: js.UndefOr[String] = js.native
    
    /**
      * <p>Allows grantee to list the objects in the bucket.</p>
      */
    var GrantRead: js.UndefOr[String] = js.native
    
    /**
      * <p>Allows grantee to read the bucket ACL.</p>
      */
    var GrantReadACP: js.UndefOr[String] = js.native
    
    /**
      * <p>Allows grantee to create, overwrite, and delete any object in the bucket.</p>
      */
    var GrantWrite: js.UndefOr[String] = js.native
    
    /**
      * <p>Allows grantee to write the ACL for the applicable bucket.</p>
      */
    var GrantWriteACP: js.UndefOr[String] = js.native
  }
  object PutBucketAclInput {
    
    @scala.inline
    def apply(Bucket: String): PutBucketAclInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutBucketAclInput]
    }
    
    @scala.inline
    implicit class PutBucketAclInputMutableBuilder[Self <: PutBucketAclInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      @scala.inline
      def set$bucketEndpoint(value: String): Self = StObject.set(x, "$bucketEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$bucketEndpointUndefined: Self = StObject.set(x, "$bucketEndpoint", js.undefined)
      
      @scala.inline
      def set$forcePathStyle(value: Boolean): Self = StObject.set(x, "$forcePathStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$forcePathStyleUndefined: Self = StObject.set(x, "$forcePathStyle", js.undefined)
      
      @scala.inline
      def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      @scala.inline
      def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      @scala.inline
      def set$useAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "$useAccelerateEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$useAccelerateEndpointUndefined: Self = StObject.set(x, "$useAccelerateEndpoint", js.undefined)
      
      @scala.inline
      def set$useDualstackEndpoint(value: Boolean): Self = StObject.set(x, "$useDualstackEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$useDualstackEndpointUndefined: Self = StObject.set(x, "$useDualstackEndpoint", js.undefined)
      
      @scala.inline
      def setACL(value: `private` | `public-read` | `public-read-write` | `authenticated-read` | String): Self = StObject.set(x, "ACL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setACLUndefined: Self = StObject.set(x, "ACL", js.undefined)
      
      @scala.inline
      def setAccessControlPolicy(value: AccessControlPolicy): Self = StObject.set(x, "AccessControlPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessControlPolicyUndefined: Self = StObject.set(x, "AccessControlPolicy", js.undefined)
      
      @scala.inline
      def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentMD5(value: String): Self = StObject.set(x, "ContentMD5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentMD5Undefined: Self = StObject.set(x, "ContentMD5", js.undefined)
      
      @scala.inline
      def setGrantFullControl(value: String): Self = StObject.set(x, "GrantFullControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantFullControlUndefined: Self = StObject.set(x, "GrantFullControl", js.undefined)
      
      @scala.inline
      def setGrantRead(value: String): Self = StObject.set(x, "GrantRead", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantReadACP(value: String): Self = StObject.set(x, "GrantReadACP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantReadACPUndefined: Self = StObject.set(x, "GrantReadACP", js.undefined)
      
      @scala.inline
      def setGrantReadUndefined: Self = StObject.set(x, "GrantRead", js.undefined)
      
      @scala.inline
      def setGrantWrite(value: String): Self = StObject.set(x, "GrantWrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantWriteACP(value: String): Self = StObject.set(x, "GrantWriteACP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantWriteACPUndefined: Self = StObject.set(x, "GrantWriteACP", js.undefined)
      
      @scala.inline
      def setGrantWriteUndefined: Self = StObject.set(x, "GrantWrite", js.undefined)
    }
  }
}
