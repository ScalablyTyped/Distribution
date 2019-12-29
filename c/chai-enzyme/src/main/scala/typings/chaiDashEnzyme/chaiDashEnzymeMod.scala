package typings.chaiDashEnzyme

import typings.chai.Chai.ChaiPlugin
import typings.cheerio.Cheerio
import typings.enzyme.enzymeMod.ReactWrapper
import typings.enzyme.enzymeMod.ShallowWrapper
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chai-enzyme", JSImport.Namespace)
@js.native
object chaiDashEnzymeMod extends js.Object {
  def apply(): ChaiPlugin = js.native
  def apply(wrapper: js.Function1[/* debugWrapper */ DebugWrapper, String]): ChaiPlugin = js.native
  type DebugWrapper = (ShallowWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]]) | Cheerio | (ReactWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]])
}

