package typings.coinbase.mod

import typings.coinbase.anon.Epoch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Time extends StObject {
  
  var data: Epoch = js.native
}
object Time {
  
  @scala.inline
  def apply(data: Epoch): Time = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
  
  @scala.inline
  implicit class TimeMutableBuilder[Self <: Time] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Epoch): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
