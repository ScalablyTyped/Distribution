package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StrokeOpts extends StObject {
  
  var cap: js.UndefOr[StrokeCap] = js.undefined
  
  var join: js.UndefOr[StrokeJoin] = js.undefined
  
  var miter_limit: js.UndefOr[Double] = js.undefined
  
  /**
    * if > 1, increase precision, else if (0 < resScale < 1) reduce precision to
    * favor speed and size
    */
  var precision: js.UndefOr[Double] = js.undefined
  
  /** The width of the stroked lines. */
  var width: js.UndefOr[Double] = js.undefined
}
object StrokeOpts {
  
  inline def apply(): StrokeOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrokeOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StrokeOpts] (val x: Self) extends AnyVal {
    
    inline def setCap(value: StrokeCap): Self = StObject.set(x, "cap", value.asInstanceOf[js.Any])
    
    inline def setCapUndefined: Self = StObject.set(x, "cap", js.undefined)
    
    inline def setJoin(value: StrokeJoin): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
    
    inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
    
    inline def setMiter_limit(value: Double): Self = StObject.set(x, "miter_limit", value.asInstanceOf[js.Any])
    
    inline def setMiter_limitUndefined: Self = StObject.set(x, "miter_limit", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
