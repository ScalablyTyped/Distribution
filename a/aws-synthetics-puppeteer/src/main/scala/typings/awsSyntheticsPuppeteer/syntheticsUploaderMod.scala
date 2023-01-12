package typings.awsSyntheticsPuppeteer

import org.scalablytyped.runtime.Shortcut
import typings.awsSyntheticsPuppeteer.anon.FileUploadErrors
import typings.awsSyntheticsPuppeteer.anon.S3Bucket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syntheticsUploaderMod extends Shortcut {
  
  @JSImport("SyntheticsUploader", JSImport.Namespace)
  @js.native
  val ^ : SyntheticsUploader = js.native
  
  /**
    * Class to help facilitate artifact uploads to S3.
    */
  trait SyntheticsUploader extends StObject {
    
    var bucketLocationError: String
    
    var canaryName: Any
    
    var dateTimeInUTC: Any
    
    def getS3Client(): Any
    
    def getS3Path(): String
    
    def hasUploadedArtifacts(): Boolean
    
    def reset(): Unit
    
    var s3BaseFilePath: Any
    
    var s3Client: Any
    
    var s3UploadLocation: S3Bucket
    
    def setCanaryDetails(canaryName: Any, s3BaseFilePath: Any, dateTimeInUTC: Any): Unit
    
    var setUpDone: Boolean
    
    var setUpError: Any
    
    def setUpUploader(): js.Promise[Unit]
    
    def uploadAndDeleteFiles(filePaths: Any): js.Promise[js.Array[Any]]
    
    /**
      *  Uploads artifacts to S3 and returns an Array of error messages.
      *  @param artifacts - {String | Array.<String> | Object.<SyntheticsResult> | Array.<SyntheticsResult>} - A single path or an array of paths to a directory or
      *  individual artifact,
      *  OR A single Object or an array of objects of ScreenshotResult.
      *  @returns Array of error messages
      */
    def uploadArtifacts(artifacts: Any): js.Promise[js.Array[String]]
    
    def uploadFilesToS3(files: Any): js.Promise[FileUploadErrors]
    
    /**
      *  Uploads screenshots to S3 and returns an Array of error messages.
      *  @param artifacts - {Object.<SyntheticsResult> | Array.<SyntheticsResult>} - A single Object or an array of objects of ScreenshotResult.
      *  @returns Array of error messages
      */
    def uploadScreenshots(screenshotResults: Any): js.Promise[js.Array[String]]
    
    var uploadedArtifacts: Boolean
  }
  object SyntheticsUploader {
    
    inline def apply(
      bucketLocationError: String,
      canaryName: Any,
      dateTimeInUTC: Any,
      getS3Client: () => Any,
      getS3Path: () => String,
      hasUploadedArtifacts: () => Boolean,
      reset: () => Unit,
      s3BaseFilePath: Any,
      s3Client: Any,
      s3UploadLocation: S3Bucket,
      setCanaryDetails: (Any, Any, Any) => Unit,
      setUpDone: Boolean,
      setUpError: Any,
      setUpUploader: () => js.Promise[Unit],
      uploadAndDeleteFiles: Any => js.Promise[js.Array[Any]],
      uploadArtifacts: Any => js.Promise[js.Array[String]],
      uploadFilesToS3: Any => js.Promise[FileUploadErrors],
      uploadScreenshots: Any => js.Promise[js.Array[String]],
      uploadedArtifacts: Boolean
    ): SyntheticsUploader = {
      val __obj = js.Dynamic.literal(bucketLocationError = bucketLocationError.asInstanceOf[js.Any], canaryName = canaryName.asInstanceOf[js.Any], dateTimeInUTC = dateTimeInUTC.asInstanceOf[js.Any], getS3Client = js.Any.fromFunction0(getS3Client), getS3Path = js.Any.fromFunction0(getS3Path), hasUploadedArtifacts = js.Any.fromFunction0(hasUploadedArtifacts), reset = js.Any.fromFunction0(reset), s3BaseFilePath = s3BaseFilePath.asInstanceOf[js.Any], s3Client = s3Client.asInstanceOf[js.Any], s3UploadLocation = s3UploadLocation.asInstanceOf[js.Any], setCanaryDetails = js.Any.fromFunction3(setCanaryDetails), setUpDone = setUpDone.asInstanceOf[js.Any], setUpError = setUpError.asInstanceOf[js.Any], setUpUploader = js.Any.fromFunction0(setUpUploader), uploadAndDeleteFiles = js.Any.fromFunction1(uploadAndDeleteFiles), uploadArtifacts = js.Any.fromFunction1(uploadArtifacts), uploadFilesToS3 = js.Any.fromFunction1(uploadFilesToS3), uploadScreenshots = js.Any.fromFunction1(uploadScreenshots), uploadedArtifacts = uploadedArtifacts.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyntheticsUploader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyntheticsUploader] (val x: Self) extends AnyVal {
      
      inline def setBucketLocationError(value: String): Self = StObject.set(x, "bucketLocationError", value.asInstanceOf[js.Any])
      
      inline def setCanaryName(value: Any): Self = StObject.set(x, "canaryName", value.asInstanceOf[js.Any])
      
      inline def setDateTimeInUTC(value: Any): Self = StObject.set(x, "dateTimeInUTC", value.asInstanceOf[js.Any])
      
      inline def setGetS3Client(value: () => Any): Self = StObject.set(x, "getS3Client", js.Any.fromFunction0(value))
      
      inline def setGetS3Path(value: () => String): Self = StObject.set(x, "getS3Path", js.Any.fromFunction0(value))
      
      inline def setHasUploadedArtifacts(value: () => Boolean): Self = StObject.set(x, "hasUploadedArtifacts", js.Any.fromFunction0(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setS3BaseFilePath(value: Any): Self = StObject.set(x, "s3BaseFilePath", value.asInstanceOf[js.Any])
      
      inline def setS3Client(value: Any): Self = StObject.set(x, "s3Client", value.asInstanceOf[js.Any])
      
      inline def setS3UploadLocation(value: S3Bucket): Self = StObject.set(x, "s3UploadLocation", value.asInstanceOf[js.Any])
      
      inline def setSetCanaryDetails(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "setCanaryDetails", js.Any.fromFunction3(value))
      
      inline def setSetUpDone(value: Boolean): Self = StObject.set(x, "setUpDone", value.asInstanceOf[js.Any])
      
      inline def setSetUpError(value: Any): Self = StObject.set(x, "setUpError", value.asInstanceOf[js.Any])
      
      inline def setSetUpUploader(value: () => js.Promise[Unit]): Self = StObject.set(x, "setUpUploader", js.Any.fromFunction0(value))
      
      inline def setUploadAndDeleteFiles(value: Any => js.Promise[js.Array[Any]]): Self = StObject.set(x, "uploadAndDeleteFiles", js.Any.fromFunction1(value))
      
      inline def setUploadArtifacts(value: Any => js.Promise[js.Array[String]]): Self = StObject.set(x, "uploadArtifacts", js.Any.fromFunction1(value))
      
      inline def setUploadFilesToS3(value: Any => js.Promise[FileUploadErrors]): Self = StObject.set(x, "uploadFilesToS3", js.Any.fromFunction1(value))
      
      inline def setUploadScreenshots(value: Any => js.Promise[js.Array[String]]): Self = StObject.set(x, "uploadScreenshots", js.Any.fromFunction1(value))
      
      inline def setUploadedArtifacts(value: Boolean): Self = StObject.set(x, "uploadedArtifacts", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = SyntheticsUploader
  
  /* This means you don't have to write `^`, but can instead just say `syntheticsUploaderMod.foo` */
  override def _to: SyntheticsUploader = ^
}
