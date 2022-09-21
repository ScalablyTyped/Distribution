package typings.cadesplugin.CAPICOM

import org.scalablytyped.runtime.TopLevel
import typings.cadesplugin.CADESCommon.PromisifiedFunction
import typings.cadesplugin.CADESCommon.Unpacked
import typings.cadesplugin.CADESCommon.ValuesOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAPICOM.Store> */
trait StoreAsync extends StObject {
  
  val Certificates: (// tslint:disable-line ban-types
  js.Promise[Unpacked[typings.cadesplugin.CAPICOM.Certificates]]) | PromisifiedFunction[typings.cadesplugin.CAPICOM.Certificates]
  
  val Close: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[Unit]]]) | PromisifiedFunction[js.Function0[Unit]]
  
  val Delete: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[Boolean]]]) | PromisifiedFunction[js.Function0[Boolean]]
  
  val Import: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function1[/* encodedStore */ String, Unit]]]) | (PromisifiedFunction[js.Function1[/* encodedStore */ String, Unit]])
  
  val Location: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CAPICOM_STORE_LOCATION]]]) | PromisifiedFunction[ValuesOf[CAPICOM_STORE_LOCATION]]
  
  val Name: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
  
  val Open: (// tslint:disable-line ban-types
  js.Promise[
    Unpacked[
      js.Function3[
        /* location */ js.UndefOr[ValuesOf[CAPICOM_STORE_LOCATION]], 
        /* name */ js.UndefOr[ValuesOf[CAPICOM_STORE_NAME]], 
        /* openMode */ js.UndefOr[ValuesOf[CAPICOM_STORE_OPEN_MODE]], 
        Unit
      ]
    ]
  ]) | (PromisifiedFunction[
    js.Function3[
      /* location */ js.UndefOr[ValuesOf[CAPICOM_STORE_LOCATION]], 
      /* name */ js.UndefOr[ValuesOf[CAPICOM_STORE_NAME]], 
      /* openMode */ js.UndefOr[ValuesOf[CAPICOM_STORE_OPEN_MODE]], 
      Unit
    ]
  ])
}
object StoreAsync {
  
  inline def apply(
    Certificates: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Certificates]]) | PromisifiedFunction[Certificates],
    Close: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[Unit]]]) | PromisifiedFunction[js.Function0[Unit]],
    Delete: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[Boolean]]]) | PromisifiedFunction[js.Function0[Boolean]],
    Import: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function1[/* encodedStore */ String, Unit]]]) | (PromisifiedFunction[js.Function1[/* encodedStore */ String, Unit]]),
    Location: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CAPICOM_STORE_LOCATION]]]) | PromisifiedFunction[ValuesOf[CAPICOM_STORE_LOCATION]],
    Name: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
    Open: (// tslint:disable-line ban-types
  js.Promise[
      Unpacked[
        js.Function3[
          /* location */ js.UndefOr[ValuesOf[CAPICOM_STORE_LOCATION]], 
          /* name */ js.UndefOr[ValuesOf[CAPICOM_STORE_NAME]], 
          /* openMode */ js.UndefOr[ValuesOf[CAPICOM_STORE_OPEN_MODE]], 
          Unit
        ]
      ]
    ]) | (PromisifiedFunction[
      js.Function3[
        /* location */ js.UndefOr[ValuesOf[CAPICOM_STORE_LOCATION]], 
        /* name */ js.UndefOr[ValuesOf[CAPICOM_STORE_NAME]], 
        /* openMode */ js.UndefOr[ValuesOf[CAPICOM_STORE_OPEN_MODE]], 
        Unit
      ]
    ])
  ): StoreAsync = {
    val __obj = js.Dynamic.literal(Certificates = Certificates.asInstanceOf[js.Any], Close = Close.asInstanceOf[js.Any], Delete = Delete.asInstanceOf[js.Any], Import = Import.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Open = Open.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreAsync]
  }
  
  extension [Self <: StoreAsync](x: Self) {
    
    inline def setCertificates(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Certificates]]) | PromisifiedFunction[Certificates]
    ): Self = StObject.set(x, "Certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "Certificates", js.Any.fromFunction1(value))
    
    inline def setClose(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function0[Unit]]]) | PromisifiedFunction[js.Function0[Unit]]
    ): Self = StObject.set(x, "Close", value.asInstanceOf[js.Any])
    
    inline def setCloseFunction0(value: () => Unit): Self = StObject.set(x, "Close", js.Any.fromFunction0(value))
    
    inline def setCloseFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "Close", js.Any.fromFunction1(value))
    
    inline def setDelete(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function0[Boolean]]]) | PromisifiedFunction[js.Function0[Boolean]]
    ): Self = StObject.set(x, "Delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteFunction0(value: () => Boolean): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setDeleteFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "Delete", js.Any.fromFunction1(value))
    
    inline def setImport(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function1[/* encodedStore */ String, Unit]]]) | (PromisifiedFunction[js.Function1[/* encodedStore */ String, Unit]])
    ): Self = StObject.set(x, "Import", value.asInstanceOf[js.Any])
    
    inline def setImportFunction1(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any]) | (/* encodedStore */ String) => js.Promise[Unpacked[Any]] | Unit
    ): Self = StObject.set(x, "Import", js.Any.fromFunction1(value))
    
    inline def setLocation(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[ValuesOf[CAPICOM_STORE_LOCATION]]]) | PromisifiedFunction[ValuesOf[CAPICOM_STORE_LOCATION]]
    ): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "Location", js.Any.fromFunction1(value))
    
    inline def setName(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "Name", js.Any.fromFunction1(value))
    
    inline def setOpen(
      value: (// tslint:disable-line ban-types
    js.Promise[
          Unpacked[
            js.Function3[
              /* location */ js.UndefOr[ValuesOf[CAPICOM_STORE_LOCATION]], 
              /* name */ js.UndefOr[ValuesOf[CAPICOM_STORE_NAME]], 
              /* openMode */ js.UndefOr[ValuesOf[CAPICOM_STORE_OPEN_MODE]], 
              Unit
            ]
          ]
        ]) | (PromisifiedFunction[
          js.Function3[
            /* location */ js.UndefOr[ValuesOf[CAPICOM_STORE_LOCATION]], 
            /* name */ js.UndefOr[ValuesOf[CAPICOM_STORE_NAME]], 
            /* openMode */ js.UndefOr[ValuesOf[CAPICOM_STORE_OPEN_MODE]], 
            Unit
          ]
        ])
    ): Self = StObject.set(x, "Open", value.asInstanceOf[js.Any])
    
    inline def setOpenFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "Open", js.Any.fromFunction1(value))
    
    inline def setOpenFunction3(
      value: (/* location */ js.UndefOr[ValuesOf[CAPICOM_STORE_LOCATION]], /* name */ js.UndefOr[ValuesOf[CAPICOM_STORE_NAME]], /* openMode */ js.UndefOr[ValuesOf[CAPICOM_STORE_OPEN_MODE]]) => Unit
    ): Self = StObject.set(x, "Open", js.Any.fromFunction3(value))
  }
}
