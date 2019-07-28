package typings.datatablesDotNet.DataTablesNs

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
    val __obj = js.Dynamic.literal(aTypes = aTypes, afnFiltering = afnFiltering, afnSortData = afnSortData, aoFeatures = aoFeatures, builder = builder, classes = classes, errMode = errMode, feature = feature, fnVersionCheck = js.Any.fromFunction1(fnVersionCheck), iApiIndex = iApiIndex, internal = internal, legacy = legacy, oApi = oApi, oJUIClasses = oJUIClasses, oPagination = oPagination, oSort = oSort, oStdClasses = oStdClasses, ofnSearch = ofnSearch, order = order, pager = pager, renderer = renderer, sVersion = sVersion, search = search, selector = selector)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ExtSettings]
  }
}

