package typings.awsSdk

import typings.awsSdk.anon.TypeofManagedUpload
import typings.awsSdk.clientsS3Mod.PresignedPost
import typings.awsSdk.clientsS3Mod.PutObjectRequest
import typings.awsSdk.libS3ManagedUploadMod.ManagedUpload
import typings.awsSdk.libS3ManagedUploadMod.ManagedUpload.ManagedUploadOptions
import typings.awsSdk.libS3ManagedUploadMod.ManagedUpload.SendData
import typings.awsSdk.libS3PresignedPostMod.PresignedPost.Params
import typings.awsSdk.libServiceMod.Service
import typings.awsSdk.libServiceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libServicesS3Mod {
  
  @JSImport("aws-sdk/lib/services/s3", "S3Customizations")
  @js.native
  /**
    * Creates a new service object with a configuration object.
    */
  open class S3Customizations () extends Service {
    def this(config: ServiceConfigurationOptions) = this()
    
    /**
      * Get the form fields and target URL for direct POST uploading.
      */
    def createPresignedPost(params: Params): PresignedPost = js.native
    /**
      * Get the form fields and target URL for direct POST uploading.
      */
    def createPresignedPost(params: Params, callback: js.Function2[/* err */ js.Error, /* data */ PresignedPost, Unit]): Unit = js.native
    
    /**
      * Get a pre-signed URL for a given operation name.
      */
    def getSignedUrl(operation: String, params: Any): String = js.native
    /**
      * Get a pre-signed URL for a given operation name.
      */
    def getSignedUrl(operation: String, params: Any, callback: js.Function2[/* err */ js.Error, /* url */ String, Unit]): Unit = js.native
    
    /**
      * Returns a 'thenable' promise that will be resolved with a pre-signed URL for a given operation name.
      */
    def getSignedUrlPromise(operation: String, params: Any): js.Promise[String] = js.native
    
    /**
      * Uploads an arbitrarily sized buffer, blob, or stream, using intelligent
      * concurrent handling of parts if the payload is large enough. You can
      * configure the concurrent queue size by setting `options`. Note that this
      * is the only operation for which the SDK can retry requests with stream
      * bodies.
      */
    def upload(params: PutObjectRequest): ManagedUpload = js.native
    def upload(params: PutObjectRequest, callback: js.Function2[/* err */ js.Error, /* data */ SendData, Unit]): ManagedUpload = js.native
    def upload(
      params: PutObjectRequest,
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* data */ SendData, Unit]
    ): ManagedUpload = js.native
    def upload(params: PutObjectRequest, options: ManagedUploadOptions): ManagedUpload = js.native
    def upload(
      params: PutObjectRequest,
      options: ManagedUploadOptions,
      callback: js.Function2[/* err */ js.Error, /* data */ SendData, Unit]
    ): ManagedUpload = js.native
  }
  /* static members */
  object S3Customizations {
    
    @JSImport("aws-sdk/lib/services/s3", "S3Customizations")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("aws-sdk/lib/services/s3", "S3Customizations.ManagedUpload")
    @js.native
    def ManagedUpload: TypeofManagedUpload = js.native
    inline def ManagedUpload_=(x: TypeofManagedUpload): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ManagedUpload")(x.asInstanceOf[js.Any])
  }
}
