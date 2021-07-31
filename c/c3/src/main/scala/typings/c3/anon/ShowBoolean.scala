package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowBoolean extends StObject {
  
  var show: Boolean
}
object ShowBoolean {
  
  @scala.inline
  def apply(show: Boolean): ShowBoolean = {
    val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowBoolean]
  }
  
  @scala.inline
  implicit class ShowBooleanMutableBuilder[Self <: ShowBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
