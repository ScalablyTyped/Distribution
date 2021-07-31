package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.B
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.N
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.S
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAttributeDefinitionMod {
  
  trait AttributeDefinition extends StObject {
    
    /**
      * <p>A name for the attribute.</p>
      */
    var AttributeName: String
    
    /**
      * <p>The data type for the attribute, where:</p> <ul> <li> <p> <code>S</code> - the attribute is of type String</p> </li> <li> <p> <code>N</code> - the attribute is of type Number</p> </li> <li> <p> <code>B</code> - the attribute is of type Binary</p> </li> </ul>
      */
    var AttributeType: S | N | B | String
  }
  object AttributeDefinition {
    
    @scala.inline
    def apply(AttributeName: String, AttributeType: S | N | B | String): AttributeDefinition = {
      val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], AttributeType = AttributeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeDefinition]
    }
    
    @scala.inline
    implicit class AttributeDefinitionMutableBuilder[Self <: AttributeDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeName(value: String): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeType(value: S | N | B | String): Self = StObject.set(x, "AttributeType", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledAttributeDefinition = AttributeDefinition
}
