package typings
package chaiDashEnzymeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ChaiNs {
  type EnzymeSelector = java.lang.String | reactLib.reactMod.ReactNs.StatelessComponent[js.Any] | (reactLib.reactMod.ReactNs.ComponentClass[js.Any, reactLib.reactMod.ReactNs.ComponentState]) | ScalablyTyped.runtime.StringDictionary[js.Any]
  type Match = js.Function1[/* selector */ EnzymeSelector, Assertion]
}
