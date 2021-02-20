package typings.coreObject

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Super[Base] extends StObject {
    
    var _super: typings.coreObject.utilsMod.Super[Base] = js.native
  }
  object Super {
    
    @scala.inline
    def apply[Base](_super: typings.coreObject.utilsMod.Super[Base]): Super[Base] = {
      val __obj = js.Dynamic.literal(_super = _super.asInstanceOf[js.Any])
      __obj.asInstanceOf[Super[Base]]
    }
    
    @scala.inline
    implicit class SuperMutableBuilder[Self <: Super[_], Base] (val x: Self with Super[Base]) extends AnyVal {
      
      @scala.inline
      def set_super(value: typings.coreObject.utilsMod.Super[Base]): Self = StObject.set(x, "_super", value.asInstanceOf[js.Any])
    }
  }
}
