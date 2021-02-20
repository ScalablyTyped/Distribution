package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanaryCodeInput extends StObject {
  
  /**
    * The entry point to use for the source code when running the canary. This value must end with the string .handler.
    */
  var Handler: String = js.native
  
  /**
    * If your canary script is located in S3, specify the full bucket name here. The bucket must already exist. Specify the full bucket name, including s3:// as the start of the bucket name.
    */
  var S3Bucket: js.UndefOr[String] = js.native
  
  /**
    * The S3 key of your script. For more information, see Working with Amazon S3 Objects.
    */
  var S3Key: js.UndefOr[String] = js.native
  
  /**
    * The S3 version ID of your script.
    */
  var S3Version: js.UndefOr[String] = js.native
  
  /**
    * If you input your canary script directly into the canary instead of referring to an S3 location, the value of this parameter is the .zip file that contains the script. It can be up to 5 MB.
    */
  var ZipFile: js.UndefOr[_Blob] = js.native
}
object CanaryCodeInput {
  
  @scala.inline
  def apply(Handler: String): CanaryCodeInput = {
    val __obj = js.Dynamic.literal(Handler = Handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanaryCodeInput]
  }
  
  @scala.inline
  implicit class CanaryCodeInputMutableBuilder[Self <: CanaryCodeInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler(value: String): Self = StObject.set(x, "Handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Bucket(value: String): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
    
    @scala.inline
    def setS3Key(value: String): Self = StObject.set(x, "S3Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyUndefined: Self = StObject.set(x, "S3Key", js.undefined)
    
    @scala.inline
    def setS3Version(value: String): Self = StObject.set(x, "S3Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3VersionUndefined: Self = StObject.set(x, "S3Version", js.undefined)
    
    @scala.inline
    def setZipFile(value: _Blob): Self = StObject.set(x, "ZipFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZipFileUndefined: Self = StObject.set(x, "ZipFile", js.undefined)
  }
}
