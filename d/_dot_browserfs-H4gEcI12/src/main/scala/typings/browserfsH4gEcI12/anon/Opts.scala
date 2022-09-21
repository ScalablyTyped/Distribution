package typings.browserfsH4gEcI12.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Opts extends StObject {
  
  var opts: Root
}
object Opts {
  
  inline def apply(opts: Root): Opts = {
    val __obj = js.Dynamic.literal(opts = opts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opts]
  }
  
  extension [Self <: Opts](x: Self) {
    
    inline def setOpts(value: Root): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
  }
}
