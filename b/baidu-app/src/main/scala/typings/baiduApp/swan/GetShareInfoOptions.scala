package typings.baiduApp.swan

import typings.baiduApp.anon.EncryptedData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetShareInfoOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /** shareTicket */
  var shareTicket: String
  
  @JSName("success")
  def success_MGetShareInfoOptions(res: EncryptedData): Unit
}
object GetShareInfoOptions {
  
  @scala.inline
  def apply(shareTicket: String, success: EncryptedData => Unit): GetShareInfoOptions = {
    val __obj = js.Dynamic.literal(shareTicket = shareTicket.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetShareInfoOptions]
  }
  
  @scala.inline
  implicit class GetShareInfoOptionsMutableBuilder[Self <: GetShareInfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShareTicket(value: String): Self = StObject.set(x, "shareTicket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: EncryptedData => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
