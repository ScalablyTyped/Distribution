package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFilterRequest extends StObject {
  
  /**
    * The ARN of the filter to delete.
    */
  var filterArn: Arn = js.native
}
object DeleteFilterRequest {
  
  @scala.inline
  def apply(filterArn: Arn): DeleteFilterRequest = {
    val __obj = js.Dynamic.literal(filterArn = filterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFilterRequest]
  }
  
  @scala.inline
  implicit class DeleteFilterRequestMutableBuilder[Self <: DeleteFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterArn(value: Arn): Self = StObject.set(x, "filterArn", value.asInstanceOf[js.Any])
  }
}
