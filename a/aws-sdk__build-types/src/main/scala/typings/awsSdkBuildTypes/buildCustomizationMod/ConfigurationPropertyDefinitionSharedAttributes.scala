package typings.awsSdkBuildTypes.buildCustomizationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationPropertyDefinitionSharedAttributes extends StObject {
  
  /**
    * The documentation string that should be injected over this configuration
    * property. Should be in standard JSDoc format and expect to be indented by
    * 4 spaces.
    */
  var documentation: String
  
  /**
    * Packages that must be imported to use this configuration property.
    * Packages will be imported using the `import * as ${snake_case_package_name} from 'package-name';`
    * syntax.
    */
  var imports: js.UndefOr[js.Array[Import]] = js.undefined
  
  /**
    * Will be used as the `InputType` type parameter to the generated
    * `ConfigurationPropertyDefinition` for this configuration property.
    *
    * Must be a symbol resolvable by the TypeScript compiler.
    *
    * If an imported type is used, it must be referred to as a property of the
    * imported package.
    */
  var inputType: String
  
  /**
    * Whether this property represents internal state about an SDK client that
    * is not meant to be controlled by users of that client.
    *
    * If `true`, the property will not appear in the client's configuration
    * interface but will appear in the client's resolved configuration
    * interface.
    */
  var internal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type to which this property will be normalized. It should only be
    * specified if different from the property's inputType (in which case it
    * must be a subtype thereof).
    *
    * Must be a symbol resolvable by the TypeScript compiler.
    *
    * If an imported type is used, it must be referred to as a property of the
    * imported package.
    */
  var resolvedType: js.UndefOr[String] = js.undefined
}
object ConfigurationPropertyDefinitionSharedAttributes {
  
  inline def apply(documentation: String, inputType: String): ConfigurationPropertyDefinitionSharedAttributes = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationPropertyDefinitionSharedAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigurationPropertyDefinitionSharedAttributes] (val x: Self) extends AnyVal {
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setImports(value: js.Array[Import]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setImportsVarargs(value: Import*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setInputType(value: String): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
    
    inline def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
    
    inline def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
    
    inline def setResolvedType(value: String): Self = StObject.set(x, "resolvedType", value.asInstanceOf[js.Any])
    
    inline def setResolvedTypeUndefined: Self = StObject.set(x, "resolvedType", js.undefined)
  }
}
