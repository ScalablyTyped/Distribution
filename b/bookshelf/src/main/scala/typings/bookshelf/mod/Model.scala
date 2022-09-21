package typings.bookshelf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.bookshelf.anon.Instantiable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bookshelf", "Model")
@js.native
open class Model[T /* <: Model[Any] */] () extends ModelBase[T] {
  def this(attributes: Any) = this()
  def this(attributes: Any, options: ModelOptions) = this()
  def this(attributes: Unit, options: ModelOptions) = this()
  
  def belongsTo[R /* <: Model[Any] */](target: Instantiable[R]): R = js.native
  def belongsTo[R /* <: Model[Any] */](target: Instantiable[R], foreignKey: String): R = js.native
  def belongsTo[R /* <: Model[Any] */](target: Instantiable[R], foreignKey: String, foreignKeyTarget: String): R = js.native
  def belongsTo[R /* <: Model[Any] */](target: Instantiable[R], foreignKey: Unit, foreignKeyTarget: String): R = js.native
  
  def belongsToMany[R /* <: Model[Any] */](target: Instantiable[R]): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](target: Instantiable[R], table: String): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](target: Instantiable[R], table: String, foreignKey: String): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](target: Instantiable[R], table: String, foreignKey: String, otherKey: String): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](
    target: Instantiable[R],
    table: String,
    foreignKey: String,
    otherKey: String,
    foreignKeyTarget: String
  ): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](
    target: Instantiable[R],
    table: String,
    foreignKey: String,
    otherKey: String,
    foreignKeyTarget: String,
    otherKeyTarget: String
  ): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](
    target: Instantiable[R],
    table: String,
    foreignKey: String,
    otherKey: String,
    foreignKeyTarget: Unit,
    otherKeyTarget: String
  ): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](
    target: Instantiable[R],
    table: String,
    foreignKey: String,
    otherKey: Unit,
    foreignKeyTarget: String
  ): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](
    target: Instantiable[R],
    table: String,
    foreignKey: String,
    otherKey: Unit,
    foreignKeyTarget: String,
    otherKeyTarget: String
  ): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](
    target: Instantiable[R],
    table: String,
    foreignKey: String,
    otherKey: Unit,
    foreignKeyTarget: Unit,
    otherKeyTarget: String
  ): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](target: Instantiable[R], table: String, foreignKey: Unit, otherKey: String): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](
    target: Instantiable[R],
    table: String,
    foreignKey: Unit,
    otherKey: String,
    foreignKeyTarget: String
  ): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](
    target: Instantiable[R],
    table: String,
    foreignKey: Unit,
    otherKey: String,
    foreignKeyTarget: String,
    otherKeyTarget: String
  ): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](
    target: Instantiable[R],
    table: String,
    foreignKey: Unit,
    otherKey: String,
    foreignKeyTarget: Unit,
    otherKeyTarget: String
  ): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](target: Instantiable[R], table: String, foreignKey: Unit, otherKey: Unit, foreignKeyTarget: String): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](
    target: Instantiable[R],
    table: String,
    foreignKey: Unit,
    otherKey: Unit,
    foreignKeyTarget: String,
    otherKeyTarget: String
  ): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](
    target: Instantiable[R],
    table: String,
    foreignKey: Unit,
    otherKey: Unit,
    foreignKeyTarget: Unit,
    otherKeyTarget: String
  ): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](target: Instantiable[R], table: Unit, foreignKey: String): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](target: Instantiable[R], table: Unit, foreignKey: String, otherKey: String): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](
    target: Instantiable[R],
    table: Unit,
    foreignKey: String,
    otherKey: String,
    foreignKeyTarget: String
  ): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](
    target: Instantiable[R],
    table: Unit,
    foreignKey: String,
    otherKey: String,
    foreignKeyTarget: String,
    otherKeyTarget: String
  ): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](
    target: Instantiable[R],
    table: Unit,
    foreignKey: String,
    otherKey: String,
    foreignKeyTarget: Unit,
    otherKeyTarget: String
  ): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](target: Instantiable[R], table: Unit, foreignKey: String, otherKey: Unit, foreignKeyTarget: String): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](
    target: Instantiable[R],
    table: Unit,
    foreignKey: String,
    otherKey: Unit,
    foreignKeyTarget: String,
    otherKeyTarget: String
  ): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](
    target: Instantiable[R],
    table: Unit,
    foreignKey: String,
    otherKey: Unit,
    foreignKeyTarget: Unit,
    otherKeyTarget: String
  ): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](target: Instantiable[R], table: Unit, foreignKey: Unit, otherKey: String): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](target: Instantiable[R], table: Unit, foreignKey: Unit, otherKey: String, foreignKeyTarget: String): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](
    target: Instantiable[R],
    table: Unit,
    foreignKey: Unit,
    otherKey: String,
    foreignKeyTarget: String,
    otherKeyTarget: String
  ): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](
    target: Instantiable[R],
    table: Unit,
    foreignKey: Unit,
    otherKey: String,
    foreignKeyTarget: Unit,
    otherKeyTarget: String
  ): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](target: Instantiable[R], table: Unit, foreignKey: Unit, otherKey: Unit, foreignKeyTarget: String): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](
    target: Instantiable[R],
    table: Unit,
    foreignKey: Unit,
    otherKey: Unit,
    foreignKeyTarget: String,
    otherKeyTarget: String
  ): Collection[R] = js.native
  def belongsToMany[R /* <: Model[Any] */](
    target: Instantiable[R],
    table: Unit,
    foreignKey: Unit,
    otherKey: Unit,
    foreignKeyTarget: Unit,
    otherKeyTarget: String
  ): Collection[R] = js.native
  
  def count(): typings.bluebird.mod.^[Double | String] = js.native
  def count(column: String): typings.bluebird.mod.^[Double | String] = js.native
  def count(column: String, options: SyncOptions): typings.bluebird.mod.^[Double | String] = js.native
  def count(column: Unit, options: SyncOptions): typings.bluebird.mod.^[Double | String] = js.native
  
  /**
    * @throws {NoRowsDeletedError} if no records are deleted and `options.required !== false`
    */
  def destroy(): typings.bluebird.mod.^[T] = js.native
  def destroy(options: DestroyOptions): typings.bluebird.mod.^[T] = js.native
  
  /**
    * @throws {NotFoundError} if no result and `options.required !== false`
    */
  def fetch(): typings.bluebird.mod.^[T] = js.native
  def fetch(options: FetchOptions): typings.bluebird.mod.^[T] = js.native
  
  def fetchAll(): typings.bluebird.mod.^[Collection[T]] = js.native
  def fetchAll(options: FetchAllOptions): typings.bluebird.mod.^[Collection[T]] = js.native
  
  def fetchPage(): typings.bluebird.mod.^[Collection[T] & Pagination] = js.native
  def fetchPage(options: FetchPageOptions): typings.bluebird.mod.^[Collection[T] & Pagination] = js.native
  
  def hasMany[R /* <: Model[Any] */](target: Instantiable[R]): Collection[R] = js.native
  def hasMany[R /* <: Model[Any] */](target: Instantiable[R], foreignKey: String): Collection[R] = js.native
  def hasMany[R /* <: Model[Any] */](target: Instantiable[R], foreignKey: String, foreignKeyTarget: String): Collection[R] = js.native
  def hasMany[R /* <: Model[Any] */](target: Instantiable[R], foreignKey: Unit, foreignKeyTarget: String): Collection[R] = js.native
  
  def hasOne[R /* <: Model[Any] */](target: Instantiable[R]): R = js.native
  def hasOne[R /* <: Model[Any] */](target: Instantiable[R], foreignKey: String): R = js.native
  def hasOne[R /* <: Model[Any] */](target: Instantiable[R], foreignKey: String, foreignKeyTarget: String): R = js.native
  def hasOne[R /* <: Model[Any] */](target: Instantiable[R], foreignKey: Unit, foreignKeyTarget: String): R = js.native
  
  def load(relations: Relations): typings.bluebird.mod.^[T] = js.native
  def load(relations: Relations, options: SyncOptions): typings.bluebird.mod.^[T] = js.native
  
  def morphMany[R /* <: Model[Any] */](target: Instantiable[R]): Collection[R] = js.native
  def morphMany[R /* <: Model[Any] */](target: Instantiable[R], name: String): Collection[R] = js.native
  def morphMany[R /* <: Model[Any] */](target: Instantiable[R], name: String, columnNames: js.Array[String]): Collection[R] = js.native
  def morphMany[R /* <: Model[Any] */](target: Instantiable[R], name: String, columnNames: js.Array[String], morphValue: String): Collection[R] = js.native
  def morphMany[R /* <: Model[Any] */](target: Instantiable[R], name: String, columnNames: Unit, morphValue: String): Collection[R] = js.native
  def morphMany[R /* <: Model[Any] */](target: Instantiable[R], name: Unit, columnNames: js.Array[String]): Collection[R] = js.native
  def morphMany[R /* <: Model[Any] */](target: Instantiable[R], name: Unit, columnNames: js.Array[String], morphValue: String): Collection[R] = js.native
  def morphMany[R /* <: Model[Any] */](target: Instantiable[R], name: Unit, columnNames: Unit, morphValue: String): Collection[R] = js.native
  
  def morphOne[R /* <: Model[Any] */](target: Instantiable[R]): R = js.native
  def morphOne[R /* <: Model[Any] */](target: Instantiable[R], name: String): R = js.native
  def morphOne[R /* <: Model[Any] */](target: Instantiable[R], name: String, columnNames: js.Array[String]): R = js.native
  def morphOne[R /* <: Model[Any] */](target: Instantiable[R], name: String, columnNames: js.Array[String], morphValue: String): R = js.native
  def morphOne[R /* <: Model[Any] */](target: Instantiable[R], name: String, columnNames: Unit, morphValue: String): R = js.native
  def morphOne[R /* <: Model[Any] */](target: Instantiable[R], name: Unit, columnNames: js.Array[String]): R = js.native
  def morphOne[R /* <: Model[Any] */](target: Instantiable[R], name: Unit, columnNames: js.Array[String], morphValue: String): R = js.native
  def morphOne[R /* <: Model[Any] */](target: Instantiable[R], name: Unit, columnNames: Unit, morphValue: String): R = js.native
  
  def morphTo(name: String, columnNames: js.Array[String], target: ModelSubclass*): T = js.native
  def morphTo(name: String, columnNames: Unit, target: ModelSubclass*): T = js.native
  def morphTo(name: String, target: ModelSubclass*): T = js.native
  
  def orderBy(column: String): T = js.native
  def orderBy(column: String, order: SortOrder): T = js.native
  
  // Declaration order matters otherwise TypeScript gets confused between query() and query(...query: string[])
  def query(): Any = js.native
  def query(
    callback: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Knex.QueryBuilder */ /* qb */ Any, 
      Unit
    ]
  ): T = js.native
  def query(query: String*): T = js.native
  def query(query: StringDictionary[Any]): T = js.native
  
  def refresh(): typings.bluebird.mod.^[T] = js.native
  def refresh(options: FetchOptions): typings.bluebird.mod.^[T] = js.native
  
  def resetQuery(): T = js.native
  
  /**
    * @throws {NoRowsUpdatedError} if updating and `options.required !== false`
    */
  def save(): typings.bluebird.mod.^[T] = js.native
  def save(attrs: StringDictionary[Any]): typings.bluebird.mod.^[T] = js.native
  def save(attrs: StringDictionary[Any], options: SaveOptions): typings.bluebird.mod.^[T] = js.native
  def save(attrs: Unit, options: SaveOptions): typings.bluebird.mod.^[T] = js.native
  def save(key: String): typings.bluebird.mod.^[T] = js.native
  def save(key: String, `val`: Any): typings.bluebird.mod.^[T] = js.native
  def save(key: String, `val`: Any, options: SaveOptions): typings.bluebird.mod.^[T] = js.native
  def save(key: String, `val`: Unit, options: SaveOptions): typings.bluebird.mod.^[T] = js.native
  def save(key: Unit, `val`: Any): typings.bluebird.mod.^[T] = js.native
  def save(key: Unit, `val`: Any, options: SaveOptions): typings.bluebird.mod.^[T] = js.native
  def save(key: Unit, `val`: Unit, options: SaveOptions): typings.bluebird.mod.^[T] = js.native
  
  def through[R /* <: Model[Any] */](interim: ModelSubclass): R = js.native
  def through[R /* <: Model[Any] */](interim: ModelSubclass, throughForeignKey: String): R = js.native
  def through[R /* <: Model[Any] */](interim: ModelSubclass, throughForeignKey: String, otherKey: String): R = js.native
  def through[R /* <: Model[Any] */](
    interim: ModelSubclass,
    throughForeignKey: String,
    otherKey: String,
    throughForeignKeyTarget: String
  ): R = js.native
  def through[R /* <: Model[Any] */](
    interim: ModelSubclass,
    throughForeignKey: String,
    otherKey: String,
    throughForeignKeyTarget: String,
    otherKeyTarget: String
  ): R = js.native
  def through[R /* <: Model[Any] */](
    interim: ModelSubclass,
    throughForeignKey: String,
    otherKey: String,
    throughForeignKeyTarget: Unit,
    otherKeyTarget: String
  ): R = js.native
  def through[R /* <: Model[Any] */](interim: ModelSubclass, throughForeignKey: String, otherKey: Unit, throughForeignKeyTarget: String): R = js.native
  def through[R /* <: Model[Any] */](
    interim: ModelSubclass,
    throughForeignKey: String,
    otherKey: Unit,
    throughForeignKeyTarget: String,
    otherKeyTarget: String
  ): R = js.native
  def through[R /* <: Model[Any] */](
    interim: ModelSubclass,
    throughForeignKey: String,
    otherKey: Unit,
    throughForeignKeyTarget: Unit,
    otherKeyTarget: String
  ): R = js.native
  def through[R /* <: Model[Any] */](interim: ModelSubclass, throughForeignKey: Unit, otherKey: String): R = js.native
  def through[R /* <: Model[Any] */](interim: ModelSubclass, throughForeignKey: Unit, otherKey: String, throughForeignKeyTarget: String): R = js.native
  def through[R /* <: Model[Any] */](
    interim: ModelSubclass,
    throughForeignKey: Unit,
    otherKey: String,
    throughForeignKeyTarget: String,
    otherKeyTarget: String
  ): R = js.native
  def through[R /* <: Model[Any] */](
    interim: ModelSubclass,
    throughForeignKey: Unit,
    otherKey: String,
    throughForeignKeyTarget: Unit,
    otherKeyTarget: String
  ): R = js.native
  def through[R /* <: Model[Any] */](interim: ModelSubclass, throughForeignKey: Unit, otherKey: Unit, throughForeignKeyTarget: String): R = js.native
  def through[R /* <: Model[Any] */](
    interim: ModelSubclass,
    throughForeignKey: Unit,
    otherKey: Unit,
    throughForeignKeyTarget: String,
    otherKeyTarget: String
  ): R = js.native
  def through[R /* <: Model[Any] */](
    interim: ModelSubclass,
    throughForeignKey: Unit,
    otherKey: Unit,
    throughForeignKeyTarget: Unit,
    otherKeyTarget: String
  ): R = js.native
  
  def where(key: String, operatorOrValue: String): T = js.native
  def where(key: String, operatorOrValue: String, valueIfOperator: String): T = js.native
  def where(key: String, operatorOrValue: String, valueIfOperator: js.Array[Double | String]): T = js.native
  def where(key: String, operatorOrValue: String, valueIfOperator: Boolean): T = js.native
  def where(key: String, operatorOrValue: String, valueIfOperator: Double): T = js.native
  def where(key: String, operatorOrValue: Boolean): T = js.native
  def where(key: String, operatorOrValue: Boolean, valueIfOperator: String): T = js.native
  def where(key: String, operatorOrValue: Boolean, valueIfOperator: js.Array[Double | String]): T = js.native
  def where(key: String, operatorOrValue: Boolean, valueIfOperator: Boolean): T = js.native
  def where(key: String, operatorOrValue: Boolean, valueIfOperator: Double): T = js.native
  def where(key: String, operatorOrValue: Double): T = js.native
  def where(key: String, operatorOrValue: Double, valueIfOperator: String): T = js.native
  def where(key: String, operatorOrValue: Double, valueIfOperator: js.Array[Double | String]): T = js.native
  def where(key: String, operatorOrValue: Double, valueIfOperator: Boolean): T = js.native
  def where(key: String, operatorOrValue: Double, valueIfOperator: Double): T = js.native
  def where(properties: StringDictionary[Any]): T = js.native
}
object Model {
  
