package typings.chalkAnimation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AnimationFn = js.Function2[
    /* text */ java.lang.String, 
    /* speed */ js.UndefOr[scala.Double], 
    typings.chalkAnimation.mod.Animation
  ]
}
