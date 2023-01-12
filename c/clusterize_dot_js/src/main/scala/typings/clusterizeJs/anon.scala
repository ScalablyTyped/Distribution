package typings.clusterizeJs

import typings.clusterizeJs.mod.Callbacks
import typings.clusterizeJs.mod.Setup
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Blocksincluster extends StObject {
    
    var blocks_in_cluster: js.UndefOr[Double] = js.undefined
    
    var callbacks: js.UndefOr[Callbacks] = js.undefined
    
    var keep_parity: js.UndefOr[Boolean] = js.undefined
    
    var no_data_class: js.UndefOr[String] = js.undefined
    
    var no_data_text: js.UndefOr[String] = js.undefined
    
    var rows: js.UndefOr[js.Array[String]] = js.undefined
    
    var rows_in_block: js.UndefOr[Double] = js.undefined
    
    var show_no_data_row: js.UndefOr[Boolean] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
  }
  object Blocksincluster {
    
    inline def apply(): Blocksincluster = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Blocksincluster]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Blocksincluster] (val x: Self) extends AnyVal {
      
      inline def setBlocks_in_cluster(value: Double): Self = StObject.set(x, "blocks_in_cluster", value.asInstanceOf[js.Any])
      
      inline def setBlocks_in_clusterUndefined: Self = StObject.set(x, "blocks_in_cluster", js.undefined)
      
      inline def setCallbacks(value: Callbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      inline def setKeep_parity(value: Boolean): Self = StObject.set(x, "keep_parity", value.asInstanceOf[js.Any])
      
      inline def setKeep_parityUndefined: Self = StObject.set(x, "keep_parity", js.undefined)
      
      inline def setNo_data_class(value: String): Self = StObject.set(x, "no_data_class", value.asInstanceOf[js.Any])
      
      inline def setNo_data_classUndefined: Self = StObject.set(x, "no_data_class", js.undefined)
      
      inline def setNo_data_text(value: String): Self = StObject.set(x, "no_data_text", value.asInstanceOf[js.Any])
      
      inline def setNo_data_textUndefined: Self = StObject.set(x, "no_data_text", js.undefined)
      
      inline def setRows(value: js.Array[String]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setRowsVarargs(value: String*): Self = StObject.set(x, "rows", js.Array(value*))
      
      inline def setRows_in_block(value: Double): Self = StObject.set(x, "rows_in_block", value.asInstanceOf[js.Any])
      
      inline def setRows_in_blockUndefined: Self = StObject.set(x, "rows_in_block", js.undefined)
      
      inline def setShow_no_data_row(value: Boolean): Self = StObject.set(x, "show_no_data_row", value.asInstanceOf[js.Any])
      
      inline def setShow_no_data_rowUndefined: Self = StObject.set(x, "show_no_data_row", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
  
  trait ContentElem
    extends StObject
       with Setup {
    
    var contentElem: HTMLElement
    
    var scrollElem: HTMLElement
  }
  object ContentElem {
    
    inline def apply(contentElem: HTMLElement, scrollElem: HTMLElement): ContentElem = {
      val __obj = js.Dynamic.literal(contentElem = contentElem.asInstanceOf[js.Any], scrollElem = scrollElem.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentElem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentElem] (val x: Self) extends AnyVal {
      
      inline def setContentElem(value: HTMLElement): Self = StObject.set(x, "contentElem", value.asInstanceOf[js.Any])
      
      inline def setScrollElem(value: HTMLElement): Self = StObject.set(x, "scrollElem", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContentId
    extends StObject
       with Setup {
    
    var contentId: String
    
    var scrollId: String
  }
  object ContentId {
    
    inline def apply(contentId: String, scrollId: String): ContentId = {
      val __obj = js.Dynamic.literal(contentId = contentId.asInstanceOf[js.Any], scrollId = scrollId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentId]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentId] (val x: Self) extends AnyVal {
      
      inline def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
      
      inline def setScrollId(value: String): Self = StObject.set(x, "scrollId", value.asInstanceOf[js.Any])
    }
  }
}
