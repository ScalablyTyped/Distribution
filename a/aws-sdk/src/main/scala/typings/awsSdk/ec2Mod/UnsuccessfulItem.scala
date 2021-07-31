package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnsuccessfulItem extends StObject {
  
  /**
    * Information about the error.
    */
  var Error: js.UndefOr[UnsuccessfulItemError] = js.undefined
  
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
}
object UnsuccessfulItem {
  
  @scala.inline
  def apply(): UnsuccessfulItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnsuccessfulItem]
  }
  
  @scala.inline
  implicit class UnsuccessfulItemMutableBuilder[Self <: UnsuccessfulItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: UnsuccessfulItemError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    @scala.inline
    def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
  }
}
