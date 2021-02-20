package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFilterResponse extends StObject {
  
  /**
    * The name of the filter.
    */
  var Name: FilterName = js.native
}
object UpdateFilterResponse {
  
  @scala.inline
  def apply(Name: FilterName): UpdateFilterResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFilterResponse]
  }
  
  @scala.inline
  implicit class UpdateFilterResponseMutableBuilder[Self <: UpdateFilterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: FilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
