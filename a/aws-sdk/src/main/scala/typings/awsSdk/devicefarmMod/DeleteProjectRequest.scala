package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteProjectRequest extends StObject {
  
  /**
    * Represents the Amazon Resource Name (ARN) of the Device Farm project to delete.
    */
  var arn: AmazonResourceName = js.native
}
object DeleteProjectRequest {
  
  @scala.inline
  def apply(arn: AmazonResourceName): DeleteProjectRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProjectRequest]
  }
  
  @scala.inline
  implicit class DeleteProjectRequestMutableBuilder[Self <: DeleteProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
