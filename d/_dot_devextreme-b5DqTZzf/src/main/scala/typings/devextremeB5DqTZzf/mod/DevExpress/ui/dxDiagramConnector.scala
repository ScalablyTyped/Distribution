package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.anon.Y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxDiagramConnector
  extends StObject
     with dxDiagramItem {
  
  /**
    * Gets the connector&apos;s start node identifier.
    */
  var fromId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the connector&apos;s start node key.
    */
  var fromKey: js.UndefOr[Any] = js.undefined
  
  /**
    * The index of a shape connection point where the connector starts.
    */
  var fromPointIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the connector&apos;s key points.
    */
  var points: js.UndefOr[js.Array[Y]] = js.undefined
  
  /**
    * Specifies the connector&apos;s text.
    */
  var texts: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Gets the connector&apos;s end node identifier.
    */
  var toId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the connector&apos;s end node key.
    */
  var toKey: js.UndefOr[Any] = js.undefined
  
  /**
    * The index of the shape connection point where the connector ends.
    */
  var toPointIndex: js.UndefOr[Double] = js.undefined
}
object dxDiagramConnector {
  
  inline def apply(): dxDiagramConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramConnector]
  }
  
  extension [Self <: dxDiagramConnector](x: Self) {
    
    inline def setFromId(value: String): Self = StObject.set(x, "fromId", value.asInstanceOf[js.Any])
    
    inline def setFromIdUndefined: Self = StObject.set(x, "fromId", js.undefined)
    
    inline def setFromKey(value: Any): Self = StObject.set(x, "fromKey", value.asInstanceOf[js.Any])
    
    inline def setFromKeyUndefined: Self = StObject.set(x, "fromKey", js.undefined)
    
    inline def setFromPointIndex(value: Double): Self = StObject.set(x, "fromPointIndex", value.asInstanceOf[js.Any])
    
    inline def setFromPointIndexUndefined: Self = StObject.set(x, "fromPointIndex", js.undefined)
    
    inline def setPoints(value: js.Array[Y]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setPointsVarargs(value: Y*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setTexts(value: js.Array[String]): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    
    inline def setTextsVarargs(value: String*): Self = StObject.set(x, "texts", js.Array(value*))
    
    inline def setToId(value: String): Self = StObject.set(x, "toId", value.asInstanceOf[js.Any])
    
    inline def setToIdUndefined: Self = StObject.set(x, "toId", js.undefined)
    
    inline def setToKey(value: Any): Self = StObject.set(x, "toKey", value.asInstanceOf[js.Any])
    
    inline def setToKeyUndefined: Self = StObject.set(x, "toKey", js.undefined)
    
    inline def setToPointIndex(value: Double): Self = StObject.set(x, "toPointIndex", value.asInstanceOf[js.Any])
    
    inline def setToPointIndexUndefined: Self = StObject.set(x, "toPointIndex", js.undefined)
  }
}
