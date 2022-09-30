package typings.blacklist

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(src: Any, args: String*): Any = ^.asInstanceOf[js.Dynamic].apply(scala.List(src.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  inline def apply(src: Any, spec: StringDictionary[Boolean]): Any = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("blacklist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
