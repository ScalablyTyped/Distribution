package typings.cucumberCucumberExpressions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object combinatorialGeneratedExpressionFactoryMod {
  
  @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/CombinatorialGeneratedExpressionFactory", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with CombinatorialGeneratedExpressionFactory {
    def this(
      expressionTemplate: String,
      parameterTypeCombinations: js.Array[js.Array[typings.cucumberCucumberExpressions.parameterTypeMod.default[Any]]]
    ) = this()
    
    /* private */ /* CompleteClass */
    override val expressionTemplate: Any = js.native
    
    /* CompleteClass */
    override def generateExpressions(): js.Array[typings.cucumberCucumberExpressions.generatedExpressionMod.default] = js.native
    
    /* private */ /* CompleteClass */
    var generatePermutations: Any = js.native
    
    /* private */ /* CompleteClass */
    override val parameterTypeCombinations: Any = js.native
  }
  
  trait CombinatorialGeneratedExpressionFactory extends StObject {
    
    /* private */ val expressionTemplate: Any
    
    def generateExpressions(): js.Array[typings.cucumberCucumberExpressions.generatedExpressionMod.default]
    
    /* private */ var generatePermutations: Any
    
    /* private */ val parameterTypeCombinations: Any
  }
  object CombinatorialGeneratedExpressionFactory {
    
    inline def apply(
      expressionTemplate: Any,
      generateExpressions: () => js.Array[typings.cucumberCucumberExpressions.generatedExpressionMod.default],
      generatePermutations: Any,
      parameterTypeCombinations: Any
    ): CombinatorialGeneratedExpressionFactory = {
      val __obj = js.Dynamic.literal(expressionTemplate = expressionTemplate.asInstanceOf[js.Any], generateExpressions = js.Any.fromFunction0(generateExpressions), generatePermutations = generatePermutations.asInstanceOf[js.Any], parameterTypeCombinations = parameterTypeCombinations.asInstanceOf[js.Any])
      __obj.asInstanceOf[CombinatorialGeneratedExpressionFactory]
    }
    
    extension [Self <: CombinatorialGeneratedExpressionFactory](x: Self) {
      
      inline def setExpressionTemplate(value: Any): Self = StObject.set(x, "expressionTemplate", value.asInstanceOf[js.Any])
      
      inline def setGenerateExpressions(value: () => js.Array[typings.cucumberCucumberExpressions.generatedExpressionMod.default]): Self = StObject.set(x, "generateExpressions", js.Any.fromFunction0(value))
      
      inline def setGeneratePermutations(value: Any): Self = StObject.set(x, "generatePermutations", value.asInstanceOf[js.Any])
      
      inline def setParameterTypeCombinations(value: Any): Self = StObject.set(x, "parameterTypeCombinations", value.asInstanceOf[js.Any])
    }
  }
}
