package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportConfiguration extends StObject {
  
  /**
    * Configuration of an S3 location to write error reports and events for a batch load.
    */
  var ReportS3Configuration: js.UndefOr[typings.awsSdk.clientsTimestreamwriteMod.ReportS3Configuration] = js.undefined
}
object ReportConfiguration {
  
  inline def apply(): ReportConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportConfiguration] (val x: Self) extends AnyVal {
    
    inline def setReportS3Configuration(value: ReportS3Configuration): Self = StObject.set(x, "ReportS3Configuration", value.asInstanceOf[js.Any])
    
    inline def setReportS3ConfigurationUndefined: Self = StObject.set(x, "ReportS3Configuration", js.undefined)
  }
}
