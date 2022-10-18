package typings.cucumberMessages.mod

import typings.cucumberMessages.distCjsSrcIdGeneratorMod.NewId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IdGenerator {
  
  @JSImport("@cucumber/messages", "IdGenerator")
  @js.native
  val ^ : js.Any = js.native
  
  inline def incrementing(): NewId = ^.asInstanceOf[js.Dynamic].applyDynamic("incrementing")().asInstanceOf[NewId]
  
  inline def uuid(): NewId = ^.asInstanceOf[js.Dynamic].applyDynamic("uuid")().asInstanceOf[NewId]
}
