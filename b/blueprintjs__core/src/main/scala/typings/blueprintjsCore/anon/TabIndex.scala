package typings.blueprintjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabIndex extends StObject {
  
  var tabIndex: Double
}
object TabIndex {
  
  inline def apply(tabIndex: Double): TabIndex = {
    val __obj = js.Dynamic.literal(tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabIndex] (val x: Self) extends AnyVal {
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
  }
}
