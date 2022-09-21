package typings.awsSyntheticsPuppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAccount extends StObject {
  
  val Types: this.type
}
object TypeofAccount {
  
  inline def apply(Types: TypeofAccount): TypeofAccount = {
    val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAccount]
  }
  
  extension [Self <: TypeofAccount](x: Self) {
    
    inline def setTypes(value: TypeofAccount): Self = StObject.set(x, "Types", value.asInstanceOf[js.Any])
  }
}
