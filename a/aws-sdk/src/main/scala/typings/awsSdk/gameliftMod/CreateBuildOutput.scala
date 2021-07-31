package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBuildOutput extends StObject {
  
  /**
    * The newly created build resource, including a unique build IDs and status. 
    */
  var Build: js.UndefOr[typings.awsSdk.gameliftMod.Build] = js.undefined
  
  /**
    * Amazon S3 location for your game build file, including bucket name and key.
    */
  var StorageLocation: js.UndefOr[S3Location] = js.undefined
  
  /**
    * This element is returned only when the operation is called without a storage location. It contains credentials to use when you are uploading a build file to an S3 bucket that is owned by Amazon GameLift. Credentials have a limited life span. To refresh these credentials, call RequestUploadCredentials. 
    */
  var UploadCredentials: js.UndefOr[AwsCredentials] = js.undefined
}
object CreateBuildOutput {
  
  @scala.inline
  def apply(): CreateBuildOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBuildOutput]
  }
  
  @scala.inline
  implicit class CreateBuildOutputMutableBuilder[Self <: CreateBuildOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: Build): Self = StObject.set(x, "Build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildUndefined: Self = StObject.set(x, "Build", js.undefined)
    
    @scala.inline
    def setStorageLocation(value: S3Location): Self = StObject.set(x, "StorageLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageLocationUndefined: Self = StObject.set(x, "StorageLocation", js.undefined)
    
    @scala.inline
    def setUploadCredentials(value: AwsCredentials): Self = StObject.set(x, "UploadCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadCredentialsUndefined: Self = StObject.set(x, "UploadCredentials", js.undefined)
  }
}
