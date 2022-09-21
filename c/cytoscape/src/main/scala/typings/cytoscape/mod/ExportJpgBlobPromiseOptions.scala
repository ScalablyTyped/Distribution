package typings.cytoscape.mod

import typings.cytoscape.cytoscapeStrings.`blob-promise`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cytoscape.mod.ExportOptions because Already inherited
- typings.cytoscape.mod.ExportBlobPromiseOptions because var conflicts: bg, full, maxHeight, maxWidth, scale. Inlined output */ trait ExportJpgBlobPromiseOptions
  extends StObject
     with ExportJpgOptions {
  
  /**
    * output Whether the output should be 'base64uri' (default), 'base64', 'blob', or 'blob-promise'.
    */
  var output: js.UndefOr[`blob-promise`] = js.undefined
}
object ExportJpgBlobPromiseOptions {
  
  inline def apply(): ExportJpgBlobPromiseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportJpgBlobPromiseOptions]
  }
  
  extension [Self <: ExportJpgBlobPromiseOptions](x: Self) {
    
    inline def setOutput(value: `blob-promise`): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
  }
}
