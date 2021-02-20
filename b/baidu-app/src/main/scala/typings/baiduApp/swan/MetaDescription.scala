package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetaDescription
  extends BaseOptions[js.Any, js.Any] {
  
  var content: js.UndefOr[String] = js.native
}
object MetaDescription {
  
  @scala.inline
  def apply(): MetaDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetaDescription]
  }
  
  @scala.inline
  implicit class MetaDescriptionMutableBuilder[Self <: MetaDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
