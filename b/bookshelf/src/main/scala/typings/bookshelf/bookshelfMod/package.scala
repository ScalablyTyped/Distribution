package typings.bookshelf

import org.scalablytyped.runtime.StringDictionary
import typings.knex.knexMod.QueryBuilder
import typings.knex.knexMod.SafePartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bookshelfMod {
  type EventFunction[T] = js.Function3[
    /* model */ T, 
    /* attrs */ js.Any, 
    /* options */ js.Any, 
    typings.bluebird.bluebirdMod.^[js.Any] | Unit
  ]
  type FetchAllOptions = FetchOptions
  type WithRelatedQuery = StringDictionary[
    js.Function1[
      /* query */ QueryBuilder[js.Any, js.Array[SafePartial[js.Any]]], 
      QueryBuilder[js.Any, js.Array[SafePartial[js.Any]]]
    ]
  ]
}
