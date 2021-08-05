package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion "SettingsLegacy"
//#region "ext internal"
trait ExtSettings extends StObject {
  
  var aTypes: js.Array[js.Any]
  
  var afnFiltering: js.Array[js.Any]
  
  var afnSortData: js.Object
  
  var aoFeatures: js.Array[js.Any]
  
  var builder: String
  
  var classes: ExtClassesSettings
  
  var errMode: String
  
  var feature: js.Array[js.Any]
  
  def fnVersionCheck(version: String): String
  
  var iApiIndex: Double
  
  var internal: js.Object
  
  var legacy: js.Object
  
  var oApi: js.Object
  
  var oJUIClasses: js.Object
  
  var oPagination: js.Object
  
  var oSort: js.Object
  
  var oStdClasses: ExtClassesSettings
  
  var ofnSearch: js.Object
  
  var order: js.Object
  
  var pager: js.Object
  
  var renderer: js.Object
  
  var sVersion: String
  
  var search: js.Array[js.Any]
  
  var selector: js.Object
  
  /**
    * Type based plug-ins.
    */
  var `type`: ExtTypeSettings
}
object ExtSettings {
  
  inline def apply(
    aTypes: js.Array[js.Any],
    afnFiltering: js.Array[js.Any],
    afnSortData: js.Object,
    aoFeatures: js.Array[js.Any],
    builder: String,
    classes: ExtClassesSettings,
    errMode: String,
    feature: js.Array[js.Any],
    fnVersionCheck: String => String,
    iApiIndex: Double,
    internal: js.Object,
    legacy: js.Object,
    oApi: js.Object,
    oJUIClasses: js.Object,
    oPagination: js.Object,
    oSort: js.Object,
    oStdClasses: ExtClassesSettings,
    ofnSearch: js.Object,
    order: js.Object,
    pager: js.Object,
    renderer: js.Object,
    sVersion: String,
    search: js.Array[js.Any],
    selector: js.Object,
    `type`: ExtTypeSettings
  ): ExtSettings = {
    val __obj = js.Dynamic.literal(aTypes = aTypes.asInstanceOf[js.Any], afnFiltering = afnFiltering.asInstanceOf[js.Any], afnSortData = afnSortData.asInstanceOf[js.Any], aoFeatures = aoFeatures.asInstanceOf[js.Any], builder = builder.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], errMode = errMode.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], fnVersionCheck = js.Any.fromFunction1(fnVersionCheck), iApiIndex = iApiIndex.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], legacy = legacy.asInstanceOf[js.Any], oApi = oApi.asInstanceOf[js.Any], oJUIClasses = oJUIClasses.asInstanceOf[js.Any], oPagination = oPagination.asInstanceOf[js.Any], oSort = oSort.asInstanceOf[js.Any], oStdClasses = oStdClasses.asInstanceOf[js.Any], ofnSearch = ofnSearch.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], pager = pager.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], sVersion = sVersion.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtSettings]
  }
  
  extension [Self <: ExtSettings](x: Self) {
    
    inline def setATypes(value: js.Array[js.Any]): Self = StObject.set(x, "aTypes", value.asInstanceOf[js.Any])
    
    inline def setATypesVarargs(value: js.Any*): Self = StObject.set(x, "aTypes", js.Array(value :_*))
    
    inline def setAfnFiltering(value: js.Array[js.Any]): Self = StObject.set(x, "afnFiltering", value.asInstanceOf[js.Any])
    
    inline def setAfnFilteringVarargs(value: js.Any*): Self = StObject.set(x, "afnFiltering", js.Array(value :_*))
    
    inline def setAfnSortData(value: js.Object): Self = StObject.set(x, "afnSortData", value.asInstanceOf[js.Any])
    
    inline def setAoFeatures(value: js.Array[js.Any]): Self = StObject.set(x, "aoFeatures", value.asInstanceOf[js.Any])
    
    inline def setAoFeaturesVarargs(value: js.Any*): Self = StObject.set(x, "aoFeatures", js.Array(value :_*))
    
    inline def setBuilder(value: String): Self = StObject.set(x, "builder", value.asInstanceOf[js.Any])
    
    inline def setClasses(value: ExtClassesSettings): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setErrMode(value: String): Self = StObject.set(x, "errMode", value.asInstanceOf[js.Any])
    
    inline def setFeature(value: js.Array[js.Any]): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureVarargs(value: js.Any*): Self = StObject.set(x, "feature", js.Array(value :_*))
    
    inline def setFnVersionCheck(value: String => String): Self = StObject.set(x, "fnVersionCheck", js.Any.fromFunction1(value))
    
    inline def setIApiIndex(value: Double): Self = StObject.set(x, "iApiIndex", value.asInstanceOf[js.Any])
    
    inline def setInternal(value: js.Object): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
    
    inline def setLegacy(value: js.Object): Self = StObject.set(x, "legacy", value.asInstanceOf[js.Any])
    
    inline def setOApi(value: js.Object): Self = StObject.set(x, "oApi", value.asInstanceOf[js.Any])
    
    inline def setOJUIClasses(value: js.Object): Self = StObject.set(x, "oJUIClasses", value.asInstanceOf[js.Any])
    
    inline def setOPagination(value: js.Object): Self = StObject.set(x, "oPagination", value.asInstanceOf[js.Any])
    
    inline def setOSort(value: js.Object): Self = StObject.set(x, "oSort", value.asInstanceOf[js.Any])
    
    inline def setOStdClasses(value: ExtClassesSettings): Self = StObject.set(x, "oStdClasses", value.asInstanceOf[js.Any])
    
    inline def setOfnSearch(value: js.Object): Self = StObject.set(x, "ofnSearch", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: js.Object): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setPager(value: js.Object): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: js.Object): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setSVersion(value: String): Self = StObject.set(x, "sVersion", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: js.Array[js.Any]): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchVarargs(value: js.Any*): Self = StObject.set(x, "search", js.Array(value :_*))
    
    inline def setSelector(value: js.Object): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setType(value: ExtTypeSettings): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
