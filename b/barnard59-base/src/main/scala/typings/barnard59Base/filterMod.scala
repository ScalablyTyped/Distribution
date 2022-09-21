package typings.barnard59Base

import typings.barnard59Core.streamObjectMod.Context
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterMod {
  
  @JSImport("barnard59-base/filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](func: Filter[T]): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(func.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  type Filter[T] = js.ThisFunction2[
    /* this */ Context, 
    /* chunk */ T, 
    /* encoding */ String, 
    Boolean | js.Promise[Boolean]
  ]
}
