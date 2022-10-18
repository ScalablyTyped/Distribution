package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable1
import typings.ethers.mod.ethers.utils.SigningKey
import typings.ethersprojectBytes.mod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSigningKey
  extends StObject
     with Instantiable1[/* privateKey */ BytesLike, SigningKey] {
  
  def isSigningKey(value: Any): /* is @ethersproject/signing-key.@ethersproject/signing-key.SigningKey */ Boolean = js.native
}
