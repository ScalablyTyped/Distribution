package typings.azureMsalNode

import typings.azureMsalCommon.iguidgeneratorMod.IGuidGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object guidGeneratorMod {
  
  @JSImport("@azure/msal-node/dist/crypto/GuidGenerator", "GuidGenerator")
  @js.native
  open class GuidGenerator ()
    extends StObject
       with IGuidGenerator {
    
    /* CompleteClass */
    override def generateGuid(): String = js.native
    
    /* CompleteClass */
    override def isGuid(guid: String): Boolean = js.native
  }
}
