package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanaryCodeInput extends StObject {
  
  /**
    * The entry point to use for the source code when running the canary. For canaries that use the syn-python-selenium-1.0 runtime or a syn-nodejs.puppeteer runtime earlier than syn-nodejs.puppeteer-3.4, the handler must be specified as  fileName.handler. For syn-python-selenium-1.1, syn-nodejs.puppeteer-3.4, and later runtimes, the handler can be specified as  fileName.functionName , or you can specify a folder where canary scripts reside as  folder/fileName.functionName .
    */
  var Handler: CodeHandler
  
  /**
    * If your canary script is located in S3, specify the bucket name here. Do not include s3:// as the start of the bucket name.
    */
  var S3Bucket: js.UndefOr[String] = js.undefined
  
  /**
    * The S3 key of your script. For more information, see Working with Amazon S3 Objects.
    */
  var S3Key: js.UndefOr[String] = js.undefined
  
  /**
    * The S3 version ID of your script.
    */
  var S3Version: js.UndefOr[String] = js.undefined
  
  /**
    * If you input your canary script directly into the canary instead of referring to an S3 location, the value of this parameter is the base64-encoded contents of the .zip file that contains the script. It must be smaller than 225 Kb. For large canary scripts, we recommend that you use an S3 location instead of inputting it directly with this parameter.
    */
  var ZipFile: js.UndefOr[_Blob] = js.undefined
}
object CanaryCodeInput {
  
  inline def apply(Handler: CodeHandler): CanaryCodeInput = {
    val __obj = js.Dynamic.literal(Handler = Handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanaryCodeInput]
  }
  
  extension [Self <: CanaryCodeInput](x: Self) {
    
    inline def setHandler(value: CodeHandler): Self = StObject.set(x, "Handler", value.asInstanceOf[js.Any])
    
    inline def setS3Bucket(value: String): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
    
    inline def setS3Key(value: String): Self = StObject.set(x, "S3Key", value.asInstanceOf[js.Any])
    
    inline def setS3KeyUndefined: Self = StObject.set(x, "S3Key", js.undefined)
    
    inline def setS3Version(value: String): Self = StObject.set(x, "S3Version", value.asInstanceOf[js.Any])
    
    inline def setS3VersionUndefined: Self = StObject.set(x, "S3Version", js.undefined)
    
    inline def setZipFile(value: _Blob): Self = StObject.set(x, "ZipFile", value.asInstanceOf[js.Any])
    
    inline def setZipFileUndefined: Self = StObject.set(x, "ZipFile", js.undefined)
  }
}
