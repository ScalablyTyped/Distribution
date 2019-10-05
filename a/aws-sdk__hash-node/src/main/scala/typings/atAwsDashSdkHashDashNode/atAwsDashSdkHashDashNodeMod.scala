package typings.atAwsDashSdkHashDashNode

import typings.atAwsDashSdkHashDashNode.atAwsDashSdkHashDashNodeStrings.ascii
import typings.atAwsDashSdkHashDashNode.atAwsDashSdkHashDashNodeStrings.latin1
import typings.atAwsDashSdkHashDashNode.atAwsDashSdkHashDashNodeStrings.utf8
import typings.atAwsDashSdkTypes.buildCryptoMod.SourceData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/hash-node", JSImport.Namespace)
@js.native
object atAwsDashSdkHashDashNodeMod extends js.Object {
  @js.native
  class Hash protected ()
    extends typings.atAwsDashSdkTypes.buildCryptoMod.Hash {
    def this(algorithmIdentifier: String) = this()
    def this(algorithmIdentifier: String, secret: SourceData) = this()
    val hash: js.Any = js.native
    @JSName("update")
    def update_ascii(toHash: SourceData, encoding: ascii): Unit = js.native
    @JSName("update")
    def update_latin1(toHash: SourceData, encoding: latin1): Unit = js.native
    @JSName("update")
    def update_utf8(toHash: SourceData, encoding: utf8): Unit = js.native
  }
  
}

