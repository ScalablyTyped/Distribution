package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourceTagsResponse extends StObject {
  
  /**
    * <p>When <code>Truncated</code> is true, this element is present and contains the
    *     value to use for the <code>Marker</code> parameter in a subsequent request.</p>
    *          <p>Do not assume or infer any information from this value.</p>
    */
  var NextMarker: js.UndefOr[String] = js.undefined
  
  /**
    * <p>A list of tags. Each tag consists of a tag key and a tag value.</p>
    *          <note>
    *             <p>Tagging or untagging a KMS key can allow or deny permission to the KMS key. For details, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html">ABAC for KMS</a> in the <i>Key Management Service Developer Guide</i>.</p>
    *          </note>
    */
  var Tags: js.UndefOr[js.Array[Tag]] = js.undefined
  
  /**
    * <p>A flag that indicates whether there are more items in the list. When this
    *     value is true, the list in this response is truncated. To get more items, pass the value of
    *     the <code>NextMarker</code> element in thisresponse to the <code>Marker</code> parameter in a
    *     subsequent request.</p>
    */
  var Truncated: js.UndefOr[Boolean] = js.undefined
}
object ListResourceTagsResponse {
  
  inline def apply(): ListResourceTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceTagsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListResourceTagsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTruncated(value: Boolean): Self = StObject.set(x, "Truncated", value.asInstanceOf[js.Any])
    
    inline def setTruncatedUndefined: Self = StObject.set(x, "Truncated", js.undefined)
  }
}
