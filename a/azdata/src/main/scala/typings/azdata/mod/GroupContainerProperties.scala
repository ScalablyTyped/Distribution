package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupContainerProperties extends StObject {
  
  var collapsed: Boolean
}
object GroupContainerProperties {
  
  @scala.inline
  def apply(collapsed: Boolean): GroupContainerProperties = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupContainerProperties]
  }
  
  @scala.inline
  implicit class GroupContainerPropertiesMutableBuilder[Self <: GroupContainerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
  }
}
