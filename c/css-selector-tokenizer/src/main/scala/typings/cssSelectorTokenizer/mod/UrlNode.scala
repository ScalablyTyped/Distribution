package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlNode
  extends ValueNodeType
     with BaseNode {
  
  var innerSpacingAfter: js.UndefOr[String] = js.native
  
  var innerSpacingBefore: js.UndefOr[String] = js.native
  
  var stringType: js.UndefOr[String] = js.native
  
  var `type`: url = js.native
  
  var url: String = js.native
}
object UrlNode {
  
  @scala.inline
  def apply(`type`: url, url: String): UrlNode = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlNode]
  }
  
  @scala.inline
  implicit class UrlNodeMutableBuilder[Self <: UrlNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInnerSpacingAfter(value: String): Self = StObject.set(x, "innerSpacingAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerSpacingAfterUndefined: Self = StObject.set(x, "innerSpacingAfter", js.undefined)
    
    @scala.inline
    def setInnerSpacingBefore(value: String): Self = StObject.set(x, "innerSpacingBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerSpacingBeforeUndefined: Self = StObject.set(x, "innerSpacingBefore", js.undefined)
    
    @scala.inline
    def setStringType(value: String): Self = StObject.set(x, "stringType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringTypeUndefined: Self = StObject.set(x, "stringType", js.undefined)
    
    @scala.inline
    def setType(value: url): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
