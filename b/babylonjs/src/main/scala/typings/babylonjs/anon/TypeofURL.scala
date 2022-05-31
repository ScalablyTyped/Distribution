package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofURL extends StObject {
  
  def createObjectURL(`object`: js.Any): String
  
  def revokeObjectURL(url: String): Unit
}
object TypeofURL {
  
  inline def apply(createObjectURL: js.Any => String, revokeObjectURL: String => Unit): TypeofURL = {
    val __obj = js.Dynamic.literal(createObjectURL = js.Any.fromFunction1(createObjectURL), revokeObjectURL = js.Any.fromFunction1(revokeObjectURL))
    __obj.asInstanceOf[TypeofURL]
  }
  
  extension [Self <: TypeofURL](x: Self) {
    
    inline def setCreateObjectURL(value: js.Any => String): Self = StObject.set(x, "createObjectURL", js.Any.fromFunction1(value))
    
    inline def setRevokeObjectURL(value: String => Unit): Self = StObject.set(x, "revokeObjectURL", js.Any.fromFunction1(value))
  }
}
