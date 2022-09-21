package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportingLocation extends StObject {
  
  /**
    * Information about the S3 location where Identity Resolution Jobs write result files.
    */
  var S3Exporting: js.UndefOr[S3ExportingLocation] = js.undefined
}
object ExportingLocation {
  
  inline def apply(): ExportingLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportingLocation]
  }
  
  extension [Self <: ExportingLocation](x: Self) {
    
    inline def setS3Exporting(value: S3ExportingLocation): Self = StObject.set(x, "S3Exporting", value.asInstanceOf[js.Any])
    
    inline def setS3ExportingUndefined: Self = StObject.set(x, "S3Exporting", js.undefined)
  }
}
