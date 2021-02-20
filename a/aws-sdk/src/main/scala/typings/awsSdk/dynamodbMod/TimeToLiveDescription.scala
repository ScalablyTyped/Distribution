package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeToLiveDescription extends StObject {
  
  /**
    *  The name of the TTL attribute for items in the table.
    */
  var AttributeName: js.UndefOr[TimeToLiveAttributeName] = js.native
  
  /**
    *  The TTL status for the table.
    */
  var TimeToLiveStatus: js.UndefOr[typings.awsSdk.dynamodbMod.TimeToLiveStatus] = js.native
}
object TimeToLiveDescription {
  
  @scala.inline
  def apply(): TimeToLiveDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeToLiveDescription]
  }
  
  @scala.inline
  implicit class TimeToLiveDescriptionMutableBuilder[Self <: TimeToLiveDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: TimeToLiveAttributeName): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    @scala.inline
    def setTimeToLiveStatus(value: TimeToLiveStatus): Self = StObject.set(x, "TimeToLiveStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeToLiveStatusUndefined: Self = StObject.set(x, "TimeToLiveStatus", js.undefined)
  }
}
