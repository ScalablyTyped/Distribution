package typings.awsSdkBuildTypes.customizationMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.SyntheticParameter
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.input
import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.output
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyntheticParameterCustomizationDefinition extends CustomizationDefinition {
  /**
    * The documentation string that should be injected for this property.
    * Should be in standard JSDoc format and expect to be indented by 4 spaces.
    */
  var documentation: String = js.native
  /**
    * Packages that must be imported to use this property.
    * Packages will be imported using the `import * as ${snake_case_package_name} from 'package-name';`
    * syntax.
    */
  var imports: js.UndefOr[js.Array[Import]] = js.native
  /**
    * The I/O shape on which this synthetic parameter should be applied.
    */
  var location: input | output = js.native
  /**
    * The name of the property to be added to the operation's input or output
    * shape. For client-side only parameters, the first character should
    * typically be `$` to avoid any clashes with service parameters.
    */
  var name: String = js.native
  /**
    * Whether this input parameter must be provided by the user.
    */
  var required: js.UndefOr[Boolean] = js.native
  var `type`: SyntheticParameter = js.native
  /**
    * Will be used as the type annotation for this property.
    *
    * Must be a symbol resolvable by the TypeScript compiler.
    *
    * If an imported type is used, it must be referred to as a property of the
    * imported package.
    */
  var typeExpression: String = js.native
}

object SyntheticParameterCustomizationDefinition {
  @scala.inline
  def apply(
    documentation: String,
    location: input | output,
    name: String,
    `type`: SyntheticParameter,
    typeExpression: String
  ): SyntheticParameterCustomizationDefinition = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typeExpression = typeExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntheticParameterCustomizationDefinition]
  }
  @scala.inline
  implicit class SyntheticParameterCustomizationDefinitionOps[Self <: SyntheticParameterCustomizationDefinition] (val x: Self) extends AnyVal {
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
    def setDocumentation(value: String): Self = this.set("documentation", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: input | output): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: SyntheticParameter): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeExpression(value: String): Self = this.set("typeExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def setImportsVarargs(value: Import*): Self = this.set("imports", js.Array(value :_*))
    @scala.inline
    def setImports(value: js.Array[Import]): Self = this.set("imports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImports: Self = this.set("imports", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
  }
  
}

