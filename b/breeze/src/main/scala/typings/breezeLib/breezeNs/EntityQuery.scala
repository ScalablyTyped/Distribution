package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.EntityQuery")
@js.native
class EntityQuery () extends js.Object {
  def this(resourceName: java.lang.String) = this()
  /** Create query from an expression tree */
  def this(tree: js.Object) = this()
  var entityManager: EntityManager = js.native
  var orderByClause: OrderByClause = js.native
  var parameters: js.Object = js.native
  var queryOptions: QueryOptions = js.native
  var resourceName: java.lang.String = js.native
  var resultEntityType: EntityType = js.native
  var skipCount: scala.Double = js.native
  var takeCount: scala.Double = js.native
  var wherePredicate: Predicate = js.native
  def execute(): js.Promise[QueryResult] = js.native
  def execute(callback: ExecuteQuerySuccessCallback): js.Promise[QueryResult] = js.native
  def execute(callback: ExecuteQuerySuccessCallback, errorCallback: ExecuteQueryErrorCallback): js.Promise[QueryResult] = js.native
  def executeLocally(): js.Array[Entity] = js.native
  def expand(propertyPaths: java.lang.String): EntityQuery = js.native
  def expand(propertyPaths: js.Array[java.lang.String]): EntityQuery = js.native
  def from(resourceName: java.lang.String): EntityQuery = js.native
  def inlineCount(): EntityQuery = js.native
  def inlineCount(enabled: scala.Boolean): EntityQuery = js.native
  def noTracking(): EntityQuery = js.native
  def noTracking(enabled: scala.Boolean): EntityQuery = js.native
  def orderBy(propertyPaths: java.lang.String): EntityQuery = js.native
  def orderBy(propertyPaths: java.lang.String, isDescending: scala.Boolean): EntityQuery = js.native
  def orderBy(propertyPaths: js.Array[java.lang.String]): EntityQuery = js.native
  def orderBy(propertyPaths: js.Array[java.lang.String], isDescending: scala.Boolean): EntityQuery = js.native
  def orderByDesc(propertyPaths: java.lang.String): EntityQuery = js.native
  def orderByDesc(propertyPaths: js.Array[java.lang.String]): EntityQuery = js.native
  def select(propertyPaths: java.lang.String): EntityQuery = js.native
  def select(propertyPaths: js.Array[java.lang.String]): EntityQuery = js.native
  def skip(count: scala.Double): EntityQuery = js.native
  def take(count: scala.Double): EntityQuery = js.native
  def toJSON(): java.lang.String = js.native
  def toType(typeName: java.lang.String): EntityQuery = js.native
  def toType(`type`: EntityType): EntityQuery = js.native
  def top(count: scala.Double): EntityQuery = js.native
  def using(obj: DataService): EntityQuery = js.native
  def using(obj: EntityManager): EntityQuery = js.native
  def using(obj: FetchStrategySymbol): EntityQuery = js.native
  def using(obj: JsonResultsAdapter): EntityQuery = js.native
  def using(obj: MergeStrategySymbol): EntityQuery = js.native
  def using(obj: QueryOptions): EntityQuery = js.native
  def where(anArray: IRecursiveArray[java.lang.String | scala.Double | FilterQueryOpSymbol | Predicate]): EntityQuery = js.native
    // for any/all clauses
  def where(predicate: FilterQueryOpSymbol): EntityQuery = js.native
  def where(predicate: Predicate): EntityQuery = js.native
  def where(
    property: java.lang.String,
    filterop: FilterQueryOpSymbol,
    property2: java.lang.String,
    filterop2: FilterQueryOpSymbol,
    value: js.Any
  ): EntityQuery = js.native
    // for any/all clauses
  def where(
    property: java.lang.String,
    filterop: java.lang.String,
    property2: java.lang.String,
    filterop2: java.lang.String,
    value: js.Any
  ): EntityQuery = js.native
  def where(property: java.lang.String, operator: FilterQueryOpSymbol, value: js.Any): EntityQuery = js.native
  def where(property: java.lang.String, operator: java.lang.String, value: js.Any): EntityQuery = js.native
  def withParameters(params: js.Object): EntityQuery = js.native
}

@JSGlobal("breeze.EntityQuery")
@js.native
object EntityQuery extends js.Object {
  def from(resourceName: java.lang.String): breezeLib.breezeNs.EntityQuery = js.native
  def fromEntities(entities: js.Array[breezeLib.breezeNs.Entity]): breezeLib.breezeNs.EntityQuery = js.native
  def fromEntities(entity: breezeLib.breezeNs.Entity): breezeLib.breezeNs.EntityQuery = js.native
  def fromEntityKey(entityKey: breezeLib.breezeNs.EntityKey): breezeLib.breezeNs.EntityQuery = js.native
  def fromEntityNavigation(entity: breezeLib.breezeNs.Entity, navigationProperty: breezeLib.breezeNs.NavigationProperty): breezeLib.breezeNs.EntityQuery = js.native
}

