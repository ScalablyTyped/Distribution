package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrefixList extends StObject {
  
  /**
    * The IP address range of the AWS service.
    */
  var Cidrs: js.UndefOr[ValueStringList] = js.native
  
  /**
    * The ID of the prefix.
    */
  var PrefixListId: js.UndefOr[String] = js.native
  
  /**
    * The name of the prefix.
    */
  var PrefixListName: js.UndefOr[String] = js.native
}
object PrefixList {
  
  @scala.inline
  def apply(): PrefixList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrefixList]
  }
  
  @scala.inline
  implicit class PrefixListMutableBuilder[Self <: PrefixList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidrs(value: ValueStringList): Self = StObject.set(x, "Cidrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrsUndefined: Self = StObject.set(x, "Cidrs", js.undefined)
    
    @scala.inline
    def setCidrsVarargs(value: String*): Self = StObject.set(x, "Cidrs", js.Array(value :_*))
    
    @scala.inline
    def setPrefixListId(value: String): Self = StObject.set(x, "PrefixListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixListIdUndefined: Self = StObject.set(x, "PrefixListId", js.undefined)
    
    @scala.inline
    def setPrefixListName(value: String): Self = StObject.set(x, "PrefixListName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixListNameUndefined: Self = StObject.set(x, "PrefixListName", js.undefined)
  }
}
