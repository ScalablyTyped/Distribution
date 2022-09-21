package typings.vegaLite8ozrbXDH.anon

import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgComparator
import typings.vegaTypings.axisMod.Axis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Axes extends StObject {
  
  var axes: js.UndefOr[js.Array[Axis]] = js.undefined
  
  var encode: js.UndefOr[Update] = js.undefined
  
  var from: js.UndefOr[Data] = js.undefined
  
  var name: String
  
  var role: String
  
  var sort: js.UndefOr[VgComparator] = js.undefined
  
  var title: js.UndefOr[Dx | Encode | Font | FontStyle] = js.undefined
  
  var `type`: String
}
object Axes {
  
  inline def apply(name: String, role: String, `type`: String): Axes = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axes]
  }
  
  extension [Self <: Axes](x: Self) {
    
    inline def setAxes(value: js.Array[Axis]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
    
    inline def setAxesVarargs(value: Axis*): Self = StObject.set(x, "axes", js.Array(value*))
    
    inline def setEncode(value: Update): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
    
    inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
    
    inline def setFrom(value: Data): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setSort(value: VgComparator): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setTitle(value: Dx | Encode | Font | FontStyle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
