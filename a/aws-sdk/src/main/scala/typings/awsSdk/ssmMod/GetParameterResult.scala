package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameterResult extends StObject {
  
  /**
    * Information about a parameter.
    */
  var Parameter: js.UndefOr[typings.awsSdk.ssmMod.Parameter] = js.undefined
}
object GetParameterResult {
  
  @scala.inline
  def apply(): GetParameterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetParameterResult]
  }
  
  @scala.inline
  implicit class GetParameterResultMutableBuilder[Self <: GetParameterResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameter(value: Parameter): Self = StObject.set(x, "Parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterUndefined: Self = StObject.set(x, "Parameter", js.undefined)
  }
}
