package typings.babelTypes.ts36Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSImportEqualsDeclaration
  extends Node
     with Statement {
  
  var id: Identifier_ = js.native
  
  var isExport: Boolean | Null = js.native
  
  var moduleReference: TSEntityName | TSExternalModuleReference = js.native
  
  @JSName("type")
  var type_TSImportEqualsDeclaration: typings.babelTypes.babelTypesStrings.TSImportEqualsDeclaration = js.native
}
@JSImport("babel-types/ts3.6", "TSImportEqualsDeclaration")
@js.native
object TSImportEqualsDeclaration extends js.Object {
  
  def apply(id: Identifier_, moduleReference: TSEntityName): TSImportEqualsDeclaration = js.native
  def apply(id: Identifier_, moduleReference: TSExternalModuleReference): TSImportEqualsDeclaration = js.native
}
