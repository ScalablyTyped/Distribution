package typings.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Npapi extends StObject {
  
  /** @default true */
  var npapi: Boolean
}
object Npapi {
  
  @scala.inline
  def apply(npapi: Boolean): Npapi = {
    val __obj = js.Dynamic.literal(npapi = npapi.asInstanceOf[js.Any])
    __obj.asInstanceOf[Npapi]
  }
  
  @scala.inline
  implicit class NpapiMutableBuilder[Self <: Npapi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNpapi(value: Boolean): Self = StObject.set(x, "npapi", value.asInstanceOf[js.Any])
  }
}
