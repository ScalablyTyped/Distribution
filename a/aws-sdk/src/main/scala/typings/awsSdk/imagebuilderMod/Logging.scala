package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logging extends StObject {
  
  /**
    * The Amazon S3 logging configuration.
    */
  var s3Logs: js.UndefOr[S3Logs] = js.native
}
object Logging {
  
  @scala.inline
  def apply(): Logging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logging]
  }
  
  @scala.inline
  implicit class LoggingMutableBuilder[Self <: Logging] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Logs(value: S3Logs): Self = StObject.set(x, "s3Logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3LogsUndefined: Self = StObject.set(x, "s3Logs", js.undefined)
  }
}
