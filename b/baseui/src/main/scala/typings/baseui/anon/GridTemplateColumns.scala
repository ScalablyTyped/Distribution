package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridTemplateColumns extends StObject {
  
  @JSName("$gridTemplateColumns")
  var $gridTemplateColumns: String
}
object GridTemplateColumns {
  
  inline def apply($gridTemplateColumns: String): GridTemplateColumns = {
    val __obj = js.Dynamic.literal($gridTemplateColumns = $gridTemplateColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridTemplateColumns]
  }
  
  extension [Self <: GridTemplateColumns](x: Self) {
    
    inline def set$gridTemplateColumns(value: String): Self = StObject.set(x, "$gridTemplateColumns", value.asInstanceOf[js.Any])
  }
}
