package typings.ckeditorCkeditor5Pagination

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationMod {
  
  @JSImport("@ckeditor/ckeditor5-pagination/src/pagination", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Pagination
  
  @js.native
  trait Pagination
    extends StObject
       with Plugin {
    
    var pageNumber: Double = js.native
    
    def scrollToPage(pageNumber: Double): Unit = js.native
    
    var totalPages: Double = js.native
  }
  
  trait PaginationConfig extends StObject {
    
    var enableOnUnsupportedBrowsers: js.UndefOr[Boolean] = js.undefined
    
    var pageHeight: String
    
    var pageMargins: PaginationMarginsConfig
    
    var pageWidth: String
  }
  object PaginationConfig {
    
    inline def apply(pageHeight: String, pageMargins: PaginationMarginsConfig, pageWidth: String): PaginationConfig = {
      val __obj = js.Dynamic.literal(pageHeight = pageHeight.asInstanceOf[js.Any], pageMargins = pageMargins.asInstanceOf[js.Any], pageWidth = pageWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationConfig]
    }
    
    extension [Self <: PaginationConfig](x: Self) {
      
      inline def setEnableOnUnsupportedBrowsers(value: Boolean): Self = StObject.set(x, "enableOnUnsupportedBrowsers", value.asInstanceOf[js.Any])
      
      inline def setEnableOnUnsupportedBrowsersUndefined: Self = StObject.set(x, "enableOnUnsupportedBrowsers", js.undefined)
      
      inline def setPageHeight(value: String): Self = StObject.set(x, "pageHeight", value.asInstanceOf[js.Any])
      
      inline def setPageMargins(value: PaginationMarginsConfig): Self = StObject.set(x, "pageMargins", value.asInstanceOf[js.Any])
      
      inline def setPageWidth(value: String): Self = StObject.set(x, "pageWidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait PaginationMarginsConfig extends StObject {
    
    var bottom: String
    
    var left: String
    
    var right: String
    
    var top: String
  }
  object PaginationMarginsConfig {
    
    inline def apply(bottom: String, left: String, right: String, top: String): PaginationMarginsConfig = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationMarginsConfig]
    }
    
    extension [Self <: PaginationMarginsConfig](x: Self) {
      
      inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var Pagination: typings.ckeditorCkeditor5Pagination.paginationMod.Pagination
    }
    object Plugins {
      
      inline def apply(Pagination: Pagination): Plugins = {
        val __obj = js.Dynamic.literal(Pagination = Pagination.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      extension [Self <: Plugins](x: Self) {
        
        inline def setPagination(value: Pagination): Self = StObject.set(x, "Pagination", value.asInstanceOf[js.Any])
      }
    }
  }
}
