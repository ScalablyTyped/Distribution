package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlNode
  extends StObject
     with BaseNode
     with ValueNodeType {
  
  var innerSpacingAfter: js.UndefOr[String] = js.undefined
  
  var innerSpacingBefore: js.UndefOr[String] = js.undefined
  
  var stringType: js.UndefOr[String] = js.undefined
  
  var `type`: url
  
  var url: String
}
object UrlNode {
  
  @scala.inline
  def apply(url: String): UrlNode = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("url")
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
