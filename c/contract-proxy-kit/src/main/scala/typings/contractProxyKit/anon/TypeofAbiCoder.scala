package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable0
import typings.ethers.anon.Data
import typings.ethers.mod.ethers.AbiCoder
import typings.ethers.typesUtilsDataMod.BytesLike
import typings.ethers.typesUtilsErrorsMod.CallExceptionAction
import typings.ethers.typesUtilsErrorsMod.CallExceptionError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAbiCoder
  extends StObject
     with Instantiable0[AbiCoder] {
  
  /**
    *  Returns the shared singleton instance of a default [[AbiCoder]].
    *
    *  On the first call, the instance is created internally.
    */
  def defaultAbiCoder(): typings.ethers.typesAbiAbiCoderMod.AbiCoder = js.native
  
  /**
    *  Returns an ethers-compatible [[CallExceptionError]] Error for the given
    *  result %%data%% for the [[CallExceptionAction]] %%action%% against
    *  the Transaction %%tx%%.
    */
  def getBuiltinCallException(action: CallExceptionAction, tx: Data): CallExceptionError = js.native
  def getBuiltinCallException(action: CallExceptionAction, tx: Data, data: BytesLike): CallExceptionError = js.native
}
