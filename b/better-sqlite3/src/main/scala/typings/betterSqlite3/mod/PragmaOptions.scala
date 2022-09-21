package typings.betterSqlite3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PragmaOptions extends StObject {
  
  var simple: js.UndefOr[Boolean] = js.undefined
}
object PragmaOptions {
  
  inline def apply(): PragmaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PragmaOptions]
  }
  
  extension [Self <: PragmaOptions](x: Self) {
    
    inline def setSimple(value: Boolean): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
    
    inline def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
  }
}
