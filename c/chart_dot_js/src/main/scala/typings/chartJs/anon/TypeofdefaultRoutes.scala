package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofdefaultRoutes extends StObject {
  
  val color: String
}
object TypeofdefaultRoutes {
  
  inline def apply(color: String): TypeofdefaultRoutes = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofdefaultRoutes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofdefaultRoutes] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
