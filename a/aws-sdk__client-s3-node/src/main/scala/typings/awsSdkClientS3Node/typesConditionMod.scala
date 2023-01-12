package typings.awsSdkClientS3Node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesConditionMod {
  
  trait Condition extends StObject {
    
    /**
      * <p>The HTTP error code when the redirect is applied. In the event of an error, if the error code equals this value, then the specified redirect is applied. Required when parent element Condition is specified and sibling KeyPrefixEquals is not specified. If both are specified, then both must be true for the redirect to be applied.</p>
      */
    var HttpErrorCodeReturnedEquals: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The object key name prefix when the redirect is applied. For example, to redirect requests for ExamplePage.html, the key prefix will be ExamplePage.html. To redirect request for all pages with the prefix docs/, the key prefix will be /docs, which identifies all objects in the docs/ folder. Required when the parent element Condition is specified and sibling HttpErrorCodeReturnedEquals is not specified. If both conditions are specified, both must be true for the redirect to be applied.</p>
      */
    var KeyPrefixEquals: js.UndefOr[String] = js.undefined
  }
  object Condition {
    
    inline def apply(): Condition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Condition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
      
      inline def setHttpErrorCodeReturnedEquals(value: String): Self = StObject.set(x, "HttpErrorCodeReturnedEquals", value.asInstanceOf[js.Any])
      
      inline def setHttpErrorCodeReturnedEqualsUndefined: Self = StObject.set(x, "HttpErrorCodeReturnedEquals", js.undefined)
      
      inline def setKeyPrefixEquals(value: String): Self = StObject.set(x, "KeyPrefixEquals", value.asInstanceOf[js.Any])
      
      inline def setKeyPrefixEqualsUndefined: Self = StObject.set(x, "KeyPrefixEquals", js.undefined)
    }
  }
  
  type UnmarshalledCondition = Condition
}
