package typings.azureArmResource

import org.scalablytyped.runtime.StringDictionary
import typings.azureArmResource.libModelsMod.Appliance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var expand: js.UndefOr[String] = js.undefined
  }
  object `0` {
    
    @scala.inline
    def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomHeaders(value: StringDictionary[String]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      @scala.inline
      def setExpand(value: String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    }
  }
  
  trait CustomHeaders extends StObject {
    
    var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object CustomHeaders {
    
    @scala.inline
    def apply(): CustomHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomHeaders]
    }
    
    @scala.inline
    implicit class CustomHeadersMutableBuilder[Self <: CustomHeaders] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomHeaders(value: StringDictionary[String]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
    }
  }
  
  trait CustomHeadersExpand extends StObject {
    
    var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var expand: js.UndefOr[String] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object CustomHeadersExpand {
    
    @scala.inline
    def apply(): CustomHeadersExpand = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomHeadersExpand]
    }
    
    @scala.inline
    implicit class CustomHeadersExpandMutableBuilder[Self <: CustomHeadersExpand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomHeaders(value: StringDictionary[String]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      @scala.inline
      def setExpand(value: String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait CustomHeadersTop extends StObject {
    
    var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object CustomHeadersTop {
    
    @scala.inline
    def apply(): CustomHeadersTop = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomHeadersTop]
    }
    
    @scala.inline
    implicit class CustomHeadersTopMutableBuilder[Self <: CustomHeadersTop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomHeaders(value: StringDictionary[String]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait Expand extends StObject {
    
    var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var expand: js.UndefOr[String] = js.undefined
    
    var recurse: js.UndefOr[Boolean] = js.undefined
  }
  object Expand {
    
    @scala.inline
    def apply(): Expand = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Expand]
    }
    
    @scala.inline
    implicit class ExpandMutableBuilder[Self <: Expand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomHeaders(value: StringDictionary[String]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      @scala.inline
      def setExpand(value: String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      @scala.inline
      def setRecurse(value: Boolean): Self = StObject.set(x, "recurse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurseUndefined: Self = StObject.set(x, "recurse", js.undefined)
    }
  }
  
  trait ExpandFilter extends StObject {
    
    var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var expand: js.UndefOr[String] = js.undefined
    
    var filter: js.UndefOr[String] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object ExpandFilter {
    
    @scala.inline
    def apply(): ExpandFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpandFilter]
    }
    
    @scala.inline
    implicit class ExpandFilterMutableBuilder[Self <: ExpandFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomHeaders(value: StringDictionary[String]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      @scala.inline
      def setExpand(value: String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      @scala.inline
      def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait Filter extends StObject {
    
    var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var filter: js.UndefOr[String] = js.undefined
  }
  object Filter {
    
    @scala.inline
    def apply(): Filter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Filter]
    }
    
    @scala.inline
    implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomHeaders(value: StringDictionary[String]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      @scala.inline
      def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    }
  }
  
  trait Parameters extends StObject {
    
    var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var parameters: js.UndefOr[Appliance] = js.undefined
  }
  object Parameters {
    
    @scala.inline
    def apply(): Parameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Parameters]
    }
    
    @scala.inline
    implicit class ParametersMutableBuilder[Self <: Parameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomHeaders(value: StringDictionary[String]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      @scala.inline
      def setParameters(value: Appliance): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    }
  }
  
  trait Skiptoken extends StObject {
    
    var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var skiptoken: js.UndefOr[String] = js.undefined
  }
  object Skiptoken {
    
    @scala.inline
    def apply(): Skiptoken = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Skiptoken]
    }
    
    @scala.inline
    implicit class SkiptokenMutableBuilder[Self <: Skiptoken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomHeaders(value: StringDictionary[String]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      @scala.inline
      def setSkiptoken(value: String): Self = StObject.set(x, "skiptoken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkiptokenUndefined: Self = StObject.set(x, "skiptoken", js.undefined)
    }
  }
  
  trait Top extends StObject {
    
    var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var filter: js.UndefOr[String] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object Top {
    
    @scala.inline
    def apply(): Top = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Top]
    }
    
    @scala.inline
    implicit class TopMutableBuilder[Self <: Top] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomHeaders(value: StringDictionary[String]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      @scala.inline
      def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
}
