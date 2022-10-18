package typings.babylonjs

import org.scalablytyped.runtime.NumberDictionary
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a list of XRInputSources. It is used in favor of a frozen array type when the contents
  * of the list are expected to change over time, such as with the XRSession inputSources attribute.
  * ref: https://immersive-web.github.io/webxr/#xrinputsourcearray-interface
  */
@js.native
trait XRInputSourceArray
  extends StObject
     with /* n */ NumberDictionary[XRInputSource] {
  
  def entries(): IterableIterator[js.Tuple2[Double, XRInputSource]] = js.native
  
  def forEach(
    callbackfn: js.Function3[
      /* value */ XRInputSource, 
      /* index */ Double, 
      /* array */ js.Array[XRInputSource], 
      Unit
    ]
  ): Unit = js.native
  def forEach(
    callbackfn: js.Function3[
      /* value */ XRInputSource, 
      /* index */ Double, 
      /* array */ js.Array[XRInputSource], 
      Unit
    ],
    thisArg: Any
  ): Unit = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[XRInputSource]] = js.native
  
  def keys(): IterableIterator[Double] = js.native
  
  var length: Double = js.native
  
  def values(): IterableIterator[XRInputSource] = js.native
}
