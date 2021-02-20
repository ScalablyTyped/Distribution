package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseLocationOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  def success_MChooseLocationOptions(res: ChooseLocationData): Unit = js.native
}
object ChooseLocationOptions {
  
  @scala.inline
  def apply(success: ChooseLocationData => Unit): ChooseLocationOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[ChooseLocationOptions]
  }
  
  @scala.inline
  implicit class ChooseLocationOptionsMutableBuilder[Self <: ChooseLocationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: ChooseLocationData => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
