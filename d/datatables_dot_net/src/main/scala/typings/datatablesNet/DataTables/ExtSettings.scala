package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion "SettingsLegacy"
//#region "ext internal"
@js.native
trait ExtSettings extends StObject {
  
  var aTypes: js.Array[_] = js.native
  
  var afnFiltering: js.Array[_] = js.native
  
  var afnSortData: js.Object = js.native
  
  var aoFeatures: js.Array[_] = js.native
  
  var builder: String = js.native
  
  var classes: ExtClassesSettings = js.native
  
  var errMode: String = js.native
  
  var feature: js.Array[_] = js.native
  
  def fnVersionCheck(version: String): String = js.native
  
  var iApiIndex: Double = js.native
  
  var internal: js.Object = js.native
  
  var legacy: js.Object = js.native
  
  var oApi: js.Object = js.native
  
  var oJUIClasses: js.Object = js.native
  
  var oPagination: js.Object = js.native
  
  var oSort: js.Object = js.native
  
  var oStdClasses: ExtClassesSettings = js.native
  
  var ofnSearch: js.Object = js.native
  
  var order: js.Object = js.native
  
  var pager: js.Object = js.native
  
  var renderer: js.Object = js.native
  
  var sVersion: String = js.native
  
  var search: js.Array[_] = js.native
  
  var selector: js.Object = js.native
  
  /**
    * Type based plug-ins.
    */
  var `type`: ExtTypeSettings = js.native
}
object ExtSettings {
  
  @scala.inline
  def apply(
    aTypes: js.Array[_],
    afnFiltering: js.Array[_],
    afnSortData: js.Object,
    aoFeatures: js.Array[_],
    builder: String,
    classes: ExtClassesSettings,
    errMode: String,
    feature: js.Array[_],
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
    search: js.Array[_],
    selector: js.Object,
    `type`: ExtTypeSettings
  ): ExtSettings = {
    val __obj = js.Dynamic.literal(aTypes = aTypes.asInstanceOf[js.Any], afnFiltering = afnFiltering.asInstanceOf[js.Any], afnSortData = afnSortData.asInstanceOf[js.Any], aoFeatures = aoFeatures.asInstanceOf[js.Any], builder = builder.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], errMode = errMode.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], fnVersionCheck = js.Any.fromFunction1(fnVersionCheck), iApiIndex = iApiIndex.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], legacy = legacy.asInstanceOf[js.Any], oApi = oApi.asInstanceOf[js.Any], oJUIClasses = oJUIClasses.asInstanceOf[js.Any], oPagination = oPagination.asInstanceOf[js.Any], oSort = oSort.asInstanceOf[js.Any], oStdClasses = oStdClasses.asInstanceOf[js.Any], ofnSearch = ofnSearch.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], pager = pager.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], sVersion = sVersion.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtSettings]
  }
  
  @scala.inline
  implicit class ExtSettingsMutableBuilder[Self <: ExtSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setATypes(value: js.Array[_]): Self = StObject.set(x, "aTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setATypesVarargs(value: js.Any*): Self = StObject.set(x, "aTypes", js.Array(value :_*))
    
    @scala.inline
    def setAfnFiltering(value: js.Array[_]): Self = StObject.set(x, "afnFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfnFilteringVarargs(value: js.Any*): Self = StObject.set(x, "afnFiltering", js.Array(value :_*))
    
    @scala.inline
    def setAfnSortData(value: js.Object): Self = StObject.set(x, "afnSortData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAoFeatures(value: js.Array[_]): Self = StObject.set(x, "aoFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAoFeaturesVarargs(value: js.Any*): Self = StObject.set(x, "aoFeatures", js.Array(value :_*))
    
    @scala.inline
    def setBuilder(value: String): Self = StObject.set(x, "builder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClasses(value: ExtClassesSettings): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMode(value: String): Self = StObject.set(x, "errMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeature(value: js.Array[_]): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureVarargs(value: js.Any*): Self = StObject.set(x, "feature", js.Array(value :_*))
    
    @scala.inline
    def setFnVersionCheck(value: String => String): Self = StObject.set(x, "fnVersionCheck", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIApiIndex(value: Double): Self = StObject.set(x, "iApiIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternal(value: js.Object): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegacy(value: js.Object): Self = StObject.set(x, "legacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOApi(value: js.Object): Self = StObject.set(x, "oApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOJUIClasses(value: js.Object): Self = StObject.set(x, "oJUIClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOPagination(value: js.Object): Self = StObject.set(x, "oPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOSort(value: js.Object): Self = StObject.set(x, "oSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOStdClasses(value: ExtClassesSettings): Self = StObject.set(x, "oStdClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfnSearch(value: js.Object): Self = StObject.set(x, "ofnSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: js.Object): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPager(value: js.Object): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderer(value: js.Object): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSVersion(value: String): Self = StObject.set(x, "sVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: js.Array[_]): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchVarargs(value: js.Any*): Self = StObject.set(x, "search", js.Array(value :_*))
    
    @scala.inline
    def setSelector(value: js.Object): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ExtTypeSettings): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
