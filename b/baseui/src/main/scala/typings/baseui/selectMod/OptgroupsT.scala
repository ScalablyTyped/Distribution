package typings.baseui.selectMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptgroupsT
  extends StObject
     with /* key */ StringDictionary[Value] {
  
  var __ungrouped: Value
}
object OptgroupsT {
  
  inline def apply(__ungrouped: Value): OptgroupsT = {
    val __obj = js.Dynamic.literal(__ungrouped = __ungrouped.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptgroupsT]
  }
  
  extension [Self <: OptgroupsT](x: Self) {
    
    inline def set__ungrouped(value: Value): Self = StObject.set(x, "__ungrouped", value.asInstanceOf[js.Any])
    
    inline def set__ungroupedVarargs(value: Option*): Self = StObject.set(x, "__ungrouped", js.Array(value :_*))
  }
}
