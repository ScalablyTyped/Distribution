package typings
package backboneDotPaginatorLib.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("backbone.PageableCollection")
@js.native
class PageableCollection[TModel /* <: backboneLib.backboneMod.Model */] ()
  extends backboneLib.backboneMod.Collection[TModel] {
  def this(models: js.Array[TModel]) = this()
  def this(models: js.Array[TModel], options: PageableInitialOptions) = this()
  var fullCollection: backboneLib.backboneMod.Collection[TModel] = js.native
  var mode: java.lang.String = js.native
  var queryParams: PageableQueryParams = js.native
  var state: PageableState = js.native
  def getFirstPage(): jqueryLib.JQueryXHR | PageableCollection[TModel] = js.native
  def getFirstPage(options: PageableGetPageOptions): jqueryLib.JQueryXHR | PageableCollection[TModel] = js.native
  def getLastPage(): jqueryLib.JQueryXHR | PageableCollection[TModel] = js.native
  def getLastPage(options: PageableGetPageOptions): jqueryLib.JQueryXHR | PageableCollection[TModel] = js.native
  def getNextPage(): jqueryLib.JQueryXHR | PageableCollection[TModel] = js.native
  def getNextPage(options: PageableGetPageOptions): jqueryLib.JQueryXHR | PageableCollection[TModel] = js.native
  def getPage(index: java.lang.String): jqueryLib.JQueryXHR | PageableCollection[TModel] = js.native
  def getPage(index: java.lang.String, options: PageableGetPageOptions): jqueryLib.JQueryXHR | PageableCollection[TModel] = js.native
  def getPage(index: scala.Double): jqueryLib.JQueryXHR | PageableCollection[TModel] = js.native
  def getPage(index: scala.Double, options: PageableGetPageOptions): jqueryLib.JQueryXHR | PageableCollection[TModel] = js.native
  def getPageByOffset(offset: scala.Double): jqueryLib.JQueryXHR | PageableCollection[TModel] = js.native
  def getPageByOffset(offset: scala.Double, options: PageableGetPageOptions): jqueryLib.JQueryXHR | PageableCollection[TModel] = js.native
  def getPreviousPage(): jqueryLib.JQueryXHR | PageableCollection[TModel] = js.native
  def getPreviousPage(options: PageableGetPageOptions): jqueryLib.JQueryXHR | PageableCollection[TModel] = js.native
  def hasNextPage(): scala.Boolean = js.native
  def hasPreviousPage(): scala.Boolean = js.native
  def parseLinks(resp: js.Any): js.Any = js.native
  def parseLinks(resp: js.Any, options: PageableParseLinksOptions): js.Any = js.native
  def parseRecords(resp: js.Any): js.Array[_] = js.native
  def parseRecords(resp: js.Any, options: js.Any): js.Array[_] = js.native
  def parseState(resp: js.Any, queryParams: PageableQueryParams, state: PageableState): PageableState = js.native
  def parseState(resp: js.Any, queryParams: PageableQueryParams, state: PageableState, options: js.Any): PageableState = js.native
  def setPageSize(pageSize: scala.Double): jqueryLib.JQueryXHR | PageableCollection[TModel] = js.native
  def setPageSize(pageSize: scala.Double, options: backboneLib.backboneMod.BackboneNs.CollectionFetchOptions): jqueryLib.JQueryXHR | PageableCollection[TModel] = js.native
  def setSorting(sortKey: java.lang.String): PageableCollection[TModel] = js.native
  def setSorting(sortKey: java.lang.String, order: scala.Double): PageableCollection[TModel] = js.native
  def setSorting(sortKey: java.lang.String, order: scala.Double, options: PageableSetSortingOptions[TModel]): PageableCollection[TModel] = js.native
  def switchMode(): jqueryLib.JQueryXHR | PageableCollection[TModel] = js.native
  def switchMode(mode: java.lang.String): jqueryLib.JQueryXHR | PageableCollection[TModel] = js.native
  def switchMode(mode: java.lang.String, options: PageableSwitchModeOptions): jqueryLib.JQueryXHR | PageableCollection[TModel] = js.native
  def sync(method: java.lang.String, model: TModel): jqueryLib.JQueryXHR = js.native
  def sync(method: java.lang.String, model: TModel, options: js.Any): jqueryLib.JQueryXHR = js.native
  def sync(method: java.lang.String, model: backboneLib.backboneMod.Collection[TModel]): jqueryLib.JQueryXHR = js.native
  def sync(method: java.lang.String, model: backboneLib.backboneMod.Collection[TModel], options: js.Any): jqueryLib.JQueryXHR = js.native
}

@JSGlobal("backbone.PageableCollection")
@js.native
object PageableCollection extends js.Object {
  def noConflict(): org.scalablytyped.runtime.Instantiable2[
    /* models */ js.UndefOr[/* models */ js.Array[backboneLib.backboneMod.Model]], 
    /* options */ js.UndefOr[/* options */ backboneDotPaginatorLib.backboneMod.PageableInitialOptions], 
    backboneDotPaginatorLib.backboneMod.PageableCollection[backboneLib.backboneMod.Model]
  ] = js.native
}

