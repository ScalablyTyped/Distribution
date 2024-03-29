package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NextPage extends StObject {
  
  var nextPage: Double
  
  var prevPage: Double
}
object NextPage {
  
  inline def apply(nextPage: Double, prevPage: Double): NextPage = {
    val __obj = js.Dynamic.literal(nextPage = nextPage.asInstanceOf[js.Any], prevPage = prevPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NextPage] (val x: Self) extends AnyVal {
    
    inline def setNextPage(value: Double): Self = StObject.set(x, "nextPage", value.asInstanceOf[js.Any])
    
    inline def setPrevPage(value: Double): Self = StObject.set(x, "prevPage", value.asInstanceOf[js.Any])
  }
}
