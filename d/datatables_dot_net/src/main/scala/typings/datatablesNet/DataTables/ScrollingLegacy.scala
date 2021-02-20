package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollingLegacy extends StObject {
  
  var bAutoCss: Boolean = js.native
  
  var bCollapse: Boolean = js.native
  
  var bInfinite: Boolean = js.native
  
  var iBarWidth: Double = js.native
  
  var iLoadGap: Double = js.native
  
  var sX: String = js.native
  
  var sY: String = js.native
}
object ScrollingLegacy {
  
  @scala.inline
  def apply(
    bAutoCss: Boolean,
    bCollapse: Boolean,
    bInfinite: Boolean,
    iBarWidth: Double,
    iLoadGap: Double,
    sX: String,
    sY: String
  ): ScrollingLegacy = {
    val __obj = js.Dynamic.literal(bAutoCss = bAutoCss.asInstanceOf[js.Any], bCollapse = bCollapse.asInstanceOf[js.Any], bInfinite = bInfinite.asInstanceOf[js.Any], iBarWidth = iBarWidth.asInstanceOf[js.Any], iLoadGap = iLoadGap.asInstanceOf[js.Any], sX = sX.asInstanceOf[js.Any], sY = sY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollingLegacy]
  }
  
  @scala.inline
  implicit class ScrollingLegacyMutableBuilder[Self <: ScrollingLegacy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBAutoCss(value: Boolean): Self = StObject.set(x, "bAutoCss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBCollapse(value: Boolean): Self = StObject.set(x, "bCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBInfinite(value: Boolean): Self = StObject.set(x, "bInfinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIBarWidth(value: Double): Self = StObject.set(x, "iBarWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setILoadGap(value: Double): Self = StObject.set(x, "iLoadGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSX(value: String): Self = StObject.set(x, "sX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSY(value: String): Self = StObject.set(x, "sY", value.asInstanceOf[js.Any])
  }
}
