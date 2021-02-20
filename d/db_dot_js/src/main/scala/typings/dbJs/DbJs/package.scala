package typings.dbJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object DbJs {
  
  type ErrorListener = js.Function1[/* err */ typings.std.Error, scala.Unit]
  
  type IndexAccessibleServer = org.scalablytyped.runtime.StringDictionary[typings.dbJs.DbJs.TypedObjectStoreServer[js.Any]]
  
  type Server = typings.dbJs.DbJs.IndexAccessibleServer with typings.dbJs.DbJs.ObjectStoreServer with typings.dbJs.DbJs.BaseServer
}
