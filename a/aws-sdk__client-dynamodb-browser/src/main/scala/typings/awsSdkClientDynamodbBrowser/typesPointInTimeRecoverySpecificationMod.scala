package typings.awsSdkClientDynamodbBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPointInTimeRecoverySpecificationMod {
  
  trait PointInTimeRecoverySpecification extends StObject {
    
    /**
      * <p>Indicates whether point in time recovery is enabled (true) or disabled (false) on the table.</p>
      */
    var PointInTimeRecoveryEnabled: Boolean
  }
  object PointInTimeRecoverySpecification {
    
    inline def apply(PointInTimeRecoveryEnabled: Boolean): PointInTimeRecoverySpecification = {
      val __obj = js.Dynamic.literal(PointInTimeRecoveryEnabled = PointInTimeRecoveryEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointInTimeRecoverySpecification]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PointInTimeRecoverySpecification] (val x: Self) extends AnyVal {
      
      inline def setPointInTimeRecoveryEnabled(value: Boolean): Self = StObject.set(x, "PointInTimeRecoveryEnabled", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledPointInTimeRecoverySpecification = PointInTimeRecoverySpecification
}
