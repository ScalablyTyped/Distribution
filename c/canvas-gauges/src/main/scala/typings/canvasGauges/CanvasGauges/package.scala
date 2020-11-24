package typings.canvasGauges

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object CanvasGauges {
  
  type AnimationRule = js.Function1[/* percent */ scala.Double, scala.Double]
  
  type DrawEventCallback = js.Function1[/* percent */ scala.Double, js.Any]
  
  type EndEventCallback = js.Function0[js.Any]
  
  type EventListeners = org.scalablytyped.runtime.StringDictionary[js.Function | js.Array[js.Function]]
  
  type MajorTicks = js.Array[scala.Double | java.lang.String]
  
  type RenderTarget = java.lang.String | typings.std.HTMLElement
}
