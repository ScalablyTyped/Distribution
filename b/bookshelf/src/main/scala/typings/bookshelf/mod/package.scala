package typings.bookshelf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.bookshelf.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(
  knex: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify knex */ Any
): Bookshelf = ^.asInstanceOf[js.Dynamic].apply(knex.asInstanceOf[js.Any]).asInstanceOf[Bookshelf]

type EventFunction[T] = js.Function3[/* model */ T, /* attrs */ Any, /* options */ Any, typings.bluebird.mod.^[Any] | Unit]

type FetchAllOptions = FetchOptions

type Relations = String | WithRelatedQuery | (js.Array[String | WithRelatedQuery])

type WithRelatedQuery = StringDictionary[
js.Function1[
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Knex.QueryBuilder */ /* query */ Any, 
  (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Knex.QueryBuilder */ Any) | Unit
]]
