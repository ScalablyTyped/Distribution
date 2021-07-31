package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NextPageNumber extends StObject {
  
  var nextPage: Double
}
object NextPageNumber {
  
  @scala.inline
  def apply(nextPage: Double): NextPageNumber = {
    val __obj = js.Dynamic.literal(nextPage = nextPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextPageNumber]
  }
  
  @scala.inline
  implicit class NextPageNumberMutableBuilder[Self <: NextPageNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPage(value: Double): Self = StObject.set(x, "nextPage", value.asInstanceOf[js.Any])
  }
}
