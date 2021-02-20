package typings.bip174

import typings.bip174.interfacesMod.KeyValue
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkPubkeyMod {
  
  @JSImport("bip174/src/lib/converter/shared/checkPubkey", "makeChecker")
  @js.native
  def makeChecker(pubkeyTypes: js.Array[Double]): js.Function1[/* keyVal */ KeyValue, js.UndefOr[Buffer]] = js.native
}
