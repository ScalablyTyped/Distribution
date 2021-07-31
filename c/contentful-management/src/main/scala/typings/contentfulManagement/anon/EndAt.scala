package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndAt extends StObject {
  
  var endAt: String
  
  var startAt: String
}
object EndAt {
  
  @scala.inline
  def apply(endAt: String, startAt: String): EndAt = {
    val __obj = js.Dynamic.literal(endAt = endAt.asInstanceOf[js.Any], startAt = startAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndAt]
  }
  
  @scala.inline
  implicit class EndAtMutableBuilder[Self <: EndAt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndAt(value: String): Self = StObject.set(x, "endAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAt(value: String): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
  }
}
