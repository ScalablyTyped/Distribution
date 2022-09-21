package typings.typescriptNn5FuAjk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def fileExists(path: String): Boolean
}
object `0` {
  
  inline def apply(fileExists: String => Boolean): `0` = {
    val __obj = js.Dynamic.literal(fileExists = js.Any.fromFunction1(fileExists))
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setFileExists(value: String => Boolean): Self = StObject.set(x, "fileExists", js.Any.fromFunction1(value))
  }
}
