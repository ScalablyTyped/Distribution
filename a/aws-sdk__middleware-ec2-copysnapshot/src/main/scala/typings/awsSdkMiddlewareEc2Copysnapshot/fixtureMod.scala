package typings.awsSdkMiddlewareEc2Copysnapshot

import typings.awsSdkMiddlewareEc2Copysnapshot.anon.AccessKeyId
import typings.awsSdkMiddlewareEc2Copysnapshot.anon.Hostname
import typings.awsSdkTypes.cryptoMod.SourceData
import typings.awsSdkTypes.middlewareMod.HandlerExecutionContext
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fixtureMod {
  
  @JSImport("@aws-sdk/middleware-ec2-copysnapshot/build/fixture", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/middleware-ec2-copysnapshot/build/fixture", "MockSha256")
  @js.native
  class MockSha256 () extends StObject {
    def this(secret: String) = this()
    def this(secret: ArrayBuffer) = this()
    def this(secret: ArrayBufferView) = this()
    
    def digest(): js.Promise[Uint8Array] = js.native
    
    def update(): Unit = js.native
    def update(data: SourceData): Unit = js.native
  }
  
  @JSImport("@aws-sdk/middleware-ec2-copysnapshot/build/fixture", "context")
  @js.native
  val context: HandlerExecutionContext = js.native
  
  inline def credentials(): js.Promise[AccessKeyId] = ^.asInstanceOf[js.Dynamic].applyDynamic("credentials")().asInstanceOf[js.Promise[AccessKeyId]]
  
  inline def endpoint(): js.Promise[Hostname] = ^.asInstanceOf[js.Dynamic].applyDynamic("endpoint")().asInstanceOf[js.Promise[Hostname]]
  
  @JSImport("@aws-sdk/middleware-ec2-copysnapshot/build/fixture", "fromUtf8")
  @js.native
  val fromUtf8: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Mock<{}> */ js.Any = js.native
  
  @JSImport("@aws-sdk/middleware-ec2-copysnapshot/build/fixture", "nextHandler")
  @js.native
  val nextHandler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Mock<Promise<void>> */ js.Any = js.native
  
  inline def region(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("region")().asInstanceOf[js.Promise[String]]
  
  @JSImport("@aws-sdk/middleware-ec2-copysnapshot/build/fixture", "toBase64")
  @js.native
  val toBase64: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Mock<{}> */ js.Any = js.native
}
