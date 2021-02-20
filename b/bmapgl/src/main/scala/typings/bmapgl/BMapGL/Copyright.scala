package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Copyright extends StObject {
  
  var bounds: js.UndefOr[Bounds] = js.native
  
  var content: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[Double] = js.native
}
object Copyright {
  
  @scala.inline
  def apply(): Copyright = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Copyright]
  }
  
  @scala.inline
  implicit class CopyrightMutableBuilder[Self <: Copyright] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
