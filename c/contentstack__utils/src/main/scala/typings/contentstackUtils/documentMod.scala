package typings.contentstackUtils

import typings.contentstackUtils.nodeTypeMod.NodeType.DOCUMENT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentMod {
  
  @JSImport("@contentstack/utils/dist/types/nodes/document", JSImport.Default)
  @js.native
  open class default () extends Document
  
  @js.native
  trait Document
    extends typings.contentstackUtils.nodeMod.default {
    
    @JSName("type")
    var type_Document: DOCUMENT = js.native
  }
}
