package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBuildsOutput extends StObject {
  
  /**
    * A collection of build resources that match the request.
    */
  var Builds: js.UndefOr[BuildList] = js.undefined
  
  /**
    * Token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonEmptyString] = js.undefined
}
object ListBuildsOutput {
  
  @scala.inline
  def apply(): ListBuildsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBuildsOutput]
  }
  
  @scala.inline
  implicit class ListBuildsOutputMutableBuilder[Self <: ListBuildsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuilds(value: BuildList): Self = StObject.set(x, "Builds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildsUndefined: Self = StObject.set(x, "Builds", js.undefined)
    
    @scala.inline
    def setBuildsVarargs(value: Build*): Self = StObject.set(x, "Builds", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NonEmptyString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
