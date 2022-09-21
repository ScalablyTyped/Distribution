package typings.devextremeB5DqTZzf.mod.DevExpress.data

import typings.devextremeB5DqTZzf.anon.CustomQueryParams
import typings.devextremeB5DqTZzf.anon.Expand
import typings.devextremeB5DqTZzf.mod.DevExpress.core.utils.DxPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ODataStore[TItem, TKey]
  extends StObject
     with Store[TItem, TKey]
     with typings.devextremeB5DqTZzf.mod.DevExpress.data.utils.Store[TItem, TKey] {
  
  /**
    * Gets an entity with a specific key.
    */
  def byKey(key: TKey, extraOptions: Expand): DxPromise[TItem] = js.native
  
  /**
    * Creates a Query for the OData endpoint.
    */
  def createQuery(): Query = js.native
  def createQuery(loadOptions: CustomQueryParams): Query = js.native
}
object ODataStore {
  
  type Options[TItem, TKey] = ODataStoreOptions[TItem, TKey]
}
