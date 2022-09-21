package typings.devextremeB5DqTZzf.mod.DevExpress.data

import typings.devextremeB5DqTZzf.anon.`0`
import typings.devextremeB5DqTZzf.anon.`1`
import typings.devextremeB5DqTZzf.anon.`2`
import typings.devextremeB5DqTZzf.mod.DevExpress.data.CustomStore.Options
import typings.devextremeB5DqTZzf.mod.DevExpress.data.DataSource._DataSourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utils {
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextremeB5DqTZzf.mod.DevExpress.data.CustomStore[TItem, TKey]
    - typings.devextremeB5DqTZzf.mod.DevExpress.data.ArrayStore[TItem, TKey]
    - typings.devextremeB5DqTZzf.mod.DevExpress.data.LocalStore[TItem, TKey]
    - typings.devextremeB5DqTZzf.mod.DevExpress.data.ODataStore[TItem, TKey]
  */
  trait Store[TItem, TKey]
    extends StObject
       with _DataSourceLike[TItem, TKey]
  
  type StoreOptions[TItem, TKey] = (Options[TItem, TKey]) | ((typings.devextremeB5DqTZzf.mod.DevExpress.data.ArrayStore.Options[TItem, TKey]) & `0`) | ((typings.devextremeB5DqTZzf.mod.DevExpress.data.LocalStore.Options[TItem, TKey]) & `1`) | ((typings.devextremeB5DqTZzf.mod.DevExpress.data.ODataStore.Options[TItem, TKey]) & `2`)
}
