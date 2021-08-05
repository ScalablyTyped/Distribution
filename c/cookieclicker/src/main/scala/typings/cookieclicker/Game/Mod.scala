package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mod extends StObject {
  
  var id: js.UndefOr[Double] = js.undefined
  
  var init: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var load: js.UndefOr[js.Function1[/* data */ String, Unit]] = js.undefined
  
  var save: js.UndefOr[js.Function0[String]] = js.undefined
}
object Mod {
  
  inline def apply(): Mod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mod]
  }
  
  extension [Self <: Mod](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setLoad(value: /* data */ String => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    
    inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    inline def setSave(value: () => String): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
  }
}
