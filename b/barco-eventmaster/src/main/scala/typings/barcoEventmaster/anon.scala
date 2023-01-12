package typings.barcoEventmaster

import typings.barcoEventmaster.barcoEventmasterInts.`0`
import typings.barcoEventmaster.barcoEventmasterInts.`1`
import typings.barcoEventmaster.barcoEventmasterInts.`2`
import typings.barcoEventmaster.barcoEventmasterInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Add extends StObject {
    
    var add: DestIndex
    
    var enable: `0` | `1`
    
    var endRange: Double
    
    var name: String
    
    var operatorId: Double
    
    var remove: DestIndex
    
    var startRange: Double
  }
  object Add {
    
    inline def apply(
      add: DestIndex,
      enable: `0` | `1`,
      endRange: Double,
      name: String,
      operatorId: Double,
      remove: DestIndex,
      startRange: Double
    ): Add = {
      val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], endRange = endRange.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operatorId = operatorId.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], startRange = startRange.asInstanceOf[js.Any])
      __obj.asInstanceOf[Add]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Add] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: DestIndex): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      inline def setEnable(value: `0` | `1`): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEndRange(value: Double): Self = StObject.set(x, "endRange", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOperatorId(value: Double): Self = StObject.set(x, "operatorId", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: DestIndex): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setStartRange(value: Double): Self = StObject.set(x, "startRange", value.asInstanceOf[js.Any])
    }
  }
  
  trait DestIndex extends StObject {
    
    var destIndex: Double
    
    var destType: `0` | `1` | `2` | `3`
  }
  object DestIndex {
    
    inline def apply(destIndex: Double, destType: `0` | `1` | `2` | `3`): DestIndex = {
      val __obj = js.Dynamic.literal(destIndex = destIndex.asInstanceOf[js.Any], destType = destType.asInstanceOf[js.Any])
      __obj.asInstanceOf[DestIndex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DestIndex] (val x: Self) extends AnyVal {
      
      inline def setDestIndex(value: Double): Self = StObject.set(x, "destIndex", value.asInstanceOf[js.Any])
      
      inline def setDestType(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "destType", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: Double
  }
  object Id {
    
    inline def apply(id: Double): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
