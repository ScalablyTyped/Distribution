package typings.betterSqlite3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerializeOptions extends StObject {
  
  var attached: js.UndefOr[String] = js.undefined
}
object SerializeOptions {
  
  inline def apply(): SerializeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializeOptions]
  }
  
  extension [Self <: SerializeOptions](x: Self) {
    
    inline def setAttached(value: String): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
    
    inline def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
  }
}
