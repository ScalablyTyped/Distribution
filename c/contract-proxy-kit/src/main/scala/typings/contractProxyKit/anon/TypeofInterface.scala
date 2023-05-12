package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable1
import typings.ethers.mod.ethers.Interface
import typings.ethers.typesAbiInterfaceMod.InterfaceAbi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofInterface
  extends StObject
     with Instantiable1[/* fragments */ InterfaceAbi, Interface] {
  
  def from(value: typings.ethers.typesAbiInterfaceMod.Interface): typings.ethers.typesAbiInterfaceMod.Interface = js.native
  /**
    *  Creates a new [[Interface]] from the ABI %%value%%.
    *
    *  The %%value%% may be provided as an existing [[Interface]] object,
    *  a JSON-encoded ABI or any Human-Readable ABI format.
    */
  def from(value: InterfaceAbi): typings.ethers.typesAbiInterfaceMod.Interface = js.native
}
