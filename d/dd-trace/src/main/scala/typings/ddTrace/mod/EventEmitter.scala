package typings.ddTrace.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
@js.native
trait EventEmitter extends StObject {
  
  var addListener: js.UndefOr[
    js.Function2[
      /* eventName */ String | js.Symbol, 
      /* listener */ js.Function1[/* repeated */ js.Any, js.Any], 
      js.Any
    ]
  ] = js.native
  
  def emit(eventName: String, args: js.Any*): js.Any = js.native
  def emit(eventName: js.Symbol, args: js.Any*): js.Any = js.native
  
  var off: js.UndefOr[
    js.Function2[
      /* eventName */ String | js.Symbol, 
      /* listener */ js.Function1[/* repeated */ js.Any, js.Any], 
      js.Any
    ]
  ] = js.native
  
  var on: js.UndefOr[
    js.Function2[
      /* eventName */ String | js.Symbol, 
      /* listener */ js.Function1[/* repeated */ js.Any, js.Any], 
      js.Any
    ]
  ] = js.native
  
  var removeListener: js.UndefOr[
    js.Function2[
      /* eventName */ String | js.Symbol, 
      /* listener */ js.Function1[/* repeated */ js.Any, js.Any], 
      js.Any
    ]
  ] = js.native
}
