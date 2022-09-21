package typings.deta

import typings.deta.keyMod.KeyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object driveMod {
  
  @JSImport("deta/dist/types/drive", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.deta.driveDriveMod.default {
    def this(key: String, `type`: KeyType, projectId: String, driveName: String) = this()
    def this(key: String, `type`: KeyType, projectId: String, driveName: String, host: String) = this()
  }
}
