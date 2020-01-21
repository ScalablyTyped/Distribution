package typings.bang88ReactNativeDrawerLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DrawerLayoutCloseEventHandler = js.Function0[scala.Unit]
  type DrawerLayoutOpenEventHandler = js.Function0[scala.Unit]
  type DrawerLayoutSlideEventHandler = js.Function1[
    /* event */ typings.bang88ReactNativeDrawerLayout.mod.DrawerLayoutSlideEvent, 
    scala.Unit
  ]
  type DrawerLayoutStateChangeEventHandler = js.Function1[/* state */ java.lang.String, scala.Unit]
}
