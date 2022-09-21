package typings.cadesplugin.CAPICOM

import org.scalablytyped.runtime.TopLevel
import typings.cadesplugin.CADESCommon.PromisifiedFunction
import typings.cadesplugin.CADESCommon.Unpacked
import typings.cadesplugin.CADESCommon._Unpacked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAPICOM.EKU> */
trait EKUAsync
  extends StObject
     with _Unpacked[Any] {
  
  val Name: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
  
  val OID: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
}
object EKUAsync {
  
  inline def apply(
    Name: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
    OID: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
  ): EKUAsync = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], OID = OID.asInstanceOf[js.Any])
    __obj.asInstanceOf[EKUAsync]
  }
  
  extension [Self <: EKUAsync](x: Self) {
    
    inline def setName(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "Name", js.Any.fromFunction1(value))
    
    inline def setOID(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = StObject.set(x, "OID", value.asInstanceOf[js.Any])
    
    inline def setOIDFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "OID", js.Any.fromFunction1(value))
  }
}
