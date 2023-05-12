package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable1
import typings.ethers.mod.ethers.FetchRequest
import typings.ethers.typesUtilsFetchMod.FetchGatewayFunc
import typings.ethers.typesUtilsFetchMod.FetchGetUrlFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFetchRequest
  extends StObject
     with Instantiable1[/* url */ String, FetchRequest] {
  
  /**
    *  Creates a function that can "fetch" data URIs.
    *
    *  Note that this is automatically done internally to support
    *  data URIs, so it is not necessary to register it.
    *
    *  This is not generally something that is needed, but may
    *  be useful in a wrapper to perfom custom data URI functionality.
    */
  def createDataGateway(): FetchGatewayFunc = js.native
  
  /**
    *  Creates a function that will fetch IPFS (unvalidated) from
    *  a custom gateway baseUrl.
    *
    *  The default IPFS gateway used internally is
    *  ``"https:/\/gateway.ipfs.io/ipfs/"``.
    */
  def createIpfsGatewayFunc(baseUrl: String): FetchGatewayFunc = js.native
  
  /**
    *  Get the current Gateway function for %%scheme%%.
    */
  def getGateway(scheme: String): Null | FetchGatewayFunc = js.native
  
  /**
    *  Locks all static configuration for gateways and FetchGetUrlFunc
    *  registration.
    */
  def lockConfig(): Unit = js.native
  
  /**
    *  Use the %%func%% when fetching URIs using %%scheme%%.
    *
    *  This method affects all requests globally.
    *
    *  If [[lockConfig]] has been called, no change is made and this
    *  throws.
    */
  def registerGateway(scheme: String, func: FetchGatewayFunc): Unit = js.native
  
  /**
    *  Use %%getUrl%% when fetching URIs over HTTP and HTTPS requests.
    *
    *  This method affects all requests globally.
    *
    *  If [[lockConfig]] has been called, no change is made and this
    *  throws.
    */
  def registerGetUrl(getUrl: FetchGetUrlFunc): Unit = js.native
}
