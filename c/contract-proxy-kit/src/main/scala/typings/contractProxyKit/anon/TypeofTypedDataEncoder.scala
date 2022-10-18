package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable1
import typings.ethers.mod.ethers.utils.TypedDataEncoder
import typings.ethersprojectAbstractSigner.mod.TypedDataDomain
import typings.ethersprojectAbstractSigner.mod.TypedDataField
import typings.ethersprojectHash.anon.Domain
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTypedDataEncoder
  extends StObject
     with Instantiable1[/* types */ Record[String, js.Array[TypedDataField]], TypedDataEncoder] {
  
  def encode(
    domain: TypedDataDomain,
    types: Record[String, js.Array[TypedDataField]],
    value: Record[String, Any]
  ): String = js.native
  
  def from(types: Record[String, js.Array[TypedDataField]]): typings.ethersprojectHash.libTypedDataMod.TypedDataEncoder = js.native
  
  def getPayload(
    domain: TypedDataDomain,
    types: Record[String, js.Array[TypedDataField]],
    value: Record[String, Any]
  ): Any = js.native
  
  def getPrimaryType(types: Record[String, js.Array[TypedDataField]]): String = js.native
  
  def hash(
    domain: TypedDataDomain,
    types: Record[String, js.Array[TypedDataField]],
    value: Record[String, Any]
  ): String = js.native
  
  def hashDomain(domain: TypedDataDomain): String = js.native
  
  def hashStruct(name: String, types: Record[String, js.Array[TypedDataField]], value: Record[String, Any]): String = js.native
  
  def resolveNames(
    domain: TypedDataDomain,
    types: Record[String, js.Array[TypedDataField]],
    value: Record[String, Any],
    resolveName: js.Function1[/* name */ String, js.Promise[String]]
  ): js.Promise[Domain] = js.native
}
