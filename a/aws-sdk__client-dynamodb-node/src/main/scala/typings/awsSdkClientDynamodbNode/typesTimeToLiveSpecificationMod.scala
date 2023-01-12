package typings.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTimeToLiveSpecificationMod {
  
  trait TimeToLiveSpecification extends StObject {
    
    /**
      * <p>The name of the Time to Live attribute used to store the expiration time for items in the table.</p>
      */
    var AttributeName: String
    
    /**
      * <p>Indicates whether Time To Live is to be enabled (true) or disabled (false) on the table.</p>
      */
    var Enabled: Boolean
  }
  object TimeToLiveSpecification {
    
    inline def apply(AttributeName: String, Enabled: Boolean): TimeToLiveSpecification = {
      val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeToLiveSpecification]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimeToLiveSpecification] (val x: Self) extends AnyVal {
      
      inline def setAttributeName(value: String): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledTimeToLiveSpecification = TimeToLiveSpecification
}
