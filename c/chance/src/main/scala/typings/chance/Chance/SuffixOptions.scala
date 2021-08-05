package typings.chance.Chance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuffixOptions extends StObject {
  
  var full: Boolean
}
object SuffixOptions {
  
  inline def apply(full: Boolean): SuffixOptions = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuffixOptions]
  }
  
  extension [Self <: SuffixOptions](x: Self) {
    
    inline def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
  }
}
