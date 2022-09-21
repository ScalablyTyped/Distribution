package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueueSearchFilter extends StObject {
  
  var TagFilter: js.UndefOr[ControlPlaneTagFilter] = js.undefined
}
object QueueSearchFilter {
  
  inline def apply(): QueueSearchFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueSearchFilter]
  }
  
  extension [Self <: QueueSearchFilter](x: Self) {
    
    inline def setTagFilter(value: ControlPlaneTagFilter): Self = StObject.set(x, "TagFilter", value.asInstanceOf[js.Any])
    
    inline def setTagFilterUndefined: Self = StObject.set(x, "TagFilter", js.undefined)
  }
}
