package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreManagedPrefixListVersionResult extends StObject {
  
  /**
    * Information about the prefix list.
    */
  var PrefixList: js.UndefOr[ManagedPrefixList] = js.native
}
object RestoreManagedPrefixListVersionResult {
  
  @scala.inline
  def apply(): RestoreManagedPrefixListVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreManagedPrefixListVersionResult]
  }
  
  @scala.inline
  implicit class RestoreManagedPrefixListVersionResultMutableBuilder[Self <: RestoreManagedPrefixListVersionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefixList(value: ManagedPrefixList): Self = StObject.set(x, "PrefixList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixListUndefined: Self = StObject.set(x, "PrefixList", js.undefined)
  }
}
