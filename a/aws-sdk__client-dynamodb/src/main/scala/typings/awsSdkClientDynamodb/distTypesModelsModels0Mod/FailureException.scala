package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailureException extends StObject {
  
  /**
    * <p>Description of the failure.</p>
    */
  var ExceptionDescription: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Exception name.</p>
    */
  var ExceptionName: js.UndefOr[String] = js.undefined
}
object FailureException {
  
  inline def apply(): FailureException = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailureException]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FailureException] (val x: Self) extends AnyVal {
    
    inline def setExceptionDescription(value: String): Self = StObject.set(x, "ExceptionDescription", value.asInstanceOf[js.Any])
    
    inline def setExceptionDescriptionUndefined: Self = StObject.set(x, "ExceptionDescription", js.undefined)
    
    inline def setExceptionName(value: String): Self = StObject.set(x, "ExceptionName", value.asInstanceOf[js.Any])
    
    inline def setExceptionNameUndefined: Self = StObject.set(x, "ExceptionName", js.undefined)
  }
}
