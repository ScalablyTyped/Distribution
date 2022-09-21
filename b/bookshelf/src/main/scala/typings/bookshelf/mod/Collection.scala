package typings.bookshelf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bookshelf", "Collection")
@js.native
// See https://github.com/tgriesser/bookshelf/blob/0.9.4/src/base/collection.js#L21
open class Collection[T /* <: Model[Any] */] () extends CollectionBase[T] {
  def this(models: js.Array[T]) = this()
  def this(models: js.Array[T], options: CollectionOptions[T]) = this()
  def this(models: Unit, options: CollectionOptions[T]) = this()
  
  def attach(ids: js.Array[Any]): typings.bluebird.mod.^[Collection[T]] = js.native
  def attach(ids: js.Array[Any], options: SyncOptions): typings.bluebird.mod.^[Collection[T]] = js.native
  def attach(ids: Any): typings.bluebird.mod.^[Collection[T]] = js.native
  def attach(ids: Any, options: SyncOptions): typings.bluebird.mod.^[Collection[T]] = js.native
  
  def count(): typings.bluebird.mod.^[Double | String] = js.native
  def count(column: String): typings.bluebird.mod.^[Double | String] = js.native
  def count(column: String, options: SyncOptions): typings.bluebird.mod.^[Double | String] = js.native
  def count(column: Unit, options: SyncOptions): typings.bluebird.mod.^[Double | String] = js.native
  
  def create(model: StringDictionary[Any]): typings.bluebird.mod.^[T] = js.native
  def create(model: StringDictionary[Any], options: CollectionCreateOptions): typings.bluebird.mod.^[T] = js.native
  
  def detach(): typings.bluebird.mod.^[Any] = js.native
  def detach(ids: js.Array[Any]): typings.bluebird.mod.^[Any] = js.native
  def detach(ids: js.Array[Any], options: SyncOptions): typings.bluebird.mod.^[Any] = js.native
  def detach(options: SyncOptions): typings.bluebird.mod.^[Any] = js.native
  
  def fetchOne(): typings.bluebird.mod.^[T] = js.native
  def fetchOne(options: CollectionFetchOneOptions): typings.bluebird.mod.^[T] = js.native
  
  def load(relations: Relations): typings.bluebird.mod.^[Collection[T]] = js.native
  def load(relations: Relations, options: SyncOptions): typings.bluebird.mod.^[Collection[T]] = js.native
  
  def orderBy(column: String): Collection[T] = js.native
  def orderBy(column: String, order: SortOrder): Collection[T] = js.native
  
  // Declaration order matters otherwise TypeScript gets confused between query() and query(...query: string[])
  def query(): Any = js.native
  def query(
    callback: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Knex.QueryBuilder */ /* qb */ Any, 
      Unit
    ]
  ): Collection[T] = js.native
  def query(query: String*): Collection[T] = js.native
  def query(query: StringDictionary[Any]): Collection[T] = js.native
  
  def resetQuery(): Collection[T] = js.native
  
  def through[R /* <: Model[Any] */](interim: ModelSubclass): Collection[R] = js.native
  def through[R /* <: Model[Any] */](interim: ModelSubclass, throughForeignKey: String): Collection[R] = js.native
  def through[R /* <: Model[Any] */](interim: ModelSubclass, throughForeignKey: String, otherKey: String): Collection[R] = js.native
  def through[R /* <: Model[Any] */](interim: ModelSubclass, throughForeignKey: Unit, otherKey: String): Collection[R] = js.native
  
  def updatePivot(attributes: Any): typings.bluebird.mod.^[Double] = js.native
  def updatePivot(attributes: Any, options: PivotOptions): typings.bluebird.mod.^[Double] = js.native
  
  def withPivot(columns: js.Array[String]): Collection[T] = js.native
}
object Collection {
  
  @JSImport("bookshelf", "Collection")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("bookshelf", "Collection.EmptyError")
  @js.native
  open class EmptyError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: String, obj: Any) = this()
    def this(message: Unit, obj: Any) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  // See https://github.com/tgriesser/bookshelf/blob/0.9.4/src/collection.js#L389
  /* static member */
  @JSImport("bookshelf", "Collection.EmptyError")
  @js.native
  def EmptyError: typings.createError.mod.Error[js.Error] = js.native
  inline def EmptyError_=(x: typings.createError.mod.Error[js.Error]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EmptyError")(x.asInstanceOf[js.Any])
  
  /** @deprecated use Typescript classes */
  /* static member */
  inline def extend[T](): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")().asInstanceOf[js.Function]
  inline def extend[T](prototypeProperties: Any): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(prototypeProperties.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  inline def extend[T](prototypeProperties: Any, classProperties: Any): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(prototypeProperties.asInstanceOf[js.Any], classProperties.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  inline def extend[T](prototypeProperties: Unit, classProperties: Any): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(prototypeProperties.asInstanceOf[js.Any], classProperties.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  /** @deprecated should use `new` objects instead. */
  /* static member */
  inline def forge[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("forge")().asInstanceOf[T]
  inline def forge[T](attributes: Any): T = ^.asInstanceOf[js.Dynamic].applyDynamic("forge")(attributes.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def forge[T](attributes: Any, options: ModelOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("forge")(attributes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def forge[T](attributes: Unit, options: ModelOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("forge")(attributes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
}
