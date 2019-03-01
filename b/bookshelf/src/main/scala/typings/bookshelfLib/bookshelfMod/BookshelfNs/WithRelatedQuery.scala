package typings
package bookshelfLib.bookshelfMod.BookshelfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithRelatedQuery
  extends /* index */ org.scalablytyped.runtime.StringDictionary[
      js.Function1[
        /* query */ knexLib.knexMod.KnexNs.QueryBuilder, 
        knexLib.knexMod.KnexNs.QueryBuilder
      ]
    ]

object WithRelatedQuery {
  @scala.inline
  def apply(
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[
      js.Function1[
        /* query */ knexLib.knexMod.KnexNs.QueryBuilder, 
        knexLib.knexMod.KnexNs.QueryBuilder
      ]
    ] = null
  ): WithRelatedQuery = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[WithRelatedQuery]
  }
}

