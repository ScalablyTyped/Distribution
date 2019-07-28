package typings.chaiDashEnzyme

import typings.cheerio.Cheerio
import typings.enzyme.enzymeMod.ReactWrapper
import typings.enzyme.enzymeMod.ShallowWrapper
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object chaiDashEnzymeMod {
  type DebugWrapper = (ShallowWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]]) | Cheerio | (ReactWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]])
}
