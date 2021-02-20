package typings.cyberblastConfig

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@cyberblast/config", "Config")
  @js.native
  class Config protected () extends StObject {
    def this(filePath: String) = this()
    
    def load(): js.Promise[StringDictionary[_]] = js.native
    
    var settings: StringDictionary[js.Any] = js.native
  }
}
