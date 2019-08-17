package typings.chaiDashEnzyme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object chaiDashEnzymeMod {
  import typings.cheerio.Cheerio
  import typings.enzyme.enzymeMod.ReactWrapper
  import typings.enzyme.enzymeMod.ShallowWrapper
  import typings.react.reactMod.Component

  type DebugWrapper = (ShallowWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]]) | Cheerio | (ReactWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]])
}
