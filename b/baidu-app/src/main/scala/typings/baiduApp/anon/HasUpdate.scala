package typings.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasUpdate extends StObject {
  
  var hasUpdate: Boolean
}
object HasUpdate {
  
  @scala.inline
  def apply(hasUpdate: Boolean): HasUpdate = {
    val __obj = js.Dynamic.literal(hasUpdate = hasUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasUpdate]
  }
  
  @scala.inline
  implicit class HasUpdateMutableBuilder[Self <: HasUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasUpdate(value: Boolean): Self = StObject.set(x, "hasUpdate", value.asInstanceOf[js.Any])
  }
}
