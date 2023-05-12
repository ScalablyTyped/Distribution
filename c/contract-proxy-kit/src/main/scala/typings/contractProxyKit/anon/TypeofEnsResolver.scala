package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable3
import typings.ethers.mod.ethers.EnsResolver
import typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider
import typings.ethers.typesProvidersProviderMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofEnsResolver
  extends StObject
     with Instantiable3[/* provider */ AbstractProvider, /* address */ String, /* name */ String, EnsResolver] {
  
  /**
    *  Resolve to the ENS resolver for %%name%% using %%provider%% or
    *  ``null`` if unconfigured.
    */
  def fromName(provider: AbstractProvider, name: String): js.Promise[Null | typings.ethers.typesProvidersEnsResolverMod.EnsResolver] = js.native
  
  def getEnsAddress(provider: Provider): js.Promise[String] = js.native
}
