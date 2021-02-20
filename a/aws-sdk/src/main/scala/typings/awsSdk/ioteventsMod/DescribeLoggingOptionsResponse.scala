package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLoggingOptionsResponse extends StObject {
  
  /**
    * The current settings of the AWS IoT Events logging options.
    */
  var loggingOptions: js.UndefOr[LoggingOptions] = js.native
}
object DescribeLoggingOptionsResponse {
  
  @scala.inline
  def apply(): DescribeLoggingOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoggingOptionsResponse]
  }
  
  @scala.inline
  implicit class DescribeLoggingOptionsResponseMutableBuilder[Self <: DescribeLoggingOptionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoggingOptions(value: LoggingOptions): Self = StObject.set(x, "loggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingOptionsUndefined: Self = StObject.set(x, "loggingOptions", js.undefined)
  }
}
