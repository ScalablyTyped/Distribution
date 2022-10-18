package typings.cucumberCucumberExpressions

import typings.cucumberCucumberExpressions.distCjsSrcAstMod.Node
import typings.cucumberCucumberExpressions.distCjsSrcTypesMod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSrcCucumberExpressionMod {
  
  @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/CucumberExpression", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with CucumberExpression {
    /**
      * @param expression
      * @param parameterTypeRegistry
      */
    def this(
      expression: String,
      parameterTypeRegistry: typings.cucumberCucumberExpressions.distCjsSrcParameterTypeRegistryMod.default
    ) = this()
    
    /* CompleteClass */
    override def `match`(text: String): js.Array[typings.cucumberCucumberExpressions.distCjsSrcArgumentMod.default] | Null = js.native
    
    /* CompleteClass */
    override val source: String = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/CucumberExpression", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/CucumberExpression", "default.escapeRegex")
    @js.native
    def escapeRegex: Any = js.native
    inline def escapeRegex_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("escapeRegex")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CucumberExpression
    extends StObject
       with Expression {
    
    /* private */ var assertNoOptionals: Any = js.native
    
    /* private */ var assertNoParameters: Any = js.native
    
    /* private */ var assertNotEmpty: Any = js.native
    
    val ast: Node = js.native
    
    /* private */ val expression: Any = js.native
    
    /* private */ val parameterTypeRegistry: Any = js.native
    
    /* private */ val parameterTypes: Any = js.native
    
    def regexp: js.RegExp = js.native
    
    /* private */ var rewriteAlternation: Any = js.native
    
    /* private */ var rewriteAlternative: Any = js.native
    
    /* private */ var rewriteExpression: Any = js.native
    
    /* private */ var rewriteOptional: Any = js.native
    
    /* private */ var rewriteParameter: Any = js.native
    
    /* private */ var rewriteToRegex: Any = js.native
    
    @JSName("source")
    def source_MCucumberExpression: String = js.native
    
    /* private */ val treeRegexp: Any = js.native
  }
}
