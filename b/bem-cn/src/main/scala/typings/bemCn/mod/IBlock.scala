package typings.bemCn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBlock extends BemItem {
  
  def apply(elemNameOrMods: (String | BemMods)*): BemItem with String = js.native
}
