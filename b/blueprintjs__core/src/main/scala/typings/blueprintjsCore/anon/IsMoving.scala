package typings.blueprintjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsMoving extends StObject {
  
  var isMoving: Boolean
}
object IsMoving {
  
  inline def apply(isMoving: Boolean): IsMoving = {
    val __obj = js.Dynamic.literal(isMoving = isMoving.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsMoving]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsMoving] (val x: Self) extends AnyVal {
    
    inline def setIsMoving(value: Boolean): Self = StObject.set(x, "isMoving", value.asInstanceOf[js.Any])
  }
}
