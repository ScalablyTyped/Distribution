package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateManagedPrefixListResult extends StObject {
  
  /**
    * Information about the prefix list.
    */
  var PrefixList: js.UndefOr[ManagedPrefixList] = js.native
}
object CreateManagedPrefixListResult {
  
  @scala.inline
  def apply(): CreateManagedPrefixListResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateManagedPrefixListResult]
  }
  
  @scala.inline
  implicit class CreateManagedPrefixListResultMutableBuilder[Self <: CreateManagedPrefixListResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefixList(value: ManagedPrefixList): Self = StObject.set(x, "PrefixList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixListUndefined: Self = StObject.set(x, "PrefixList", js.undefined)
  }
}
