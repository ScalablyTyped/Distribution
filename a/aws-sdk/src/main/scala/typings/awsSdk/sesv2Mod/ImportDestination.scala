package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportDestination extends StObject {
  
  /**
    * An object that contains the action of the import job towards a contact list.
    */
  var ContactListDestination: js.UndefOr[typings.awsSdk.sesv2Mod.ContactListDestination] = js.native
  
  /**
    * An object that contains the action of the import job towards suppression list.
    */
  var SuppressionListDestination: js.UndefOr[typings.awsSdk.sesv2Mod.SuppressionListDestination] = js.native
}
object ImportDestination {
  
  @scala.inline
  def apply(): ImportDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportDestination]
  }
  
  @scala.inline
  implicit class ImportDestinationMutableBuilder[Self <: ImportDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactListDestination(value: ContactListDestination): Self = StObject.set(x, "ContactListDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactListDestinationUndefined: Self = StObject.set(x, "ContactListDestination", js.undefined)
    
    @scala.inline
    def setSuppressionListDestination(value: SuppressionListDestination): Self = StObject.set(x, "SuppressionListDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressionListDestinationUndefined: Self = StObject.set(x, "SuppressionListDestination", js.undefined)
  }
}
