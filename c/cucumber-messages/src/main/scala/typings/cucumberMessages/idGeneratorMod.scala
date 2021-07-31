package typings.cucumberMessages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object idGeneratorMod {
  
  @JSImport("cucumber-messages/dist/src/IdGenerator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def incrementing(): NewId = ^.asInstanceOf[js.Dynamic].applyDynamic("incrementing")().asInstanceOf[NewId]
  
  @scala.inline
  def uuid(): NewId = ^.asInstanceOf[js.Dynamic].applyDynamic("uuid")().asInstanceOf[NewId]
  
  type NewId = js.Function0[String]
}
