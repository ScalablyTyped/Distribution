package typings.contentstackUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNodesTextNodeMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.contentstackUtils.distTypesJsonToHtmlMod.AnyNode because Already inherited
  - typings.contentstackUtils.distTypesGqlMod.AnyNode because Already inherited */ @JSImport("@contentstack/utils/dist/types/nodes/text-node", JSImport.Default)
  @js.native
  open class default protected () extends TextNode {
    def this(text: String) = this()
  }
  
  @js.native
  trait TextNode
    extends typings.contentstackUtils.distTypesNodesNodeMod.default {
    
    var bold: js.UndefOr[Boolean] = js.native
    
    var break: js.UndefOr[Boolean] = js.native
    
    var inlineCode: js.UndefOr[Boolean] = js.native
    
    var italic: js.UndefOr[Boolean] = js.native
    
    var strikethrough: js.UndefOr[Boolean] = js.native
    
    var subscript: js.UndefOr[Boolean] = js.native
    
    var superscript: js.UndefOr[Boolean] = js.native
    
    var text: String = js.native
    
    var underline: js.UndefOr[Boolean] = js.native
  }
}
