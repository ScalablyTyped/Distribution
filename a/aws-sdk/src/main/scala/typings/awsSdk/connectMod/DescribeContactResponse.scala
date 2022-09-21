package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeContactResponse extends StObject {
  
  /**
    * Information about the contact.
    */
  var Contact: js.UndefOr[typings.awsSdk.connectMod.Contact] = js.undefined
}
object DescribeContactResponse {
  
  inline def apply(): DescribeContactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContactResponse]
  }
  
  extension [Self <: DescribeContactResponse](x: Self) {
    
    inline def setContact(value: Contact): Self = StObject.set(x, "Contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "Contact", js.undefined)
  }
}
