package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3MachineLearningModelResourceData extends StObject {
  
  /**
    * The absolute local path of the resource inside the Lambda environment.
    */
  var DestinationPath: js.UndefOr[string] = js.undefined
  
  var OwnerSetting: js.UndefOr[ResourceDownloadOwnerSetting] = js.undefined
  
  /**
    * The URI of the source model in an S3 bucket. The model package must be in tar.gz or .zip format.
    */
  var S3Uri: js.UndefOr[string] = js.undefined
}
object S3MachineLearningModelResourceData {
  
  inline def apply(): S3MachineLearningModelResourceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3MachineLearningModelResourceData]
  }
  
  extension [Self <: S3MachineLearningModelResourceData](x: Self) {
    
    inline def setDestinationPath(value: string): Self = StObject.set(x, "DestinationPath", value.asInstanceOf[js.Any])
    
    inline def setDestinationPathUndefined: Self = StObject.set(x, "DestinationPath", js.undefined)
    
    inline def setOwnerSetting(value: ResourceDownloadOwnerSetting): Self = StObject.set(x, "OwnerSetting", value.asInstanceOf[js.Any])
    
    inline def setOwnerSettingUndefined: Self = StObject.set(x, "OwnerSetting", js.undefined)
    
    inline def setS3Uri(value: string): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
    
    inline def setS3UriUndefined: Self = StObject.set(x, "S3Uri", js.undefined)
  }
}
