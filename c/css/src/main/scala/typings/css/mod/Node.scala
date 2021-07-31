package typings.css.mod

import typings.css.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  /** A reference to the parent node, or null if the node has no parent. */
  var parent: js.UndefOr[Node] = js.undefined
  
  /** Information about the position in the source string that corresponds to the node. */
  var position: js.UndefOr[Content] = js.undefined
  
  /** The possible values are the ones listed in the Types section on https://github.com/reworkcss/css page. */
  var `type`: js.UndefOr[String] = js.undefined
}
object Node {
  
  @scala.inline
  def apply(): Node = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParent(value: Node): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setPosition(value: Content): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
