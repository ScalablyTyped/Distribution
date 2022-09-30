package typings.bookshelf.mod

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bookshelf extends Events[Any] {
  
  var Collection: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bookshelf.Collection */ Any = js.native
  
  var Model: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bookshelf.Model */ Any = js.native
  
  var VERSION: String = js.native
  
  var knex: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify knex */ Any = js.native
  
  def model(name: String): Any = js.native
  def model(name: String, model: js.Object): Any = js.native
  def model(name: String, model: js.Object, staticProperties: Any): Any = js.native
  def model(
    name: String,
    model: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bookshelf.Model */ Any
  ): Any = js.native
  def model(
    name: String,
    model: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bookshelf.Model */ Any,
    staticProperties: Any
  ): Any = js.native
  def model(name: String, model: Unit, staticProperties: Any): Any = js.native
  
  def plugin(name: String): Bookshelf = js.native
  def plugin(name: String, options: Any): Bookshelf = js.native
  def plugin(name: js.Array[String]): Bookshelf = js.native
  def plugin(name: js.Array[String], options: Any): Bookshelf = js.native
  def plugin(name: js.Function): Bookshelf = js.native
  def plugin(name: js.Function, options: Any): Bookshelf = js.native
  
  def transaction[T](
    callback: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify knex.Transaction */ /* transaction */ Any, 
      PromiseLike[T]
    ]
  ): typings.bluebird.mod.^[T] = js.native
}
