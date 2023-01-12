package typings.backlogJs.distTypesOptionMod.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchStatusParams extends StObject {
  
  var color: js.UndefOr[ProjectStatusColor] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object PatchStatusParams {
  
  inline def apply(): PatchStatusParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchStatusParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatchStatusParams] (val x: Self) extends AnyVal {
    
    inline def setColor(value: ProjectStatusColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
