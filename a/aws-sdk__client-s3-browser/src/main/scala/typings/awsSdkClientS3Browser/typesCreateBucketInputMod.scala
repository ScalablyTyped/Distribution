package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`authenticated-read`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`private`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`public-read-write`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`public-read`
import typings.awsSdkClientS3Browser.inputTypesUnionMod._InputTypesUnion
import typings.awsSdkClientS3Browser.typesCreateBucketConfigurationMod.CreateBucketConfiguration
import typings.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateBucketInputMod {
  
  @js.native
  trait CreateBucketInput extends _InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.native
    
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
      * <p>The canned ACL to apply to the bucket.</p>
      */
    var ACL: js.UndefOr[`private` | `public-read` | `public-read-write` | `authenticated-read` | String] = js.native
    
    /**
      * _BucketName shape
      */
    var Bucket: String = js.native
    
    /**
      * _CreateBucketConfiguration shape
      */
    var CreateBucketConfiguration: js.UndefOr[
        typings.awsSdkClientS3Browser.typesCreateBucketConfigurationMod.CreateBucketConfiguration
      ] = js.native
    
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
  object CreateBucketInput {
    
    @scala.inline
    def apply(Bucket: String): CreateBucketInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateBucketInput]
    }
    
    @scala.inline
    implicit class CreateBucketInputMutableBuilder[Self <: CreateBucketInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
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
      def setACL(value: `private` | `public-read` | `public-read-write` | `authenticated-read` | String): Self = StObject.set(x, "ACL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setACLUndefined: Self = StObject.set(x, "ACL", js.undefined)
      
      @scala.inline
      def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateBucketConfiguration(value: CreateBucketConfiguration): Self = StObject.set(x, "CreateBucketConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateBucketConfigurationUndefined: Self = StObject.set(x, "CreateBucketConfiguration", js.undefined)
      
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
