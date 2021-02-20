package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoleLastUsed extends StObject {
  
  /**
    * The date and time, in ISO 8601 date-time format that the role was last used. This field is null if the role has not been used within the IAM tracking period. For more information about the tracking period, see Regions Where Data Is Tracked in the IAM User Guide. 
    */
  var LastUsedDate: js.UndefOr[dateType] = js.native
  
  /**
    * The name of the AWS Region in which the role was last used.
    */
  var Region: js.UndefOr[stringType] = js.native
}
object RoleLastUsed {
  
  @scala.inline
  def apply(): RoleLastUsed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleLastUsed]
  }
  
  @scala.inline
  implicit class RoleLastUsedMutableBuilder[Self <: RoleLastUsed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastUsedDate(value: dateType): Self = StObject.set(x, "LastUsedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUsedDateUndefined: Self = StObject.set(x, "LastUsedDate", js.undefined)
    
    @scala.inline
    def setRegion(value: stringType): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
  }
}
