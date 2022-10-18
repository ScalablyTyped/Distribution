package typings.cssnanoUtils

import typings.cssnanoUtils.typesSameParentMod.Child
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Parent extends StObject {
    
    var parent: js.UndefOr[Child] = js.undefined
  }
  object Parent {
    
    inline def apply(): Parent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Parent]
    }
    
    extension [Self <: Parent](x: Self) {
      
      inline def setParent(value: Child): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    }
  }
}
