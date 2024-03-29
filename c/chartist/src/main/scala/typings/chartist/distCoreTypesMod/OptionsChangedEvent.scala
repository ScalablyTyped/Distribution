package typings.chartist.distCoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsChangedEvent[T] extends StObject {
  
  var currentOptions: T
  
  var previousOptions: T
}
object OptionsChangedEvent {
  
  inline def apply[T](currentOptions: T, previousOptions: T): OptionsChangedEvent[T] = {
    val __obj = js.Dynamic.literal(currentOptions = currentOptions.asInstanceOf[js.Any], previousOptions = previousOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsChangedEvent[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsChangedEvent[?], T] (val x: Self & OptionsChangedEvent[T]) extends AnyVal {
    
    inline def setCurrentOptions(value: T): Self = StObject.set(x, "currentOptions", value.asInstanceOf[js.Any])
    
    inline def setPreviousOptions(value: T): Self = StObject.set(x, "previousOptions", value.asInstanceOf[js.Any])
  }
}
