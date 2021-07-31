package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationErrorsCollection extends StObject {
  
  def deepErrors(): js.Array[ValidationError]
  
  def `for`(name: String): ValidationErrorsCollection
  
  def forIndex(index: Double): ValidationErrorsCollection
  
  def on(name: String): ValidationError
}
object ValidationErrorsCollection {
  
  @scala.inline
  def apply(
    deepErrors: () => js.Array[ValidationError],
    `for`: String => ValidationErrorsCollection,
    forIndex: Double => ValidationErrorsCollection,
    on: String => ValidationError
  ): ValidationErrorsCollection = {
    val __obj = js.Dynamic.literal(deepErrors = js.Any.fromFunction0(deepErrors), forIndex = js.Any.fromFunction1(forIndex), on = js.Any.fromFunction1(on))
    __obj.updateDynamic("for")(js.Any.fromFunction1(`for`))
    __obj.asInstanceOf[ValidationErrorsCollection]
  }
  
  @scala.inline
  implicit class ValidationErrorsCollectionMutableBuilder[Self <: ValidationErrorsCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeepErrors(value: () => js.Array[ValidationError]): Self = StObject.set(x, "deepErrors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFor(value: String => ValidationErrorsCollection): Self = StObject.set(x, "for", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForIndex(value: Double => ValidationErrorsCollection): Self = StObject.set(x, "forIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOn(value: String => ValidationError): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
  }
}
