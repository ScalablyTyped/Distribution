package typings.atCyberblastConfig

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@cyberblast/config", JSImport.Namespace)
@js.native
object atCyberblastConfigMod extends js.Object {
  @js.native
  class Config protected () extends js.Object {
    def this(filePath: String) = this()
    var settings: StringDictionary[js.Any] = js.native
    def load(): js.Promise[StringDictionary[_]] = js.native
  }
  
}

