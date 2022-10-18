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
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setCustomHeaders(value: StringDictionary[String]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      inline def setExpand(value: String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    }
  }
  
  trait CustomHeaders extends StObject {
    
    var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object CustomHeaders {
    
    inline def apply(): CustomHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomHeaders]
    }
    
    extension [Self <: CustomHeaders](x: Self) {
      
      inline def setCustomHeaders(value: StringDictionary[String]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
    }
  }
  
  trait CustomHeadersExpand extends StObject {
    
    var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var expand: js.UndefOr[String] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object CustomHeadersExpand {
    
    inline def apply(): CustomHeadersExpand = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomHeadersExpand]
    }
    
    extension [Self <: CustomHeadersExpand](x: Self) {
      
      inline def setCustomHeaders(value: StringDictionary[String]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      inline def setExpand(value: String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait CustomHeadersFilter extends StObject {
    
    var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var filter: js.UndefOr[String] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object CustomHeadersFilter {
    
    inline def apply(): CustomHeadersFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomHeadersFilter]
    }
    
    extension [Self <: CustomHeadersFilter](x: Self) {
      
      inline def setCustomHeaders(value: StringDictionary[String]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait Expand extends StObject {
    
    var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var expand: js.UndefOr[String] = js.undefined
    
    var recurse: js.UndefOr[Boolean] = js.undefined
  }
  object Expand {
    
    inline def apply(): Expand = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Expand]
    }
    
    extension [Self <: Expand](x: Self) {
      
      inline def setCustomHeaders(value: StringDictionary[String]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      inline def setExpand(value: String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      inline def setRecurse(value: Boolean): Self = StObject.set(x, "recurse", value.asInstanceOf[js.Any])
      
      inline def setRecurseUndefined: Self = StObject.set(x, "recurse", js.undefined)
    }
  }
  
  trait ExpandFilter extends StObject {
    
    var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var expand: js.UndefOr[String] = js.undefined
    
    var filter: js.UndefOr[String] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object ExpandFilter {
    
    inline def apply(): ExpandFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpandFilter]
    }
    
    extension [Self <: ExpandFilter](x: Self) {
      
      inline def setCustomHeaders(value: StringDictionary[String]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      inline def setExpand(value: String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait Filter extends StObject {
    
    var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var filter: js.UndefOr[String] = js.undefined
  }
  object Filter {
    
    inline def apply(): Filter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Filter]
    }
    
    extension [Self <: Filter](x: Self) {
      
      inline def setCustomHeaders(value: StringDictionary[String]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    }
  }
  
  trait Parameters extends StObject {
    
    var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var parameters: js.UndefOr[Appliance] = js.undefined
  }
  object Parameters {
    
    inline def apply(): Parameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Parameters]
    }
    
    extension [Self <: Parameters](x: Self) {
      
      inline def setCustomHeaders(value: StringDictionary[String]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      inline def setParameters(value: Appliance): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    }
  }
  
  trait Skiptoken extends StObject {
    
    var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var skiptoken: js.UndefOr[String] = js.undefined
  }
  object Skiptoken {
    
    inline def apply(): Skiptoken = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Skiptoken]
    }
    
    extension [Self <: Skiptoken](x: Self) {
      
      inline def setCustomHeaders(value: StringDictionary[String]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      inline def setSkiptoken(value: String): Self = StObject.set(x, "skiptoken", value.asInstanceOf[js.Any])
      
      inline def setSkiptokenUndefined: Self = StObject.set(x, "skiptoken", js.undefined)
    }
  }
  
  trait Top extends StObject {
    
    var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object Top {
    
    inline def apply(): Top = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Top]
    }
    
    extension [Self <: Top](x: Self) {
      
      inline def setCustomHeaders(value: StringDictionary[String]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
}
