package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationTimeValue extends StObject {
  
  /**
    *  Contains an integer specifying time in minutes.   Valid values: 15 minutes. 
    */
  var Minutes: js.UndefOr[typings.awsSdk.s3Mod.Minutes] = js.native
}
object ReplicationTimeValue {
  
  @scala.inline
  def apply(): ReplicationTimeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationTimeValue]
  }
  
  @scala.inline
  implicit class ReplicationTimeValueMutableBuilder[Self <: ReplicationTimeValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinutes(value: Minutes): Self = StObject.set(x, "Minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinutesUndefined: Self = StObject.set(x, "Minutes", js.undefined)
  }
}
