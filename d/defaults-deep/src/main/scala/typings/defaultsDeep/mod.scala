package typings.defaultsDeep

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(objs: Obj*): Obj = ^.asInstanceOf[js.Dynamic].apply(objs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Obj]
  
  @JSImport("defaults-deep", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Obj = StringDictionary[Any]
}
