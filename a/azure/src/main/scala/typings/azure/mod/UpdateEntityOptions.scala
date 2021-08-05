package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEntityOptions
  extends StObject
     with TimeoutIntervalOptions {
  
  var checkEtag: js.UndefOr[Boolean] = js.undefined
}
object UpdateEntityOptions {
  
  inline def apply(): UpdateEntityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEntityOptions]
  }
  
  extension [Self <: UpdateEntityOptions](x: Self) {
    
    inline def setCheckEtag(value: Boolean): Self = StObject.set(x, "checkEtag", value.asInstanceOf[js.Any])
    
    inline def setCheckEtagUndefined: Self = StObject.set(x, "checkEtag", js.undefined)
  }
}
