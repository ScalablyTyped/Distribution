package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag extends StObject {
  
  /**
    * <p>The key of the tag.</p>
    */
  var TagKey: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The value of the tag.</p>
    */
  var TagValue: js.UndefOr[String] = js.undefined
}
object Tag {
  
  inline def apply(): Tag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
    
    inline def setTagKey(value: String): Self = StObject.set(x, "TagKey", value.asInstanceOf[js.Any])
    
    inline def setTagKeyUndefined: Self = StObject.set(x, "TagKey", js.undefined)
    
    inline def setTagValue(value: String): Self = StObject.set(x, "TagValue", value.asInstanceOf[js.Any])
    
    inline def setTagValueUndefined: Self = StObject.set(x, "TagValue", js.undefined)
  }
}
