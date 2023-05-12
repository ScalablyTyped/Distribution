package typings.cucumberCucumber.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILoadSourcesResult extends StObject {
  
  var errors: js.Array[ISourcesError]
  
  var plan: js.Array[IPlannedPickle]
}
object ILoadSourcesResult {
  
  inline def apply(errors: js.Array[ISourcesError], plan: js.Array[IPlannedPickle]): ILoadSourcesResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoadSourcesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILoadSourcesResult] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: js.Array[ISourcesError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: ISourcesError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setPlan(value: js.Array[IPlannedPickle]): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setPlanVarargs(value: IPlannedPickle*): Self = StObject.set(x, "plan", js.Array(value*))
  }
}
