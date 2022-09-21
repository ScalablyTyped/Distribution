package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxDiagramBeforeChangeConnectorTextArgs extends StObject {
  
  /**
    * The processed connector.
    */
  var connector: js.UndefOr[dxDiagramConnector] = js.undefined
  
  /**
    * The index of the processed text in the connector&apos;s texts collection.
    */
  var index: js.UndefOr[Double] = js.undefined
}
object dxDiagramBeforeChangeConnectorTextArgs {
  
  inline def apply(): dxDiagramBeforeChangeConnectorTextArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramBeforeChangeConnectorTextArgs]
  }
  
  extension [Self <: dxDiagramBeforeChangeConnectorTextArgs](x: Self) {
    
    inline def setConnector(value: dxDiagramConnector): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
    
    inline def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
