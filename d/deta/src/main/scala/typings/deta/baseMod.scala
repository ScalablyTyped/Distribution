package typings.deta

import typings.deta.keyMod.KeyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  @JSImport("deta/dist/types/base", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.deta.baseBaseMod.default {
    def this(key: String, `type`: KeyType, projectId: String, baseName: String) = this()
    def this(key: String, `type`: KeyType, projectId: String, baseName: String, host: String) = this()
  }
}
