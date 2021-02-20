package typings.clusterizeJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("clusterize.js", JSImport.Namespace)
  @js.native
  class ^ protected () extends Clusterize {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Callbacks extends StObject {
    
    var clusterChanged: js.UndefOr[js.Function0[Unit]] = js.native
    
    var clusterWillChange: js.UndefOr[js.Function0[Unit]] = js.native
    
    var scrollingProgress: js.UndefOr[js.Function1[/* progress */ Double, Unit]] = js.native
  }
  object Callbacks {
    
    @scala.inline
    def apply(): Callbacks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Callbacks]
    }
    
    @scala.inline
    implicit class CallbacksMutableBuilder[Self <: Callbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClusterChanged(value: () => Unit): Self = StObject.set(x, "clusterChanged", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClusterChangedUndefined: Self = StObject.set(x, "clusterChanged", js.undefined)
      
      @scala.inline
      def setClusterWillChange(value: () => Unit): Self = StObject.set(x, "clusterWillChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClusterWillChangeUndefined: Self = StObject.set(x, "clusterWillChange", js.undefined)
      
      @scala.inline
      def setScrollingProgress(value: /* progress */ Double => Unit): Self = StObject.set(x, "scrollingProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollingProgressUndefined: Self = StObject.set(x, "scrollingProgress", js.undefined)
    }
  }
  
  @js.native
  trait Clusterize extends StObject {
    
    def append(rows: js.Array[String]): Unit = js.native
    
    def clear(): Unit = js.native
    
    def destroy(): Unit = js.native
    def destroy(clean: Boolean): Unit = js.native
    
    def getRowsAmount(): Double = js.native
    
    def getScrollProgress(): Double = js.native
    
    def prepend(rows: js.Array[String]): Unit = js.native
    
    def refresh(): Unit = js.native
    def refresh(force: Boolean): Unit = js.native
    
    def update(): Unit = js.native
    def update(data: js.Array[String]): Unit = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var blocks_in_cluster: js.UndefOr[Double] = js.native
    
    var callbacks: js.UndefOr[Callbacks] = js.native
    
    var contentId: String = js.native
    
    var keep_parity: js.UndefOr[Boolean] = js.native
    
    var no_data_class: js.UndefOr[String] = js.native
    
    var no_data_text: js.UndefOr[String] = js.native
    
    var rows: js.UndefOr[js.Array[String]] = js.native
    
    var rows_in_block: js.UndefOr[Double] = js.native
    
    var scrollId: String = js.native
    
    var show_no_data_row: js.UndefOr[Boolean] = js.native
    
    var tag: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(contentId: String, scrollId: String): Options = {
      val __obj = js.Dynamic.literal(contentId = contentId.asInstanceOf[js.Any], scrollId = scrollId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlocks_in_cluster(value: Double): Self = StObject.set(x, "blocks_in_cluster", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlocks_in_clusterUndefined: Self = StObject.set(x, "blocks_in_cluster", js.undefined)
      
      @scala.inline
      def setCallbacks(value: Callbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      @scala.inline
      def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeep_parity(value: Boolean): Self = StObject.set(x, "keep_parity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeep_parityUndefined: Self = StObject.set(x, "keep_parity", js.undefined)
      
      @scala.inline
      def setNo_data_class(value: String): Self = StObject.set(x, "no_data_class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNo_data_classUndefined: Self = StObject.set(x, "no_data_class", js.undefined)
      
      @scala.inline
      def setNo_data_text(value: String): Self = StObject.set(x, "no_data_text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNo_data_textUndefined: Self = StObject.set(x, "no_data_text", js.undefined)
      
      @scala.inline
      def setRows(value: js.Array[String]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setRowsVarargs(value: String*): Self = StObject.set(x, "rows", js.Array(value :_*))
      
      @scala.inline
      def setRows_in_block(value: Double): Self = StObject.set(x, "rows_in_block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRows_in_blockUndefined: Self = StObject.set(x, "rows_in_block", js.undefined)
      
      @scala.inline
      def setScrollId(value: String): Self = StObject.set(x, "scrollId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow_no_data_row(value: Boolean): Self = StObject.set(x, "show_no_data_row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow_no_data_rowUndefined: Self = StObject.set(x, "show_no_data_row", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
