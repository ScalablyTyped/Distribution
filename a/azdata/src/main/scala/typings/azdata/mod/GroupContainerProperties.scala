package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupContainerProperties
  extends StObject
     with ComponentProperties {
  
  var collapsed: Boolean
}
object GroupContainerProperties {
  
  inline def apply(collapsed: Boolean): GroupContainerProperties = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupContainerProperties]
  }
  
  extension [Self <: GroupContainerProperties](x: Self) {
    
    inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
  }
}
