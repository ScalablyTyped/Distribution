package typings.datatablesNetFixedheader

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataTables {
  
  trait Api extends StObject {
    
    var fixedHeader: FixedHeaderApi
  }
  object Api {
    
    @scala.inline
    def apply(fixedHeader: FixedHeaderApi): Api = {
      val __obj = js.Dynamic.literal(fixedHeader = fixedHeader.asInstanceOf[js.Any])
      __obj.asInstanceOf[Api]
    }
    
    @scala.inline
    implicit class ApiMutableBuilder[Self <: Api] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFixedHeader(value: FixedHeaderApi): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
    }
  }
  
  trait FixedHeaderApi extends StObject {
    
    /**
      * Recalculate the position of the DataTable on the page and adjust the fixed element as appropriate.
      */
    def adjust(): Api
    
    /**
      * Disable the fixed elements
      */
    def disable(): Api
    
    /**
      * Enable / disable the fixed elements
      */
    def enable(enable: Boolean): Api
    
    /**
      * Get the fixed footer's offset.
      */
    def footerOffset(offset: Double): Api
    
    /**
      * Get the fixed header's offset.
      */
    def headerOffset(offset: Double): Api
  }
  object FixedHeaderApi {
    
    @scala.inline
    def apply(
      adjust: () => Api,
      disable: () => Api,
      enable: Boolean => Api,
      footerOffset: Double => Api,
      headerOffset: Double => Api
    ): FixedHeaderApi = {
      val __obj = js.Dynamic.literal(adjust = js.Any.fromFunction0(adjust), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction1(enable), footerOffset = js.Any.fromFunction1(footerOffset), headerOffset = js.Any.fromFunction1(headerOffset))
      __obj.asInstanceOf[FixedHeaderApi]
    }
    
    @scala.inline
    implicit class FixedHeaderApiMutableBuilder[Self <: FixedHeaderApi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjust(value: () => Api): Self = StObject.set(x, "adjust", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisable(value: () => Api): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnable(value: Boolean => Api): Self = StObject.set(x, "enable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFooterOffset(value: Double => Api): Self = StObject.set(x, "footerOffset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaderOffset(value: Double => Api): Self = StObject.set(x, "headerOffset", js.Any.fromFunction1(value))
    }
  }
  
  /*
    * FixedHeader extension options
    */
  trait FixedHeaderSettings extends StObject {
    
    /*
      * Enable / disable fixed footer
      */
    var footer: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Offset the table's fixed footer
      */
    var footerOffset: js.UndefOr[Double] = js.undefined
    
    /*
      * Enable / disable fixed header
      */
    var header: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Offset the table's fixed header
      */
    var headerOffset: js.UndefOr[Double] = js.undefined
  }
  object FixedHeaderSettings {
    
    @scala.inline
    def apply(): FixedHeaderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FixedHeaderSettings]
    }
    
    @scala.inline
    implicit class FixedHeaderSettingsMutableBuilder[Self <: FixedHeaderSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFooter(value: Boolean): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterOffset(value: Double): Self = StObject.set(x, "footerOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterOffsetUndefined: Self = StObject.set(x, "footerOffset", js.undefined)
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderOffset(value: Double): Self = StObject.set(x, "headerOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderOffsetUndefined: Self = StObject.set(x, "headerOffset", js.undefined)
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    }
  }
  
  @js.native
  trait FixedHeaderStaticFunctions
    extends StObject
       with Instantiable2[/* dt */ Api, (/* settings */ Boolean) | (/* settings */ FixedHeaderSettings), Unit] {
    
    var defaults: FixedHeaderSettings = js.native
    
    var version: String = js.native
  }
  
  trait Settings extends StObject {
    
    /*
      * FixedHeader extension options
      */
    var fixedHeader: js.UndefOr[Boolean | FixedHeaderSettings] = js.undefined
  }
  object Settings {
    
    @scala.inline
    def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFixedHeader(value: Boolean | FixedHeaderSettings): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
    }
  }
  
  trait StaticFunctions extends StObject {
    
    var FixedHeader: FixedHeaderStaticFunctions
  }
  object StaticFunctions {
    
    @scala.inline
    def apply(FixedHeader: FixedHeaderStaticFunctions): StaticFunctions = {
      val __obj = js.Dynamic.literal(FixedHeader = FixedHeader.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticFunctions]
    }
    
    @scala.inline
    implicit class StaticFunctionsMutableBuilder[Self <: StaticFunctions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFixedHeader(value: FixedHeaderStaticFunctions): Self = StObject.set(x, "FixedHeader", value.asInstanceOf[js.Any])
    }
  }
}
