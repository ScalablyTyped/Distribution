package typings.azureSb.mod.Azure.ServiceBus.Results.Models

import typings.azureSb.anon.Author
import typings.azureSb.mod.Azure.ServiceBus.DateString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base extends StObject {
  
  var CreatedAt: DateString
  
  @JSName("_")
  var _underscore: Author
}
object Base {
  
  @scala.inline
  def apply(CreatedAt: DateString, _underscore: Author): Base = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
  
  @scala.inline
  implicit class BaseMutableBuilder[Self <: Base] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: DateString): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_underscore(value: Author): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
  }
}
