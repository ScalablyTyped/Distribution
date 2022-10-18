package typings.awsSdk.clientsTimestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorReportLocation extends StObject {
  
  /**
    * The S3 location where error reports are written.
    */
  var S3ReportLocation: js.UndefOr[typings.awsSdk.clientsTimestreamqueryMod.S3ReportLocation] = js.undefined
}
object ErrorReportLocation {
  
  inline def apply(): ErrorReportLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorReportLocation]
  }
  
  extension [Self <: ErrorReportLocation](x: Self) {
    
    inline def setS3ReportLocation(value: S3ReportLocation): Self = StObject.set(x, "S3ReportLocation", value.asInstanceOf[js.Any])
    
    inline def setS3ReportLocationUndefined: Self = StObject.set(x, "S3ReportLocation", js.undefined)
  }
}
