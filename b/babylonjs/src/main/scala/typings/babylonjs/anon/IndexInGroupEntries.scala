package typings.babylonjs.anon

import typings.babylonjs.enginesExtensionsEngineDotcomputeShaderMod.ComputeBindingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexInGroupEntries extends StObject {
  
  var indexInGroupEntries: js.UndefOr[Double] = js.undefined
  
  var `object`: Any
  
  var `type`: ComputeBindingType
}
object IndexInGroupEntries {
  
  inline def apply(`object`: Any, `type`: ComputeBindingType): IndexInGroupEntries = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexInGroupEntries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndexInGroupEntries] (val x: Self) extends AnyVal {
    
    inline def setIndexInGroupEntries(value: Double): Self = StObject.set(x, "indexInGroupEntries", value.asInstanceOf[js.Any])
    
    inline def setIndexInGroupEntriesUndefined: Self = StObject.set(x, "indexInGroupEntries", js.undefined)
    
    inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setType(value: ComputeBindingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
