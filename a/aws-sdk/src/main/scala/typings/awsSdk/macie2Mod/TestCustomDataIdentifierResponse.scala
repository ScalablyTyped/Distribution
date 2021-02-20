package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestCustomDataIdentifierResponse extends StObject {
  
  /**
    * The number of instances of sample text that matched the detection criteria specified in the custom data identifier.
    */
  var matchCount: js.UndefOr[integer] = js.native
}
object TestCustomDataIdentifierResponse {
  
  @scala.inline
  def apply(): TestCustomDataIdentifierResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestCustomDataIdentifierResponse]
  }
  
  @scala.inline
  implicit class TestCustomDataIdentifierResponseMutableBuilder[Self <: TestCustomDataIdentifierResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatchCount(value: integer): Self = StObject.set(x, "matchCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchCountUndefined: Self = StObject.set(x, "matchCount", js.undefined)
  }
}
