package typings.contentstackUtils

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModelsEmbeddedObjectMod {
  
  type EmbedModel[T] = StringDictionary[js.Array[T]]
  
  trait EmbeddedItem
    extends StObject
       with /* propName */ StringDictionary[Any] {
    
    var _content_type_uid: js.UndefOr[String] = js.undefined
    
    var uid: String
  }
  object EmbeddedItem {
    
    inline def apply(uid: String): EmbeddedItem = {
      val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmbeddedItem]
    }
    
    extension [Self <: EmbeddedItem](x: Self) {
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def set_content_type_uid(value: String): Self = StObject.set(x, "_content_type_uid", value.asInstanceOf[js.Any])
      
      inline def set_content_type_uidUndefined: Self = StObject.set(x, "_content_type_uid", js.undefined)
    }
  }
  
  trait EntryEmbedable
    extends StObject
       with /* propName */ StringDictionary[Any] {
    
    var _embedded_items: js.UndefOr[EmbedModel[EmbeddedItem]] = js.undefined
    
    var uid: String
  }
  object EntryEmbedable {
    
    inline def apply(uid: String): EntryEmbedable = {
      val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryEmbedable]
    }
    
    extension [Self <: EntryEmbedable](x: Self) {
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def set_embedded_items(value: EmbedModel[EmbeddedItem]): Self = StObject.set(x, "_embedded_items", value.asInstanceOf[js.Any])
      
      inline def set_embedded_itemsUndefined: Self = StObject.set(x, "_embedded_items", js.undefined)
    }
  }
}
