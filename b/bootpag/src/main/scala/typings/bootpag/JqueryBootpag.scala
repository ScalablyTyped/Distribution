package typings.bootpag

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JqueryBootpag {
  
  trait Options extends StObject {
    
    /**
      * css class for active (default 'active')
      */
    var activeClass: js.UndefOr[String] = js.undefined
    
    /**
      * css class for disabled (default 'disabled')
      */
    var disabledClass: js.UndefOr[String] = js.undefined
    
    /**
      * name of first (default 'FIRST')
      */
    var first: js.UndefOr[String] = js.undefined
    
    /**
      * css class for first (default 'first')
      */
    var firstClass: js.UndefOr[String] = js.undefined
    
    /**
      * do we ant first and last (default true)
      */
    var firstLastUse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * template for pagination links (default "javascript:void(0);")
      */
    var href: js.UndefOr[String] = js.undefined
    
    /**
      * variable name in href template for page number (default "{{number}}")
      */
    var hrefVariable: js.UndefOr[String] = js.undefined
    
    /**
      * name of last (default 'LAST')
      */
    var last: js.UndefOr[String] = js.undefined
    
    /**
      * css class for last (default 'last')
      */
    var lastClass: js.UndefOr[String] = js.undefined
    
    /**
      * next/prev buttons move over one page or maximum visible pages (default true)
      */
    var leaps: js.UndefOr[Boolean] = js.undefined
    
    /**
      * maximum number of visible pages
      */
    var maxVisible: Double
    
    /**
      * next button text (default ???)
      */
    var next: js.UndefOr[String] = js.undefined
    
    /**
      * css class for next (default 'next')
      */
    var nextClass: js.UndefOr[String] = js.undefined
    
    /**
      * page to show on start
      */
    var page: js.UndefOr[Double] = js.undefined
    
    /**
      * prev button text (default ???)
      */
    var prev: js.UndefOr[String] = js.undefined
    
    /**
      * css class for prev (default 'prev')
      */
    var prevClass: js.UndefOr[String] = js.undefined
    
    /**
      * number of pages
      */
    var total: Double
    
    /**
      * css class for wrap (default 'pagination')
      */
    var wrapClass: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(maxVisible: Double, total: Double): Options = {
      val __obj = js.Dynamic.literal(maxVisible = maxVisible.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setActiveClass(value: String): Self = StObject.set(x, "activeClass", value.asInstanceOf[js.Any])
      
      inline def setActiveClassUndefined: Self = StObject.set(x, "activeClass", js.undefined)
      
      inline def setDisabledClass(value: String): Self = StObject.set(x, "disabledClass", value.asInstanceOf[js.Any])
      
      inline def setDisabledClassUndefined: Self = StObject.set(x, "disabledClass", js.undefined)
      
      inline def setFirst(value: String): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setFirstClass(value: String): Self = StObject.set(x, "firstClass", value.asInstanceOf[js.Any])
      
      inline def setFirstClassUndefined: Self = StObject.set(x, "firstClass", js.undefined)
      
      inline def setFirstLastUse(value: Boolean): Self = StObject.set(x, "firstLastUse", value.asInstanceOf[js.Any])
      
      inline def setFirstLastUseUndefined: Self = StObject.set(x, "firstLastUse", js.undefined)
      
      inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setHrefVariable(value: String): Self = StObject.set(x, "hrefVariable", value.asInstanceOf[js.Any])
      
      inline def setHrefVariableUndefined: Self = StObject.set(x, "hrefVariable", js.undefined)
      
      inline def setLast(value: String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setLastClass(value: String): Self = StObject.set(x, "lastClass", value.asInstanceOf[js.Any])
      
      inline def setLastClassUndefined: Self = StObject.set(x, "lastClass", js.undefined)
      
      inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
      
      inline def setLeaps(value: Boolean): Self = StObject.set(x, "leaps", value.asInstanceOf[js.Any])
      
      inline def setLeapsUndefined: Self = StObject.set(x, "leaps", js.undefined)
      
      inline def setMaxVisible(value: Double): Self = StObject.set(x, "maxVisible", value.asInstanceOf[js.Any])
      
      inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextClass(value: String): Self = StObject.set(x, "nextClass", value.asInstanceOf[js.Any])
      
      inline def setNextClassUndefined: Self = StObject.set(x, "nextClass", js.undefined)
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setPrev(value: String): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevClass(value: String): Self = StObject.set(x, "prevClass", value.asInstanceOf[js.Any])
      
      inline def setPrevClassUndefined: Self = StObject.set(x, "prevClass", js.undefined)
      
      inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setWrapClass(value: String): Self = StObject.set(x, "wrapClass", value.asInstanceOf[js.Any])
      
      inline def setWrapClassUndefined: Self = StObject.set(x, "wrapClass", js.undefined)
    }
  }
  
  /**
    * Event handler on page click.
    * @param event : JQueryEventObject
    * @param pageNumber : number of the clicked page
    */
  type PageEventHandler = js.Function2[/* event */ JQueryEventObject, /* pageNumber */ Double, Any]
}
