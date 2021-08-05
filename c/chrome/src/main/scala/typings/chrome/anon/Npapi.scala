package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Npapi extends StObject {
  
  var npapi: js.UndefOr[Boolean] = js.undefined
}
object Npapi {
  
  inline def apply(): Npapi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Npapi]
  }
  
  extension [Self <: Npapi](x: Self) {
    
    inline def setNpapi(value: Boolean): Self = StObject.set(x, "npapi", value.asInstanceOf[js.Any])
    
    inline def setNpapiUndefined: Self = StObject.set(x, "npapi", js.undefined)
  }
}
