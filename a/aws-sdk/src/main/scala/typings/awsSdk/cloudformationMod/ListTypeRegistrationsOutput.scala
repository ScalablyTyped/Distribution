package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTypeRegistrationsOutput extends StObject {
  
  /**
    * If the request doesn't return all of the remaining results, NextToken is set to a token. To retrieve the next set of results, call this action again and assign that token to the request object's NextToken parameter. If the request returns all results, NextToken is set to null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.undefined
  
  /**
    *  A list of type registration tokens. Use  DescribeTypeRegistration  to return detailed information about a type registration request.
    */
  var RegistrationTokenList: js.UndefOr[typings.awsSdk.cloudformationMod.RegistrationTokenList] = js.undefined
}
object ListTypeRegistrationsOutput {
  
  @scala.inline
  def apply(): ListTypeRegistrationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTypeRegistrationsOutput]
  }
  
  @scala.inline
  implicit class ListTypeRegistrationsOutputMutableBuilder[Self <: ListTypeRegistrationsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRegistrationTokenList(value: RegistrationTokenList): Self = StObject.set(x, "RegistrationTokenList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationTokenListUndefined: Self = StObject.set(x, "RegistrationTokenList", js.undefined)
    
    @scala.inline
    def setRegistrationTokenListVarargs(value: RegistrationToken*): Self = StObject.set(x, "RegistrationTokenList", js.Array(value :_*))
  }
}
