package typings.badgin

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deepMergeMod {
  
  @JSImport("badgin/build/deepMerge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(target: Record[String, js.Any], source: Record[String, js.Any]): Record[String, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Record[String, js.Any]]
}
