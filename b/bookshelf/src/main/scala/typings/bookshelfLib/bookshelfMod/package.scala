package typings
package bookshelfLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bookshelfMod {
  type EventFunction[T] = js.Function3[
    /* model */ T, 
    /* attrs */ js.Any, 
    /* options */ js.Any, 
    bluebirdLib.bluebirdMod.^[js.Any] | scala.Unit
  ]
  type FetchAllOptions = FetchOptions
  type WithRelatedQuery = org.scalablytyped.runtime.StringDictionary[
    js.Function1[
      /* query */ knexLib.knexMod.QueryBuilder[js.Object, js.Array[stdLib.Partial[js.Object]]], 
      knexLib.knexMod.QueryBuilder[js.Object, js.Array[stdLib.Partial[js.Object]]]
    ]
  ]
}