  @JSImport("bookshelf", "Model")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("bookshelf", "Model.NoRowsDeletedError")
  @js.native
  open class NoRowsDeletedError ()
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
  /* static member */
  @JSImport("bookshelf", "Model.NoRowsDeletedError")
  @js.native
  def NoRowsDeletedError: typings.createError.mod.Error[js.Error] = js.native
  inline def NoRowsDeletedError_=(x: typings.createError.mod.Error[js.Error]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoRowsDeletedError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("bookshelf", "Model.NoRowsUpdatedError")
  @js.native
  open class NoRowsUpdatedError ()
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
  /* static member */
  @JSImport("bookshelf", "Model.NoRowsUpdatedError")
  @js.native
  def NoRowsUpdatedError: typings.createError.mod.Error[js.Error] = js.native
  inline def NoRowsUpdatedError_=(x: typings.createError.mod.Error[js.Error]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoRowsUpdatedError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("bookshelf", "Model.NotFoundError")
  @js.native
  open class NotFoundError ()
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
  // See https://github.com/tgriesser/bookshelf/blob/0.9.4/src/errors.js
  // See https://github.com/tgriesser/bookshelf/blob/0.9.4/src/model.js#L1280
  /* static member */
  @JSImport("bookshelf", "Model.NotFoundError")
  @js.native
  def NotFoundError: typings.createError.mod.Error[js.Error] = js.native
  inline def NotFoundError_=(x: typings.createError.mod.Error[js.Error]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NotFoundError")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def collection[T /* <: Model[Any] */](): Collection[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("collection")().asInstanceOf[Collection[T]]
  inline def collection[T /* <: Model[Any] */](models: js.Array[T]): Collection[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("collection")(models.asInstanceOf[js.Any]).asInstanceOf[Collection[T]]
  inline def collection[T /* <: Model[Any] */](models: js.Array[T], options: CollectionOptions[T]): Collection[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")(models.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Collection[T]]
  inline def collection[T /* <: Model[Any] */](models: Unit, options: CollectionOptions[T]): Collection[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")(models.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Collection[T]]
  
  /* static member */
  inline def count(): typings.bluebird.mod.^[Double | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[typings.bluebird.mod.^[Double | String]]
  inline def count(column: String): typings.bluebird.mod.^[Double | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(column.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[Double | String]]
  inline def count(column: String, options: SyncOptions): typings.bluebird.mod.^[Double | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("count")(column.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Double | String]]
  inline def count(column: Unit, options: SyncOptions): typings.bluebird.mod.^[Double | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("count")(column.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Double | String]]
  
  /** @deprecated use Typescript classes */
  /* static member */
  inline def extend[T /* <: Model[Any] */](): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")().asInstanceOf[js.Function]
  inline def extend[T /* <: Model[Any] */](prototypeProperties: Any): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(prototypeProperties.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  inline def extend[T /* <: Model[Any] */](prototypeProperties: Any, classProperties: Any): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(prototypeProperties.asInstanceOf[js.Any], classProperties.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  inline def extend[T /* <: Model[Any] */](prototypeProperties: Unit, classProperties: Any): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(prototypeProperties.asInstanceOf[js.Any], classProperties.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  // should return a type
  /* static member */
  inline def fetchAll[T /* <: Model[Any] */](): typings.bluebird.mod.^[Collection[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchAll")().asInstanceOf[typings.bluebird.mod.^[Collection[T]]]
  
  /** @deprecated should use `new` objects instead. */
  /* static member */
  inline def forge[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("forge")().asInstanceOf[T]
  inline def forge[T](attributes: Any): T = ^.asInstanceOf[js.Dynamic].applyDynamic("forge")(attributes.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def forge[T](attributes: Any, options: ModelOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("forge")(attributes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def forge[T](attributes: Unit, options: ModelOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("forge")(attributes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /* static member */
  inline def where[T](key: String, operatorOrValue: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(key.asInstanceOf[js.Any], operatorOrValue.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def where[T](key: String, operatorOrValue: String, valueIfOperator: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(key.asInstanceOf[js.Any], operatorOrValue.asInstanceOf[js.Any], valueIfOperator.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def where[T](key: String, operatorOrValue: String, valueIfOperator: js.Array[Double | String]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(key.asInstanceOf[js.Any], operatorOrValue.asInstanceOf[js.Any], valueIfOperator.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def where[T](key: String, operatorOrValue: String, valueIfOperator: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(key.asInstanceOf[js.Any], operatorOrValue.asInstanceOf[js.Any], valueIfOperator.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def where[T](key: String, operatorOrValue: String, valueIfOperator: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(key.asInstanceOf[js.Any], operatorOrValue.asInstanceOf[js.Any], valueIfOperator.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def where[T](key: String, operatorOrValue: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(key.asInstanceOf[js.Any], operatorOrValue.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def where[T](key: String, operatorOrValue: Boolean, valueIfOperator: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(key.asInstanceOf[js.Any], operatorOrValue.asInstanceOf[js.Any], valueIfOperator.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def where[T](key: String, operatorOrValue: Boolean, valueIfOperator: js.Array[Double | String]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(key.asInstanceOf[js.Any], operatorOrValue.asInstanceOf[js.Any], valueIfOperator.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def where[T](key: String, operatorOrValue: Boolean, valueIfOperator: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(key.asInstanceOf[js.Any], operatorOrValue.asInstanceOf[js.Any], valueIfOperator.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def where[T](key: String, operatorOrValue: Boolean, valueIfOperator: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(key.asInstanceOf[js.Any], operatorOrValue.asInstanceOf[js.Any], valueIfOperator.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def where[T](key: String, operatorOrValue: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(key.asInstanceOf[js.Any], operatorOrValue.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def where[T](key: String, operatorOrValue: Double, valueIfOperator: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(key.asInstanceOf[js.Any], operatorOrValue.asInstanceOf[js.Any], valueIfOperator.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def where[T](key: String, operatorOrValue: Double, valueIfOperator: js.Array[Double | String]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(key.asInstanceOf[js.Any], operatorOrValue.asInstanceOf[js.Any], valueIfOperator.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def where[T](key: String, operatorOrValue: Double, valueIfOperator: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(key.asInstanceOf[js.Any], operatorOrValue.asInstanceOf[js.Any], valueIfOperator.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def where[T](key: String, operatorOrValue: Double, valueIfOperator: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(key.asInstanceOf[js.Any], operatorOrValue.asInstanceOf[js.Any], valueIfOperator.asInstanceOf[js.Any])).asInstanceOf[T]
  /* static member */
  inline def where[T](properties: StringDictionary[Any]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("where")(properties.asInstanceOf[js.Any]).asInstanceOf[T]
}
