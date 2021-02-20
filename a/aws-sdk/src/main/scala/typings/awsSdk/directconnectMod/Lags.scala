package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lags extends StObject {
  
  /**
    * The LAGs.
    */
  var lags: js.UndefOr[LagList] = js.native
}
object Lags {
  
  @scala.inline
  def apply(): Lags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lags]
  }
  
  @scala.inline
  implicit class LagsMutableBuilder[Self <: Lags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLags(value: LagList): Self = StObject.set(x, "lags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLagsUndefined: Self = StObject.set(x, "lags", js.undefined)
    
    @scala.inline
    def setLagsVarargs(value: Lag*): Self = StObject.set(x, "lags", js.Array(value :_*))
  }
}
