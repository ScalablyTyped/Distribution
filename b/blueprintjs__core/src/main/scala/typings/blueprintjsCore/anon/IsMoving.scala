package typings.blueprintjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsMoving extends StObject {
  
  var isMoving: Boolean = js.native
}
object IsMoving {
  
  @scala.inline
  def apply(isMoving: Boolean): IsMoving = {
    val __obj = js.Dynamic.literal(isMoving = isMoving.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsMoving]
  }
  
  @scala.inline
  implicit class IsMovingMutableBuilder[Self <: IsMoving] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsMoving(value: Boolean): Self = StObject.set(x, "isMoving", value.asInstanceOf[js.Any])
  }
}
