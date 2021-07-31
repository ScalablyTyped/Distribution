package typings.blueprintjsTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NextScrollLeft extends StObject {
  
  var nextScrollLeft: Double
  
  var nextScrollTop: Double
}
object NextScrollLeft {
  
  @scala.inline
  def apply(nextScrollLeft: Double, nextScrollTop: Double): NextScrollLeft = {
    val __obj = js.Dynamic.literal(nextScrollLeft = nextScrollLeft.asInstanceOf[js.Any], nextScrollTop = nextScrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextScrollLeft]
  }
  
  @scala.inline
  implicit class NextScrollLeftMutableBuilder[Self <: NextScrollLeft] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextScrollLeft(value: Double): Self = StObject.set(x, "nextScrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextScrollTop(value: Double): Self = StObject.set(x, "nextScrollTop", value.asInstanceOf[js.Any])
  }
}
