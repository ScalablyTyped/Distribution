package typings.chaiEnzyme

import typings.chai.Chai_.ChaiPlugin
import typings.cheerio.Cheerio_
import typings.enzyme.mod.ReactWrapper
import typings.enzyme.mod.ShallowWrapper
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chai-enzyme", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(): ChaiPlugin = js.native
  def apply(wrapper: js.Function1[/* debugWrapper */ DebugWrapper, String]): ChaiPlugin = js.native
  type DebugWrapper = (ShallowWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]]) | Cheerio_ | (ReactWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]])
}

