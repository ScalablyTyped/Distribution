package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PositionShow extends StObject {
  
  var position: js.UndefOr[Top] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var x: js.UndefOr[Double] = js.native
}
object PositionShow {
  
  @scala.inline
  def apply(): PositionShow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionShow]
  }
  
  @scala.inline
  implicit class PositionShowMutableBuilder[Self <: PositionShow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: Top): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
