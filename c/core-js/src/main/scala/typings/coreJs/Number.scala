package typings.coreJs

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #############################################################################################
// Number - https://github.com/zloirock/core-js/#number
// Modules: core.number.iterator
// #############################################################################################
@js.native
trait Number extends StObject {
  
  /**
    * Non-standard.
    */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Double]] = js.native
}
