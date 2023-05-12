package typings.barnard59Base

import typings.barnard59Core.libStreamObjectMod.Context
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapMod {
  
  @JSImport("barnard59-base/map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[From, To](// eslint-disable-next-line no-unnecessary-generics
  cb: Callback[From, To]): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(cb.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  type Callback[From, To] = js.ThisFunction2[/* this */ Context, /* chunk */ From, /* encoding */ String, js.Promise[To] | To]
}
