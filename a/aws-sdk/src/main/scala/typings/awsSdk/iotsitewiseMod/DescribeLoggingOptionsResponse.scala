package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLoggingOptionsResponse extends js.Object {
  
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
  implicit class DescribeLoggingOptionsResponseOps[Self <: DescribeLoggingOptionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLoggingOptions(value: LoggingOptions): Self = this.set("loggingOptions", value.asInstanceOf[js.Any])
  }
}
