package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateShareMenuOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 是否使用带 shareTicket 的转发详情 */
  var withShareTicket: js.UndefOr[Boolean] = js.native
}
object UpdateShareMenuOptions {
  
  @scala.inline
  def apply(): UpdateShareMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateShareMenuOptions]
  }
  
  @scala.inline
  implicit class UpdateShareMenuOptionsMutableBuilder[Self <: UpdateShareMenuOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWithShareTicket(value: Boolean): Self = StObject.set(x, "withShareTicket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithShareTicketUndefined: Self = StObject.set(x, "withShareTicket", js.undefined)
  }
}
