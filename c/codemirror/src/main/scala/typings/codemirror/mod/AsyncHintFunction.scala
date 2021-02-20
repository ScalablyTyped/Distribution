package typings.codemirror.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncHintFunction extends StObject {
  
  def apply(cm: Editor, callback: js.Function1[/* hints */ Hints, _]): js.Any = js.native
  
  var async: js.UndefOr[Boolean] = js.native
}
