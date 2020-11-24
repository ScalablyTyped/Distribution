package typings.createReactClass

import typings.react.mod.ClassicComponentClass
import typings.react.mod.ComponentSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("create-react-class", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply[P, S](spec: ComponentSpec[P, S]): ClassicComponentClass[P] = js.native
}
