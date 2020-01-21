package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSImportEqualsDeclaration
  extends Node
     with Statement {
  var id: Identifier_
  var isExport: Boolean | Null
  var moduleReference: TSEntityName | TSExternalModuleReference
  @JSName("type")
  var type_TSImportEqualsDeclaration: typings.babelTypes.babelTypesStrings.TSImportEqualsDeclaration
}

@JSImport("babel-types", "TSImportEqualsDeclaration")
@js.native
object TSImportEqualsDeclaration extends js.Object {
  def apply(id: Identifier_, moduleReference: TSEntityName): TSImportEqualsDeclaration = js.native
  def apply(id: Identifier_, moduleReference: TSExternalModuleReference): TSImportEqualsDeclaration = js.native
}

