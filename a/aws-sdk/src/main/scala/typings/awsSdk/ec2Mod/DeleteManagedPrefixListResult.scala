package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteManagedPrefixListResult extends StObject {
  
  /**
    * Information about the prefix list.
    */
  var PrefixList: js.UndefOr[ManagedPrefixList] = js.undefined
}
object DeleteManagedPrefixListResult {
  
  @scala.inline
  def apply(): DeleteManagedPrefixListResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteManagedPrefixListResult]
  }
  
  @scala.inline
  implicit class DeleteManagedPrefixListResultMutableBuilder[Self <: DeleteManagedPrefixListResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefixList(value: ManagedPrefixList): Self = StObject.set(x, "PrefixList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixListUndefined: Self = StObject.set(x, "PrefixList", js.undefined)
  }
}
