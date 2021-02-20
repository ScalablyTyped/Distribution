package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInstanceProfilesResult extends StObject {
  
  /**
    * An object that contains information about your instance profiles.
    */
  var instanceProfiles: js.UndefOr[InstanceProfiles] = js.native
  
  /**
    * An identifier that can be used in the next call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}
object ListInstanceProfilesResult {
  
  @scala.inline
  def apply(): ListInstanceProfilesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInstanceProfilesResult]
  }
  
  @scala.inline
  implicit class ListInstanceProfilesResultMutableBuilder[Self <: ListInstanceProfilesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceProfiles(value: InstanceProfiles): Self = StObject.set(x, "instanceProfiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceProfilesUndefined: Self = StObject.set(x, "instanceProfiles", js.undefined)
    
    @scala.inline
    def setInstanceProfilesVarargs(value: InstanceProfile*): Self = StObject.set(x, "instanceProfiles", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
