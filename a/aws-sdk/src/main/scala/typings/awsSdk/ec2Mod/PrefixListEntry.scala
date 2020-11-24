package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrefixListEntry extends js.Object {
  
  /**
    * The CIDR block.
    */
  var Cidr: js.UndefOr[String] = js.native
  
  /**
    * The description.
    */
  var Description: js.UndefOr[String] = js.native
}
object PrefixListEntry {
  
  @scala.inline
  def apply(): PrefixListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrefixListEntry]
  }
  
  @scala.inline
  implicit class PrefixListEntryOps[Self <: PrefixListEntry] (val x: Self) extends AnyVal {
    
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
    def setCidr(value: String): Self = this.set("Cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidr: Self = this.set("Cidr", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
  }
}
