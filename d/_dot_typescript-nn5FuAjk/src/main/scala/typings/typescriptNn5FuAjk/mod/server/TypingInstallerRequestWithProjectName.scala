package typings.typescriptNn5FuAjk.mod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypingInstallerRequestWithProjectName extends StObject {
  
  val projectName: String
}
object TypingInstallerRequestWithProjectName {
  
  inline def apply(projectName: String): TypingInstallerRequestWithProjectName = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypingInstallerRequestWithProjectName]
  }
  
  extension [Self <: TypingInstallerRequestWithProjectName](x: Self) {
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
