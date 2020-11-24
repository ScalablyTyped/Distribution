package typings.bemCn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BemBlock extends _BemMix {
  
  def apply(settings: BemSettings, context: BemContext, elemNameOrMods: (String | BemMods)*): BemItem | String = js.native
}
