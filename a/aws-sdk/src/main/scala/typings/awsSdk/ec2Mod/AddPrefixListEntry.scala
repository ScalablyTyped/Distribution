package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddPrefixListEntry extends StObject {
  
  /**
    * The CIDR block.
    */
  var Cidr: String = js.native
  
  /**
    * A description for the entry. Constraints: Up to 255 characters in length.
    */
  var Description: js.UndefOr[String] = js.native
}
object AddPrefixListEntry {
  
  @scala.inline
  def apply(Cidr: String): AddPrefixListEntry = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPrefixListEntry]
  }
  
  @scala.inline
  implicit class AddPrefixListEntryMutableBuilder[Self <: AddPrefixListEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidr(value: String): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
