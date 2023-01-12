package typings.cucumberCucumberExpressions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSrcCucumberExpressionGeneratorMod {
  
  @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/CucumberExpressionGenerator", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with CucumberExpressionGenerator {
    def this(parameterTypes: js.Function0[
            js.Iterable[typings.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.default[Any]]
          ]) = this()
    
    /* private */ /* CompleteClass */
    var createParameterTypeMatchers: Any = js.native
    
    /* CompleteClass */
    override def generateExpressions(text: String): js.Array[typings.cucumberCucumberExpressions.distCjsSrcGeneratedExpressionMod.default] = js.native
    
    /* private */ /* CompleteClass */
    override val parameterTypes: Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/CucumberExpressionGenerator", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/CucumberExpressionGenerator", "default.createParameterTypeMatchers2")
    @js.native
    def createParameterTypeMatchers2: Any = js.native
    inline def createParameterTypeMatchers2_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createParameterTypeMatchers2")(x.asInstanceOf[js.Any])
  }
  
  trait CucumberExpressionGenerator extends StObject {
    
    /* private */ var createParameterTypeMatchers: Any
    
    def generateExpressions(text: String): js.Array[typings.cucumberCucumberExpressions.distCjsSrcGeneratedExpressionMod.default]
    
    /* private */ val parameterTypes: Any
  }
  object CucumberExpressionGenerator {
    
    inline def apply(
      createParameterTypeMatchers: Any,
      generateExpressions: String => js.Array[typings.cucumberCucumberExpressions.distCjsSrcGeneratedExpressionMod.default],
      parameterTypes: Any
    ): CucumberExpressionGenerator = {
      val __obj = js.Dynamic.literal(createParameterTypeMatchers = createParameterTypeMatchers.asInstanceOf[js.Any], generateExpressions = js.Any.fromFunction1(generateExpressions), parameterTypes = parameterTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[CucumberExpressionGenerator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CucumberExpressionGenerator] (val x: Self) extends AnyVal {
      
      inline def setCreateParameterTypeMatchers(value: Any): Self = StObject.set(x, "createParameterTypeMatchers", value.asInstanceOf[js.Any])
      
      inline def setGenerateExpressions(
        value: String => js.Array[typings.cucumberCucumberExpressions.distCjsSrcGeneratedExpressionMod.default]
      ): Self = StObject.set(x, "generateExpressions", js.Any.fromFunction1(value))
      
      inline def setParameterTypes(value: Any): Self = StObject.set(x, "parameterTypes", value.asInstanceOf[js.Any])
    }
  }
}
