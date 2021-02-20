package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggingOptions extends StObject {
  
  /**
    * The AWS IoT SiteWise logging verbosity level.
    */
  var level: LoggingLevel = js.native
}
object LoggingOptions {
  
  @scala.inline
  def apply(level: LoggingLevel): LoggingOptions = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingOptions]
  }
  
  @scala.inline
  implicit class LoggingOptionsMutableBuilder[Self <: LoggingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: LoggingLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
