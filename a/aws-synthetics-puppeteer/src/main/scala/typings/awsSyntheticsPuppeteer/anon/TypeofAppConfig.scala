package typings.awsSyntheticsPuppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAppConfig extends StObject {
  
  val Types: this.type
}
object TypeofAppConfig {
  
  inline def apply(Types: TypeofAppConfig): TypeofAppConfig = {
    val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAppConfig]
  }
  
  extension [Self <: TypeofAppConfig](x: Self) {
    
    inline def setTypes(value: TypeofAppConfig): Self = StObject.set(x, "Types", value.asInstanceOf[js.Any])
  }
}
