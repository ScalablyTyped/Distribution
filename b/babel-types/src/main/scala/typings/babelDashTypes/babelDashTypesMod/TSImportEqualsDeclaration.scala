package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSImportEqualsDeclaration
  extends Node
     with Statement {
  var id: Identifier
  var isExport: Boolean | Null
  var moduleReference: TSEntityName | TSExternalModuleReference
  @JSName("type")
  var type_TSImportEqualsDeclaration: typings.babelDashTypes.babelDashTypesStrings.TSImportEqualsDeclaration
}

@JSImport("babel-types", "TSImportEqualsDeclaration")
@js.native
object TSImportEqualsDeclaration extends js.Object {
  def apply(id: Identifier, moduleReference: TSEntityName): TSImportEqualsDeclaration = js.native
  def apply(id: Identifier, moduleReference: TSExternalModuleReference): TSImportEqualsDeclaration = js.native
}

