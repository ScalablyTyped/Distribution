package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAutoMLJobResponse extends StObject {
  
  /**
    * When a job is created, it is assigned a unique ARN.
    */
  var AutoMLJobArn: typings.awsSdk.sagemakerMod.AutoMLJobArn = js.native
}
object CreateAutoMLJobResponse {
  
  @scala.inline
  def apply(AutoMLJobArn: AutoMLJobArn): CreateAutoMLJobResponse = {
    val __obj = js.Dynamic.literal(AutoMLJobArn = AutoMLJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAutoMLJobResponse]
  }
  
  @scala.inline
  implicit class CreateAutoMLJobResponseMutableBuilder[Self <: CreateAutoMLJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoMLJobArn(value: AutoMLJobArn): Self = StObject.set(x, "AutoMLJobArn", value.asInstanceOf[js.Any])
  }
}
