package typings.cucumberCucumberExpressions

import typings.cucumberCucumberExpressions.distCjsSrcTypesMod.DefinesParameterType
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSrcParameterTypeRegistryMod {
  
  @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/ParameterTypeRegistry", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ParameterTypeRegistry {
    
    /* CompleteClass */
    override def defineParameterType[T](parameterType: typings.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.default[T]): Unit = js.native
  }
  
  @js.native
  trait ParameterTypeRegistry
    extends StObject
       with DefinesParameterType {
    
    def lookupByRegexp(parameterTypeRegexp: String, expressionRegexp: js.RegExp, text: String): js.UndefOr[typings.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.default[Any]] = js.native
    
    def lookupByTypeName(typeName: String): js.UndefOr[typings.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.default[Any]] = js.native
    
    /* private */ val parameterTypeByName: Any = js.native
    
    def parameterTypes: IterableIterator[typings.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.default[Any]] = js.native
    
    /* private */ val parameterTypesByRegexp: Any = js.native
  }
}
