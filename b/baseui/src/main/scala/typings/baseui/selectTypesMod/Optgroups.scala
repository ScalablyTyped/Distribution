package typings.baseui.selectTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Optgroups
  extends StObject
     with /* x */ StringDictionary[Value] {
  
  var __ungrouped: js.UndefOr[Value] = js.undefined
}
object Optgroups {
  
  inline def apply(): Optgroups = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Optgroups]
  }
  
  extension [Self <: Optgroups](x: Self) {
    
    inline def set__ungrouped(value: Value): Self = StObject.set(x, "__ungrouped", value.asInstanceOf[js.Any])
    
    inline def set__ungroupedUndefined: Self = StObject.set(x, "__ungrouped", js.undefined)
    
    inline def set__ungroupedVarargs(value: Option*): Self = StObject.set(x, "__ungrouped", js.Array(value*))
  }
}
