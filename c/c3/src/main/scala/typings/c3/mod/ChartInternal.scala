package typings.c3.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartInternal
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  /** Access the external Chart API. */
  var api: ChartAPI
}
object ChartInternal {
  
  @scala.inline
  def apply(api: ChartAPI): ChartInternal = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartInternal]
  }
  
  @scala.inline
  implicit class ChartInternalMutableBuilder[Self <: ChartInternal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi(value: ChartAPI): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
  }
}
