package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LFTag extends StObject {
  
  /**
    * The key-name for the LF-tag.
    */
  var TagKey: LFTagKey
  
  /**
    * A list of possible values an attribute can take.
    */
  var TagValues: TagValueList
}
object LFTag {
  
  inline def apply(TagKey: LFTagKey, TagValues: TagValueList): LFTag = {
    val __obj = js.Dynamic.literal(TagKey = TagKey.asInstanceOf[js.Any], TagValues = TagValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[LFTag]
  }
  
  extension [Self <: LFTag](x: Self) {
    
    inline def setTagKey(value: LFTagKey): Self = StObject.set(x, "TagKey", value.asInstanceOf[js.Any])
    
    inline def setTagValues(value: TagValueList): Self = StObject.set(x, "TagValues", value.asInstanceOf[js.Any])
    
    inline def setTagValuesVarargs(value: LFTagValue*): Self = StObject.set(x, "TagValues", js.Array(value*))
  }
}
