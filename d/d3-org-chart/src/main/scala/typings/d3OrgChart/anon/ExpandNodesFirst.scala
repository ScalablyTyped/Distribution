package typings.d3OrgChart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandNodesFirst extends StObject {
  
  var expandNodesFirst: js.UndefOr[Boolean] = js.undefined
}
object ExpandNodesFirst {
  
  inline def apply(): ExpandNodesFirst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandNodesFirst]
  }
  
  extension [Self <: ExpandNodesFirst](x: Self) {
    
    inline def setExpandNodesFirst(value: Boolean): Self = StObject.set(x, "expandNodesFirst", value.asInstanceOf[js.Any])
    
    inline def setExpandNodesFirstUndefined: Self = StObject.set(x, "expandNodesFirst", js.undefined)
  }
}
