package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingleQueryArgument extends StObject {
  
  /**
    * The name of the query argument to inspect.
    */
  var Name: FieldToMatchData = js.native
}
object SingleQueryArgument {
  
  @scala.inline
  def apply(Name: FieldToMatchData): SingleQueryArgument = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleQueryArgument]
  }
  
  @scala.inline
  implicit class SingleQueryArgumentMutableBuilder[Self <: SingleQueryArgument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: FieldToMatchData): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
