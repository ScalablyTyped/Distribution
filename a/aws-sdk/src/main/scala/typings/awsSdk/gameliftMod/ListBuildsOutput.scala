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
    * A token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonEmptyString] = js.undefined
}
object ListBuildsOutput {
  
  inline def apply(): ListBuildsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBuildsOutput]
  }
  
  extension [Self <: ListBuildsOutput](x: Self) {
    
    inline def setBuilds(value: BuildList): Self = StObject.set(x, "Builds", value.asInstanceOf[js.Any])
    
    inline def setBuildsUndefined: Self = StObject.set(x, "Builds", js.undefined)
    
    inline def setBuildsVarargs(value: Build*): Self = StObject.set(x, "Builds", js.Array(value*))
    
    inline def setNextToken(value: NonEmptyString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
