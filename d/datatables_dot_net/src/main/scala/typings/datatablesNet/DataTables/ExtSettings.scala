package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "SettingsLegacy"
//#region "ext internal"
trait ExtSettings extends js.Object {
  var aTypes: js.Array[_]
  var afnFiltering: js.Array[_]
  var afnSortData: js.Object
  var aoFeatures: js.Array[_]
  var builder: String
  var classes: ExtClassesSettings
  var errMode: String
  var feature: js.Array[_]
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
  var search: js.Array[_]
  var selector: js.Object
  /**
    * Type based plug-ins.
    */
  var `type`: ExtTypeSettings
  def fnVersionCheck(version: String): String
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
}

