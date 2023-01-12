package typings.cookieclicker.Game

import typings.cookieclicker.cookieclickerInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mod extends StObject {
  
  var dir: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var init: js.UndefOr[js.Function0[Unit] | `0`] = js.undefined
  
  var load: js.UndefOr[js.Function1[/* data */ String, Unit]] = js.undefined
  
  var save: js.UndefOr[js.Function0[String]] = js.undefined
}
object Mod {
  
  inline def apply(): Mod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mod] (val x: Self) extends AnyVal {
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInit(value: js.Function0[Unit] | `0`): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitFunction0(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setLoad(value: /* data */ String => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    
    inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    inline def setSave(value: () => String): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
  }
}
