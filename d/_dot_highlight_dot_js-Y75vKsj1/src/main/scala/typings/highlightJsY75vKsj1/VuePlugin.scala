package typings.highlightJsY75vKsj1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VuePlugin extends StObject {
  
  def install(vue: Any): Unit
}
object VuePlugin {
  
  inline def apply(install: Any => Unit): VuePlugin = {
    val __obj = js.Dynamic.literal(install = js.Any.fromFunction1(install))
    __obj.asInstanceOf[VuePlugin]
  }
  
  extension [Self <: VuePlugin](x: Self) {
    
    inline def setInstall(value: Any => Unit): Self = StObject.set(x, "install", js.Any.fromFunction1(value))
  }
}
