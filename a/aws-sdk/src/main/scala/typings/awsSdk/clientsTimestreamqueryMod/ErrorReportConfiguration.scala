package typings.awsSdk.clientsTimestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorReportConfiguration extends StObject {
  
  /**
    * The S3 configuration for the error reports.
    */
  var S3Configuration: typings.awsSdk.clientsTimestreamqueryMod.S3Configuration
}
object ErrorReportConfiguration {
  
  inline def apply(S3Configuration: S3Configuration): ErrorReportConfiguration = {
    val __obj = js.Dynamic.literal(S3Configuration = S3Configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorReportConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorReportConfiguration] (val x: Self) extends AnyVal {
    
    inline def setS3Configuration(value: S3Configuration): Self = StObject.set(x, "S3Configuration", value.asInstanceOf[js.Any])
  }
}
