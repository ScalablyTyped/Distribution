package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAliasesOutput extends StObject {
  
  /**
    * A collection of alias resources that match the request parameters.
    */
  var Aliases: js.UndefOr[AliasList] = js.native
  
  /**
    * A token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonEmptyString] = js.native
}
object ListAliasesOutput {
  
  @scala.inline
  def apply(): ListAliasesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAliasesOutput]
  }
  
  @scala.inline
  implicit class ListAliasesOutputMutableBuilder[Self <: ListAliasesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliases(value: AliasList): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesUndefined: Self = StObject.set(x, "Aliases", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: Alias*): Self = StObject.set(x, "Aliases", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NonEmptyString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
