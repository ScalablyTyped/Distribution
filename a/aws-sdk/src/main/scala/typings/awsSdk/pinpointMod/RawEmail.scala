package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawEmail extends StObject {
  
  /**
    * The email message, represented as a raw MIME message. The entire message must be base64 encoded.
    */
  var Data: js.UndefOr[_Blob] = js.undefined
}
object RawEmail {
  
  @scala.inline
  def apply(): RawEmail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RawEmail]
  }
  
  @scala.inline
  implicit class RawEmailMutableBuilder[Self <: RawEmail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: _Blob): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
  }
}
