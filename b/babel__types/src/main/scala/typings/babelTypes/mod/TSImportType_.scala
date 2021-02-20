package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSImportType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TSImportType_
  extends TSType
     with BaseNode {
  
  var argument: StringLiteral_ = js.native
  
  var qualifier: TSEntityName | Null = js.native
  
  var typeParameters: TSTypeParameterInstantiation_ | Null = js.native
  
  @JSName("type")
  var type_TSImportType_ : TSImportType = js.native
}
object TSImportType_ {
  
  @scala.inline
  def apply(argument: StringLiteral_, `type`: TSImportType): TSImportType_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSImportType_]
  }
  
  @scala.inline
  implicit class TSImportType_MutableBuilder[Self <: TSImportType_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: StringLiteral_): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifier(value: TSEntityName): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifierNull: Self = StObject.set(x, "qualifier", null)
    
    @scala.inline
    def setType(value: TSImportType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TSTypeParameterInstantiation_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
