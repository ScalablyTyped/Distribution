package typings.awsSdkTypes.middlewareMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbsoluteLocation extends StObject {
  
  /**
    * By default middleware will be added to individual step in un-guaranteed order.
    * In the case that
    *
    * @default 'normal'
    */
  var priority: js.UndefOr[Priority] = js.undefined
}
object AbsoluteLocation {
  
  inline def apply(): AbsoluteLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbsoluteLocation]
  }
  
  extension [Self <: AbsoluteLocation](x: Self) {
    
    inline def setPriority(value: Priority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
