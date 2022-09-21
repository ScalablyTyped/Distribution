package typings.tslintXANLscI2

import typings.tslintXANLscI2.anon.PropertiesLocations
import typings.tslintXANLscI2.anon.PropertiesOverloads
import typings.tslintXANLscI2.anon.PropertiesPrivacies
import typings.tslintXANLscI2.anon.PropertiesType
import typings.tslintXANLscI2.anon.PropertiesVisibilities
import typings.tslintXANLscI2.exclusionDescriptorsDTsMod.IInputExclusionDescriptors
import typings.tslintXANLscI2.mod.Rules.AbstractRule
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object completedDocsRuleDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "ALL")
  @js.native
  val ALL_ : /* "all" */ String = js.native
  
  @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "ARGUMENT_CLASSES")
  @js.native
  val ARGUMENT_CLASSES: /* "classes" */ String = js.native
  
  @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "ARGUMENT_CONSTRUCTORS")
  @js.native
  val ARGUMENT_CONSTRUCTORS: /* "constructors" */ String = js.native
  
  @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "ARGUMENT_ENUMS")
  @js.native
  val ARGUMENT_ENUMS: /* "enums" */ String = js.native
  
  @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "ARGUMENT_ENUM_MEMBERS")
  @js.native
  val ARGUMENT_ENUM_MEMBERS: /* "enum-members" */ String = js.native
  
  @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "ARGUMENT_FUNCTIONS")
  @js.native
  val ARGUMENT_FUNCTIONS: /* "functions" */ String = js.native
  
  @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "ARGUMENT_INTERFACES")
  @js.native
  val ARGUMENT_INTERFACES: /* "interfaces" */ String = js.native
  
  @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "ARGUMENT_METHODS")
  @js.native
  val ARGUMENT_METHODS: /* "methods" */ String = js.native
  
  @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "ARGUMENT_NAMESPACES")
  @js.native
  val ARGUMENT_NAMESPACES: /* "namespaces" */ String = js.native
  
  @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "ARGUMENT_PROPERTIES")
  @js.native
  val ARGUMENT_PROPERTIES: /* "properties" */ String = js.native
  
  @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "ARGUMENT_TYPES")
  @js.native
  val ARGUMENT_TYPES: /* "types" */ String = js.native
  
  @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "ARGUMENT_VARIABLES")
  @js.native
  val ARGUMENT_VARIABLES: /* "variables" */ String = js.native
  
  @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "DESCRIPTOR_LOCATIONS")
  @js.native
  val DESCRIPTOR_LOCATIONS: /* "locations" */ String = js.native
  
  @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "DESCRIPTOR_OVERLOADS")
  @js.native
  val DESCRIPTOR_OVERLOADS: /* "overloads" */ String = js.native
  
  @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "DESCRIPTOR_PRIVACIES")
  @js.native
  val DESCRIPTOR_PRIVACIES: /* "privacies" */ String = js.native
  
  @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "DESCRIPTOR_TAGS")
  @js.native
  val DESCRIPTOR_TAGS: /* "tags" */ String = js.native
  
  @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "DESCRIPTOR_VISIBILITIES")
  @js.native
  val DESCRIPTOR_VISIBILITIES: /* "visibilities" */ String = js.native
  
  @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "LOCATION_INSTANCE")
  @js.native
  val LOCATION_INSTANCE: /* "instance" */ String = js.native
  
  @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "LOCATION_STATIC")
  @js.native
  val LOCATION_STATIC: /* "static" */ String = js.native
  
  @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "PRIVACY_PRIVATE")
  @js.native
  val PRIVACY_PRIVATE: /* "private" */ String = js.native
  
  @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "PRIVACY_PROTECTED")
  @js.native
  val PRIVACY_PROTECTED: /* "protected" */ String = js.native
  
  @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "PRIVACY_PUBLIC")
  @js.native
  val PRIVACY_PUBLIC: /* "public" */ String = js.native
  
  @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
    
    /* private */ var getExclusionsMap: Any = js.native
  }
  /* static members */
  object Rule {
    
    @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "Rule.ARGUMENT_DESCRIPTOR_BLOCK")
    @js.native
    def ARGUMENT_DESCRIPTOR_BLOCK: PropertiesType = js.native
    inline def ARGUMENT_DESCRIPTOR_BLOCK_=(x: PropertiesType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARGUMENT_DESCRIPTOR_BLOCK")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "Rule.ARGUMENT_DESCRIPTOR_CLASS")
    @js.native
    def ARGUMENT_DESCRIPTOR_CLASS: PropertiesLocations = js.native
    inline def ARGUMENT_DESCRIPTOR_CLASS_=(x: PropertiesLocations): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARGUMENT_DESCRIPTOR_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "Rule.ARGUMENT_DESCRIPTOR_CONSTRUCTOR")
    @js.native
    def ARGUMENT_DESCRIPTOR_CONSTRUCTOR: PropertiesOverloads = js.native
    inline def ARGUMENT_DESCRIPTOR_CONSTRUCTOR_=(x: PropertiesOverloads): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARGUMENT_DESCRIPTOR_CONSTRUCTOR")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "Rule.ARGUMENT_DESCRIPTOR_FUNCTION")
    @js.native
    def ARGUMENT_DESCRIPTOR_FUNCTION: PropertiesVisibilities = js.native
    inline def ARGUMENT_DESCRIPTOR_FUNCTION_=(x: PropertiesVisibilities): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARGUMENT_DESCRIPTOR_FUNCTION")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "Rule.ARGUMENT_DESCRIPTOR_METHOD")
    @js.native
    def ARGUMENT_DESCRIPTOR_METHOD: PropertiesPrivacies = js.native
    inline def ARGUMENT_DESCRIPTOR_METHOD_=(x: PropertiesPrivacies): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARGUMENT_DESCRIPTOR_METHOD")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "Rule.FAILURE_STRING_EXIST")
    @js.native
    def FAILURE_STRING_EXIST: String = js.native
    inline def FAILURE_STRING_EXIST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_EXIST")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "Rule.defaultArguments")
    @js.native
    def defaultArguments: IInputExclusionDescriptors = js.native
    inline def defaultArguments_=(x: IInputExclusionDescriptors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultArguments")(x.asInstanceOf[js.Any])
    
    @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "TAGS_FOR_CONTENT")
  @js.native
  val TAGS_FOR_CONTENT: /* "content" */ String = js.native
  
  @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "TAGS_FOR_EXISTENCE")
  @js.native
  val TAGS_FOR_EXISTENCE: /* "existence" */ String = js.native
  
  @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "VISIBILITY_EXPORTED")
  @js.native
  val VISIBILITY_EXPORTED: /* "exported" */ String = js.native
  
  @JSImport(".tslint-xANLscI2/lib/rules/completedDocsRule.d.ts", "VISIBILITY_INTERNAL")
  @js.native
  val VISIBILITY_INTERNAL: /* "internal" */ String = js.native
  
  type All = /* "all" */ String
  
  type DocType = All | (/* "classes" */ String)
  
  type Location = All | (/* "instance" */ String)
  
  type Privacy = All | (/* "private" */ String)
  
  type Visibility = All | (/* "exported" */ String)
}
