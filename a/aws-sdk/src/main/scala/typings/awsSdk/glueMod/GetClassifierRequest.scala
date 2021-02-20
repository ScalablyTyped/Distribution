package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetClassifierRequest extends StObject {
  
  /**
    * Name of the classifier to retrieve.
    */
  var Name: NameString = js.native
}
object GetClassifierRequest {
  
  @scala.inline
  def apply(Name: NameString): GetClassifierRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClassifierRequest]
  }
  
  @scala.inline
  implicit class GetClassifierRequestMutableBuilder[Self <: GetClassifierRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
