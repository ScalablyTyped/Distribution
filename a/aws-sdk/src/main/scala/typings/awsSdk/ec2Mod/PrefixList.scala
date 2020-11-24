package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrefixList extends js.Object {
  
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
  implicit class PrefixListOps[Self <: PrefixList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCidrsVarargs(value: String*): Self = this.set("Cidrs", js.Array(value :_*))
    
    @scala.inline
    def setCidrs(value: ValueStringList): Self = this.set("Cidrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidrs: Self = this.set("Cidrs", js.undefined)
    
    @scala.inline
    def setPrefixListId(value: String): Self = this.set("PrefixListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixListId: Self = this.set("PrefixListId", js.undefined)
    
    @scala.inline
    def setPrefixListName(value: String): Self = this.set("PrefixListName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixListName: Self = this.set("PrefixListName", js.undefined)
  }
}
