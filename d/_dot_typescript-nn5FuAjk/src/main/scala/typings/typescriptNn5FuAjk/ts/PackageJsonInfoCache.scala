package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageJsonInfoCache extends StObject {
  
  def clear(): Unit
}
object PackageJsonInfoCache {
  
  inline def apply(clear: () => Unit): PackageJsonInfoCache = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
    __obj.asInstanceOf[PackageJsonInfoCache]
  }
  
  extension [Self <: PackageJsonInfoCache](x: Self) {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
  }
}
