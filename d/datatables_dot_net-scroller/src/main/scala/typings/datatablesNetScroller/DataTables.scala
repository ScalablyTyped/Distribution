package typings.datatablesNetScroller

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataTables {
  
  trait Api extends StObject {
    
    var scroller: ScrollerMethodsModel
  }
  object Api {
    
    inline def apply(scroller: ScrollerMethodsModel): Api = {
      val __obj = js.Dynamic.literal(scroller = scroller.asInstanceOf[js.Any])
      __obj.asInstanceOf[Api]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Api] (val x: Self) extends AnyVal {
      
      inline def setScroller(value: ScrollerMethodsModel): Self = StObject.set(x, "scroller", value.asInstanceOf[js.Any])
    }
  }
  
  /*
    * start: {int}, // the 0-indexed record at the top of the viewport
    * end:   {int}, // the 0-indexed record at the bottom of the viewport
    */
  trait PageInfo extends StObject {
    
    var end: Double
    
    var start: Double
  }
  object PageInfo {
    
    inline def apply(end: Double, start: Double): PageInfo = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageInfo] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RowMethods extends StObject {
    
    /**
      * Scroll to a row
      */
    def scrollTo(): Api = js.native
    def scrollTo(animate: Boolean): Api = js.native
  }
  
  @js.native
  trait ScrollerMethods
    extends StObject
       with Api {
    
    /*
      * Calculate the row number that will be found at the given pixel position
      * (y-scroll).
      */
    def pixelsToRow(pixels: Double): Double = js.native
    def pixelsToRow(pixels: Double, intParse: Boolean): Double = js.native
    def pixelsToRow(pixels: Double, intParse: Boolean, virtual: Boolean): Double = js.native
    def pixelsToRow(pixels: Double, intParse: Unit, virtual: Boolean): Double = js.native
    
    /*
      * Calculate the pixel position from the top of the scrolling container for
      * a given row
      */
    def rowToPixels(rowIdx: Double): Double = js.native
    def rowToPixels(rowIdx: Double, intParse: Boolean): Double = js.native
    def rowToPixels(rowIdx: Double, intParse: Boolean, virtual: Boolean): Double = js.native
    def rowToPixels(rowIdx: Double, intParse: Unit, virtual: Boolean): Double = js.native
    
    def scrollToRow(rowIdx: Double): Api = js.native
    def scrollToRow(rowIdx: Double, animate: Boolean): Api = js.native
  }
  
  @js.native
  trait ScrollerMethodsModel extends StObject {
    
    /*
      * Calculate and store information about how many rows are to be displayed
      * in the scrolling viewport, based on current dimensions in the browser's
      * rendering.
      */
    def measure(): Api = js.native
    def measure(redraw: Boolean): Api = js.native
    
    /*
      * Get information about current displayed record range.
      */
    def page(): PageInfo = js.native
    
    /*
      * Get Scroller Api
      */
    def scroller(): ScrollerMethods = js.native
  }
  
  trait ScrollerSettings extends StObject {
    
    /*
      * Scroller uses the boundary scaling factor to decide when to redraw the table - which it
      * typically does before you reach the end of the currently loaded data set (in order to
      * allow the data to look continuous to a user scrolling through the data).
      */
    var boundaryScale: js.UndefOr[Double] = js.undefined
    
    /*
      * The display buffer is what Scroller uses to calculate how many rows it should pre-fetch
      * for scrolling.
      */
    var displayBuffer: js.UndefOr[Double] = js.undefined
    
    /*
      * Show (or not) the loading element in the background of the table. Note that you should
      * include the dataTables.scroller.css file for this to be displayed correctly.
      */
    var loadingIndicator: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Scroller will attempt to automatically calculate the height of rows for it's internal
      * calculations. However the height that is used can be overridden using this parameter.
      */
    var rowHeight: js.UndefOr[Double | String] = js.undefined
    
    /*
      * When using server-side processing, Scroller will wait a small amount of time to allow
      * the scrolling to finish before requesting more data from the server.
      */
    var serverWait: js.UndefOr[Double] = js.undefined
    
    /*
      * Indicate if Scroller show show trace information on the console or not.
      */
    var trace: js.UndefOr[Boolean] = js.undefined
  }
  object ScrollerSettings {
    
    inline def apply(): ScrollerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollerSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollerSettings] (val x: Self) extends AnyVal {
      
      inline def setBoundaryScale(value: Double): Self = StObject.set(x, "boundaryScale", value.asInstanceOf[js.Any])
      
      inline def setBoundaryScaleUndefined: Self = StObject.set(x, "boundaryScale", js.undefined)
      
      inline def setDisplayBuffer(value: Double): Self = StObject.set(x, "displayBuffer", value.asInstanceOf[js.Any])
      
      inline def setDisplayBufferUndefined: Self = StObject.set(x, "displayBuffer", js.undefined)
      
      inline def setLoadingIndicator(value: Boolean): Self = StObject.set(x, "loadingIndicator", value.asInstanceOf[js.Any])
      
      inline def setLoadingIndicatorUndefined: Self = StObject.set(x, "loadingIndicator", js.undefined)
      
      inline def setRowHeight(value: Double | String): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
      
      inline def setServerWait(value: Double): Self = StObject.set(x, "serverWait", value.asInstanceOf[js.Any])
      
      inline def setServerWaitUndefined: Self = StObject.set(x, "serverWait", js.undefined)
      
      inline def setTrace(value: Boolean): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    }
  }
  
  trait Settings extends StObject {
    
    /*
      * Select extension options
      */
    var scroller: js.UndefOr[Boolean | ScrollerSettings] = js.undefined
  }
  object Settings {
    
    inline def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      inline def setScroller(value: Boolean | ScrollerSettings): Self = StObject.set(x, "scroller", value.asInstanceOf[js.Any])
      
      inline def setScrollerUndefined: Self = StObject.set(x, "scroller", js.undefined)
    }
  }
}
