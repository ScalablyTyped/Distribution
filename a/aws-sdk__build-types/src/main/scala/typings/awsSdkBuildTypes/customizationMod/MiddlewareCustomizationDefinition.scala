package typings.awsSdkBuildTypes.customizationMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.Middleware
import typings.awsSdkTypes.middlewareMod.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MiddlewareCustomizationDefinition extends CustomizationDefinition {
  
  /**
    * An expression that should evaluate to a boolean that will determine if
    * the middleware is injected into the stack. This will be evaluated after
    * all configuration has been resolved; the configuration can be
    * dereferenced as `this.config`.
    */
  var conditionExpression: js.UndefOr[String] = js.native
  
  /**
    * Any configuration necessary for this middleware to be resolved.
    */
  var configuration: js.UndefOr[ConfigurationDefinition] = js.native
  
  /**
    * An expression that resolves to the middleware to inject.
    */
  var expression: String = js.native
  
  /**
    * Packages that must be imported to use this middleware.
    * Packages will be imported using the `import * as ${snake_case_package_name} from 'package-name';`
    * syntax.
    */
  var imports: js.UndefOr[js.Array[Import]] = js.native
  
  /**
    * The priority within the specified step with which the middleware should
    * be executed.
    */
  var priority: Double = js.native
  
  /**
    * The step in which to inject the middleware.
    */
  var step: Step = js.native
  
  /**
    * An expression that resolves to a set of tags to apply to this middleware.
    */
  var tags: js.UndefOr[String] = js.native
  
  var `type`: Middleware = js.native
}
object MiddlewareCustomizationDefinition {
  
  @scala.inline
  def apply(expression: String, priority: Double, step: Step, `type`: Middleware): MiddlewareCustomizationDefinition = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiddlewareCustomizationDefinition]
  }
  
  @scala.inline
  implicit class MiddlewareCustomizationDefinitionMutableBuilder[Self <: MiddlewareCustomizationDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditionExpression(value: String): Self = StObject.set(x, "conditionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionExpressionUndefined: Self = StObject.set(x, "conditionExpression", js.undefined)
    
    @scala.inline
    def setConfiguration(value: ConfigurationDefinition): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImports(value: js.Array[Import]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    @scala.inline
    def setImportsVarargs(value: Import*): Self = StObject.set(x, "imports", js.Array(value :_*))
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Step): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setType(value: Middleware): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
