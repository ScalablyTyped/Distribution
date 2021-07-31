package typings.d3Indirections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base class for all GET responses. Should not be used directly.
  */
trait ResponseBase extends StObject {
  
  var result: js.Any
}
object ResponseBase {
  
  @scala.inline
  def apply(result: js.Any): ResponseBase = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseBase]
  }
  
  @scala.inline
  implicit class ResponseBaseMutableBuilder[Self <: ResponseBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
