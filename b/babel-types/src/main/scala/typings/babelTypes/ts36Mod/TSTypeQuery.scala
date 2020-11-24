package typings.babelTypes.ts36Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypeQuery
  extends Node
     with TSType {
  
  var exprName: TSEntityName = js.native
  
  @JSName("type")
  var type_TSTypeQuery: typings.babelTypes.babelTypesStrings.TSTypeQuery = js.native
}
@JSImport("babel-types/ts3.6", "TSTypeQuery")
@js.native
object TSTypeQuery extends js.Object {
  
  def apply(exprName: TSEntityName): TSTypeQuery = js.native
}
