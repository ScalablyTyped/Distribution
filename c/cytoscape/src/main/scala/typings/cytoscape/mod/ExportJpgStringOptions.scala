package typings.cytoscape.mod

import typings.cytoscape.cytoscapeStrings.base64
import typings.cytoscape.cytoscapeStrings.base64uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cytoscape.mod.ExportOptions because Already inherited
- typings.cytoscape.mod.ExportStringOptions because var conflicts: bg, full, maxHeight, maxWidth, scale. Inlined output */ trait ExportJpgStringOptions
  extends StObject
     with ExportJpgOptions {
  
  /**
    * output Whether the output should be 'base64uri' (default), 'base64', or 'blob'.
    */
  var output: js.UndefOr[base64uri | base64] = js.undefined
}
object ExportJpgStringOptions {
  
  inline def apply(): ExportJpgStringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportJpgStringOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportJpgStringOptions] (val x: Self) extends AnyVal {
    
    inline def setOutput(value: base64uri | base64): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
  }
}
