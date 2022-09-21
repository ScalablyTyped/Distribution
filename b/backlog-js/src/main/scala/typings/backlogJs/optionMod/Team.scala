package typings.backlogJs.optionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Team {
  
  trait GetTeamsParams extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[Order] = js.undefined
  }
  object GetTeamsParams {
    
    inline def apply(): GetTeamsParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTeamsParams]
    }
    
    extension [Self <: GetTeamsParams](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  trait PatchTeamParams extends StObject {
    
    var members: js.UndefOr[js.Array[Double]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object PatchTeamParams {
    
    inline def apply(): PatchTeamParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatchTeamParams]
    }
    
    extension [Self <: PatchTeamParams](x: Self) {
      
      inline def setMembers(value: js.Array[Double]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
      
      inline def setMembersVarargs(value: Double*): Self = StObject.set(x, "members", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
