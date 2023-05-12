package typings.cucumberCucumber.libApiTypesMod

import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.ISupportCodeLibrary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRunResult extends StObject {
  
  /**
    * Whether the test run was overall successful i.e. no failed scenarios. The exact meaning can vary based on the `strict` configuration option.
    */
  var success: Boolean
  
  /**
    * The support code library that was used in the test run; can be reused in subsequent `runCucumber` calls.
    */
  var support: ISupportCodeLibrary
}
object IRunResult {
  
  inline def apply(success: Boolean, support: ISupportCodeLibrary): IRunResult = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any], support = support.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRunResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRunResult] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSupport(value: ISupportCodeLibrary): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
  }
}
