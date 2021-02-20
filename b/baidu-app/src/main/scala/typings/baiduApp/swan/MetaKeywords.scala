package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetaKeywords
  extends BaseOptions[js.Any, js.Any] {
  
  var content: js.UndefOr[String] = js.native
}
object MetaKeywords {
  
  @scala.inline
  def apply(): MetaKeywords = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetaKeywords]
  }
  
  @scala.inline
  implicit class MetaKeywordsMutableBuilder[Self <: MetaKeywords] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
