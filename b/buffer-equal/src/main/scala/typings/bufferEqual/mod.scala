package typings.bufferEqual

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @return Whether the two buffers are equal.
    *
    * @example
    * import bufferEqual = require('buffer-equal');
    *
    * console.dir(bufferEqual(
    *     Buffer.from([253,254,255]),
    *     Buffer.from([253,254,255])
    * ));
    * // -> true
    *
    * console.dir(bufferEqual(
    *     Buffer.from('abc'),
    *     Buffer.from('abcd')
    * ));
    * // -> false
    */
  inline def apply(a: Buffer, b: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("buffer-equal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
