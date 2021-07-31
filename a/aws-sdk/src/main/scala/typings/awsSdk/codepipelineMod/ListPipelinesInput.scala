package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPipelinesInput extends StObject {
  
  /**
    * An identifier that was returned from the previous list pipelines call. It can be used to return the next set of pipelines in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListPipelinesInput {
  
  @scala.inline
  def apply(): ListPipelinesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPipelinesInput]
  }
  
  @scala.inline
  implicit class ListPipelinesInputMutableBuilder[Self <: ListPipelinesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
