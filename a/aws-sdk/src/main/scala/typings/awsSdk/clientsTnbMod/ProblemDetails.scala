package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProblemDetails extends StObject {
  
  /**
    * A human-readable explanation specific to this occurrence of the problem.
    */
  var detail: String
  
  /**
    * A human-readable title of the problem type.
    */
  var title: js.UndefOr[String] = js.undefined
}
object ProblemDetails {
  
  inline def apply(detail: String): ProblemDetails = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProblemDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProblemDetails] (val x: Self) extends AnyVal {
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
