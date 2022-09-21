package typings.awsSyntheticsPuppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofInspector extends StObject {
  
  val Types: this.type
}
object TypeofInspector {
  
  inline def apply(Types: TypeofInspector): TypeofInspector = {
    val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofInspector]
  }
  
  extension [Self <: TypeofInspector](x: Self) {
    
    inline def setTypes(value: TypeofInspector): Self = StObject.set(x, "Types", value.asInstanceOf[js.Any])
  }
}
