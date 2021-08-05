package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLoggingOptionsResponse extends StObject {
  
  /**
    * The current logging options.
    */
  var loggingOptions: LoggingOptions
}
object DescribeLoggingOptionsResponse {
  
  inline def apply(loggingOptions: LoggingOptions): DescribeLoggingOptionsResponse = {
    val __obj = js.Dynamic.literal(loggingOptions = loggingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLoggingOptionsResponse]
  }
  
  extension [Self <: DescribeLoggingOptionsResponse](x: Self) {
    
    inline def setLoggingOptions(value: LoggingOptions): Self = StObject.set(x, "loggingOptions", value.asInstanceOf[js.Any])
  }
}
