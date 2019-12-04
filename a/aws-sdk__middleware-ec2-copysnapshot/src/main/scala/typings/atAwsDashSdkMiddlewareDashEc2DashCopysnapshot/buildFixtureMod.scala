package typings.atAwsDashSdkMiddlewareDashEc2DashCopysnapshot

import typings.atAwsDashSdkTypes.buildCryptoMod.SourceData
import typings.atAwsDashSdkTypes.buildMiddlewareMod.HandlerExecutionContext
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/middleware-ec2-copysnapshot/build/fixture", JSImport.Namespace)
@js.native
object buildFixtureMod extends js.Object {
  @js.native
  class MockSha256 () extends js.Object {
    def this(secret: String) = this()
    def this(secret: ArrayBuffer) = this()
    def this(secret: ArrayBufferView) = this()
    def digest(): js.Promise[Uint8Array] = js.native
    def update(): Unit = js.native
    def update(data: SourceData): Unit = js.native
  }
  
  val context: HandlerExecutionContext = js.native
  val fromUtf8: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Mock<{}> */ js.Any = js.native
  val nextHandler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Mock<Promise<void>> */ js.Any = js.native
  val toBase64: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Mock<{}> */ js.Any = js.native
  def credentials(): js.Promise[Anon_AccessKeyId] = js.native
  def endpoint(): js.Promise[Anon_Hostname] = js.native
  def region(): js.Promise[String] = js.native
}

