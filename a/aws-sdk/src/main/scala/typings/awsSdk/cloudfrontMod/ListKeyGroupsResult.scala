package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListKeyGroupsResult extends StObject {
  
  /**
    * A list of key groups.
    */
  var KeyGroupList: js.UndefOr[typings.awsSdk.cloudfrontMod.KeyGroupList] = js.native
}
object ListKeyGroupsResult {
  
  @scala.inline
  def apply(): ListKeyGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListKeyGroupsResult]
  }
  
  @scala.inline
  implicit class ListKeyGroupsResultMutableBuilder[Self <: ListKeyGroupsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyGroupList(value: KeyGroupList): Self = StObject.set(x, "KeyGroupList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyGroupListUndefined: Self = StObject.set(x, "KeyGroupList", js.undefined)
  }
}
