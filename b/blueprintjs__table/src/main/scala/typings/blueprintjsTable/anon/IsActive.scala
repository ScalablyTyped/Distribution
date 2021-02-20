package typings.blueprintjsTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsActive extends StObject {
  
  var isActive: Boolean = js.native
}
object IsActive {
  
  @scala.inline
  def apply(isActive: Boolean): IsActive = {
    val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsActive]
  }
  
  @scala.inline
  implicit class IsActiveMutableBuilder[Self <: IsActive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
  }
}
