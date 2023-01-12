package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsBinary extends StObject {
  
  var isBinary: Boolean
}
object IsBinary {
  
  inline def apply(isBinary: Boolean): IsBinary = {
    val __obj = js.Dynamic.literal(isBinary = isBinary.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsBinary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsBinary] (val x: Self) extends AnyVal {
    
    inline def setIsBinary(value: Boolean): Self = StObject.set(x, "isBinary", value.asInstanceOf[js.Any])
  }
}
