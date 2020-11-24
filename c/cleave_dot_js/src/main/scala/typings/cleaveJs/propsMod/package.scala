package typings.cleaveJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object propsMod {
  
  type ChangeEventHandler[T] = typings.react.mod.EventHandler[typings.cleaveJs.propsMod.ChangeEvent[T]]
  
  type InitHandler = js.Function1[/* owner */ typings.react.mod.ReactInstance, scala.Unit]
}
