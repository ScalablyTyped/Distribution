package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLoggingOptionsResponse extends StObject {
  
  /**
    * The current logging options.
    */
  var loggingOptions: LoggingOptions = js.native
}
object DescribeLoggingOptionsResponse {
  
  @scala.inline
  def apply(loggingOptions: LoggingOptions): DescribeLoggingOptionsResponse = {
    val __obj = js.Dynamic.literal(loggingOptions = loggingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLoggingOptionsResponse]
  }
  
  @scala.inline
  implicit class DescribeLoggingOptionsResponseMutableBuilder[Self <: DescribeLoggingOptionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoggingOptions(value: LoggingOptions): Self = StObject.set(x, "loggingOptions", value.asInstanceOf[js.Any])
  }
}
