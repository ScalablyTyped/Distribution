package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRunRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the run to delete.
    */
  var arn: AmazonResourceName = js.native
}
object DeleteRunRequest {
  
  @scala.inline
  def apply(arn: AmazonResourceName): DeleteRunRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRunRequest]
  }
  
  @scala.inline
  implicit class DeleteRunRequestMutableBuilder[Self <: DeleteRunRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
