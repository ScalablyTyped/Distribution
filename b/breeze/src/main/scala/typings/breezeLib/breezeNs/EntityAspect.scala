package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.EntityAspect")
@js.native
class EntityAspect () extends js.Object {
  var entity: Entity = js.native
  var entityManager: EntityManager = js.native
  var entityState: EntityStateSymbol = js.native
  var extraMetadata: js.Object = js.native
  var hasValidationErrors: scala.Boolean = js.native
  var isBeingSaved: scala.Boolean = js.native
  var originalValues: js.Object = js.native
  var propertyChanged: PropertyChangedEvent = js.native
  var validationErrorsChanged: ValidationErrorsChangedEvent = js.native
  def acceptChanges(): scala.Unit = js.native
  def addValidationError(validationError: ValidationError): scala.Unit = js.native
  def clearValidationErrors(): scala.Unit = js.native
  def getKey(): EntityKey = js.native
  def getKey(forceRefresh: scala.Boolean): EntityKey = js.native
  def getValidationErrors(): js.Array[ValidationError] = js.native
  def getValidationErrors(property: IProperty): js.Array[ValidationError] = js.native
  def getValidationErrors(property: java.lang.String): js.Array[ValidationError] = js.native
  def isNavigationPropertyLoaded(navigationProperty: NavigationProperty): scala.Boolean = js.native
  def isNavigationPropertyLoaded(navigationProperty: java.lang.String): scala.Boolean = js.native
  def loadNavigationProperty(navigationProperty: NavigationProperty): stdLib.Promise[QueryResult] = js.native
  def loadNavigationProperty(navigationProperty: NavigationProperty, callback: js.Function): stdLib.Promise[QueryResult] = js.native
  def loadNavigationProperty(navigationProperty: NavigationProperty, callback: js.Function, errorCallback: js.Function): stdLib.Promise[QueryResult] = js.native
  def loadNavigationProperty(navigationProperty: java.lang.String): stdLib.Promise[QueryResult] = js.native
  def loadNavigationProperty(navigationProperty: java.lang.String, callback: js.Function): stdLib.Promise[QueryResult] = js.native
  def loadNavigationProperty(navigationProperty: java.lang.String, callback: js.Function, errorCallback: js.Function): stdLib.Promise[QueryResult] = js.native
  def rejectChanges(): scala.Unit = js.native
  def removeValidationError(validationError: ValidationError): scala.Unit = js.native
  def removeValidationError(validator: Validator): scala.Unit = js.native
  def removeValidationError(validator: Validator, property: DataProperty): scala.Unit = js.native
  def removeValidationError(validator: Validator, property: NavigationProperty): scala.Unit = js.native
  def setAdded(): scala.Unit = js.native
  def setDeleted(): scala.Unit = js.native
  def setDetached(): scala.Unit = js.native
  def setEntityState(entityState: EntityStateSymbol): scala.Unit = js.native
  def setModified(): scala.Unit = js.native
  def setUnchanged(): scala.Unit = js.native
  def validateEntity(): scala.Boolean = js.native
  def validateProperty(property: DataProperty): scala.Boolean = js.native
  def validateProperty(property: DataProperty, context: js.Any): scala.Boolean = js.native
  def validateProperty(property: NavigationProperty): scala.Boolean = js.native
  def validateProperty(property: NavigationProperty, context: js.Any): scala.Boolean = js.native
  def validateProperty(property: java.lang.String): scala.Boolean = js.native
  def validateProperty(property: java.lang.String, context: js.Any): scala.Boolean = js.native
}

