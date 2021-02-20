package typings.cucumberMessages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object idGeneratorMod {
  
  @JSImport("cucumber-messages/dist/src/IdGenerator", "incrementing")
  @js.native
  def incrementing(): NewId = js.native
  
  @JSImport("cucumber-messages/dist/src/IdGenerator", "uuid")
  @js.native
  def uuid(): NewId = js.native
  
  type NewId = js.Function0[String]
}
