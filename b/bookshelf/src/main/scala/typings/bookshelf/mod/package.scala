package typings.bookshelf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EventFunction[T] = js.Function3[
    /* model */ T, 
    /* attrs */ js.Any, 
    /* options */ js.Any, 
    typings.bluebird.mod.^[js.Any] | scala.Unit
  ]
  type FetchAllOptions = typings.bookshelf.mod.FetchOptions
  type WithRelatedQuery = org.scalablytyped.runtime.StringDictionary[
    js.Function1[
      /* query */ typings.knex.mod.QueryBuilder[js.Any, js.Array[typings.knex.mod.SafePartial[js.Any]]], 
      typings.knex.mod.QueryBuilder[js.Any, js.Array[typings.knex.mod.SafePartial[js.Any]]]
    ]
  ]
}
