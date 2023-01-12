package typings.backlogJs.distTypesOptionMod.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchCustomFieldItemParams extends StObject {
  
  var name: String
}
object PatchCustomFieldItemParams {
  
  inline def apply(name: String): PatchCustomFieldItemParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchCustomFieldItemParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatchCustomFieldItemParams] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
