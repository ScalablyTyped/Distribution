package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSolutionVersionResponse extends StObject {
  
  /**
    * The ARN of the new solution version.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.native
}
object CreateSolutionVersionResponse {
  
  @scala.inline
  def apply(): CreateSolutionVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSolutionVersionResponse]
  }
  
  @scala.inline
  implicit class CreateSolutionVersionResponseMutableBuilder[Self <: CreateSolutionVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSolutionVersionArn(value: Arn): Self = StObject.set(x, "solutionVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolutionVersionArnUndefined: Self = StObject.set(x, "solutionVersionArn", js.undefined)
  }
}
