package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrokeOpts extends StObject {
  
  var cap: js.UndefOr[StrokeCap] = js.native
  
  var join: js.UndefOr[StrokeJoin] = js.native
  
  var miter_limit: js.UndefOr[Double] = js.native
  
  /**
    * if > 1, increase precision, else if (0 < resScale < 1) reduce precision to
    * favor speed and size
    */
  var precision: js.UndefOr[Double] = js.native
  
  /** The width of the stroked lines. */
  var width: js.UndefOr[Double] = js.native
}
object StrokeOpts {
  
  @scala.inline
  def apply(): StrokeOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrokeOpts]
  }
  
  @scala.inline
  implicit class StrokeOptsMutableBuilder[Self <: StrokeOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCap(value: StrokeCap): Self = StObject.set(x, "cap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapUndefined: Self = StObject.set(x, "cap", js.undefined)
    
    @scala.inline
    def setJoin(value: StrokeJoin): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
    
    @scala.inline
    def setMiter_limit(value: Double): Self = StObject.set(x, "miter_limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiter_limitUndefined: Self = StObject.set(x, "miter_limit", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
