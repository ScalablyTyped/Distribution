package typings.awsSdk.mediastoredataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  /**
    * The length of the item in bytes.
    */
  var ContentLength: js.UndefOr[NonNegativeLong] = js.undefined
  
  /**
    * The content type of the item.
    */
  var ContentType: js.UndefOr[typings.awsSdk.mediastoredataMod.ContentType] = js.undefined
  
  /**
    * The ETag that represents a unique instance of the item.
    */
  var ETag: js.UndefOr[typings.awsSdk.mediastoredataMod.ETag] = js.undefined
  
  /**
    * The date and time that the item was last modified.
    */
  var LastModified: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the item.
    */
  var Name: js.UndefOr[ItemName] = js.undefined
  
  /**
    * The item type (folder or object).
    */
  var Type: js.UndefOr[ItemType] = js.undefined
}
object Item {
  
  inline def apply(): Item = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Item]
  }
  
  extension [Self <: Item](x: Self) {
    
    inline def setContentLength(value: NonNegativeLong): Self = StObject.set(x, "ContentLength", value.asInstanceOf[js.Any])
    
    inline def setContentLengthUndefined: Self = StObject.set(x, "ContentLength", js.undefined)
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setETag(value: ETag): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setLastModified(value: js.Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    inline def setName(value: ItemName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setType(value: ItemType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
