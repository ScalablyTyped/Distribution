package typings.cucumberMessages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cucumber-messages/dist/src/IdGenerator", JSImport.Namespace)
@js.native
object idGeneratorMod extends js.Object {
  
  def incrementing(): NewId = js.native
  
  def uuid(): NewId = js.native
  
  type NewId = js.Function0[String]
}
