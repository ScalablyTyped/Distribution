package typings.cadesplugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CADESCommon {
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {readonly [ K in keyof T ]: T[K] extends std.Function? cadesplugin.CADES_Common.PromisifiedFunction<T[K]> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<T[K]>>}
    }}}
    */
  @js.native
  trait Async[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    // tslint:disable-line ban-types
  T extends (args : infer A): infer U ? (args : {[ K in keyof A ]: cadesplugin.CADES_Common.Unpacked<A[K]>}): std.Promise<cadesplugin.CADES_Common.Unpacked<U>> : T
    }}}
    */
  @js.native
  trait PromisifiedFunction[T /* <: js.Function */] extends StObject
  
  // Extracts the type if wrapped by a Promise
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Promise<infer U> ? U : T extends cadesplugin.CAPICOM.Certificate ? cadesplugin.CAPICOM.CertificateAsync : T extends cadesplugin.CAPICOM.Certificates ? cadesplugin.CAPICOM.CertificatesAsync : T extends cadesplugin.CAdESCOM.CPSigner ? cadesplugin.CAdESCOM.CPSignerAsync : T extends cadesplugin.CAdESCOM.CPHashedData ? cadesplugin.CAdESCOM.CPHashedDataAsync : T extends cadesplugin.CAdESCOM.Version ? cadesplugin.CAdESCOM.VersionAsync : T extends cadesplugin.CAPICOM.OID ? cadesplugin.CAPICOM.OIDAsync : T extends cadesplugin.CAPICOM.EncodedData ? cadesplugin.CAPICOM.EncodedDataAsync : T extends cadesplugin.CAPICOM.PublicKey ? cadesplugin.CAPICOM.PublicKeyAsync : T extends cadesplugin.CAPICOM.PrivateKey ? cadesplugin.CAPICOM.PrivateKeyAsync : T extends cadesplugin.CAPICOM.ExtendedKeyUsage ? cadesplugin.CAPICOM.ExtendedKeyUsageAsync : T extends cadesplugin.CAPICOM.EKUs ? cadesplugin.CAPICOM.EKUsAsync : T extends cadesplugin.CAPICOM.EKU ? cadesplugin.CAPICOM.EKUAsync : T extends cadesplugin.CAdESCOM.CPAttribute ? cadesplugin.CAdESCOM.CPAttributeAsync : T extends cadesplugin.CAdESCOM.CPAuthenticatedAttributes2 ? cadesplugin.CAdESCOM.CPAuthenticatedAttributes2Async : T
    }}}
    */
  @js.native
  trait Unpacked[T] extends StObject
  
  type ValuesOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  
  type VarDate = js.Object
}
