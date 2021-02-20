package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.Instantiable1
import typings.datatablesNet.JQuery
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion "table-methods"
//#endregion "Namespaces"
//#region "Static-Methods"
@js.native
trait StaticFunctions extends StObject {
  
  /**
    * Returns JQuery object
    *
    * Usage:
    * $( selector ).dataTable();
    */
  def apply(): JQueryDataTables = js.native
  
  /**
    * Get DataTable API instance
    *
    * @param table Selector string for table
    */
  var Api: Instantiable1[
    /* selector */ String | Node | js.Array[Node] | JQuery | SettingsLegacy, 
    typings.datatablesNet.DataTables.Api
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
    * Check if a table node is a DataTable already or not.
    *
    * Usage:
    * $.fn.dataTable.isDataTable("selector");
    * @param table The table to check.
    */
  def isDataTable(table: String): Boolean = js.native
  def isDataTable(table: Api): Boolean = js.native
  def isDataTable(table: JQuery): Boolean = js.native
  def isDataTable(table: Node): Boolean = js.native
  
  /**
    * Helpers for `columns.render`.
    *
    * The options defined here can be used with the `columns.render` initialisation
    * option to provide a display renderer.
    */
  var render: StaticRenderFunctions = js.native
  
  /**
    * Get all DataTable tables that have been initialised - optionally you can select to get only currently visible tables and / or retrieve the tables as API instances.
    *
    * @param visible As a boolean value this options is used to indicate if you want all tables on the page should be returned (false), or visible tables only (true).
    * Since 1.10.8 this option can also be given as an object.
    */
  def tables(): js.Array[Api] | Api = js.native
  def tables(visible: Boolean): js.Array[Api] | Api = js.native
  def tables(visible: objectTablesStatic): js.Array[Api] | Api = js.native
  
  /**
    * Utils
    */
  var util: StaticUtilFunctions = js.native
  
  /**
    * Version number compatibility check function
    *
    * Usage:
    * $.fn.dataTable.versionCheck("1.10.0");
    * @param version Version string
    */
  def versionCheck(version: String): Boolean = js.native
}
