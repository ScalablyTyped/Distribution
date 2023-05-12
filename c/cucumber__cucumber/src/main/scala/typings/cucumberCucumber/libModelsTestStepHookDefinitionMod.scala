package typings.cucumberCucumber

import typings.cucumberCucumber.libModelsDefinitionMod.IDefinition
import typings.cucumberCucumber.libModelsDefinitionMod.IDefinitionOptions
import typings.cucumberCucumber.libModelsDefinitionMod.IDefinitionParameters
import typings.cucumberCucumber.libModelsDefinitionMod.IGetInvocationDataRequest
import typings.cucumberCucumber.libModelsDefinitionMod.IGetInvocationDataResponse
import typings.cucumberCucumber.libModelsDefinitionMod.IHookDefinitionOptions
import typings.cucumberMessages.mod.Pickle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsTestStepHookDefinitionMod {
  
  @JSImport("@cucumber/cucumber/lib/models/test_step_hook_definition", JSImport.Default)
  @js.native
  open class default protected () extends TestStepHookDefinition {
    def this(data: IDefinitionParameters[IHookDefinitionOptions]) = this()
    
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
  trait TestStepHookDefinition
    extends typings.cucumberCucumber.libModelsDefinitionMod.default
       with IDefinition {
    
    def appliesToTestCase(pickle: Pickle): Boolean = js.native
    
    /* InferMemberOverrides */
    override val code: js.Function = js.native
    
    /* InferMemberOverrides */
    override val id: String = js.native
    
    /* InferMemberOverrides */
    override val line: Double = js.native
    
    /* InferMemberOverrides */
    override val options: IDefinitionOptions = js.native
    
    /* private */ val pickleTagFilter: Any = js.native
    
    val tagExpression: String = js.native
    
    /* InferMemberOverrides */
    override val unwrappedCode: js.Function = js.native
    
    /* InferMemberOverrides */
    override val uri: String = js.native
  }
}
