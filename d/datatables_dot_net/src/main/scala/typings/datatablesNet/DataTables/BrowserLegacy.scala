package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserLegacy extends StObject {
  
  var bBounding: Boolean = js.native
  
  var bScrollOversize: Boolean = js.native
  
  var bScrollbarLeft: Boolean = js.native
  
  var barWidth: Double = js.native
}
object BrowserLegacy {
  
  @scala.inline
  def apply(bBounding: Boolean, bScrollOversize: Boolean, bScrollbarLeft: Boolean, barWidth: Double): BrowserLegacy = {
    val __obj = js.Dynamic.literal(bBounding = bBounding.asInstanceOf[js.Any], bScrollOversize = bScrollOversize.asInstanceOf[js.Any], bScrollbarLeft = bScrollbarLeft.asInstanceOf[js.Any], barWidth = barWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserLegacy]
  }
  
  @scala.inline
  implicit class BrowserLegacyMutableBuilder[Self <: BrowserLegacy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBBounding(value: Boolean): Self = StObject.set(x, "bBounding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBScrollOversize(value: Boolean): Self = StObject.set(x, "bScrollOversize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBScrollbarLeft(value: Boolean): Self = StObject.set(x, "bScrollbarLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarWidth(value: Double): Self = StObject.set(x, "barWidth", value.asInstanceOf[js.Any])
  }
}
