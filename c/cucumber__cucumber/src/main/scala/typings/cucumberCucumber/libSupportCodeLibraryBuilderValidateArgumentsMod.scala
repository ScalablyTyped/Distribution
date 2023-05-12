package typings.cucumberCucumber

import typings.cucumberCucumber.anon.Args
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.DefineStepPattern
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.IDefineStepOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSupportCodeLibraryBuilderValidateArgumentsMod {
  
  @JSImport("@cucumber/cucumber/lib/support_code_library_builder/validate_arguments", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: Args): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait IDefineStepArguments extends StObject {
    
    var code: js.UndefOr[js.Function] = js.undefined
    
    var options: js.UndefOr[IDefineStepOptions] = js.undefined
    
    var pattern: js.UndefOr[DefineStepPattern] = js.undefined
  }
  object IDefineStepArguments {
    
    inline def apply(): IDefineStepArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDefineStepArguments]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDefineStepArguments] (val x: Self) extends AnyVal {
      
      inline def setCode(value: js.Function): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setOptions(value: IDefineStepOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPattern(value: DefineStepPattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    }
  }
}
