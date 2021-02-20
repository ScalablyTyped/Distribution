package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFilterResponse extends StObject {
  
  /**
    * The ARN of the new filter.
    */
  var filterArn: js.UndefOr[Arn] = js.native
}
object CreateFilterResponse {
  
  @scala.inline
  def apply(): CreateFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFilterResponse]
  }
  
  @scala.inline
  implicit class CreateFilterResponseMutableBuilder[Self <: CreateFilterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterArn(value: Arn): Self = StObject.set(x, "filterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterArnUndefined: Self = StObject.set(x, "filterArn", js.undefined)
  }
}
