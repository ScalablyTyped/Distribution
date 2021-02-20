package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrefixListEntry extends StObject {
  
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
  implicit class PrefixListEntryMutableBuilder[Self <: PrefixListEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidr(value: String): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrUndefined: Self = StObject.set(x, "Cidr", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
