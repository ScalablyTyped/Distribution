package typings.cypress.anon

import typings.cypress.Cypress.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenMode extends StObject {
  
  var openMode: js.UndefOr[Nullable[Double]] = js.undefined
  
  var runMode: js.UndefOr[Nullable[Double]] = js.undefined
}
object OpenMode {
  
  inline def apply(): OpenMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenMode]
  }
  
  extension [Self <: OpenMode](x: Self) {
    
    inline def setOpenMode(value: Nullable[Double]): Self = StObject.set(x, "openMode", value.asInstanceOf[js.Any])
    
    inline def setOpenModeNull: Self = StObject.set(x, "openMode", null)
    
    inline def setOpenModeUndefined: Self = StObject.set(x, "openMode", js.undefined)
    
    inline def setRunMode(value: Nullable[Double]): Self = StObject.set(x, "runMode", value.asInstanceOf[js.Any])
    
    inline def setRunModeNull: Self = StObject.set(x, "runMode", null)
    
    inline def setRunModeUndefined: Self = StObject.set(x, "runMode", js.undefined)
  }
}
