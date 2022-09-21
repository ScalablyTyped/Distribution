package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxSankeyConnectionInfoObject extends StObject {
  
  /**
    * The title of the link&apos;s source node.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * The title of the link&apos;s target node.
    */
  var target: js.UndefOr[String] = js.undefined
  
  /**
    * The link&apos;s weight.
    */
  var weight: js.UndefOr[Double] = js.undefined
}
object dxSankeyConnectionInfoObject {
  
  inline def apply(): dxSankeyConnectionInfoObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSankeyConnectionInfoObject]
  }
  
  extension [Self <: dxSankeyConnectionInfoObject](x: Self) {
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
