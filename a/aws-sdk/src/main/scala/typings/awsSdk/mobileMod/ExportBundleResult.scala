package typings.awsSdk.mobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportBundleResult extends StObject {
  
  /**
    *  URL which contains the custom-generated SDK and tool packages used to integrate the client mobile app or web app with the AWS resources created by the AWS Mobile Hub project. 
    */
  var downloadUrl: js.UndefOr[DownloadUrl] = js.undefined
}
object ExportBundleResult {
  
  inline def apply(): ExportBundleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportBundleResult]
  }
  
  extension [Self <: ExportBundleResult](x: Self) {
    
    inline def setDownloadUrl(value: DownloadUrl): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    inline def setDownloadUrlUndefined: Self = StObject.set(x, "downloadUrl", js.undefined)
  }
}
