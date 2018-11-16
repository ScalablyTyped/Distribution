package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region "Namespaces"
//#region "core-methods"
@js.native
trait CoreMethods extends UtilityMethods {
  /**
           * Ajax Methods
           */
  var ajax: AjaxMethodModel = js.native
  /**
           * Page Methods / object
           */
  @JSName("page")
  var page_Original: PageMethods = js.native
  /**
           * Page Methods / object
           */
  @JSName("state")
  var state_Original: StateMethods = js.native
  /**
           * Get jquery object
           */
  @JSName("$")
  def $(selector: datatablesDotNetLib.JQuery): datatablesDotNetLib.JQuery = js.native
  /**
           * Get jquery object
           */
  @JSName("$")
  def $(selector: datatablesDotNetLib.JQuery, modifier: ObjectSelectorModifier): datatablesDotNetLib.JQuery = js.native
  /**
           * Get jquery object
           */
  @JSName("$")
  def $(selector: java.lang.String): datatablesDotNetLib.JQuery = js.native
  /**
           * Get jquery object
           */
  @JSName("$")
  def $(selector: java.lang.String, modifier: ObjectSelectorModifier): datatablesDotNetLib.JQuery = js.native
  /**
           * Get jquery object
           */
  @JSName("$")
  def $(selector: js.Array[stdLib.Node]): datatablesDotNetLib.JQuery = js.native
  /**
           * Get jquery object
           */
  @JSName("$")
  def $(selector: js.Array[stdLib.Node], modifier: ObjectSelectorModifier): datatablesDotNetLib.JQuery = js.native
  /**
           * Get jquery object
           */
  @JSName("$")
  def $(selector: stdLib.Node): datatablesDotNetLib.JQuery = js.native
  /**
           * Get jquery object
           */
  @JSName("$")
  def $(selector: stdLib.Node, modifier: ObjectSelectorModifier): datatablesDotNetLib.JQuery = js.native
  /**
           * Clear the table of all data.
           */
  def clear(): Api = js.native
  /**
           * Destroy the DataTables in the current context.
           *
           * @param remove Completely remove the table from the DOM (true) or leave it in the DOM in its original plain un-enhanced HTML state (default, false).
           */
  def destroy(): Api = js.native
  /**
           * Destroy the DataTables in the current context.
           *
           * @param remove Completely remove the table from the DOM (true) or leave it in the DOM in its original plain un-enhanced HTML state (default, false).
           */
  def destroy(remove: scala.Boolean): Api = js.native
  /**
           * Redraw the DataTables in the current context, optionally updating ordering, searching and paging as required.
           *
           * @param paging This parameter is used to determine what kind of draw DataTables will perform.
           */
  def draw(): Api = js.native
  /**
           * Redraw the DataTables in the current context, optionally updating ordering, searching and paging as required.
           *
           * @param paging This parameter is used to determine what kind of draw DataTables will perform.
           */
  def draw(paging: java.lang.String): Api = js.native
  /**
           * Redraw the DataTables in the current context, optionally updating ordering, searching and paging as required.
           *
           * @param paging This parameter is used to determine what kind of draw DataTables will perform.
           */
  def draw(paging: scala.Boolean): Api = js.native
  /*
           * Look up a language token that was defined in the DataTables' language initialisation object.
           *
           * @param token The language token to lookup from the language object.
           * @param def The default value to use if the DataTables initialisation has not specified a value.
           * @param numeric If handling numeric output, the number to be presented should be given in this parameter.
           *
           * @returns Resulting internationalised string.
           */
  def i18n(token: java.lang.String, `def`: js.Any): java.lang.String = js.native
  /*
           * Look up a language token that was defined in the DataTables' language initialisation object.
           *
           * @param token The language token to lookup from the language object.
           * @param def The default value to use if the DataTables initialisation has not specified a value.
           * @param numeric If handling numeric output, the number to be presented should be given in this parameter.
           *
           * @returns Resulting internationalised string.
           */
  def i18n(token: java.lang.String, `def`: js.Any, numeric: scala.Double): java.lang.String = js.native
  /*
           * Get the initialisation options used for the table. Since: DataTables 1.10.6
           */
  def init(): Settings = js.native
  /**
           * Table events removal.
           *
           * @param event Event name to remove.
           * @param callback Specific callback function to remove if you want to unbind a single event listener.
           */
  def off(event: java.lang.String): Api = js.native
  /**
           * Table events removal.
           *
           * @param event Event name to remove.
           * @param callback Specific callback function to remove if you want to unbind a single event listener.
           */
  def off(
    event: java.lang.String,
    callback: js.Function2[/* e */ stdLib.Event, /* repeated */js.Any, scala.Unit]
  ): Api = js.native
  /**
           * Table events listener.
           *
           * @param event Event to listen for.
           * @param callback Specific callback function to remove if you want to unbind a single event listener.
           */
  def on(
    event: java.lang.String,
    callback: js.Function2[/* e */ stdLib.Event, /* repeated */js.Any, scala.Unit]
  ): Api = js.native
  /**
           * Listen for a table event once and then remove the listener.
           *
           * @param event Event to listen for.
           * @param callback Specific callback function to remove if you want to unbind a single event listener.
           */
  def one(
    event: java.lang.String,
    callback: js.Function2[/* e */ stdLib.Event, /* repeated */js.Any, scala.Unit]
  ): Api = js.native
  /**
           * Get the current page of the table.
           */
  /**
           * Page Methods / object
           */
  def page(): scala.Double = js.native
  /**
           * Set the current page of the table.
           *
           * @param page Index or 'first', 'next', 'previous', 'last'
           */
  /**
           * Page Methods / object
           */
  def page(page: java.lang.String): Api = js.native
  /**
           * Set the current page of the table.
           *
           * @param page Index or 'first', 'next', 'previous', 'last'
           */
  /**
           * Page Methods / object
           */
  def page(page: scala.Double): Api = js.native
  /**
           * Get current search
           */
  def search(): java.lang.String = js.native
  /**
           * Search for data in the table.
           *
           * @param input Search string to apply to the table.
           * @param regex Treat as a regular expression (true) or not (default, false).
           * @param smart Perform smart search.
           * @param caseInsen Do case-insensitive matching (default, true) or not (false).
           */
  def search(input: java.lang.String): Api = js.native
  /**
           * Search for data in the table.
           *
           * @param input Search string to apply to the table.
           * @param regex Treat as a regular expression (true) or not (default, false).
           * @param smart Perform smart search.
           * @param caseInsen Do case-insensitive matching (default, true) or not (false).
           */
  def search(input: java.lang.String, regex: scala.Boolean): Api = js.native
  /**
           * Search for data in the table.
           *
           * @param input Search string to apply to the table.
           * @param regex Treat as a regular expression (true) or not (default, false).
           * @param smart Perform smart search.
           * @param caseInsen Do case-insensitive matching (default, true) or not (false).
           */
  def search(input: java.lang.String, regex: scala.Boolean, smart: scala.Boolean): Api = js.native
  /**
           * Search for data in the table.
           *
           * @param input Search string to apply to the table.
           * @param regex Treat as a regular expression (true) or not (default, false).
           * @param smart Perform smart search.
           * @param caseInsen Do case-insensitive matching (default, true) or not (false).
           */
  def search(input: java.lang.String, regex: scala.Boolean, smart: scala.Boolean, caseInsen: scala.Boolean): Api = js.native
  /**
           * Obtain the table's settings object
           */
  def settings(): Api = js.native
  /**
           * Get the last saved state of the table
           */
  /**
           * Page Methods / object
           */
  def state(): StateReturnModel = js.native
}

