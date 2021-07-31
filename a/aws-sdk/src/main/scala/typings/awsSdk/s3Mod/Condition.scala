package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Condition extends StObject {
  
  /**
    * The HTTP error code when the redirect is applied. In the event of an error, if the error code equals this value, then the specified redirect is applied. Required when parent element Condition is specified and sibling KeyPrefixEquals is not specified. If both are specified, then both must be true for the redirect to be applied.
    */
  var HttpErrorCodeReturnedEquals: js.UndefOr[typings.awsSdk.s3Mod.HttpErrorCodeReturnedEquals] = js.undefined
  
  /**
    * The object key name prefix when the redirect is applied. For example, to redirect requests for ExamplePage.html, the key prefix will be ExamplePage.html. To redirect request for all pages with the prefix docs/, the key prefix will be /docs, which identifies all objects in the docs/ folder. Required when the parent element Condition is specified and sibling HttpErrorCodeReturnedEquals is not specified. If both conditions are specified, both must be true for the redirect to be applied.
    */
  var KeyPrefixEquals: js.UndefOr[typings.awsSdk.s3Mod.KeyPrefixEquals] = js.undefined
}
object Condition {
  
  @scala.inline
  def apply(): Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Condition]
  }
  
  @scala.inline
  implicit class ConditionMutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttpErrorCodeReturnedEquals(value: HttpErrorCodeReturnedEquals): Self = StObject.set(x, "HttpErrorCodeReturnedEquals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpErrorCodeReturnedEqualsUndefined: Self = StObject.set(x, "HttpErrorCodeReturnedEquals", js.undefined)
    
    @scala.inline
    def setKeyPrefixEquals(value: KeyPrefixEquals): Self = StObject.set(x, "KeyPrefixEquals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPrefixEqualsUndefined: Self = StObject.set(x, "KeyPrefixEquals", js.undefined)
  }
}
