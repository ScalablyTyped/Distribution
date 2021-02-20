package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPhoneNumbersOptedOutInput extends StObject {
  
  /**
    * A NextToken string is used when you call the ListPhoneNumbersOptedOut action to retrieve additional records that are available after the first page of results.
    */
  var nextToken: js.UndefOr[java.lang.String] = js.native
}
object ListPhoneNumbersOptedOutInput {
  
  @scala.inline
  def apply(): ListPhoneNumbersOptedOutInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPhoneNumbersOptedOutInput]
  }
  
  @scala.inline
  implicit class ListPhoneNumbersOptedOutInputMutableBuilder[Self <: ListPhoneNumbersOptedOutInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: java.lang.String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
