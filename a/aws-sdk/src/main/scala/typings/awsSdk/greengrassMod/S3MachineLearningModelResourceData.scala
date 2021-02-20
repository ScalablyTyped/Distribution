package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3MachineLearningModelResourceData extends StObject {
  
  /**
    * The absolute local path of the resource inside the Lambda environment.
    */
  var DestinationPath: js.UndefOr[string] = js.native
  
  var OwnerSetting: js.UndefOr[ResourceDownloadOwnerSetting] = js.native
  
  /**
    * The URI of the source model in an S3 bucket. The model package must be in tar.gz or .zip format.
    */
  var S3Uri: js.UndefOr[string] = js.native
}
object S3MachineLearningModelResourceData {
  
  @scala.inline
  def apply(): S3MachineLearningModelResourceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3MachineLearningModelResourceData]
  }
  
  @scala.inline
  implicit class S3MachineLearningModelResourceDataMutableBuilder[Self <: S3MachineLearningModelResourceData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationPath(value: string): Self = StObject.set(x, "DestinationPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationPathUndefined: Self = StObject.set(x, "DestinationPath", js.undefined)
    
    @scala.inline
    def setOwnerSetting(value: ResourceDownloadOwnerSetting): Self = StObject.set(x, "OwnerSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerSettingUndefined: Self = StObject.set(x, "OwnerSetting", js.undefined)
    
    @scala.inline
    def setS3Uri(value: string): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3UriUndefined: Self = StObject.set(x, "S3Uri", js.undefined)
  }
}
