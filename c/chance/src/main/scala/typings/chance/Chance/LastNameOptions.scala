package typings.chance.Chance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LastNameOptions extends StObject {
  
  var nationality: LastNameNationalities = js.native
}
object LastNameOptions {
  
  @scala.inline
  def apply(nationality: LastNameNationalities): LastNameOptions = {
    val __obj = js.Dynamic.literal(nationality = nationality.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastNameOptions]
  }
  
  @scala.inline
  implicit class LastNameOptionsMutableBuilder[Self <: LastNameOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNationality(value: LastNameNationalities): Self = StObject.set(x, "nationality", value.asInstanceOf[js.Any])
  }
}
