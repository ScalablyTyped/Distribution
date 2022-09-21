package typings.deta

import typings.deta.keyMod.KeyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detaMod {
  
  @JSImport("deta/dist/types/deta", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Deta {
    def this(key: String, `type`: KeyType, projectId: String) = this()
  }
  
  @js.native
  trait Deta extends StObject {
    
    def Base(baseName: String): typings.deta.baseMod.default = js.native
    def Base(baseName: String, host: String): typings.deta.baseMod.default = js.native
    
    def Drive(driveName: String): typings.deta.driveMod.default = js.native
    def Drive(driveName: String, host: String): typings.deta.driveMod.default = js.native
    
    /* private */ var key: Any = js.native
    
    /* private */ var projectId: Any = js.native
    
    /* private */ var `type`: Any = js.native
  }
}
