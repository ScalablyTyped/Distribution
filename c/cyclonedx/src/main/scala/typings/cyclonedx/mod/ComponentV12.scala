package typings.cyclonedx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentV12
  extends StObject
     with ComponentBase {
  
  var components: js.UndefOr[js.Array[ComponentV12]] = js.undefined
  
  var pedigree: js.UndefOr[Pedigree[ComponentV12]] = js.undefined
  
  var version: String
}
object ComponentV12 {
  
  inline def apply(name: String, `type`: ComponentType, version: String): ComponentV12 = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentV12]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentV12] (val x: Self) extends AnyVal {
    
    inline def setComponents(value: js.Array[ComponentV12]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setComponentsVarargs(value: ComponentV12*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setPedigree(value: Pedigree[ComponentV12]): Self = StObject.set(x, "pedigree", value.asInstanceOf[js.Any])
    
    inline def setPedigreeUndefined: Self = StObject.set(x, "pedigree", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
