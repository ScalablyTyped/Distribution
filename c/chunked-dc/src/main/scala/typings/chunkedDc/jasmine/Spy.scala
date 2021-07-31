package typings.chunkedDc.jasmine

import typings.chunkedDc.anon.Args
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spy extends StObject {
  
  def apply(params: js.Any*): js.Any = js.native
  
  var and: SpyAnd = js.native
  
  var argsForCall: js.Array[js.Any] = js.native
  
  var calls: Calls = js.native
  
  var identity: String = js.native
  
  var mostRecentCall: Args = js.native
  
  var wasCalled: Boolean = js.native
}
