package typings.cytoscape.mod

import typings.cytoscape.cytoscapeStrings.`null`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#layouts/null
  */
trait NullLayoutOptions
  extends StObject
     with LayoutOptions {
  
  var name: `null`
}
object NullLayoutOptions {
  
  @scala.inline
  def apply(): NullLayoutOptions = {
    val __obj = js.Dynamic.literal(name = "null")
    __obj.asInstanceOf[NullLayoutOptions]
  }
  
  @scala.inline
  implicit class NullLayoutOptionsMutableBuilder[Self <: NullLayoutOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: `null`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
