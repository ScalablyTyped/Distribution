package typings.awsSyntheticsPuppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSupport extends StObject {
  
  val Types: this.type
}
object TypeofSupport {
  
  inline def apply(Types: TypeofSupport): TypeofSupport = {
    val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSupport]
  }
  
  extension [Self <: TypeofSupport](x: Self) {
    
    inline def setTypes(value: TypeofSupport): Self = StObject.set(x, "Types", value.asInstanceOf[js.Any])
  }
}
