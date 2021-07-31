package typings.ddTrace.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
trait Analyzable extends StObject {
  
  /**
    * Whether to enable App Analytics. Can also be set to a number instead to
    * control the sample rate, or to an key-value pair with span names as keys
    * and booleans or sample rates as values for more granular control.
    */
  var analytics: js.UndefOr[Boolean | Double | (StringDictionary[Boolean | Double])] = js.undefined
}
object Analyzable {
  
  @scala.inline
  def apply(): Analyzable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Analyzable]
  }
  
  @scala.inline
  implicit class AnalyzableMutableBuilder[Self <: Analyzable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalytics(value: Boolean | Double | (StringDictionary[Boolean | Double])): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyticsUndefined: Self = StObject.set(x, "analytics", js.undefined)
  }
}
