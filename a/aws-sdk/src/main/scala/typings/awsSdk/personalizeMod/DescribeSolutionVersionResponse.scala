package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSolutionVersionResponse extends StObject {
  
  /**
    * The solution version.
    */
  var solutionVersion: js.UndefOr[SolutionVersion] = js.native
}
object DescribeSolutionVersionResponse {
  
  @scala.inline
  def apply(): DescribeSolutionVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSolutionVersionResponse]
  }
  
  @scala.inline
  implicit class DescribeSolutionVersionResponseMutableBuilder[Self <: DescribeSolutionVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSolutionVersion(value: SolutionVersion): Self = StObject.set(x, "solutionVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolutionVersionUndefined: Self = StObject.set(x, "solutionVersion", js.undefined)
  }
}
