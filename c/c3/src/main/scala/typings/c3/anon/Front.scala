package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Front extends StObject {
  
  var front: js.UndefOr[Boolean] = js.undefined
}
object Front {
  
  @scala.inline
  def apply(): Front = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Front]
  }
  
  @scala.inline
  implicit class FrontMutableBuilder[Self <: Front] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFront(value: Boolean): Self = StObject.set(x, "front", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrontUndefined: Self = StObject.set(x, "front", js.undefined)
  }
}
