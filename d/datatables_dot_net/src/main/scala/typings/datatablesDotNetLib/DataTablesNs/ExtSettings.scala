package typings
package datatablesDotNetLib.DataTablesNs

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
  var builder: java.lang.String
  var classes: ExtClassesSettings
  var errMode: java.lang.String
  var feature: js.Array[_]
  var iApiIndex: scala.Double
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
  var sVersion: java.lang.String
  var search: js.Array[_]
  var selector: js.Object
  /**
           * Type based plug-ins.
           */
  var `type`: ExtTypeSettings
  def fnVersionCheck(version: java.lang.String): java.lang.String
}

