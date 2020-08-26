package typings.awsSdkBuildTypes.customizationMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.ParserDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ParserDecoratorCustomizationDefinitionOps[Self <: ParserDecoratorCustomizationDefinition] (val x: Self) extends AnyVal {
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
    def setType(value: ParserDecorator): Self = this.set("type", value.asInstanceOf[js.Any])
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
  }
  
}

