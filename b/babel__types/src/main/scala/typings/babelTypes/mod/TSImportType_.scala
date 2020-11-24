package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSImportType
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
  implicit class TSImportType_Ops[Self <: TSImportType_] (val x: Self) extends AnyVal {
    
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
    def setArgument(value: StringLiteral_): Self = this.set("argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSImportType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifier(value: TSEntityName): Self = this.set("qualifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifierNull: Self = this.set("qualifier", null)
    
    @scala.inline
    def setTypeParameters(value: TSTypeParameterInstantiation_): Self = this.set("typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = this.set("typeParameters", null)
  }
}
