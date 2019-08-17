package typings.chaiDashEnzyme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ChaiNs {
  import org.scalablytyped.runtime.StringDictionary
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState
  import typings.react.reactMod.StatelessComponent

  type EnzymeSelector = String | StatelessComponent[js.Any] | (ComponentClass[js.Any, ComponentState]) | StringDictionary[js.Any]
  type Match = js.Function1[/* selector */ EnzymeSelector, Assertion]
}
