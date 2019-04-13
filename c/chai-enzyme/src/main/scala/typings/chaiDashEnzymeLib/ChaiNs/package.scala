package typings
package chaiDashEnzymeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ChaiNs {
  type EnzymeSelector = java.lang.String | reactLib.reactMod.StatelessComponent[js.Any] | (reactLib.reactMod.ComponentClass[js.Any, reactLib.reactMod.ComponentState]) | org.scalablytyped.runtime.StringDictionary[js.Any]
  type Match = js.Function1[/* selector */ EnzymeSelector, Assertion]
}
