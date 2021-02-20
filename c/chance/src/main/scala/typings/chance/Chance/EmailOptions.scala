package typings.chance.Chance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailOptions extends StObject {
  
  var domain: String = js.native
  
  var length: Double = js.native
}
object EmailOptions {
  
  @scala.inline
  def apply(domain: String, length: Double): EmailOptions = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailOptions]
  }
  
  @scala.inline
  implicit class EmailOptionsMutableBuilder[Self <: EmailOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
