package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingleHeader extends StObject {
  
  /**
    * The name of the query header to inspect.
    */
  var Name: FieldToMatchData
}
object SingleHeader {
  
  @scala.inline
  def apply(Name: FieldToMatchData): SingleHeader = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleHeader]
  }
  
  @scala.inline
  implicit class SingleHeaderMutableBuilder[Self <: SingleHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: FieldToMatchData): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
