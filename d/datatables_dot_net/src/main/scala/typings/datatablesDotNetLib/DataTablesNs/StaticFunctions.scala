package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "table-methods"
//#endregion "Namespaces"
//#region "Static-Methods"
@js.native
trait StaticFunctions extends js.Object {
  /**
           * Get DataTable API instance
           *
           * @param table Selector string for table
           */
  var Api: ScalablyTyped.runtime.Instantiable1[
    /* selector */ java.lang.String | stdLib.Node | js.Array[stdLib.Node] | datatablesDotNetLib.JQuery, 
    Api
  ] = js.native
  /**
           * Default Settings
           */
  var defaults: Settings = js.native
  /**
           * Default Settings
           */
  var ext: ExtSettings = js.native
  /**
           * Helpers for `columns.render`.
           *
           * The options defined here can be used with the `columns.render` initialisation
           * option to provide a display renderer.
           */
  var render: StaticRenderFunctions = js.native
  /**
           * Utils
           */
  var util: StaticUtilFunctions = js.native
  /**
           * Returns JQuery object
           *
           * Usage:
           * $( selector ).dataTable();
           */
  def apply(): JQueryDataTables = js.native
  /**
           * Check if a table node is a DataTable already or not.
           *
           * Usage:
           * $.fn.dataTable.isDataTable("selector");
           * @param table The table to check.
           */
  def isDataTable(table: Api): scala.Boolean = js.native
  /**
           * Check if a table node is a DataTable already or not.
           *
           * Usage:
           * $.fn.dataTable.isDataTable("selector");
           * @param table The table to check.
           */
  def isDataTable(table: datatablesDotNetLib.JQuery): scala.Boolean = js.native
  /**
           * Check if a table node is a DataTable already or not.
           *
           * Usage:
           * $.fn.dataTable.isDataTable("selector");
           * @param table The table to check.
           */
  def isDataTable(table: java.lang.String): scala.Boolean = js.native
  /**
           * Check if a table node is a DataTable already or not.
           *
           * Usage:
           * $.fn.dataTable.isDataTable("selector");
           * @param table The table to check.
           */
  def isDataTable(table: stdLib.Node): scala.Boolean = js.native
  /**
           * Get all DataTable tables that have been initialised - optionally you can select to get only currently visible tables and / or retrieve the tables as API instances.
           *
           * @param visible As a boolean value this options is used to indicate if you want all tables on the page should be returned (false), or visible tables only (true).
           * Since 1.10.8 this option can also be given as an object.
           */
  def tables(): js.Array[Api] | Api = js.native
  /**
           * Get all DataTable tables that have been initialised - optionally you can select to get only currently visible tables and / or retrieve the tables as API instances.
           *
           * @param visible As a boolean value this options is used to indicate if you want all tables on the page should be returned (false), or visible tables only (true).
           * Since 1.10.8 this option can also be given as an object.
           */
  def tables(visible: objectTablesStatic): js.Array[Api] | Api = js.native
  /**
           * Get all DataTable tables that have been initialised - optionally you can select to get only currently visible tables and / or retrieve the tables as API instances.
           *
           * @param visible As a boolean value this options is used to indicate if you want all tables on the page should be returned (false), or visible tables only (true).
           * Since 1.10.8 this option can also be given as an object.
           */
  def tables(visible: scala.Boolean): js.Array[Api] | Api = js.native
  /**
           * Version number compatibility check function
           *
           * Usage:
           * $.fn.dataTable.versionCheck("1.10.0");
           * @param version Version string
           */
  def versionCheck(version: java.lang.String): scala.Boolean = js.native
}

