package typings.blueprintjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object reactUtilsMod {
  
  type LifecycleCompatPolyfill[P, T /* <: typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState] */] = js.Function1[
    /* Comp */ T, 
    T with typings.blueprintjsCore.blueprintjsCoreStrings.LifecycleCompatPolyfill with org.scalablytyped.runtime.TopLevel[T]
  ]
}
