package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityAspect extends js.Object {
  var entity: Entity = js.native
  var entityManager: EntityManager = js.native
  var entityState: EntityStateSymbol = js.native
  var extraMetadata: js.Object = js.native
  var hasValidationErrors: Boolean = js.native
  var isBeingSaved: Boolean = js.native
  var originalValues: js.Object = js.native
  var propertyChanged: PropertyChangedEvent = js.native
  var validationErrorsChanged: ValidationErrorsChangedEvent = js.native
  def acceptChanges(): Unit = js.native
  def addValidationError(validationError: ValidationError): Unit = js.native
  def clearValidationErrors(): Unit = js.native
  def getKey(): EntityKey = js.native
  def getKey(forceRefresh: Boolean): EntityKey = js.native
  def getValidationErrors(): js.Array[ValidationError] = js.native
  def getValidationErrors(property: String): js.Array[ValidationError] = js.native
  def getValidationErrors(property: IProperty): js.Array[ValidationError] = js.native
  def isNavigationPropertyLoaded(navigationProperty: String): Boolean = js.native
  def isNavigationPropertyLoaded(navigationProperty: NavigationProperty): Boolean = js.native
  def loadNavigationProperty(navigationProperty: String): js.Promise[QueryResult] = js.native
  def loadNavigationProperty(navigationProperty: String, callback: js.UndefOr[scala.Nothing], errorCallback: js.Function): js.Promise[QueryResult] = js.native
  def loadNavigationProperty(navigationProperty: String, callback: js.Function): js.Promise[QueryResult] = js.native
  def loadNavigationProperty(navigationProperty: String, callback: js.Function, errorCallback: js.Function): js.Promise[QueryResult] = js.native
  def loadNavigationProperty(navigationProperty: NavigationProperty): js.Promise[QueryResult] = js.native
  def loadNavigationProperty(
    navigationProperty: NavigationProperty,
    callback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function
  ): js.Promise[QueryResult] = js.native
  def loadNavigationProperty(navigationProperty: NavigationProperty, callback: js.Function): js.Promise[QueryResult] = js.native
  def loadNavigationProperty(navigationProperty: NavigationProperty, callback: js.Function, errorCallback: js.Function): js.Promise[QueryResult] = js.native
  def rejectChanges(): Unit = js.native
  def removeValidationError(validationError: ValidationError): Unit = js.native
  def removeValidationError(validator: Validator): Unit = js.native
  def removeValidationError(validator: Validator, property: DataProperty): Unit = js.native
  def removeValidationError(validator: Validator, property: NavigationProperty): Unit = js.native
  def setAdded(): Unit = js.native
  def setDeleted(): Unit = js.native
  def setDetached(): Unit = js.native
  def setEntityState(entityState: EntityStateSymbol): Unit = js.native
  def setModified(): Unit = js.native
  def setUnchanged(): Unit = js.native
  def validateEntity(): Boolean = js.native
  def validateProperty(property: String): Boolean = js.native
  def validateProperty(property: String, context: js.Any): Boolean = js.native
  def validateProperty(property: DataProperty): Boolean = js.native
  def validateProperty(property: DataProperty, context: js.Any): Boolean = js.native
  def validateProperty(property: NavigationProperty): Boolean = js.native
  def validateProperty(property: NavigationProperty, context: js.Any): Boolean = js.native
}

