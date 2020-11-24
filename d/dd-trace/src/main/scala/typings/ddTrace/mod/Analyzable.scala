package typings.ddTrace.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
@js.native
trait Analyzable extends js.Object {
  
  /**
    * Whether to enable App Analytics. Can also be set to a number instead to
    * control the sample rate, or to an key-value pair with span names as keys
    * and booleans or sample rates as values for more granular control.
    */
  var analytics: js.UndefOr[Boolean | Double | (StringDictionary[Boolean | Double])] = js.native
}
object Analyzable {
  
  @scala.inline
  def apply(): Analyzable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Analyzable]
  }
  
  @scala.inline
  implicit class AnalyzableOps[Self <: Analyzable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnalytics(value: Boolean | Double | (StringDictionary[Boolean | Double])): Self = this.set("analytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalytics: Self = this.set("analytics", js.undefined)
  }
}
