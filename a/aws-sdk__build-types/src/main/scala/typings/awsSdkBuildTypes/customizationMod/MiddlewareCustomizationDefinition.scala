package typings.awsSdkBuildTypes.customizationMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.Middleware
import typings.awsSdkTypes.middlewareMod.Step
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
  implicit class MiddlewareCustomizationDefinitionOps[Self <: MiddlewareCustomizationDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Step): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Middleware): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionExpression(value: String): Self = this.set("conditionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditionExpression: Self = this.set("conditionExpression", js.undefined)
    
    @scala.inline
    def setConfiguration(value: ConfigurationDefinition): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    
    @scala.inline
    def setImportsVarargs(value: Import*): Self = this.set("imports", js.Array(value :_*))
    
    @scala.inline
    def setImports(value: js.Array[Import]): Self = this.set("imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImports: Self = this.set("imports", js.undefined)
    
    @scala.inline
    def setTags(value: String): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
