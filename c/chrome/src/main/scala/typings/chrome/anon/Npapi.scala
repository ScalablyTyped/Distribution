package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Npapi extends StObject {
  
  var npapi: js.UndefOr[Boolean] = js.native
}
object Npapi {
  
  @scala.inline
  def apply(): Npapi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Npapi]
  }
  
  @scala.inline
  implicit class NpapiMutableBuilder[Self <: Npapi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNpapi(value: Boolean): Self = StObject.set(x, "npapi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNpapiUndefined: Self = StObject.set(x, "npapi", js.undefined)
  }
}
