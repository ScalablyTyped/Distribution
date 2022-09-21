package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeChangesInGraveyard extends StObject {
  
  var includeChangesInGraveyard: js.UndefOr[Boolean] = js.undefined
}
object IncludeChangesInGraveyard {
  
  inline def apply(): IncludeChangesInGraveyard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeChangesInGraveyard]
  }
  
  extension [Self <: IncludeChangesInGraveyard](x: Self) {
    
    inline def setIncludeChangesInGraveyard(value: Boolean): Self = StObject.set(x, "includeChangesInGraveyard", value.asInstanceOf[js.Any])
    
    inline def setIncludeChangesInGraveyardUndefined: Self = StObject.set(x, "includeChangesInGraveyard", js.undefined)
  }
}
