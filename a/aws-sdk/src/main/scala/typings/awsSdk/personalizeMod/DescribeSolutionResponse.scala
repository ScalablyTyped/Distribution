package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSolutionResponse extends StObject {
  
  /**
    * An object that describes the solution.
    */
  var solution: js.UndefOr[Solution] = js.undefined
}
object DescribeSolutionResponse {
  
  @scala.inline
  def apply(): DescribeSolutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSolutionResponse]
  }
  
  @scala.inline
  implicit class DescribeSolutionResponseMutableBuilder[Self <: DescribeSolutionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSolution(value: Solution): Self = StObject.set(x, "solution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolutionUndefined: Self = StObject.set(x, "solution", js.undefined)
  }
}
