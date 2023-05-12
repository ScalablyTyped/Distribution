package typings.cucumberCucumber

import typings.cucumberCucumber.libModelsDefinitionMod.IDefinition
import typings.cucumberCucumber.libModelsDefinitionMod.IDefinitionOptions
import typings.cucumberCucumber.libModelsDefinitionMod.IGetInvocationDataRequest
import typings.cucumberCucumber.libModelsDefinitionMod.IGetInvocationDataResponse
import typings.cucumberCucumber.libModelsDefinitionMod.IStepDefinitionParameters
import typings.cucumberCucumber.libModelsGherkinStepKeywordMod.GherkinStepKeyword
import typings.cucumberCucumberExpressions.distCjsSrcTypesMod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsStepDefinitionMod {
  
  @JSImport("@cucumber/cucumber/lib/models/step_definition", JSImport.Default)
  @js.native
  open class default protected () extends StepDefinition {
    def this(data: IStepDefinitionParameters) = this()
    
    /* CompleteClass */
    override val code: js.Function = js.native
    
    /* CompleteClass */
    override def getInvocationParameters(options: IGetInvocationDataRequest): js.Promise[IGetInvocationDataResponse] = js.native
    
    /* CompleteClass */
    override val id: String = js.native
    
    /* CompleteClass */
    override val line: Double = js.native
    
    /* CompleteClass */
    override val options: IDefinitionOptions = js.native
    
    /* CompleteClass */
    override val unwrappedCode: js.Function = js.native
    
    /* CompleteClass */
    override val uri: String = js.native
  }
  
  @js.native
  trait StepDefinition
    extends typings.cucumberCucumber.libModelsDefinitionMod.default
       with IDefinition {
    
    /* InferMemberOverrides */
    override val code: js.Function = js.native
    
    val expression: Expression = js.native
    
    /* InferMemberOverrides */
    override val id: String = js.native
    
    val keyword: GherkinStepKeyword = js.native
    
    /* InferMemberOverrides */
    override val line: Double = js.native
    
    def matchesStepName(stepName: String): Boolean = js.native
    
    /* InferMemberOverrides */
    override val options: IDefinitionOptions = js.native
    
    val pattern: String | js.RegExp = js.native
    
    /* InferMemberOverrides */
    override val unwrappedCode: js.Function = js.native
    
    /* InferMemberOverrides */
    override val uri: String = js.native
  }
}
