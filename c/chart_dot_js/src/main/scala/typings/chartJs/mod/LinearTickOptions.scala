package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinearTickOptions extends TickOptions {
  
  var precision: js.UndefOr[Double] = js.native
}
object LinearTickOptions {
  
  @scala.inline
  def apply(): LinearTickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearTickOptions]
  }
  
  @scala.inline
  implicit class LinearTickOptionsMutableBuilder[Self <: LinearTickOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
  }
}
