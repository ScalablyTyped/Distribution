package typings.awsSdkBuildTypes.customizationMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.ParserDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParserDecoratorCustomizationDefinition extends CustomizationDefinition {
  
  /**
    * Any configuration necessary for this middleware to be resolved.
    */
  var configuration: js.UndefOr[ConfigurationDefinition] = js.native
  
  /**
    * An expression that resolves to the decorator with which to wrap the
    * parser.
    */
  var expression: String = js.native
  
  /**
    * Packages that must be imported to use this parser decorator.
    * Packages will be imported using the `import * as ${snake_case_package_name} from 'package-name';`
    * syntax.
    */
  var imports: js.UndefOr[js.Array[Import]] = js.native
  
  /**
    * The relative priority of this decorator relative to other decorators.
    * Used during client generation to order decorator application.
    */
  var priority: Double = js.native
  
  var `type`: ParserDecorator = js.native
}
object ParserDecoratorCustomizationDefinition {
  
  @scala.inline
  def apply(expression: String, priority: Double, `type`: ParserDecorator): ParserDecoratorCustomizationDefinition = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserDecoratorCustomizationDefinition]
  }
  
  @scala.inline
  implicit class ParserDecoratorCustomizationDefinitionMutableBuilder[Self <: ParserDecoratorCustomizationDefinition] (val x: Self) extends AnyVal {
    
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
    def setType(value: ParserDecorator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
