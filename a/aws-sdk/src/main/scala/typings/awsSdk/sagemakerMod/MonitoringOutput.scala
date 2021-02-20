package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoringOutput extends StObject {
  
  /**
    * The Amazon S3 storage location where the results of a monitoring job are saved.
    */
  var S3Output: MonitoringS3Output = js.native
}
object MonitoringOutput {
  
  @scala.inline
  def apply(S3Output: MonitoringS3Output): MonitoringOutput = {
    val __obj = js.Dynamic.literal(S3Output = S3Output.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringOutput]
  }
  
  @scala.inline
  implicit class MonitoringOutputMutableBuilder[Self <: MonitoringOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Output(value: MonitoringS3Output): Self = StObject.set(x, "S3Output", value.asInstanceOf[js.Any])
  }
}
