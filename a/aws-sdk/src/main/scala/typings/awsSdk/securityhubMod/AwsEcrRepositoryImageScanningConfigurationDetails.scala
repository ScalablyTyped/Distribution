package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcrRepositoryImageScanningConfigurationDetails extends StObject {
  
  /**
    * Whether to scan images after they are pushed to a repository.
    */
  var ScanOnPush: js.UndefOr[Boolean] = js.undefined
}
object AwsEcrRepositoryImageScanningConfigurationDetails {
  
  inline def apply(): AwsEcrRepositoryImageScanningConfigurationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcrRepositoryImageScanningConfigurationDetails]
  }
  
  extension [Self <: AwsEcrRepositoryImageScanningConfigurationDetails](x: Self) {
    
    inline def setScanOnPush(value: Boolean): Self = StObject.set(x, "ScanOnPush", value.asInstanceOf[js.Any])
    
    inline def setScanOnPushUndefined: Self = StObject.set(x, "ScanOnPush", js.undefined)
  }
}
