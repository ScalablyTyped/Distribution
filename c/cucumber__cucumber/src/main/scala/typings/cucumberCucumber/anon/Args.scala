package typings.cucumberCucumber.anon

import typings.cucumberCucumber.libSupportCodeLibraryBuilderValidateArgumentsMod.IDefineStepArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Args extends StObject {
  
  var args: js.UndefOr[IDefineStepArguments] = js.undefined
  
  var fnName: String
  
  var location: String
}
object Args {
  
  inline def apply(fnName: String, location: String): Args = {
    val __obj = js.Dynamic.literal(fnName = fnName.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: IDefineStepArguments): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setFnName(value: String): Self = StObject.set(x, "fnName", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
