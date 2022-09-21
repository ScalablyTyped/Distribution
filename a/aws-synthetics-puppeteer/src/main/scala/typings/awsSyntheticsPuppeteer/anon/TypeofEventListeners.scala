package typings.awsSyntheticsPuppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofEventListeners extends StObject {
  
  val Core: TypeofCore
}
object TypeofEventListeners {
  
  inline def apply(Core: TypeofCore): TypeofEventListeners = {
    val __obj = js.Dynamic.literal(Core = Core.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofEventListeners]
  }
  
  extension [Self <: TypeofEventListeners](x: Self) {
    
    inline def setCore(value: TypeofCore): Self = StObject.set(x, "Core", value.asInstanceOf[js.Any])
  }
}
