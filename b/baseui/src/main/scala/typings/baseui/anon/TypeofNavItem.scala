package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofNavItem extends StObject {
  
  /* static member */
  var defaultProps: OnSelect
}
object TypeofNavItem {
  
  inline def apply(defaultProps: OnSelect): TypeofNavItem = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofNavItem]
  }
  
  extension [Self <: TypeofNavItem](x: Self) {
    
    inline def setDefaultProps(value: OnSelect): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
  }
}
