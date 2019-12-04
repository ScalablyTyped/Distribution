package typings.bip174

import typings.bip174.srcLibInterfacesMod.KeyValue
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip174/src/lib/converter/shared/checkPubkey", JSImport.Namespace)
@js.native
object srcLibConverterSharedCheckPubkeyMod extends js.Object {
  def makeChecker(pubkeyTypes: js.Array[Double]): js.Function1[/* keyVal */ KeyValue, js.UndefOr[Buffer]] = js.native
}

