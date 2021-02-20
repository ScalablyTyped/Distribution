package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteClassifierRequest extends StObject {
  
  /**
    * Name of the classifier to remove.
    */
  var Name: NameString = js.native
}
object DeleteClassifierRequest {
  
  @scala.inline
  def apply(Name: NameString): DeleteClassifierRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClassifierRequest]
  }
  
  @scala.inline
  implicit class DeleteClassifierRequestMutableBuilder[Self <: DeleteClassifierRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
