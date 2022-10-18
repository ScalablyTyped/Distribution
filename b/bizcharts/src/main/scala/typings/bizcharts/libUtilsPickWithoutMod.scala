package typings.bizcharts

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsPickWithoutMod {
  
  @JSImport("bizcharts/lib/utils/pickWithout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(obj: Record[String, Any], keys: js.Array[String | js.RegExp]): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(obj.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
