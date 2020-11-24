package typings.cyberblastConfig

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cyberblast/config", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class Config protected () extends js.Object {
    def this(filePath: String) = this()
    
    def load(): js.Promise[StringDictionary[_]] = js.native
    
    var settings: StringDictionary[js.Any] = js.native
  }
}
