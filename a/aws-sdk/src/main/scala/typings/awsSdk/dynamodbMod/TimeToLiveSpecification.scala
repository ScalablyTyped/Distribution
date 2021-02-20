package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeToLiveSpecification extends StObject {
  
  /**
    * The name of the TTL attribute used to store the expiration time for items in the table.
    */
  var AttributeName: TimeToLiveAttributeName = js.native
  
  /**
    * Indicates whether TTL is to be enabled (true) or disabled (false) on the table.
    */
  var Enabled: TimeToLiveEnabled = js.native
}
object TimeToLiveSpecification {
  
  @scala.inline
  def apply(AttributeName: TimeToLiveAttributeName, Enabled: TimeToLiveEnabled): TimeToLiveSpecification = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeToLiveSpecification]
  }
  
  @scala.inline
  implicit class TimeToLiveSpecificationMutableBuilder[Self <: TimeToLiveSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: TimeToLiveAttributeName): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: TimeToLiveEnabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
  }
}
