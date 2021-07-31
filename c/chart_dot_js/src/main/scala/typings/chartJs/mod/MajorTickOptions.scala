package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MajorTickOptions
  extends StObject
     with NestedTickOptions {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object MajorTickOptions {
  
  @scala.inline
  def apply(): MajorTickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MajorTickOptions]
  }
  
  @scala.inline
  implicit class MajorTickOptionsMutableBuilder[Self <: MajorTickOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
