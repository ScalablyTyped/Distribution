package typings.awsSdkClientDynamodbBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTimeToLiveSpecificationMod {
  
  @js.native
  trait TimeToLiveSpecification extends StObject {
    
    /**
      * <p>The name of the Time to Live attribute used to store the expiration time for items in the table.</p>
      */
    var AttributeName: String = js.native
    
    /**
      * <p>Indicates whether Time To Live is to be enabled (true) or disabled (false) on the table.</p>
      */
    var Enabled: Boolean = js.native
  }
  object TimeToLiveSpecification {
    
    @scala.inline
    def apply(AttributeName: String, Enabled: Boolean): TimeToLiveSpecification = {
      val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeToLiveSpecification]
    }
    
    @scala.inline
    implicit class TimeToLiveSpecificationMutableBuilder[Self <: TimeToLiveSpecification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeName(value: String): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledTimeToLiveSpecification = TimeToLiveSpecification
}
