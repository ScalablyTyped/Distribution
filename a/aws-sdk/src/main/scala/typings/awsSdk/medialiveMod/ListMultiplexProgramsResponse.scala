package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMultiplexProgramsResponse extends StObject {
  
  /**
    * List of multiplex programs.
    */
  var MultiplexPrograms: js.UndefOr[listOfMultiplexProgramSummary] = js.native
  
  /**
    * Token for the next ListMultiplexProgram request.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ListMultiplexProgramsResponse {
  
  @scala.inline
  def apply(): ListMultiplexProgramsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMultiplexProgramsResponse]
  }
  
  @scala.inline
  implicit class ListMultiplexProgramsResponseMutableBuilder[Self <: ListMultiplexProgramsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultiplexPrograms(value: listOfMultiplexProgramSummary): Self = StObject.set(x, "MultiplexPrograms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplexProgramsUndefined: Self = StObject.set(x, "MultiplexPrograms", js.undefined)
    
    @scala.inline
    def setMultiplexProgramsVarargs(value: MultiplexProgramSummary*): Self = StObject.set(x, "MultiplexPrograms", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
