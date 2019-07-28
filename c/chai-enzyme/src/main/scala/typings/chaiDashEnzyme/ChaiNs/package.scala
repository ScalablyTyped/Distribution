package typings.chaiDashEnzyme

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ChaiNs {
  type EnzymeSelector = String | StatelessComponent[js.Any] | (ComponentClass[js.Any, ComponentState]) | StringDictionary[js.Any]
  type Match = js.Function1[/* selector */ EnzymeSelector, Assertion]
}
