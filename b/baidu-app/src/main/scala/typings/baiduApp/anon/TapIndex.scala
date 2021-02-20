package typings.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TapIndex extends StObject {
  
  /**
    * 用户点击的按钮，从上到下的顺序，从0开始
    */
  var tapIndex: Double = js.native
}
object TapIndex {
  
  @scala.inline
  def apply(tapIndex: Double): TapIndex = {
    val __obj = js.Dynamic.literal(tapIndex = tapIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapIndex]
  }
  
  @scala.inline
  implicit class TapIndexMutableBuilder[Self <: TapIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTapIndex(value: Double): Self = StObject.set(x, "tapIndex", value.asInstanceOf[js.Any])
  }
}
