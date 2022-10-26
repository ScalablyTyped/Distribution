package typings.chromeRemoteInterface.mod

import typings.chromeRemoteInterface.chromeRemoteInterfaceBooleans.`false`
import typings.chromeRemoteInterface.chromeRemoteInterfaceBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendCallback[T /* <: /* keyof devtools-protocol.devtools-protocol/types/protocol-mapping.ProtocolMapping.Commands */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 536, starting with typings.chromeRemoteInterface.chromeRemoteInterfaceStrings.ConsoleDotclearMessages, typings.chromeRemoteInterface.chromeRemoteInterfaceStrings.ConsoleDotdisable, typings.chromeRemoteInterface.chromeRemoteInterfaceStrings.ConsoleDotenable */ Any */] extends StObject {
  
  def apply(error: js.Error, response: Unit): Unit = js.native
  def apply(
    error: `false`,
    response: /* import warning: importer.ImportType#apply Failed type conversion: devtools-protocol.devtools-protocol/types/protocol-mapping.ProtocolMapping.Commands[T]['returnType'] */ js.Any
  ): Unit = js.native
  def apply(error: `true`, response: SendError): Unit = js.native
}
