package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFilterResponse extends StObject {
  
  /**
    * The name of the successfully created filter.
    */
  var Name: FilterName = js.native
}
object CreateFilterResponse {
  
  @scala.inline
  def apply(Name: FilterName): CreateFilterResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFilterResponse]
  }
  
  @scala.inline
  implicit class CreateFilterResponseMutableBuilder[Self <: CreateFilterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: FilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
